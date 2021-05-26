package rock.beantest;

 import org.springframework.cglib.beans.BeanCopier;
import rock.bean.BenchmarkTest;
import rock.bean.FromBean;
import rock.bean.ToBean;
import rock.bean.inter.MethodCallBack;

import java.math.BigDecimal;
import java.sql.Date;

public class TestMain {

    public static void main(String[] args) {
        FromBean fb = new FromBean();
        fb.setAddress("山东省烟台市莱山区飞龙天润大厦1706");
        fb.setAge(25);
        fb.setMoney(new BigDecimal(5200000.00));
        fb.setIdNo("370687199511065545");
        fb.setName("大帅比蓝旭鹏");
        // fb.setBirthday(new Date(1000000).toString());
         fb.setBirthday(new Date(1000000));
      //  fb.setBirthday("123123123");

        MethodCallBack beanutilCB = new MethodCallBack() {

            @Override
            public String getMethodName() {
                return "org.apache.commons.beanutils.BeanUtils.copyProperties";
            }

            @Override
            public ToBean callMethod(FromBean frombean) throws Exception {
                ToBean toBean = new ToBean();
                org.apache.commons.beanutils.BeanUtils.copyProperties(toBean, frombean);
                return toBean;
            }
        };

        MethodCallBack propertyCB = new MethodCallBack() {

            @Override
            public String getMethodName() {
                return "org.apache.commons.beanutils.PropertyUtils.copyProperties";
            }

            @Override
            public ToBean callMethod(FromBean frombean) throws Exception {
                ToBean toBean = new ToBean();
                org.apache.commons.beanutils.PropertyUtils.copyProperties(toBean, frombean);
                return toBean;
            }
        };

        MethodCallBack springCB = new MethodCallBack() {

            @Override
            public String getMethodName() {
                return "org.springframework.beans.BeanUtils.copyProperties";
            }

            @Override
            public ToBean callMethod(FromBean frombean) throws Exception {
                ToBean toBean = new ToBean();
                org.springframework.beans.BeanUtils.copyProperties(frombean, toBean);
                return toBean;
            }
        };

        MethodCallBack cglibCB = new MethodCallBack() {

            BeanCopier bc = BeanCopier.create(FromBean.class, ToBean.class, false);

            @Override
            public String getMethodName() {
                return "org.springframework.cglib.beans.BeanCopier.create";
            }

            @Override
            public ToBean callMethod(FromBean frombean) throws Exception {
                ToBean toBean = new ToBean();
                bc.copy(frombean, toBean, null);
                return toBean;
            }
        };

        MethodCallBack setCB = new MethodCallBack() {

            @Override
            public String getMethodName() {
                return "set method";
            }

            @Override
            public ToBean callMethod(FromBean frombean) throws Exception {
                ToBean toBean = new ToBean();
                toBean.setAddress(frombean.getAddress());
                toBean.setAge(frombean.getAge());
                toBean.setIdNo(frombean.getIdNo());
                toBean.setMoney(frombean.getMoney());
                toBean.setName(frombean.getName());
               // toBean.setBirthday(frombean.getBirthday());
                return toBean;
            }
        };


        // 数量较少的时候，测试性能
        BenchmarkTest bt1 = new BenchmarkTest(1);
        bt1.benchmark(beanutilCB, fb);
        bt1.benchmark(propertyCB, fb);
        bt1.benchmark(springCB, fb);
        bt1.benchmark(cglibCB, fb);
        bt1.benchmark(setCB, fb);


        // 测试一万次性能测试
        BenchmarkTest bt1W = new BenchmarkTest(10000);
        bt1W.benchmark(beanutilCB, fb);
        bt1W.benchmark(propertyCB, fb);
        bt1W.benchmark(springCB, fb);
        bt1W.benchmark(cglibCB, fb);
        bt1W.benchmark(setCB, fb);



        // 数量较少的时候，测试性能
        BenchmarkTest bt10 = new BenchmarkTest(10);
        bt10.benchmark(beanutilCB, fb);
        bt10.benchmark(propertyCB, fb);
        bt10.benchmark(springCB, fb);
        bt10.benchmark(cglibCB, fb);
        bt10.benchmark(setCB, fb);


       // 测试一千次性能测试
        BenchmarkTest bt1K = new BenchmarkTest(1000);
        bt1K.benchmark(beanutilCB, fb);
        bt1K.benchmark(propertyCB, fb);
        bt1K.benchmark(springCB, fb);
        bt1K.benchmark(cglibCB, fb);
        bt1K.benchmark(setCB, fb);



        // 换顺序一万------------
//        BenchmarkTest bt1WR = new BenchmarkTest(10000);
//        bt1WR.benchmark(setCB, fb);
//        bt1WR.benchmark(cglibCB, fb);
//        bt1WR.benchmark(springCB, fb);
//        bt1WR.benchmark(propertyCB, fb);
//        bt1WR.benchmark(beanutilCB, fb);

    }


    /**
     *
     *
     * 从整体的表现来看，Cglib的BeanCopier的性能是最好的无论是数量较大的1万次的测试，还是数量较少10次，几乎都是趋近与零损耗;
     * Spring BeanUtil是在次数增多的情况下，性能较好，在数据较少的时候，性能比PropertyUtils的性能差一些;
     * PropertyUtils的性能相对稳定，表现是呈现线性增长的趋势;
     * Apache的BeanUtil的性能最差，无论是单次Copy还是大数量的多次Copy性能都不是很好;
     * PropertyUtils和BeanUtils的功能基本一致。唯一的区别是：BeanUtils在对Bean赋值时会进行类型转化，而PropertyUtils不会对类型进行转化，
     * 如果类型不同则会抛出异常！，这可以解释PropertyUtils效率比BeanUtils要高的原因。
     * 建议：基本类型在源目标类型一致的情况下使用： PropertyUtils效率会更高。
     * Dozer框架的拷贝,万次内的效率beanutils比dozer要快, 十万次以上的效率beanutils的效率和dozer差不多, 复杂类型的拷贝可以使用： Dozer
     *
     * Spring BeanUtils 不能转化 java.util.Date，可以支持它的子类 java.sql.Date
     *
     * 其他方式 ：
     * Dozer 需要添加额外配置，目前项目中基本不需要。
     * 目前dozer官网最新版本 5.5.1 Apr, 2014 至今一直未曾更新
     * dozer是用来两个对象之间属性转换的工具，有了这个工具之后，我们将一个对象的所有属性值转给另一个对象时，就不需要再去写重复的set和get方法了。
     * <dependency>
     *             <groupId>net.sf.dozer</groupId>
     *             <artifactId>dozer</artifactId>
     *             <version>5.5.1</version>
     *         </dependency>
     */


    /**
     * 结论：
     *
     *     Apache BeanUtils 性能最差
     *
     *     Apache PropertyUtils 基本是线性增长
     *
     *     Spring BeanUtils 不稳定
     *
     *     Cglib和 直接set 性能最好
     *
     * 原因分析：
     *
     *     Apache BeanUtils、PropertyUtils、Spring BeanUtils采用反射
     *
     *     Cglib采用动态代理
     *
     *     动态代理：为其他对象提供一个代理以控制对某个对象的访问。
     *     代理类主要负责为委托了（真实对象）预处理消息、过滤消息、传递消息给委托类，代理类不现实具体服务，而是利用委托类来完成服务，并将执行结果封装处理。
     */
}

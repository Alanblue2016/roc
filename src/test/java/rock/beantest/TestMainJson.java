package rock.beantest;

 import org.springframework.cglib.beans.BeanCopier;
 import org.springside.modules.utils.mapper.JsonMapper;
 import rock.bean.BenchmarkTest;
import rock.bean.FromBean;
import rock.bean.ToBean;
import rock.bean.inter.MethodCallBack;

import java.math.BigDecimal;
import java.sql.Date;

public class TestMainJson {

    public static void main(String[] args) {
        FromBean fb = new FromBean();
        fb.setAddress("山东省烟台市莱山区飞龙天润大厦1706");
        fb.setAge(25);
        fb.setMoney(new BigDecimal(5200000.00));
        fb.setIdNo("370687199511065545");
        fb.setName("大帅比蓝旭鹏");

        MethodCallBack jsonMapperCopy = new MethodCallBack() {

            @Override
            public String getMethodName() {
                return "json";
            }

            @Override
            public ToBean callMethod(FromBean frombean) throws Exception {
                String from = JsonMapper.defaultMapper().toJson(frombean);
                //System.out.println(from);
                ToBean toBean = JsonMapper.defaultMapper().fromJson(from, ToBean.class);
                return toBean;
            }
        };





        // 换顺序一万------------
        BenchmarkTest bt1WR = new BenchmarkTest(10000);
        bt1WR.benchmark(jsonMapperCopy, fb);


    }


}

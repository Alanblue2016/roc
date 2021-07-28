package rock.bean;


import rock.bean.inter.MethodCallBack;

public class BenchmarkTest {

    /**
     * 执行次数
     */
    private int count;

    public BenchmarkTest(int count) {
        this.count = count;
        System.out.println("性能测试" + this.count + "==================");
    }


    /**
     * 性能测试
     *
     * @param m
     * @param frombean
     */
    public void benchmark(MethodCallBack m, FromBean frombean) {
        try {
            long begin = System.currentTimeMillis();
            ToBean tobean = null;
            for (int i = 0; i < count; i++) {

                tobean = m.callMethod(frombean);
               // System.out.println(tobean.getBirthday());

            }
            System.out.println(String.format("%-60s 耗时：%sms", m.getMethodName(), System.currentTimeMillis() - begin));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

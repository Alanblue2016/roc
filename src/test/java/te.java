import net.bytebuddy.implementation.bind.annotation.Super;
import org.springframework.data.geo.Circle;
import rock.tool.DateUtils;

import java.security.PublicKey;
import java.sql.SQLOutput;

public class te {
    public static void main(String[] args) {
        // byte
//        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
//        System.out.println("包装类：java.lang.Byte");
//        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
//        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
//        System.out.println();
//
//        // short
//        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
//        System.out.println("包装类：java.lang.Short");
//        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
//        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
//        System.out.println();
//
//        // int
//        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
//        System.out.println("包装类：java.lang.Integer");
//        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
//        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
//        System.out.println();
//
//        // long
//        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
//        System.out.println("包装类：java.lang.Long");
//        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
//        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
//        System.out.println();
//
//        // float
//        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
//        System.out.println("包装类：java.lang.Float");
//        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
//        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
//        System.out.println();
//
//        // double
//        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
//        System.out.println("包装类：java.lang.Double");
//        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
//        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
//        System.out.println();
//
//        // char
//        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
//        System.out.println("包装类：java.lang.Character");
//        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
//        System.out.println("最小值：Character.MIN_VALUE="
//            + (int) Character.MIN_VALUE);
//        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
//        System.out.println("最大值：Character.MAX_VALUE="
//            + (int) Character.MAX_VALUE);

//        Date date1 = new Date();
//
//        Date fave = new Date(5000);
//        System.out.println(date1.after(fave));
//
//        System.out.println(fave);

//        UUID uuid = UUID.randomUUID();
//
//        String replace = uuid.toString().replace("-", "");
//
//        System.out.println(replace);
//
//        Long time = Instant.now().getEpochSecond();
//        System.out.println(time);

//        List<String> allist= new ArrayList<>();
//        allist.add("333");
//        allist.add("222");
//        allist.add("44");
//        allist.add("55");
//         allist.add("qqq");
//         allist.add("www");
//         allist.add("ee");
//         allist.add("rr");
//         allist.addAll(allist);
//        System.out.println(allist);

//        @Autowired
//        RestTemplate apiRestTemplate;

//        JsonMapper jsonMapper = new JsonMapper();
//
//
//        ResponseEntity<HashMap> res = null;


//        try {
////            String url = "safsdfsssaf";
////            SmsReq smsReq = new SmsReq();
////            smsReq.setAppId("sfp-vip");
////            smsReq.setClientIp("asdfasfa");// 地址
////            smsReq.setPhone("13693214433"); // 手机号
////            smsReq.setTemplateCode("SMS_135042909"); // 模板id
////            smsReq.setSign("智慧商业助手");
////            smsReq.setUserId("34234242");
////            smsReq.setParam("sfasdfasdf");
//
//            Map<String, String> map = new HashMap<>();
//            map.put("code", "asdfasdfasd");
//            map.put("phone_number", "1312313131231");
//
//            String json = jsonMapper.toJson(map);
//            System.out.println(json);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //  res = apiRestTemplate.postForEntity(url, json, HashMap.class);

//        List<Integer> strs = new ArrayList<>();
//        List<Integer> Allstrs = new ArrayList<>();
//
//
//        for (int i = 0; i < 4; i++) {
//            strs.add(i);
//            Allstrs.addAll(strs);
//
//        }
//        System.out.println(Allstrs);
//
//
//        System.out.println(Runtime.getRuntime().maxMemory()); //最大可用内存，对应-Xmx
//        System.out.println(Runtime.getRuntime().freeMemory()); //当前JVM空闲内存
//        System.out.println(Runtime.getRuntime().totalMemory());//当前JVM占用的内存总数，其值相当于当前JVM已使用的内存及freeMemory()的总和
//        Cat cat = new Cat();
//
//        String catstr = cat.toString();
//        System.out.println(catstr);
//        Integer rt = Integer.parseInt("1");
//        System.out.println(rt);


//        Cat cat = null;
//
//        if (cat == null || !cat.getCute()) {
//            System.out.println("1111");
//        } else {
//            System.out.println("222");
//        }

        //15.获取某个时间的上周一和周日
//        Calendar cal = Calendar.getInstance();
//        //n为推迟的周数，1本周，-1向前推迟一周，2下周，依次类推
//        int n = -1;
//        String monday;
//        cal.add(Calendar.DATE, n * 7);
//        //想周几，这里就传几Calendar.MONDAY（TUESDAY...）
//        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
//        monday = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
//        System.out.println(monday);

//        Object[] objects = new Object[2];
//        objects[0] = 123;
//        objects[1] = 234;
//
//        Integer t = Integer.valueOf(objects[0].toString());
//        System.out.println(t.toString());

//        LocalDate beginDate = DateUtils.date2LocalDate(DateUtils.getBeginDayOfLastWeek());//上周开始时间
//        LocalDate endDate = DateUtils.date2LocalDate(DateUtils.getEndDayOfLastWeek());//
//
//        List<String> strings = DateUtils.getDays(beginDate.toString(), endDate.toString());
//
//        strings.stream().forEach(c->{
//            System.out.println(c);
//        });
//        String [] a= new String[5];
//        System.out.println(a.length);

//        String  date = DateUtils.getPastDate(1);
//        System.out.println(date);
//        LocalDate localDate = DateUtils.date2LocalDate(date);
//        System.out.println(localDate.toString());

        class Sharp {
            private int a;

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }

            void drew() {

            }

            void erase() {

            }

        }
        class Circle extends Sharp {
            Circle circle = new Circle();

        }

    }

    private static <Sharp> void doSomething(Sharp Sharp) {

        Circle circle = new Circle();
        doSomething(circle);
        System.out.println("234234");
    }
}

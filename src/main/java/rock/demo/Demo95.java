package rock.demo;

import com.google.common.collect.Maps;
import org.springside.modules.utils.mapper.JsonMapper;

import java.text.ParseException;
import java.util.Map;

public class Demo95 {
    //接口请求地址
    //按更新时间查询笑话
    public static final String URL_A = "http://v.juhe.cn/joke/content/list.php?key=%s&&time=%d&pagesize=%d";

    //最新笑话
    public static final String URL_B = "http://v.juhe.cn/joke/content/text.php?key=%s&pagesize=%d";

    //随机笑话
    public static final String URL_C = "http://v.juhe.cn/joke/randJoke.php?key=%s";

    //申请接口的请求key
    // TODO: 您需要改为自己的请求key
    public static final String KEY = "69862ef612ee6dc333d1ae0f41833050";


    public static void main(String[] args) throws ParseException {
//
//        // TODO: 日期
//
//        //时间戳
//        long time = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
//        //每页数量
//        int pageSize = 2;
//
//        System.out.println("------------按更新时间查询笑话-----------------");
//        printA(time, pageSize);
//        System.out.println("------------最新笑话-----------------");
//        printB(pageSize);
//        System.out.println("------------随机笑话-----------------");
//        printC();

//        int min = 0;
//        int max = 100;
//        Random random = new Random();
//        for (int i = 0; i < 100; i++) {
//            int s = random.nextInt(max) % (max - min + 1) + min;
//            System.out.println(String.valueOf(s));
//        }


        // Long yesterDayBegin = DateUtils.getBeginDayOfYesterday().getTime()/1000;
//        System.out.println(DateUtils.getBeginDayOfWeek().toString());
//
////        String s = TimeTool.dateToStringForYYYYMMDDStr(LocalDateTime.now());
//        int weekth = DateUtils.getWeekth();
//        System.out.println(weekth);

//        String decode = URLDecoder.decode("%E5%8F%8C%E9%B1%BC%E5%BA%A7");
//        System.out.println(decode);

//        List<String> yearDate = DateUtils.getYearDateShort("2008-07-15","2008-07-15");
//
//        System.out.println(yearDate);

//        String today = TimeTool.dateToNianYueRi(LocalDateTime.now());
//        System.out.println(today);
//        String response = "{\n" +
//            "\t\"date\":20210719,\n" +
//            "\t\"name\":\"水瓶座\",\n" +
//            "\t\"QFriend\":\"白羊座\",\n" +
//            "\t\"color\":\"绿色\",\n" +
//            "\t\"datetime\":\"2021年07月19日\",\n" +
//            "\t\"health\":\"65\",\n" +
//            "\t\"love\":\"65\",\n" +
//            "\t\"work\":\"60\",\n" +
//            "\t\"money\":\"65\",\n" +
//            "\t\"number\":9,\n" +
//            "\t\"summary\":\"今天的水瓶座会感觉工作或者生活当中的某件事情占用了你太多的时间，使你感觉压力颇大的同时，也无暇顾及其他。不如把这件事情先放到一边，回归自己原本的生活，让内心舒缓一下。\",\n" +
//            "\t\"all\":\"75\",\n" +
//            "\t\"resultcode\":\"200\",\n" +
//            "\t\"error_code\":0\n" +
//            "}";
//        JSONObject jsonObject = JsonMapper.defaultMapper().fromJson(response, JSONObject.class);
//        int error_code = jsonObject.getIntValue("error_code");
//        if (error_code == 0) {
//            if (jsonObject != null) {
//                Integer year = DateUtils.getNowYear();
//
//            }
//        }

//        Map<String, Object> resMap = Maps.newHashMap();
//
//        for (int i = 0; i < 10; i++) {
//            resMap.put("pId", i);
//        }
//        System.out.println(JsonMapper.defaultMapper().toJson(resMap));
//
//        Long pId = 90L;
//        Long L = pId == null ? 0L : pId;
//        System.out.println(L);


//        String stockId =" 34343,2323,2 23,";
//
//        String[] split = stockId.trim().split(",");
//        System.out.println(split.length);

//        List<SendCouponParams>  params = new ArrayList<>();
//        SendCouponParams params1 = new SendCouponParams();
//        params1.setCoupon_code("234223");
//        params1.setCreate_coupon_merchant("sdsdddd");
//        params1.setOut_request_no("234234234");
//        params1.setCustomize_send_time("asdfsadf");
//        params.add(params1);
//
//
//        SendCouponVo sendCouponVo = new SendCouponVo();
//        sendCouponVo.setBindsendcoupon("werwer");
//        sendCouponVo.setSend_coupon_merchant("sssad法师大法师地方");
//        sendCouponVo.setSend_coupon_params(params);
//        sendCouponVo.setBindsendcoupon("werwer");
//
//        System.out.println(JsonMapper.defaultMapper().toJson(sendCouponVo));


//        String beginDate = "2021-09-01";
//        String endDate = "2021-09-09";
//        List<String> skipDays = new ArrayList<>();
//
//        skipDays.add("2021-09-02");
//        skipDays.add("2021-09-03");
//
//
//        List<String> days = DateUtils.getDays(beginDate, endDate);
//        List<String> removeDays = new ArrayList<>();
//
//        for (int i = 0; i < days.size(); i++) {
//            for (int n = 0; n < skipDays.size(); n++) {
//                if (StringUtils.equals(days.get(i), skipDays.get(n))) {
//                    //移除要跳过的天数
//                    removeDays.add(days.get(i));
//                 }
//            }
//            if (DateUtils.isWeekend(days.get(i))) {
//                removeDays.add(days.get(i));
//            }
//
//        }
//
//
//        days.removeAll(removeDays);
//
//
//        for (int i = 0; i < days.size(); i++) {
//            System.out.println(days.get(i));
//        }

        String tableName = "bus";
        Integer times = 1;
        String aId = "1442324";

        Map map = Maps.newHashMap();
        map.put ("id",234234);
        map.put ("lineId",111111);

//        SaveLineDataVo saveLineDataVo = new SaveLineDataVo();
//        saveLineDataVo.setAId(aId);
//        saveLineDataVo.setJson(json);
//        saveLineDataVo.setTimes(times);
//        saveLineDataVo.setTableName(tableName);
        StringBuilder sb = new StringBuilder();
        sb.append(tableName);
        sb.append("#");
        sb.append(aId);
        sb.append("#");
        sb.append(JsonMapper.defaultMapper().toJson(map));
        String value = sb.toString();
        System.out.println(value);


    }

}

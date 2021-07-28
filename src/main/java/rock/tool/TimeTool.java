package rock.tool;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeTool {
    public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmmss");
    public static final DateTimeFormatter shortFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static final DateTimeFormatter shortFormatterStr = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
    public static final DateTimeFormatter stringFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static String dateToString(LocalDateTime dateTime) {
        return dateTime.format(stringFormatter);
    }


    public static String dateToNianYueRi(LocalDateTime dateTime) {
        return dateTime.format(shortFormatterStr);
    }
    public static String dateToStringForYYYYMMDD(LocalDateTime dateTime) {
        return dateTime.format(shortFormatter);
    } public static String dateToStringForYYYYMMDDStr(LocalDateTime dateTime) {
        return dateTime.format(shortFormatterStr);
    }

    public static String dateToStringDefault(LocalDateTime dateTime) {
        return dateTime.format(formatter);
    }

    public static Instant strToInstant(String str, DateTimeFormatter formatter) {
        return LocalDateTime.from(formatter.parse(str)).atZone(ZoneId.systemDefault()).toInstant();
    }

    public static Instant strToInstant(String str) {
        return LocalDateTime.from(stringFormatter.parse(str)).atZone(ZoneId.systemDefault()).toInstant();
    }

    //10位时间戳转字符串
    public static String timeStampToDate(Long seconds, String format) {
        if (seconds == null) {
            return "";
        }
        if (format == null || format.isEmpty()) {
            format = "yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date(seconds * 1000));
    }


    /**
     * 获取距离当前时间间隔 num 天的时间,之前
     *
     * @param num
     * @return
     */
    public static Instant getInstantDays(Integer num) {
        if (num == null) {
            return null;
        }
        LocalDate localDate = LocalDate.now().minusDays(num);
        Instant instant = localDate.atStartOfDay().toInstant(ZoneOffset.UTC);
        return instant;
    }


    //获取当天的开始时间
    public static Date getDayBegin() {
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }


}

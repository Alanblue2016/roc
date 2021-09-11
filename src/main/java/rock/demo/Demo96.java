package rock.demo;

import rock.tool.DateUtils;
import rock.tool.TimeTool;

import java.text.ParseException;
import java.util.Date;

public class Demo96 {
    public static void main(String[] args) throws ParseException {

        String dayBegin = DateUtils.getStringDateShort();

        System.out.println(dayBegin);
    }
}

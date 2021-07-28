package rock.beantest;

import org.springside.modules.utils.mapper.JsonMapper;
import rock.bean.BenchmarkTest;
import rock.bean.FromBean;
import rock.bean.ToBean;
import rock.bean.inter.MethodCallBack;

import java.math.BigDecimal;

public class TestMainBean {

    public static void main(String[] args) {
        FromBean fb = new FromBean();

        System.out.println(System.identityHashCode(fb));

        System.out.println(fb);


    }


}

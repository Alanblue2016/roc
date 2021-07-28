import org.junit.runner.RunWith;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;
import rock.tool.Constant;

@RunWith(SpringRunner.class)
@Component
public class TestCont {

    /**
     * 根据概率获取奖品的测试类
     */
    public static void main(String[] args) {

        Integer e = 0;
        if (e.equals(Constant.PrizeType.XIE_XIE_CAN_YU.getValue())) {
            System.out.println("2342");
        } else {
            System.out.println("1111");

        }
    }

}



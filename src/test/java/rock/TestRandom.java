package rock;

import org.junit.runner.RunWith;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@Component
public class TestRandom {

    /**
     * 根据概率获取奖品的测试类
     */
    public static void main(String[] args) {
        TestRandom tr = new TestRandom();

        long begin1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            tr.getGumBySet();
        }
        System.out.println("set使用时间：" + (System.currentTimeMillis() - begin1));
    }

    /* Set 获取 */
    void getGumBySet() {
        Double nextInt = Double.valueOf(new Random().nextInt(10000));
        Double random = Double.valueOf(nextInt/100);
        Double prizeRate = 0.00;// 中奖率
        Iterator<Gem> it = initSetGems().iterator();
        while (it.hasNext()) {
            Gem gem = it.next();
            prizeRate += gem.getPriority();
            if (random < prizeRate) {
                System.out.println("奖品为：" + gem.getName()
                    + " 概率：" + gem.getPriority()
                    + " 随机数random：" + random
                    + " 概率基数prizeRate：" + prizeRate);
                break;
            }
        }
    }


    /**
     * 初始化set
     */
    Set<Gem> initSetGems() {
        Set<Gem> gums = new HashSet<Gem>();
        gums.add(new Gem("A", 0.01));
        gums.add(new Gem("M", 0.04));
        gums.add(new Gem("B", 0.05));
        gums.add(new Gem("C", 0.00));
        gums.add(new Gem("D", 0.00));
        gums.add(new Gem("E", 0.00));
        return gums;
    }

    /**
     * 奖品类
     */
    class Gem {
        /**
         * 奖品名称
         */
        private String name;
        /**
         * 奖品概率
         */
        private Double priority;

        public Gem() {
            super();
        }

        public Gem(String name, Double priority) {
            super();
            this.name = name;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return "Gum [name=" + name + ", priority=" + priority + "]";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPriority() {
            return priority;
        }

        public void setPriority(Double priority) {
            this.priority = priority;
        }
    }
}



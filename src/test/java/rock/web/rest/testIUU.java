package rock.web.rest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import rock.RocApp;


@SpringBootTest(classes = RocApp.class)
public class testIUU {


    @Autowired
    RedisTemplate redisTemplate;

    private static final Long waitTime = 60L;


    @Test
    public void tr() throws Exception {
//        System.out.println("122313123");
//        System.out.println("1111");
//        Set<String> strs = new HashSet<>();
//        for (int i = 0; i < 22100; i++) {
//            strs.add(String.valueOf(Math.random() + Math.random() + Math.random()));
//        }
//        System.out.println("一共" + strs.size());
//
//        List<Set<String>> splitList = ListTool.splitList(strs, 10000);
//        System.out.println("分成 " + splitList.size() + "批发送");
//        for (int i = 0; i < splitList.size(); i++) {
//            Set<String> spOpenIdSet = splitList.get(i);
//            System.out.println("群发！" + i);
//
//            redisTemplate.opsForValue().set(i, spOpenIdSet, waitTime, TimeUnit.SECONDS);
//
//        }

//        String property = System.getProperty("user.dir");
//        System.out.println(property);
        String res = "{\n" +
            "\t\"type\": \"http://www.jhipster.tech/problem/problem-with-message\",\n" +
            "\t\"title\": \"Internal Server Error\",\n" +
            "\t\" \": 500,\n" +
            "\t\"message\": \"error.http.500\"\n" +
            "}";
        int status = res.indexOf("status");
        System.out.println(status);


    }

}

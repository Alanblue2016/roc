package rock.tool;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class RedisUtil {


    @Resource
    RedisTemplate<String, String> redisTemplate;

    public String get(String key) {
        if (StringUtils.isEmpty(key)) {
            return null;
        }
        return redisTemplate.opsForValue().get(key);
    }

    public void set(String key, String value) {
        if (StringUtils.isEmpty(key) || StringUtils.isEmpty(value)) {
            return;
        }
        redisTemplate.opsForValue().set(key, value);
    }

    public Long incrementKey(String key, long delta) {

        Long increment = redisTemplate.opsForValue().increment(key, delta);

        return increment;
    }


}

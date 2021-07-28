package rock.service.impl;

import rock.tool.RedisUtil;

import javax.annotation.Resource;

public class UserServiceImpl {
    @Resource
    RedisUtil redisUtil;
    private static final String MEMBER_CARD_INFO_C_INDEX_MAX = "BUS:MEMBERCARDINFO:CINDEX:MAX_test:";


    public void testRedis() {
        String key = MEMBER_CARD_INFO_C_INDEX_MAX + "aId";
        Long cIndex = redisUtil.incrementKey(key, 1);
        //如果不存在key
        if (1 == cIndex) {
            Long dataIndex = 0L;
            // 存入redis 最大index 值
            cIndex = redisUtil.incrementKey(key, dataIndex);
        }

        System.out.println(cIndex.toString());
    }
}

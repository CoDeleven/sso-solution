package cn.codeleven.utils;

import redis.clients.jedis.Jedis;

public class RedisUtil {
    public static Jedis getJedisClient(){
        String host = PropertyUtil.getPropertyByKey("redis", "host");
        String port = PropertyUtil.getPropertyByKey("redis", "port");
        return new Jedis(host, Integer.parseInt(port));
    }

    public static void closeJedisClient(Jedis jedisClient){
        jedisClient.close();
    }
}

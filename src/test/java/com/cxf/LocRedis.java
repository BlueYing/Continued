package com.cxf;

import redis.clients.jedis.Jedis;

public class LocRedis {
  public static void main(String[] args) {
    Jedis jedis = new Jedis("192.168.1.13");  
    String keys = "name";  
      
    // 删数据  
    jedis.del(keys);  
    // 存数据  
    jedis.set(keys, "snowolf");  
    // 取数据  
    String value = jedis.get(keys);  
      
    System.out.println(value);  

  }
}

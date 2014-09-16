package com.cxf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

public class RedisTest {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml");
    final RedisTemplate<Object, Object> redisTemplate = (RedisTemplate<Object, Object>) context
        .getBean("redisTemplate");
    redisTemplate.execute(new RedisCallback<Object>() {
      @Override
      public Object doInRedis(RedisConnection connection)
          throws DataAccessException {
        RedisSerializer<String> serializer = (RedisSerializer<String>) redisTemplate
            .getStringSerializer();
        connection.set(serializer.serialize("231"),
            serializer.serialize("2312"));
        return null;
      }
    });
  }
}

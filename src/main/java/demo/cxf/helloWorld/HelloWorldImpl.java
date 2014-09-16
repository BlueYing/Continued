package demo.cxf.helloWorld;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.serializer.RedisSerializer;

import demo.redis.util.AbstractBaseRedisDao;

@WebService(serviceName = "helloWorld")
public class HelloWorldImpl extends AbstractBaseRedisDao<String, String> implements helloWorld {

  @Override
  public String sayHello(@WebParam(name = "text") final String text) {
    System.out.println("syaHello calked");
    
    redisTemplate.execute(new RedisCallback<Boolean>() {  
      public Boolean doInRedis(RedisConnection connection)  
              throws DataAccessException {  
          RedisSerializer<String> serializer = getRedisSerializer();  
          return connection.setNX(serializer.serialize(text), serializer.serialize(text));  
      }  

  });  
    
    return "hello" + text + ",this is world.";
  }


  @Override
  public String seeYou(@WebParam(name = "say")String say) {
    return say;
  }
}

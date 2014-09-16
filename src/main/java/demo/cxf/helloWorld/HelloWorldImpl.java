package demo.cxf.helloWorld;

import javax.jws.WebParam;
import javax.jws.WebService;

import net.sf.json.JSONObject;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.serializer.RedisSerializer;

import com.he.BaseInfo;
import com.he.BusiInfo;
import com.he.EidInfo;
import com.he.ExtenInfo;
import com.he.HmacInfo;
import com.he.Return1;

import demo.redis.util.AbstractBaseRedisDao;

@WebService(serviceName = "helloWorld")
public class HelloWorldImpl extends AbstractBaseRedisDao<String, String>
    implements helloWorld {

  @Override
  public Return1 sayHello(@WebParam(name = "baseInfo") final BaseInfo text,
      @WebParam(name = "busiInfo") final BusiInfo busiInfo,
      @WebParam(name = "eidInfo") final EidInfo eidInfo,
      @WebParam(name = "extenInfo") final ExtenInfo extenInfo,
      @WebParam(name = "hmacInfo") final HmacInfo hmacInfo) {
    System.out.println("syaHello calked");

    redisTemplate.execute(new RedisCallback<Boolean>() {
      public Boolean doInRedis(RedisConnection connection)
          throws DataAccessException {
        RedisSerializer<String> serializer = getRedisSerializer();
        JSONObject base = JSONObject.fromObject(text);
        JSONObject busi = JSONObject.fromObject(busiInfo);
        JSONObject eid = JSONObject.fromObject(eidInfo);
        JSONObject exten = JSONObject.fromObject(extenInfo);
        JSONObject hamc = JSONObject.fromObject(hmacInfo);
        return connection.setNX(
            serializer.serialize(text.getVersion() + text.getApp_id()
                + text.getBiz_type() + text.getBiz_sequence_id()),
            serializer.serialize(base.toString() + busi.toString()
                + eid.toString() + exten.toString() + hamc.toString()));
      }

    });
    Return1 r1 = new Return1();
    r1.setName("测试");
    r1.setEid_cert("23232");
    r1.setIdnumber("232423");
    return r1;
  }

  @Override
  public String seeYou(@WebParam(name = "say") String say) {
    return say;
  }
}

package demo.cxf.helloWorld;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.he.BaseInfo;
import com.he.BusiInfo;
import com.he.EidInfo;
import com.he.ExtenInfo;
import com.he.HmacInfo;
import com.he.Return1;

@WebService
public interface helloWorld {
  Return1 sayHello(@WebParam(name = "baseInfo") BaseInfo text,
      @WebParam(name = "busiInfo") final BusiInfo busiInfo,
      @WebParam(name = "eidInfo") final EidInfo eidInfo,
      @WebParam(name = "extenInfo") final ExtenInfo extenInfo,
      @WebParam(name = "hmacInfo") final HmacInfo hmacInfo);

  String seeYou(@WebParam(name = "say") String say);
}

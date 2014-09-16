package demo.cxf.helloWorld;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface helloWorld {
  String sayHello(@WebParam(name = "text") String text);
  String seeYou(@WebParam(name = "say") String say);
}

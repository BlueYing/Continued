package demo.cxf.helloWorld;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "helloWorld")
public class HelloWorldImpl implements helloWorld {

  @Override
  public String sayHello(@WebParam(name = "text") String text) {
    System.out.println("syaHello calked");
    return "hello" + text + ",this is world.";
  }

}

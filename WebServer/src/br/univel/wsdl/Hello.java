package br.univel.wsdl;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Hello
{
    private final String message = new String("Hello, ");

    public Hello()
    {}

    @WebMethod
    public String sayHello(final String name)
    {
        return message + name + ".";
    }
}
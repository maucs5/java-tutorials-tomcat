package foo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("get")
public class Hello {
    @GET
    public String get() {
        return "hello world world world";
    }
}

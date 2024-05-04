package eu.agilejava.dukes;

import jakarta.mvc.Controller;
import jakarta.mvc.View;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

@Controller
@Path("dukes")
public class DukesController {

    @GET
//    @View("dukes.jsp")
    public Response dukes(@QueryParam("name") String name) {

        System.out.println(name);

        return Response.ok("dukes.jsp").build();

    }
}

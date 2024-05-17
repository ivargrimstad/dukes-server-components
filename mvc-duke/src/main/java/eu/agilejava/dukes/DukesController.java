package eu.agilejava.dukes;

import jakarta.inject.Inject;
import jakarta.mvc.Controller;
import jakarta.mvc.View;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Controller
@Path("hello")
public class DukesController {

    // inject model

    @GET
    @View("dukes.jsp")
    public void dukes() {

        // populate model
    }
}

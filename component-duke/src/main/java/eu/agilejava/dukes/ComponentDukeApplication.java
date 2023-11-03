package eu.agilejava.dukes;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.SeBootstrap;
import jakarta.ws.rs.core.Application;

@ApplicationPath("")
public class ComponentDukeApplication extends Application {

    void main() throws InterruptedException {

        SeBootstrap.Configuration config = SeBootstrap.Configuration.builder()
                .rootPath("booty-duke")
                .port(8081)
                .build();

        Application app = new ComponentDukeApplication();
        SeBootstrap.start(app, config);
        Thread.currentThread().join();
    }
}
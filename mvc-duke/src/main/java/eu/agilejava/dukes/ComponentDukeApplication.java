package eu.agilejava.dukes;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.SeBootstrap;
import jakarta.ws.rs.core.Application;

import java.util.Set;

@ApplicationPath("")
public class ComponentDukeApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return Set.of(DukesController.class);
    }

    void main() throws InterruptedException {

        SeBootstrap.Configuration config = SeBootstrap.Configuration.builder()
                .rootPath("component-duke")
                .port(8081)
                .build();

        Application app = new ComponentDukeApplication();
        SeBootstrap.start(app, config);
        Thread.currentThread().join();
    }
}
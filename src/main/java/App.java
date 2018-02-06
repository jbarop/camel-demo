import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.main.Main;

public class App {

    public static void main(String[] args) throws Exception {
        Main camelMain = new Main();

        camelMain.addRouteBuilder(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file:runtime-data/in")
                        .log("${body}")
                        .to("file:runtime-data/out");
            }
        });

        camelMain.run(args);
        System.exit(camelMain.getExitCode());
    }

}

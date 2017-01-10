import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class ConfigApp {



        @Bean
        public String helloWorld(){
            return "curva";
        }

}

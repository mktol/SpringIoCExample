import com.example.Message;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan("com.example")
@PropertySource(value = "classpath:app.properties")
public class ConfigApp {

    @Value(	"${name}")
    private String jack;

    private static int counter = 0;
        @Bean("generalQuestion")
        @Scope(value = "prototype")
        public Message customMessage(){
            System.out.println(jack);
            Message message = new Message();
            message.setId(43L);
            message.setText("Sense of life "+counter++);
            return message;
        }

        @Bean
        public String helloWorld(){
            return "hello world";
        }

}

import com.example.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigApp.class);
        System.out.println(ctx.getBean("helloWorld"));
        String[] names = ctx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        MessageService messageService = (MessageService) ctx.getBean("messageService");
        messageService.showMessage();
    }
}

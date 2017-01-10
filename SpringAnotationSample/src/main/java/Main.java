import com.example.MessageService;
import com.example.postConstruct.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext(ConfigApp.class);
//        ctx.refresh();
        System.out.println(ctx.getBean("helloWorld"));
/*        String[] names = ctx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }*/
        MessageService messageService = (MessageService) ctx.getBean("messageService");
        messageService.showMessage();
        String data = "{Json, Xml, Html, CSV}";
        messageService.writeData(data);

        Item item = (Item)ctx.getBean("item");
        System.out.println(item);
        Item item1 = (Item) ctx.getBean("item");
        System.out.println(item1);
        ctx.close();




    }
}

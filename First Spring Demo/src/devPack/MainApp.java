package devPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		SpringHelloWorld obj=(SpringHelloWorld) ctx.getBean("bean1");
		obj.setMsg("Spring Framework is Awesome!!");
		obj.getMsg();
	}
}

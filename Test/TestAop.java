import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Aop.pojo.User;
import Aop.service.UserService;



class TestAop {

	@Test
	void test() {
		//创建applicationContext对象
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过getBean方法获得对象
		UserService us=(UserService) ctx.getBean("userService");
		//调用对象的方法执行操作
		User user=new User(1,"李四",20);
		us.saveUser(user);
	}

}

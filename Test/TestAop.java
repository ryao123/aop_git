import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Aop.pojo.User;
import Aop.service.UserService;



class TestAop {

	@Test
	void test() {
		//����applicationContext����
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��getBean������ö���
		UserService us=(UserService) ctx.getBean("userService");
		//���ö���ķ���ִ�в���
		User user=new User(1,"����",20);
		us.saveUser(user);
	}

}

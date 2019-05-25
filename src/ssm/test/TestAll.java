package ssm.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssm.service.UserService;

public class TestAll {

	
	@Test
	public void Test() {
		
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		UserService ud = (UserService) ac.getBean("userService");
		
		System.out.println(ud.findAllByPage(0, 5).size());
		
		ac.close();
	}

}

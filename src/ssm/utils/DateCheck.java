package ssm.utils;

import org.springframework.stereotype.Component;

import ssm.domain.User;


@Component
public class DateCheck {

	public DateCheck() {}
	
	public void checkUser(User user) {
		System.out.println(user.getUsername()+"----"+user.getPassword());
	}

}

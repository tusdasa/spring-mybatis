package ssm.service;

import java.util.List;

import ssm.domain.User;
public interface UserService {
	boolean addUser(User user);
	boolean delUser(Integer uid);
	boolean updateUser(User user);
	User findUserById(Integer uid);
	List<User> findAll();
	List<User> findAllByPage(Integer start, Integer size);
	Long count();
}

package ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.dao.UserDAO;
import ssm.domain.User;
import ssm.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDAO;
	
	public UserServiceImpl() {}

	@Override
	public boolean addUser(User user) {
		if(userDAO.insert(user)>=1) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<User> findAll() {
		return userDAO.findAll();
	}

	@Override
	public boolean delUser(Integer uid) {
		if(userDAO.deleteById(uid)>0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean updateUser(User user) {
		if(userDAO.updateById(user)>0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public User findUserById(Integer uid) {
		return userDAO.selectById(uid);
	}

	@Override
	public List<User> findAllByPage(Integer start, Integer size) {
		return userDAO.findAllByPage(start, size);
	}

	@Override
	public Long count() {
		return userDAO.count();
	}

}

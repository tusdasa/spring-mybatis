package ssm.dao;

import ssm.domain.User;

/**
 * UserDAO继承基类
 */
public interface UserDAO extends MyBatisBaseDao<User, Integer> {
	Long count();
}
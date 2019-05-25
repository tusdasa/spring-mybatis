package ssm.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import ssm.dao.UserDAO;
import ssm.domain.User;
public class UserDaoImpl extends DaoBase implements UserDAO {
	public UserDaoImpl() {
	}

	@Override
	public int insert(User record) {

		SqlSession session = this.getSqlSession();

		int result = session.insert("insert", record);

		session.close();

		return result;
	}

	@Override
	public int insertSelective(User record) {

		SqlSession session = this.getSqlSession();

		int result = session.insert("insertSelective", record);

		session.close();

		return result;

	}

	@Override
	public List<User> findAll() {

		SqlSession session = this.getSqlSession();

		List<User> u = session.selectList("findAll");

		session.close();

		return u;
	}

	@Override
	public int deleteById(Integer id) {

		SqlSession session = this.getSqlSession();

		int result = session.delete("deleteById", id);

		session.close();

		return result;
	}

	@Override
	public int updateById(User record) {

		SqlSession session = this.getSqlSession();

		int result = session.update("updateById", record);

		session.close();

		return result;
	}

	@Override
	public User selectById(Integer id) {

		SqlSession session = this.getSqlSession();

		User result = session.selectOne("selectById", id);

		session.close();

		return result;
	}

	@Override
	public List<User> findAllByPage(Integer start, Integer size) {

		Map<String, Integer> result = new HashMap<>();

		result.put("start", start);
		result.put("size", size);

		SqlSession session = this.getSqlSession();

		List<User> users = session.selectList("findAllByPage", result);

		session.close();

		return users;
	}

	@Override
	public Long count() {
		
		SqlSession session = this.getSqlSession();
		
		Long result = session.selectOne("count");
		
		session.close();
		
		return result;
	}

}

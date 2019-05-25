package ssm.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class DaoBase {

	private SqlSessionFactory sqlSessionFactory;
	
	public DaoBase() {
	}

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	public SqlSession getSqlSession() {
		return this.sqlSessionFactory.openSession();
	}

}

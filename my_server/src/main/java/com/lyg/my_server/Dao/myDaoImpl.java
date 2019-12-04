package com.lyg.my_server.Dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class myDaoImpl extends SqlSessionDaoSupport implements myDao {

	@Override
	public String get_pw(String id) {
		// TODO Auto-generated method stub
		return (String)getSqlSession().selectOne("mapper.get_user", id);
	}

}

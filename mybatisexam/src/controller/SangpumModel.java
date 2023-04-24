package controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import model.Board;


public class SangpumModel {
	static SangpumModel model = new SangpumModel();
	public static SangpumModel instance(){
		return model;
	}


	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();

	public List<Board> selectSangpum(){
		List<Board> list = null;
		SqlSession sqlSession = factory.openSession();
		list = sqlSession.selectList("fulls");
		sqlSession.close();
		return list;
	}
}




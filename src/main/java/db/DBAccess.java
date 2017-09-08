package db;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBAccess {
		   public SqlSession getSqlSession() throws Exception{
	    	//通过配置文件获取数据了连接信息
	    	Reader reader=Resources.getResourceAsReader("config/Configuration.xml");
	    	//通过配置信息构建一个sqlSessionFactory
	    	SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
			//通过SqlSessionFactory打开数据库会话
	    	SqlSession sqlSession=sqlSessionFactory.openSession();
	    	return sqlSession;
	    	
	    	
    }
}

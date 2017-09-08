package dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import db.DBAccess;
import pojo.TestItems;
import dao.ITest;

public class TestDao {
	public void insert(List<TestItems> items){
		   DBAccess dbAccess=new DBAccess();
	       	SqlSession sqlSession=null;
	       	for(int i = 0 ; i < items.size() ; i++) {
	       	   System.out.println(items.get(i).getGood());
	       	  System.out.println(items.get(i).getMname());
	       	  System.out.println(items.get(i).getTime());
	       	}
	    	try {
				sqlSession=dbAccess.getSqlSession();
				ITest itest=sqlSession.getMapper(ITest.class);
				itest.insert(items);

				//sqlSession.delete("chat.insert",item);
				sqlSession.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(sqlSession!=null){
					sqlSession.close();
				}
			}
	 }
	@SuppressWarnings({ "null", "unused" })
	public static void main(String[] args) {
		TestDao testdao=new TestDao();
		HashMap<String, TestItems> itemsinsert=new HashMap<String ,TestItems>();
		itemsinsert.put("key", new TestItems());
		  Logger log = null ;
		  log.debug("wwj");
		  log.info(itemsinsert);
		  log.warn(itemsinsert);
		  log.error(itemsinsert);
		 
		
	}
}

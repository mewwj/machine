package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import db.DBAccess;
import pojo.AllItems;
import pojo.DayItems;
import pojo.TestItems;
import dao.ITest;

public class TestDao {
	public void insert(List<TestItems> items){
		   DBAccess dbAccess=new DBAccess();
	       	SqlSession sqlSession=null;
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
	public List<TestItems> selectlist(String time,String pline){
		   DBAccess dbAccess=new DBAccess();
	        List<TestItems> testlist = new ArrayList<TestItems>(); // 信息集合
	        TestItems items=new TestItems();
	       	SqlSession sqlSession=null;
	        items.setTime(time);
	        items.setPline(pline);
	    	try {
				sqlSession=dbAccess.getSqlSession();
				ITest itest=sqlSession.getMapper(ITest.class);
				testlist=itest.selectlist(items);
				//sqlSession.delete("chat.insert",item);
				sqlSession.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(sqlSession!=null){
					sqlSession.close();
				}
			}
			return testlist;
	 }
	public void deleteoneitem(int id){
		   DBAccess dbAccess=new DBAccess();
	      
	      	SqlSession sqlSession=null;
	      	try {
				sqlSession=dbAccess.getSqlSession();
				ITest itest=sqlSession.getMapper(ITest.class);
				System.out.println("传入的id"+ id);
				itest.deleteoneitem(id);
				//sqlSession.delete("chat.deleteoneitem",id);
				sqlSession.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(sqlSession!=null){
					sqlSession.close();
				}
			}
	   }
	public void deleteitems(List<Integer> idlist) {
		DBAccess dbAccess=new DBAccess();
	      
      	SqlSession sqlSession=null;
      	try {
			sqlSession=dbAccess.getSqlSession();
			ITest itest=sqlSession.getMapper(ITest.class);
			System.out.println("传入的id");
			itest.deleteitems(idlist);
			//sqlSession.delete("chat.deleteoneitem",id);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}
	//查找一条数据
	public List<TestItems> selectitem(int id) {
		 DBAccess dbAccess=new DBAccess();
		  List<TestItems> testlist1 = new ArrayList<TestItems>(); // 信息集合
	      	SqlSession sqlSession=null;
	      	try {
				sqlSession=dbAccess.getSqlSession();
				ITest itest=sqlSession.getMapper(ITest.class);
				testlist1=itest.selectitem(id);
				//sqlSession.delete("chat.deleteoneitem",id);
				sqlSession.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(sqlSession!=null){
					sqlSession.close();
				}
			}
			return testlist1;
	}
	public List<DayItems> selectordernumber(String time) {
		 DBAccess dbAccess=new DBAccess();
		  List<DayItems> testlist2 = new ArrayList<DayItems>(); // 信息集合
	      	SqlSession sqlSession=null;
	      	try {
				sqlSession=dbAccess.getSqlSession();
				ITest itest=sqlSession.getMapper(ITest.class);
				testlist2=itest.selectordernumber(time);
				//sqlSession.delete("chat.deleteoneitem",id);
				sqlSession.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(sqlSession!=null){
					sqlSession.close();
				}
			}
			return testlist2;
	}
	public List<AllItems> listallitem(String time ) {
		 DBAccess dbAccess=new DBAccess();
		  List<AllItems> listall = new ArrayList<AllItems>(); // 信息集合
	      	SqlSession sqlSession=null;
	      	try {
				sqlSession=dbAccess.getSqlSession();
				ITest itest=sqlSession.getMapper(ITest.class);
				listall=itest.listallitem(time);
				//sqlSession.delete("chat.deleteoneitem",id);
				sqlSession.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(sqlSession!=null){
					sqlSession.close();
				}
			}
			return listall;
	}
	public void updateitem(List<TestItems> items) {
		DBAccess dbAccess=new DBAccess();
       	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			ITest itest=sqlSession.getMapper(ITest.class);
			itest.updateitem(items);
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
	public List<String> selectpline() {
		 DBAccess dbAccess=new DBAccess();
		  List<String> listpline = new ArrayList<String>(); // 信息集合
	      	SqlSession sqlSession=null;
	      	try {
				sqlSession=dbAccess.getSqlSession();
				ITest itest=sqlSession.getMapper(ITest.class);
				listpline=itest.selectpline();
				//sqlSession.delete("chat.deleteoneitem",id);
				sqlSession.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(sqlSession!=null){
					sqlSession.close();
				}
			}
			return listpline;
	}
	public List<String> selecttestm() {
		 DBAccess dbAccess=new DBAccess();
		  List<String> listtestm = new ArrayList<String>(); // 信息集合
	      	SqlSession sqlSession=null;
	      	try {
				sqlSession=dbAccess.getSqlSession();
				ITest itest=sqlSession.getMapper(ITest.class);
				listtestm=itest.selecttestm();
				//sqlSession.delete("chat.deleteoneitem",id);
				sqlSession.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(sqlSession!=null){
					sqlSession.close();
				}
			}
	      	
			return listtestm;
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
		  HashMap<String, TestItems> selectlist=new HashMap<String ,TestItems>();
			itemsinsert.put("key", new TestItems());
			  Logger log1 = null ;
			  log.debug("wwj");
			  log.info(selectlist);
			  log.warn(selectlist);
			  log.error(selectlist);
			  HashMap<String, TestItems> deleteoneitem=new HashMap<String ,TestItems>();
				itemsinsert.put("key", new TestItems());
				  Logger log2 = null ;
				  log.debug("wwj");
				  log.info(deleteoneitem);
				  log.warn(deleteoneitem);
				  log.error(deleteoneitem);
				  HashMap<String, TestItems> deleteitems=new HashMap<String ,TestItems>();
					itemsinsert.put("key", new TestItems());
					  Logger log3 = null ;
					  log.debug("wwj");
					  log.info(deleteitems);
					  log.warn(deleteitems);
					  log.error(deleteitems);
					  HashMap<String, TestItems> selectitem=new HashMap<String ,TestItems>();
						itemsinsert.put("key", new TestItems());
						  Logger log4 = null ;
						  log.debug("wwj");
						  log.info(selectitem);
						  log.warn(selectitem);
						  log.error(selectitem);
			 HashMap<String, TestItems> selectordernumber=new HashMap<String ,TestItems>();
							itemsinsert.put("key", new TestItems());
							  Logger log5 = null ;
							  log.debug("wwj");
							  log.info(selectordernumber);
							  log.warn(selectordernumber);
							  log.error(selectordernumber);
		 HashMap<String, TestItems> updateitem=new HashMap<String ,TestItems>();
							itemsinsert.put("key", new TestItems());
								  Logger log6 = null ;
							  log.debug("wwj");
							  log.info(updateitem);
							  log.warn(updateitem);
							  log.error(updateitem);	
		  HashMap<String, TestItems> selectpline=new HashMap<String ,TestItems>();
								itemsinsert.put("key", new TestItems());
									  Logger log7 = null ;
								  log.debug("wwj");
								  log.info(selectpline);
								  log.warn(selectpline);
								  log.error(selectpline);			
							  
	}
	
	
	
	
	
}

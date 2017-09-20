package service;

import java.util.List;

import dao.InfoDao;
import dao.TestDao;
import pojo.AllItems;
import pojo.DayItems;
import pojo.TestInfo;
import pojo.TestItems;

public class ListService {
	public List<TestItems> listitems(String time,String pline){
		 TestDao listdao=new TestDao();
		  return listdao.selectlist(time, pline);
		}
	public List<DayItems> selectordernumber(String time){
		  TestDao listdao=new TestDao();
		  return listdao.selectordernumber(time);
		}
	public List<AllItems> listallitem(String time){
		TestDao testdao=new TestDao();
		return testdao.listallitem(time);
	}
	public List<TestInfo> selecttestinfo(){
		InfoDao infodao=new InfoDao();
		return infodao.selecttestinfo();
		
	}
	public Object selectcsrinfo() {
		InfoDao infodao=new InfoDao();
		return infodao.selectcsrinfo();
	}
}
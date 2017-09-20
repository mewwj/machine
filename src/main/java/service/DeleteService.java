package service;

import java.util.ArrayList;
import java.util.List;

import dao.InfoDao;
import dao.TestDao;

public class DeleteService {
	public void deleteoneitem(String id){
		 if(id!=null&&!"".equals(id.trim())){
		 TestDao testdao=new TestDao();
		 testdao.deleteoneitem(Integer.valueOf(id));
		 }
	 }

	public void deleteitems(String[] ids) {
		TestDao testdao=new TestDao();
		 List<Integer> idlist=new ArrayList<Integer>();
		 for(String id:ids){
			 idlist.add(Integer.valueOf(id));
		 }
		 testdao.deleteitems(idlist);	
	}

	public void deleteonetest(Integer idtest) {
		InfoDao infoDao=new InfoDao();
		infoDao.deleteonetest(idtest);	
		
	}

	public void deleteonecsr(Integer idcsr) {
		InfoDao infoDao=new InfoDao();
		infoDao.deleteonecsr(idcsr);		
		
	}

	public void deletecsrbatch(String[] idcsrs) {
		InfoDao infoDao=new InfoDao();
		List<Integer> idcsrlist=new ArrayList<Integer>();
		 for(String id:idcsrs){
			 idcsrlist.add(Integer.valueOf(id));
		 }
		infoDao.deletecsrbatch(idcsrlist);		
		
	}

	public void deletetestbatch(String[] idtests) {
		InfoDao infoDao=new InfoDao();
		List<Integer> idtestlist=new ArrayList<Integer>();
		 for(String id:idtests){
			 idtestlist.add(Integer.valueOf(id));
		 }
		infoDao.deletetestbatch(idtestlist);	
		
	}



}

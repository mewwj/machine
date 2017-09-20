package service;

import java.util.List;

import dao.InfoDao;
import dao.TestDao;
import pojo.TestItems;

public class InsertService {
	
	public void insert(List<TestItems> items){
		TestDao testdao=new TestDao();
		testdao.insert(items);
}

	public void inserttestinfo(List<String> listtest) {
		InfoDao infoDao=new InfoDao();
		infoDao.inserttestinfo(listtest);
	}

	public void insertcsrinfo(List<String> listcsr) {
		InfoDao infoDao=new InfoDao();
		infoDao.insertcsrinfo(listcsr);
		
	}
	
}

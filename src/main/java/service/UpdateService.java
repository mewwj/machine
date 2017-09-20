package service;

import java.util.List;

import dao.InfoDao;
import dao.TestDao;
import pojo.CsrInfo;
import pojo.TestInfo;
import pojo.TestItems;

public class UpdateService {

	public List<TestItems> selectitem(String id) {
		   TestDao testdao=new TestDao();
		   return testdao.selectitem(Integer.valueOf(id));
		
	}
	public void updateitem(List<TestItems> items) {
		   TestDao testdao=new TestDao();
		    testdao.updateitem(items);
		
	}
	public void updateCsrInfo(List<CsrInfo> csrList) {
		InfoDao infoDao=new InfoDao();
		  infoDao.updateCsrInfo(csrList);
	}
	public void updateTestInfo(List<TestInfo> testList) {
		InfoDao infoDao=new InfoDao();
		infoDao.updateTestInfo(testList);
	}

}

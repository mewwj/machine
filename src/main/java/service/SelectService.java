package service;

import java.util.List;

import dao.InfoDao;
import dao.TestDao;
import pojo.CsrInfo;
import pojo.TestInfo;

public class SelectService {
     public List<String> selectpline(){
    	 TestDao tistdao=new TestDao();
		  return tistdao.selectpline();
     }
     public List<String> selecttestm(){
    	 TestDao tistdao=new TestDao();
		  return tistdao.selecttestm();
     }
	public List<CsrInfo> selectonecsrinfo(String idcsr) {
				InfoDao infodao=new InfoDao();
				return infodao.selectonecsrinfo(Integer.valueOf(idcsr));
	}
	public List<TestInfo> selectonetestinfo(String idtest) {
		InfoDao infodao=new InfoDao();
		System.out.println(idtest);
		return infodao.selectonetestinfo(Integer.valueOf(idtest));
	}
	public List<String> selectmstandard() {
		InfoDao infodao=new InfoDao();
		return infodao.selectmstandard();
	}
	public Object selectmname() {
		InfoDao infodao=new InfoDao();
		return infodao.selectmname();
	}
}

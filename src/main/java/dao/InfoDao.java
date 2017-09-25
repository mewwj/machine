package dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import db.DBAccess;
import pojo.CsrInfo;
import pojo.TestInfo;

public class InfoDao {
	public List<TestInfo> selecttestinfo(){
		   DBAccess dbAccess=new DBAccess();
	        List<TestInfo> infolist1 = new ArrayList<TestInfo>(); // 信息集合
	       	SqlSession sqlSession=null;
	    	try {
				sqlSession=dbAccess.getSqlSession();
				Imain itest=sqlSession.getMapper(Imain.class);
				infolist1=itest.selecttestinfo();
				//sqlSession.delete("chat.insert",item);
				sqlSession.commit();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(sqlSession!=null){
					sqlSession.close();
				}
			}
			return infolist1;
	 }

	public List<CsrInfo> selectcsrinfo() {
		DBAccess dbAccess=new DBAccess();
        List<CsrInfo> infolist2 = new ArrayList<CsrInfo>(); // 信息集合
       	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			Imain itest=sqlSession.getMapper(Imain.class);
			infolist2=itest.selectcsrinfo();
			//sqlSession.delete("chat.insert",item);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return infolist2;
}

	public List<CsrInfo> selectonecsrinfo(int idcsr) {
		DBAccess dbAccess=new DBAccess();
        List<CsrInfo> onecsrinfolist = new ArrayList<CsrInfo>(); // 信息集合
       	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			Imain itest=sqlSession.getMapper(Imain.class);
			onecsrinfolist=itest.selectonecsrinfo(idcsr);
			//sqlSession.delete("chat.insert",item);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return onecsrinfolist;
	}

	public List<TestInfo> selectonetestinfo(int idtest) {
		DBAccess dbAccess=new DBAccess();
        List<TestInfo> onetestinfolist = new ArrayList<TestInfo>(); // 信息集合
       	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			Imain itest=sqlSession.getMapper(Imain.class);
			onetestinfolist=itest.selectonetestinfo(idtest);
			//sqlSession.delete("chat.insert",item);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return onetestinfolist;
	}

	public void updateCsrInfo(List<CsrInfo> csrList) {
		DBAccess dbAccess=new DBAccess();
       	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			Imain itest=sqlSession.getMapper(Imain.class);
			itest.updateCsrInfo(csrList);
			System.out.println("update dao");
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

	public void updateTestInfo(List<TestInfo> testList) {
		DBAccess dbAccess=new DBAccess();
       	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			Imain itest=sqlSession.getMapper(Imain.class);
			itest.updateTestInfo(testList);
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

	public void deleteonetest(Integer idtest) {
		DBAccess dbAccess=new DBAccess();
       	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			Imain itest=sqlSession.getMapper(Imain.class);
			itest.deleteonetest(idtest);
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

	public void deleteonecsr(Integer idcsr) {
		DBAccess dbAccess=new DBAccess();
       	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			Imain itest=sqlSession.getMapper(Imain.class);
			itest.deleteonecsr(idcsr);
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

	public void deletecsrbatch(List<Integer> idcsrlist) {
		DBAccess dbAccess=new DBAccess();
       	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			Imain itest=sqlSession.getMapper(Imain.class);
			itest.deletecsrbatch(idcsrlist);
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

	public void deletetestbatch(List<Integer> idtestlist) {
		DBAccess dbAccess=new DBAccess();
       	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			Imain itest=sqlSession.getMapper(Imain.class);
			itest.deletetestbatch(idtestlist);
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

	public void inserttestinfo(List<String> listtest) {
		DBAccess dbAccess=new DBAccess();
       	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			Imain imain=sqlSession.getMapper(Imain.class);
			imain.inserttestinfo(listtest);
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

	public void insertcsrinfo(List<String> listcsr) {
		DBAccess dbAccess=new DBAccess();
       	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			Imain imain=sqlSession.getMapper(Imain.class);
			imain.insertcsrinfo(listcsr);
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

	public List<String> selectmstandard() {
		DBAccess dbAccess=new DBAccess();
        List<String> liststandard = new ArrayList<String>(); // 信息集合
       	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			Imain imain=sqlSession.getMapper(Imain.class);
			liststandard=imain.selectmstandard();
			//sqlSession.delete("chat.insert",item);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return liststandard;
	
	}

	public Object selectmname() {
		DBAccess dbAccess=new DBAccess();
        List<String> listmname = new ArrayList<String>(); // 信息集合
       	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			Imain imain=sqlSession.getMapper(Imain.class);
			listmname=imain.selectmname();
			//sqlSession.delete("chat.insert",item);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return listmname;
	
	}

	public List<TestInfo> selecttestinfoa() {
		DBAccess dbAccess=new DBAccess();
        List<TestInfo> listTestInfo = new ArrayList<TestInfo>(); // 信息集合
       	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			Imain imain=sqlSession.getMapper(Imain.class);
			listTestInfo=imain.selectTestInfoa(listTestInfo);
			//sqlSession.delete("chat.insert",item);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return listTestInfo;
	}

	public List<CsrInfo> selectcsrinfoa() {
		DBAccess dbAccess=new DBAccess();
        List<CsrInfo> listCsrInfo = new ArrayList<CsrInfo>(); // 信息集合
       	SqlSession sqlSession=null;
    	try {
			sqlSession=dbAccess.getSqlSession();
			Imain imain=sqlSession.getMapper(Imain.class);
			listCsrInfo=imain.selectcsrinfoa(listCsrInfo);
			//sqlSession.delete("chat.insert",item);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return listCsrInfo;
	}
}

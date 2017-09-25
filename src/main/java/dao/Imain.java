package dao;

import java.util.List;

import pojo.CsrInfo;
import pojo.TestInfo;

public interface Imain {

	List<TestInfo> selecttestinfo();

	List<CsrInfo> selectcsrinfo();

	List<CsrInfo> selectonecsrinfo(int idcsr);

	List<TestInfo> selectonetestinfo( int idtest);

	void updateCsrInfo(List<CsrInfo> csrList);

	void updateTestInfo(List<TestInfo> testList);

	void deleteonetest(Integer idtest);

	void deleteonecsr(Integer idcsr);

	void deletecsrbatch(List<Integer> idcsrlist);

	void deletetestbatch(List<Integer> idtestlist);

	void inserttestinfo(List<String> listtest);

	void insertcsrinfo(List<String> listcsr);

	List<String> selectmstandard();

	List<String> selectmname();

	List<TestInfo> selectTestInfoa(List<TestInfo> TestList);

	List<CsrInfo> selectcsrinfoa(List<CsrInfo> CsrList);

}

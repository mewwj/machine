package service;

import java.util.List;

import dao.TestDao;
import pojo.TestItems;

public class InsertService {
	
	public void insert(List<TestItems> items){
		TestDao testdao=new TestDao();
		testdao.insert(items);
}}

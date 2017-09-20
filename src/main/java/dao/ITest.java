package dao;

import java.util.List;

import pojo.AllItems;
import pojo.DayItems;
import pojo.TestItems;

public interface ITest {

	public void insert(List<TestItems> items);
	
	public List<TestItems> selectlist(TestItems items);

	public void deleteoneitem(int id);
      
	public void deleteitems(List<Integer> ids);

	public List<TestItems> selectitem(int id);

	public List<DayItems> selectordernumber(String time);

	public List<AllItems> listallitem(String time);

	public void updateitem(List<TestItems> items);

	public List<String> selectpline();

	public List<String> selecttestm();


}

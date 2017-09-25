package servlet;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.TestItems;
import service.InsertService;
import service.ListService;
import service.SelectService;

/**
 * Servlet implementation class DoInsertServlet
 */
public class DoInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DoInsertServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pline=request.getParameter("insertpline");
		String mname=request.getParameter("mname");
		String ordernumber=request.getParameter("ordernumber");
		String testm=request.getParameter("inserttestm");
		String pnumber1=request.getParameter("pnumber");
		int pnumber=Integer.valueOf(pnumber1);
		String time1=request.getParameter("inserttime");
		String good1=request.getParameter("good");
		int good=Integer.valueOf(good1);
		String ng1=request.getParameter("ng");
		int ng=Integer.valueOf(ng1);
		String goodrate1=request.getParameter("goodrate");
		double goodrate2=Double.valueOf(goodrate1);
		String ngrate1=request.getParameter("ngrate");
		double ngrate2=Double.valueOf(ngrate1);
		DecimalFormat df = new DecimalFormat("#.000");  
		 double goodrate=Double.valueOf(df.format(goodrate2));
		double ngrate=Double.valueOf(df.format(ngrate2));
		String spc1=request.getParameter("spc");
		int spc=Integer.valueOf(spc1);
		String thd1=request.getParameter("thd");
		int thd=Integer.valueOf(thd1);
		String oth1=request.getParameter("oth");
		int oth=Integer.valueOf(oth1);
		System.out.println(pline);
		List<TestItems> items=new ArrayList();
		    TestItems testitems=new TestItems();
		    testitems.setPline(pline);
		    testitems.setMname(mname);
		    testitems.setOrdernumber(ordernumber);
		    testitems.setTestm(testm);
		    testitems.setPnumber(pnumber);
		    testitems.setTime(time1);
		    testitems.setGood(good);
		    testitems.setNg(ng);
		    testitems.setGoodrate(goodrate);
		    testitems.setNgrate(ngrate);
		    testitems.setSpc(spc);
		    testitems.setThd(thd);
		    testitems.setOth(oth);
		    items.add(testitems);
		    InsertService insrtService=new InsertService();
		    insrtService.insert(items);
		   
		    request.getRequestDispatcher("/DoListServlet").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

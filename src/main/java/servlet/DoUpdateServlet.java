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
import service.UpdateService;

public class DoUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DoUpdateServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id1=request.getParameter("updateid");
		int id=Integer.valueOf(id1);
		String pline=request.getParameter("updatepline");
		System.out.println(pline);
		String mname=request.getParameter("updatemname");
		String ordernumber=request.getParameter("updateordernumber");
		String mstandard=request.getParameter("updatemtandard");
		String testm=request.getParameter("updatetestm");
		String time1=request.getParameter("updatetime");
		String good1=request.getParameter("updategood");
		int good=Integer.valueOf(good1);
		String ng1=request.getParameter("updateng");
		int ng=Integer.valueOf(ng1);
		int pnumber=good+ng;
		Double goodrate=(double) (good/pnumber);
		Double ngrate=(double) (ng/pnumber);
		System.out.println(ngrate);
		String spc1=request.getParameter("updatespc");
		int spc=Integer.valueOf(spc1);
		String thd1=request.getParameter("updatethd");
		int thd=Integer.valueOf(thd1);
		String oth1=request.getParameter("updateoth");
		int oth=Integer.valueOf(oth1);
		List<TestItems> items=new ArrayList();
		    TestItems testitems=new TestItems();
		    testitems.setId(id);
		    testitems.setPline(pline);
		    testitems.setMname(mname);
		    testitems.setOrdernumber(ordernumber);
		    testitems.setMstandard(mstandard);
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
		    System.out.println("doupdateservlet");
		    UpdateService updateService=new UpdateService();
		        updateService.updateitem(items);
		    request.getRequestDispatcher("/ToListServlet").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

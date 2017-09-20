package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.InfoDao;
import service.InsertService;
import service.SelectService;

/**
 * 到添加界面
 */
public class CSRTEST_DoInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CSRTEST_DoInsertServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		          String pline=request.getParameter("pline");
		          String testm=request.getParameter("testm");
		          InsertService insertService=new InsertService();
		          SelectService selectService=new SelectService(); 
		          String khzah=request.getParameter("khzah");
		          String mname=request.getParameter("mname");
		          String mstandard=request.getParameter("mstandard");
		           request.setAttribute("liststandard",selectService.selectmstandard());
		          if(pline != null && pline.length()>0) {
		        	  List<String> listtest= new ArrayList();
		        	  listtest.add(pline);
		        	  listtest.add(testm);
		        	  insertService.inserttestinfo(listtest);
		        	  request.getRequestDispatcher("WEB-INF/jsp/CSRTESTtestinsert.jsp").forward(request, response);
		          }else {
		          if(khzah != null && khzah.length() > 0) {
		        	  List<String> listcsr= new ArrayList();
		        	      listcsr.add(khzah);
		        	      listcsr.add(mname);
		        	      listcsr.add(mstandard);
		        	      insertService.insertcsrinfo(listcsr);
			        	  request.getRequestDispatcher("WEB-INF/jsp/CSRTESTcsrinsert.jsp").forward(request, response);
		          }else {
		        	  request.getRequestDispatcher("/ToAllServlet").forward(request, response);
		          }
		
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.InfoDao;
import pojo.CsrInfo;
import pojo.TestInfo;
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
		         request.setCharacterEncoding("UTF-8");
		         //获取网页信息
		          String pline=request.getParameter("pline");
		          String testm=request.getParameter("testm");
		          String khzah=request.getParameter("khzah");
		          String mname=request.getParameter("mname");
		          String mstandard=request.getParameter("mstandard");
		          InsertService insertService=new InsertService();
		          SelectService selectService=new SelectService(); 
		          //客户信息集合
		          List<CsrInfo> CsrList =new ArrayList<CsrInfo>();
		          CsrInfo csrinfo=new CsrInfo();
		          csrinfo.setKhzah(khzah);
		          csrinfo.setMname(mname);
		          csrinfo.setMstandard(mstandard);
		          CsrList.add(csrinfo);
		          //测试信息集合
		          List<TestInfo> TestList =new ArrayList<TestInfo>();
		          TestInfo testinfo=new TestInfo();
		          testinfo.setPline(pline);
		          testinfo.setTestm(testm);
		          TestList.add(testinfo);
		          //向网页输出信息
		          String msg;
		           request.setAttribute("liststandard",selectService.selectmstandard());
		           //测试信息判断，是否添加，是否存在
		             if(pline != null && pline.length()>0) {
		        	  if(selectService.selecttestinfoa(TestList)!=null) {
		        		      msg="该信息已经存在";
		        		      request.setAttribute("msg", msg);
		        		      request.getRequestDispatcher("WEB-INF/jsp/CSRTESTtestinsert.jsp").forward(request, response);
		        	  }else {
			        	  List<String> listtest= new ArrayList();
			        	  listtest.add(pline);
			        	  listtest.add(testm);
			        	  insertService.inserttestinfo(listtest);
			        	  msg="添加成功";
			        	  request.setAttribute("msg", msg);
			        	  request.getRequestDispatcher("WEB-INF/jsp/CSRTESTtestinsert.jsp").forward(request, response);
		        	  }
		        	  } 
		        	 
		             //客户信息判断，是否添加，是否存在
		             if(khzah != null && khzah.length() > 0) {
		        		  if( selectService.selectcsrinfoa(CsrList)!=null  ) {
		        			  msg="该信息已经存在";
		        			  request.setAttribute("msg", msg);
		        			  request.getRequestDispatcher("WEB-INF/jsp/CSRTESTcsrinsert.jsp").forward(request, response);
		        		  }else {
		        	  List<String> listcsr= new ArrayList();
		        	      listcsr.add(khzah);
		        	      listcsr.add(mname);
		        	      listcsr.add(mstandard);
		        	      insertService.insertcsrinfo(listcsr);
		        	      msg="添加成功";
		        	      request.setAttribute("msg", msg);
			        	  request.getRequestDispatcher("WEB-INF/jsp/CSRTESTcsrinsert.jsp").forward(request, response);
			        	  }
		               }
		        	  request.getRequestDispatcher("/ToAllServlet").forward(request, response);
	 }
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

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
 * ����ӽ���
 */
public class CSRTEST_DoInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CSRTEST_DoInsertServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		         request.setCharacterEncoding("UTF-8");
		         //��ȡ��ҳ��Ϣ
		          String pline=request.getParameter("pline");
		          String testm=request.getParameter("testm");
		          String khzah=request.getParameter("khzah");
		          String mname=request.getParameter("mname");
		          String mstandard=request.getParameter("mstandard");
		          InsertService insertService=new InsertService();
		          SelectService selectService=new SelectService(); 
		          //�ͻ���Ϣ����
		          List<CsrInfo> CsrList =new ArrayList<CsrInfo>();
		          CsrInfo csrinfo=new CsrInfo();
		          csrinfo.setKhzah(khzah);
		          csrinfo.setMname(mname);
		          csrinfo.setMstandard(mstandard);
		          CsrList.add(csrinfo);
		          //������Ϣ����
		          List<TestInfo> TestList =new ArrayList<TestInfo>();
		          TestInfo testinfo=new TestInfo();
		          testinfo.setPline(pline);
		          testinfo.setTestm(testm);
		          TestList.add(testinfo);
		          //����ҳ�����Ϣ
		          String msg;
		           request.setAttribute("liststandard",selectService.selectmstandard());
		           //������Ϣ�жϣ��Ƿ���ӣ��Ƿ����
		             if(pline != null && pline.length()>0) {
		        	  if(selectService.selecttestinfoa(TestList)!=null) {
		        		      msg="����Ϣ�Ѿ�����";
		        		      request.setAttribute("msg", msg);
		        		      request.getRequestDispatcher("WEB-INF/jsp/CSRTESTtestinsert.jsp").forward(request, response);
		        	  }else {
			        	  List<String> listtest= new ArrayList();
			        	  listtest.add(pline);
			        	  listtest.add(testm);
			        	  insertService.inserttestinfo(listtest);
			        	  msg="��ӳɹ�";
			        	  request.setAttribute("msg", msg);
			        	  request.getRequestDispatcher("WEB-INF/jsp/CSRTESTtestinsert.jsp").forward(request, response);
		        	  }
		        	  } 
		        	 
		             //�ͻ���Ϣ�жϣ��Ƿ���ӣ��Ƿ����
		             if(khzah != null && khzah.length() > 0) {
		        		  if( selectService.selectcsrinfoa(CsrList)!=null  ) {
		        			  msg="����Ϣ�Ѿ�����";
		        			  request.setAttribute("msg", msg);
		        			  request.getRequestDispatcher("WEB-INF/jsp/CSRTESTcsrinsert.jsp").forward(request, response);
		        		  }else {
		        	  List<String> listcsr= new ArrayList();
		        	      listcsr.add(khzah);
		        	      listcsr.add(mname);
		        	      listcsr.add(mstandard);
		        	      insertService.insertcsrinfo(listcsr);
		        	      msg="��ӳɹ�";
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

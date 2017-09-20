package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.CsrInfo;
import pojo.TestInfo;
import service.UpdateService;

public class CSRTEST_UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CSRTEST_UpdateServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String csrid1=request.getParameter("csrid");
				String csrkhzah=request.getParameter("csrkhzah");
				String csrmname=request.getParameter("csrmname");
				String mstandard=request.getParameter("mstandard");
				if(csrid1!=null) {
				int csrid =Integer.valueOf(csrid1);
				List<CsrInfo> csrList=new ArrayList();
				   CsrInfo csrInfo=new CsrInfo();
				   csrInfo.setId(csrid);
				   csrInfo.setKhzah(csrkhzah);
				   csrInfo.setMname(csrmname);
				   csrInfo.setMstandard(mstandard);
				   csrList.add(csrInfo);
				   UpdateService updateService=new UpdateService();
					  if(csrid > 0 ) { updateService.updateCsrInfo(csrList);}
					  }
			        
				
				String testid1=request.getParameter("testid");
					String testpline=request.getParameter("testpline");
					String testtestm=request.getParameter("testtestm");
					if(testid1 != null ) {  
						int testid=Integer.valueOf(testid1);
					List<TestInfo> testList=new ArrayList();
					   TestInfo testInfo=new TestInfo();
					   testInfo.setId(testid);
					   testInfo.setPline(testpline);
					   testInfo.setTestm(testtestm);
					   testList.add(testInfo); 
					  UpdateService updateService=new UpdateService();
				       if(testid > 0) {  updateService.updateTestInfo(testList);}}
	
				    request.getRequestDispatcher("/CSRTEST_ToAllServlet").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

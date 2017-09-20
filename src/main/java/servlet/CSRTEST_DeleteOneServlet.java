package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.DeleteService;

/**
 * 删除一个数据
 */
public class CSRTEST_DeleteOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CSRTEST_DeleteOneServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             String idtest1=request.getParameter("idtest");
		      if(idtest1!=null) {
                      Integer idtest=Integer.valueOf(idtest1);
                        DeleteService deleteservice=new DeleteService();	
                        		deleteservice.deleteonetest(idtest);}
		      
				      String idcsr1= request.getParameter("idcsr");
		               if(idcsr1!=null) {
		            	   	Integer idcsr=Integer.valueOf(idcsr1);
		                  DeleteService deleteservice=new DeleteService();	
		                        		deleteservice.deleteonecsr(idcsr);}
		               request.getRequestDispatcher("/CSRTEST_ToAllServlet").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

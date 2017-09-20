package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SelectService;
import service.UpdateService;

/**
 * 去往修改信息servlet
 */
public class CSRTEST_SelectOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CSRTEST_SelectOneServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//得到id
		
		String idcsr=request.getParameter("idcsr");
		String  idtest=request.getParameter("idtest");
		System.out.println(idcsr+""+idtest);
		//将查询到的值传给页面
		    SelectService selectService=new SelectService();
		    if(idcsr!=null) {
		    	request.setAttribute("listcsr",selectService.selectonecsrinfo(idcsr));
		    }
		    if(idtest!=null) {
		    	request.setAttribute("listtest",selectService.selectonetestinfo(idtest));
		    }
			 request.getRequestDispatcher("/WEB-INF/jsp/CSRTESTupdate.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

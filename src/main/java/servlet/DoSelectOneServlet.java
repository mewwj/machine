package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SelectService;
import service.UpdateService;

public class DoSelectOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DoSelectOneServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		System.out.println(id);
		//将查询到的值传给页面
		   UpdateService updateService=new UpdateService();
		    request.setAttribute("itemslist1", updateService.selectitem(id));
		    SelectService selectService=new SelectService();
			 request.setAttribute("listpline",selectService.selectpline());
			 request.setAttribute("listtestm",selectService.selecttestm());
	      //页面跳转
	   request.getRequestDispatcher("/WEB-INF/jsp/update.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

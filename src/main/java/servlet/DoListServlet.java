package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ListService;
import service.SelectService;

public class DoListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DoListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pline=request.getParameter("pline");
		String time=request.getParameter("time");
		//将查询的值传给页面
		 ListService listservice=new ListService();
		 request.setAttribute("itemslist",listservice.listitems(time, pline));
		 request.getRequestDispatcher("/WEB-INF/jsp/backlist.jsp").forward(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

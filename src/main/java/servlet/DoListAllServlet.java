package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ListService;

public class DoListAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DoListAllServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String time= request.getParameter("listalltime");
		 request.setAttribute("time", time);
		 ListService listservice=new ListService();
		 request.setAttribute("allitemslist",listservice.listallitem(time));
		 request.getRequestDispatcher("/WEB-INF/jsp/listall.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

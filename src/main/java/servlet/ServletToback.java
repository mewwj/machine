package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SelectService;

public class ServletToback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletToback() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 SelectService selectService=new SelectService();
		 request.setAttribute("listpline",selectService.selectpline());
		 request.setAttribute("listtestm",selectService.selecttestm());
		 request.setAttribute("listmname",selectService.selectmname());
		request.getRequestDispatcher("/WEB-INF/jsp/backcontrol.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

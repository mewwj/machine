package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ListService;

/**
 * 去往信息展示界面
 */
public class CSRTEST_ToAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CSRTEST_ToAllServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 ListService listservice=new ListService();
		    
		 request.setAttribute("infolist1",listservice.selecttestinfo());
		 request.setAttribute("infolist2",listservice.selectcsrinfo());
		request.getRequestDispatcher("/WEB-INF/jsp/CSRTESTall.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

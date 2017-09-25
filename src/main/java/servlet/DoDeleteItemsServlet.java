package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.DeleteService;

public class DoDeleteItemsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DoDeleteItemsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		try {
					String[] ids=request.getParameterValues("id");
						//将查询到的值传给页面
				DeleteService deleteService=new DeleteService();
				deleteService.deleteitems(ids);
				request.getRequestDispatcher("/DoListServlet").forward(request, response);
		} catch (Exception e) {
			  request.getRequestDispatcher("/DoListServlet").forward(request, response);
		}
		//刷新展示页面。
	    
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SelectService;

/**
 * 去往添加界面
 */
public class CSRTEST_ToInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CSRTEST_ToInsertServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		              Integer id=Integer.valueOf(request.getParameter("id")) ;
		                  //如果id是1  跳向客户信息添加页面
		              SelectService selectService=new SelectService(); 
		              request.setAttribute("liststandard",selectService.selectmstandard());
		              if(id==1) {
		            	  	request.getRequestDispatcher("WEB-INF/jsp/CSRTESTcsrinsert.jsp").forward(request, response);
				}
		              //如果id是其他  跳向测试信息添加页面
		              else{
					request.getRequestDispatcher("WEB-INF/jsp/CSRTESTtestinsert.jsp").forward(request, response);
				}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

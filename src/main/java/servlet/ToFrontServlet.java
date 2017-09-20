package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ListService;
public class ToFrontServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ToFrontServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Date now = new Date(); 
		  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");//可以方便地修改日期格式
		  String time =null; 
				 time= dateFormat.format( now ); 
		  ListService listservice=new ListService();
		  
		  System.out.println(time);
		 request.setAttribute("itemslist2",listservice.selectordernumber(time));
		request.getRequestDispatcher("WEB-INF/jsp/front/frontlist.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

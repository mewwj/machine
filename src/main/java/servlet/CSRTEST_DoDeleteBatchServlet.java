package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.DeleteService;

/**
 * ɾ���������
 */
public class CSRTEST_DoDeleteBatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CSRTEST_DoDeleteBatchServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				request.setCharacterEncoding("utf-8");
				String[] idcsrs=request.getParameterValues("idcsr");
				if(idcsrs != null) {
					for(String s:idcsrs) {
					System.out.println(s);
				}
					DeleteService deleteService=new DeleteService();
					deleteService.deletecsrbatch(idcsrs);
					
				}else {
					System.out.println("����Ϊ��");
				}
				String[] idtests=request.getParameterValues("idtest");
				System.out.println("123456");
				if(idtests!=null) {
				for(String a:idtests) {
					System.out.println(a);
				}
				//����ѯ����ֵ����ҳ��
				DeleteService deleteService=new DeleteService();
				    deleteService.deletetestbatch(idtests);
				    }else {
				    	System.out.println("����λ��");
				    }
				//ˢ��չʾҳ�档
			     request.getRequestDispatcher("/CSRTEST_ToAllServlet").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

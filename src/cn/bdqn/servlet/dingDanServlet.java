package cn.bdqn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dingDanServlet")
public class dingDanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public dingDanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date1 = request.getParameter("date1");
		String num = request.getParameter("num");
		String phone1 = request.getParameter("phone1");
		String email1 = request.getParameter("email1");
	}

}

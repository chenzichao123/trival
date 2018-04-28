package cn.bdqn.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.bdqn.entity.DingDan;
import cn.bdqn.servers.DingDanServers;
import cn.bdqn.servers.DingDanServersImpl;


@WebServlet("/dingDanServlet")
public class dingDanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    DingDanServers dds=new DingDanServersImpl();
    public dingDanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String date = request.getParameter("date1");
		Date date1=new Date(date);
		String num = request.getParameter("num");
		String name = request.getParameter("name1");
		String phone = request.getParameter("phone1");
		String email = request.getParameter("email1");
		DingDan dingdan=new DingDan(null, new Date(), new Date(), new Date(), null,null , new Date(), name, phone, email);
		
		
	}

}

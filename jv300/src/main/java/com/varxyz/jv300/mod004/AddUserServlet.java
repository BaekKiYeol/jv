package com.varxyz.jv300.mod004;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddUserServlet
 */
@WebServlet("/mod004/user.do")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String id = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		String username = request.getParameter("userName");
		String ssn = request.getParameter("ssn");
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		String[] concerns = request.getParameterValues("concerns");
	
		String pageTitle = "Add User";
	    response.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head><title>" + pageTitle + "</title></head>");
	    out.println("<body>");
	    out.println("<h3 style = font-size : 30px;'> 회원가입완료 " + "</h3>");
	    out.println("<p>아이디 : " + id +"</p>");
	    out.println("<p>비밀번호 : " + passwd +"</p>");
	    out.println("<p>이름 : " + username +"</p>");
	    out.println("<p>주민번호 : " + ssn +"</p>");
	    out.println("<p>이메일 : " + email1 + "@" + email2 +"</p>");
//	    out.println("<p>이메일2 : " + email2 +"</p>");
	    out.println("<p>관심분야 : ");
	    for(String con : concerns) {
	    	out.println("[" + con + "]");
	    }
	    out.println("</p>");
	    out.println("</body></html>");
	    out.close();

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		doGet(request, response);
	}

}

package com.varxyz.jv300.mod002;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Gugudan extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		  String pageTitle = "Gugudan";
	      response.setContentType("text/html; charset=UTF-8");   
	      PrintWriter out = response.getWriter();
	      out.println("<html>");
	      out.println("<head><title>" + pageTitle + "</title></head>");
	      out.println("<body>");
	      out.println("<h3 style = 'color : blueviolet; text-align: center; font-size : 30px;'> 구구단</h3>");
	      out.println("<p style = 'text-align : center;'>"+Gugudan()+"</p>");
	      out.println("</body></html>");
	      out.close();
		}
	
	public String Gugudan() {
		String g = "";
		for (int i = 1; i <= 9; i++) {
		for(int j = 2; j <= 9; j++) {
				g += (j + "X" + i + "=" + j * i + " ");
				if(j == 9) {
					g += "<br>";
				}
			}
		}
		return g;
	}
}
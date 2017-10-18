package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetAtrributeView
 */
public class GetAtrributeView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAtrributeView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.write("<html>");
		out.write("	<body>");
		out.write("<p>"+(String)request.getAttribute("name"));
		out.write("<p>"+(String)request.getAttribute("content"));
		out.write("<p>"+(String)request.getAttribute("city"));
		out.write("<p>"+(String)request.getAttribute("sradio"));
		
		if(request.getAttribute("pet") != null) {
			String[] attributePet = (String[])request.getAttribute("pet");
			for(int i= 0; i<attributePet.length; i++) {
				out.write("<p>pet : "+ attributePet[i]);
			}
		}
		out.write("	</body>");
		out.write("</html>");
		
	
	}

}

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCycle
 */
public class ServletCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCycle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
//	public void init(ServletConfig config) throws ServletException {
//		super.init(config);
//		System.out.println("init staaaaaaaaaat ");
//	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroyed.");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service");
		
		
		response.setCharacterEncoding("euc_kr");

		PrintWriter out = response.getWriter();
		
		String servletName = getServletName();
		
		String servletContext = getServletContext().getServletContextName();
		String realPath = getServletContext().getRealPath(servletName);
		
		out.write("\nservletContext 이름 :"+servletContext);
		out.write("\nservlet 이름 : "+servletName);
		out.write("\n"+servletName+"servlet 경로 : "+realPath);
	}

}

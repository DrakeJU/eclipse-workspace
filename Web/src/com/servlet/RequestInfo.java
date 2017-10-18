package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestInfo
 */
public class RequestInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("euc_kr");
		PrintWriter out = response.getWriter();
		
		out.write("<html>");
		out.write("	<body>");
		out.write("		서버 이름 : "+ request.getServerName());
		out.write("<p>		서버 프로토콜 : "+request.getProtocol()); //약속한 귀약
		out.write("<p>		서버 포트 : "+ request.getServerPort());
		out.write("<p>		전달 방식 : "+ request.getMethod());
		out.write("<p>		서버 루트 : "+ request.getSession().getServletContext().getRealPath("/"));
		out.write("<p>		QueryString : "+request.getQueryString()); //get 방식에서만 쓰여짐
		out.write("<p>		클라이언트 ip : " +request.getRemoteAddr());
		out.write("<p>		접속이전페이지 : " +request.getHeader("Referer"));
		out.write("<p>		접속브라우저 정보: " +request.getHeader("User-Agent"));
		out.write("	</body>");
		out.write("</html>");
		
		
		
	}

}

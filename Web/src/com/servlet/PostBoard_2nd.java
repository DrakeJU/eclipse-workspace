package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class PostBoard_2nd
 */
public class PostBoard_2nd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostBoard_2nd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		int totalPost = Integer.valueOf(request.getParameter("TotalPost"));//총 포스팅 수
		int postlimitperPage = Integer.valueOf(request.getParameter("PostLimit"));//페이지에 포스팅수
		int subLineNum = Integer.valueOf(request.getParameter("NumPerPage"));//페이지에 페이지 표시수
		int currentPage = Integer.valueOf(request.getParameter("CurrentPage"));//현재 페이지
		
		int pageLevel = 1;
		int perPage = totalPost-((currentPage-1)*postlimitperPage);//선택한 페이지에 출력될만큼만 출력하게
		int startpage = (int)(((double)currentPage/postlimitperPage)*currentPage);
		int endpage = startpage+postlimitperPage-1;
		int maxpage = (int)((double)totalPost/postlimitperPage + 1);
		
		
		out.write("<html>");
		out.write("<body>");
		out.write("TotalPost : "+totalPost+"<p>");
		out.write("postlimitperPage : "+postlimitperPage+"<p>");
		out.write("subLineNum : "+subLineNum+"<p>");
		out.write("CurrentPage : "+currentPage+"<p>");
		out.write("start page : "+startpage+"<p>");
		out.write("end page : "+endpage+"<p>");
		out.write("<table width = '100%' border='1'><tr></tr></table><p>");
		
		
		for(int i = perPage; i>=(perPage-postlimitperPage); i--) {
			if(i>0) {
				out.write("게시물 번호 : "+i+"<br>");
			}
		}
		
		if( startpage != 1) {
			out.write("[이전]");
		}
		for( int i = startpage; i<=endpage; i++) {
			out.write(i);
			if(i == currentPage) {
				out.write("["+i+"]");
			}else {
				out.write("&nbsp;&nbsp;"+i+"&nbsp;&nbsp;");
			}
		}
		if( endpage>maxpage) {
			out.write("[다음]");
		}

		out.write("</body>");
		out.write("</html>");
		
		
	}

}

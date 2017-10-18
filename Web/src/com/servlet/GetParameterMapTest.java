package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetParameterMapTest
 */
public class GetParameterMapTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetParameterMapTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		Map<String, String[]> map = request.getParameterMap();
		Set<String> mk = map.keySet(); //모든 키들과 키값이 mk에 저장되어
		Iterator<String> keyiterator = mk.iterator();// 키값들이 빠지게됨
		String key;
		String[] values = null;
		
		out.write("<html>");
		out.write("	<body>");
 		while(keyiterator.hasNext()) {
			key =(String)keyiterator.next();
			values = request.getParameterValues(key);
			for(int i = 0; i<values.length; i++) {
				out.write("<p> 선택한 key : "+key+"<p> 값들 : "+values[i]);
			}
		}
		out.write("	</body>");
		out.write("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

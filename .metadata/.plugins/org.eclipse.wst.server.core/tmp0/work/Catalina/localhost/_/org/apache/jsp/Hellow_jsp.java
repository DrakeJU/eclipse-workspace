/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.82
 * Generated at: 2017-10-18 07:36:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public final class Hellow_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\tHello world!\n");
      out.write("\t안녕하세요 처음으로 시작합니다.\n");
      out.write("\t");

		String name = "홍길동";
		//out.print(name);
		System.out.println("로그에 초기 페이지 접근 남기기");
	
      out.write('\n');
      out.write('	');

		String id = "용하";
		out.print(id);
	
      out.write("\n");
      out.write("\t<p>\n");
      out.write("\tout 객체를 사용하지 않고 직접출력방법:\n");
      out.write("\t");
      out.print( id );
      out.write("\n");
      out.write("\t<p>\n");
      out.write("\t<table border = \"1\">\n");
      out.write("\t");
for(int i = 1; i<=10 ;i++){
	
      out.write('\n');
      out.write('	');
      out.write('	');
//=i 
      out.write(" <td>");
out.print(i);
      out.write("</td>\n");
      out.write("\t");

	}
	
      out.write("\n");
      out.write("\t</table>\n");
      out.write("\t\n");
      out.write("\t<p> 시작\n");
      out.write("\t\n");
      out.write("\t");
 
		int num;
		Random r1 = new Random();
		num = r1.nextInt(30)+1;
	
      out.write("\n");
      out.write("\t\n");
      out.write("\t");
 	
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat a = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm 분 ss초");
	
      out.write("\n");
      out.write("\t\n");
      out.write("\t");

		int col = 4;
		int row = 4;
		int blankCnt = 0;
	
      out.write("\n");
      out.write("\t<table border = \"1\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td colspan = \"4\">생성된 숫자는 ");
      out.print(num);
      out.write("<br>[");
 out.write(a.format(cal.getTime())); 
      out.write("]</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t");

			for (int i = 1; i <= col * row; i++) {
				if (i % 4 == 1) {
					out.print("<tr>");
				}
				if (i <= num) {
					out.print("<td>" + i + "</td>");
				} else {
					blankCnt++;
					out.print("<td>" + "</td>");
				}
				if (i % 4 == 0) {
					out.print("</tr>");
				}
			}
		
      out.write("\n");
      out.write("\t</table>\n");
      out.write("\t<p>\n");
      out.write("\t<form action =\"./reciveHello.jsp\" method=\"post\" target=\"_self\">\n");
      out.write("\t\t난  수 <input type =\"text\" name = \"randomNum\" value = ");
      out.print(num);
      out.write("><br>\n");
      out.write("\t\t빈칸 수 <input type =\"text\" name = \"blank\" value = ");
      out.print(blankCnt);
      out.write("><br>\n");
      out.write("\t\t<input type = \"submit\" value = \"보내기\">\n");
      out.write("\t\t\n");
      out.write("\t</form>\t\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

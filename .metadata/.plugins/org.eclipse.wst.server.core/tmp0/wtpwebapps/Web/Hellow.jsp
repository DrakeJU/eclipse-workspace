
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	Hello world!
	안녕하세요 처음으로 시작합니다.
	<%
		String name = "홍길동";
		//out.print(name);
		System.out.println("로그에 초기 페이지 접근 남기기");
	%>
	<%
		String id = "용하";
		out.print(id);
	%>
	<p>
	out 객체를 사용하지 않고 직접출력방법:
	<%= id %>
	<p>
	<table border = "1">
	<%for(int i = 1; i<=10 ;i++){
	%>
		<%//=i %> <td><%out.print(i);%></td>
	<%
	}
	%>
	</table>
	
	<p> 시작
	
	<% 
		int num;
		Random r1 = new Random();
		num = r1.nextInt(30)+1;
	%>
	
	<% 	
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat a = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm 분 ss초");
	%>
	
	<%
		int col = 4;
		int row = 4;
		int blankCnt = 0;
	%>
	<table border = "1">
		<tr>
			<td colspan = "4">생성된 숫자는 <%=num%><br>[<% out.write(a.format(cal.getTime())); %>]</td>
		</tr>
		
		
		<%
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
		%>
	</table>
	<p>
	<form action ="./reciveHello.jsp" method="post" target="_self">
		난  수 <input type ="text" name = "randomNum" value = <%=num%>><br>
		빈칸 수 <input type ="text" name = "blank" value = <%=blankCnt%>><br>
		<input type = "submit" value = "보내기">
		
	</form>	
	
</body>
</html>
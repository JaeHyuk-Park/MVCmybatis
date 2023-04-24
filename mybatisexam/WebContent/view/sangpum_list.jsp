<%@page import="model.Board"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		ArrayList<Board> list = (ArrayList<Board>)request.getAttribute("data");
		for(int i=0; i<list.size(); i++){
			out.println("번호 : "+list.get(i).getNum()+"<br>");
			out.println("이름 : " +list.get(i).getName()+"<br>");
			out.println("제목 : "+list.get(i).getTitle()+"<br>");
			out.println("일시 : "+list.get(i).getDate()+"<br>");
		}
	
	%>
</body>
</html>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>action tag</title>
</head>
<body>
<%
  SimpleDateFormat sdf = new SimpleDateFormat("오늘은 yyyy년 MM월 dd일(E요일)입니다.");
  String sDate = sdf.format(new Date());
%>
<h2> 오늘은 2020년 06월 23일(화요일)입니다.</h2>
<h2><%=sDate%></h2>
</body>
</html>
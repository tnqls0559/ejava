<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>layout</title>
</head>
<body>
<table width="400" border="1" cellpadding="0" cellspacing="0">
<tr>
 <td colspan="2">
   <jsp:include page="/module/top.jsp" flush="false"/>
 </td>
</tr>
<tr>
  <td>
    <jsp:include page="/module/left.jsp"flush="false"/>
    <td width="300" valign="top">
    <td>
   <jsp:include page="content.jsp"/>
  </td>
</tr>
<tr>
  <td colspan="2">
   <jsp:include page="/module/bottom.jsp"flush="false"/>
  </td>
</tr>
</table>
</body>
</html>
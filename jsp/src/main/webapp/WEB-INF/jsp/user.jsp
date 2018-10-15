<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/15 0015
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<html>
<head>
    <title>Title</title>
</head>
<body>
    日期：<%= new Date() %><br>
    IP:<%= request.getRemoteAddr()%><br>
    <%
        for (int i = 0; i < (int)session.getAttribute("count");i++){
    %>
        。。。<br>
    <%}%>
    <p>c:if标签</p>
    <c:if test="${username != null}">
        <p>用户名：${username}</p>
    </c:if>

    <p>c:choose标签</p>
    <c:choose>
        <c:when test="${salary <= 0}">
            <= 0<br>
        </c:when>
        <c:when test="${salary >= 100}">
            >= 1000<br>
        </c:when>
        <c:otherwise>
            ====<br>
        </c:otherwise>
    </c:choose>
<%@ include file="footer.jsp"%>
<jsp:include page="footer.jsp" flush="true"/>
</body>
</html>

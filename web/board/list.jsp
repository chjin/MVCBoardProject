<%--
  Created by IntelliJ IDEA.
  User: cjw
  Date: 2016-04-01
  Time: 오전 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="EUC-KR" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="table.css">
</head>
<body>
    <center>
        <h3>게시판!</h3>
        <table border="0" width="600">
            <tr>
                <td align="left">
                    <a href="insert.do">
                        <img src="image/btn_write.gif" border="0">
                    </a>
                </td>
            </tr>
        </table>

        <table id="table_content">
            <tr>
                <th width="10%">번호</th>
                <th width="45%">제목</th>
                <th width="15%">이름</th>
                <th width="20%">작성일</th>
                <th width="10%">조회수</th>
            </tr>

            <c:forEach var="dto" items="${list}">
                <tr class="dataTr">
                    <td width="10%" class="tdcenter">${dto.no}</td>
                </tr>
            </c:forEach>
        </table>
    </center>
</body>
</html>



















































































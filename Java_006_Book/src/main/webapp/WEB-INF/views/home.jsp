<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>반갑습니다</h1>
		<h5>주문번호를 입력하고 Enter</h5>
	<form action="rent/seq">
		<input name="id">
		<button>전송</button>
	</form>
	
		<a href="rent/order">도서대여신청</a>
		<p>
	<c:forEach items="${BRLIST}" var="BR">
		
			<a href="rent/seq?id=${BR.br_seq}"> 
			${BR. }br_seq ${br_seq }
			${br_bcode } ${br_bname } ${br_tel } ${br_isbn } ${br_title } </a>
			${br_edate } ${br_price } ${br_sdate}
	</c:forEach>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h1 {
	background-color: rgba(0, 255, 0, 0.7); /* 배경 색*/
	color: white; /* 글자색 */
	padding: 1.2rem;
	text-align: center; /* 글자 위치 */
}

a {
	text-decoration: none;
}
/*
	CSS 3를 사용한 interactive 스타일 지정 
	동적(Dyanamic) 스타일 지정 
	*/

/* CSS 3 */
/* a tag에 마우스가 떠 있으면 */
a:hover {
	text-decoration: underline;
	background-color: rgba(0, 0, 255, 0.3);
}
</style>
</head>
<body>
	<h1>다이어트를 도와줘!!</h1>
	<!-- >> diet context diet값을 자동으로 바꿔줌. 그래서 변경되었을대 수정할 필요 x /diet/food/search -->
	<a href="${pageContext.request.contextPath}/food/search">섭취정보 등록</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>날짜별 식품섭취 리스트</h1>
	<C:if test=$"{empty MFLIST}">등록된 섭취정보가 없습니다.</C:if>
		<table>
			<tr>
			<th>날짜</th><th>식품명</th><th>섭취량</th><th>총내용량</th><th>에너지</th><th>단백질</th><th>지방</th><th>탄수화물</th><th>총당류</th>
			</tr>
			
			<C:forEach items="${MFLIST}" var="MF">
			<tr>
			<td>${MF.mf_date}</td>
			<td>${MF.fd_name}</td>
			<td>${MF.mf_intake}</td>
			<td>${MF.fd_kcal}</td>
			<td>${MF.fd_protein}</td>
			<td>${MF.fd_roll}</td>
			<td>${MF.fd_cbhd}</td>
			<td>${MF.fd_sugar}</td>
			</tr>	
			</C:forEach>
		</table>
	<nav>
		<ul>
		
		<li><strong><a herf="name">섭취정보 추가하기</a></strong>
		<li><strong><a herf="name">섭취정보 조회하기</a></strong>
		
		</ul>
	
	</nav>
		
	
</body>
</html>
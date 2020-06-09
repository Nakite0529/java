<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>
	<%
		// 1~100 짝수의 합?
		int sum=0;
		for(int i=1; i<=100;i++){
			if(i%2==0){
				sum+=i;
				
			}
		}
		
	%>
	결괏값 : <%=sum %>
	</h1>
	
</body>
</html>
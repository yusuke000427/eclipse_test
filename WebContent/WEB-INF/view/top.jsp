<%@ page import="java.util.ArrayList"%>
<%@ page import="bean.bean"%>
<%@ page import="dao.dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./css/style.css">
<meta charset="UTF-8">
<title>掲示板課題</title>
</head>
<body>
	書き込み
	<br>
	<form action="/keiziban/kanri" method="get">
		<input type="submit" value="管理者画面へ"><br>
	</form>
	<form action="/keiziban/top" method="get">
		投稿者:<input type="text" name="name"><br>
		内容:<input type="text" name="coment"><br>
		メールアドレス:<input type="text" name="mail"><br>
		<input type="submit"value="投稿"><br>
	</form>
-----------------------------------------------------------------------------------------------------------------<br>
		<%
	ArrayList<bean>bean = (ArrayList<bean>)request.getAttribute("list");
	for(int i = 0 ; i < bean.size() ; i++){
		bean ren2 = bean.get(i);
	%>
			<p>コメント:<%=ren2.getComent() %></p><br>
<%=ren2.getId() %>  投稿者:<%=ren2.getName() %>  投稿時間:<%=ren2.getKakitime() %>  編集時間:<%=ren2.getHentime() %><br>
-----------------------------------------------------------------------------------------------------------------<br>

		<%
	}
	%>
}
</body>
</html>
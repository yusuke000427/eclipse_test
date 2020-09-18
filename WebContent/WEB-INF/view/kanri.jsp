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
<title>管理画面</title>
</head>
<body>
	<form action="/keiziban/top" method="get">
		<input type="submit" value="メイン画面へ"><br>
	</form>
	削除するIDを入力<br>
	<form action="/keiziban/kanri" method="get">
		ID:<input type="text" name="id"><br>
		<input type="submit"value="削除"><br>
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
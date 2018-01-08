<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>手表商店后台</title>
</head>
<frameset rows="0,*" cols="*" frameborder="no" border="0" framespacing="0">
  <frame />
  <frameset cols="187,*" frameborder="no" border="0" framespacing="0">
    <frame src="<%=request.getContextPath()%>/Admin/Admin_left.html" name="leftFrame" scrolling="no" noresize="noresize" id="leftFrame" title="leftFrame" />
    <frame src="<%=request.getContextPath()%>/Admin/result.jsp?shop=${param.shop }" name="rightFrame" id="rightFrame" title="rightFrame" />
  </frameset>
</frameset>
<body>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
<link href="<%=request.getContextPath()%>/Admin/css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>

	<div class="formbody">
    
    
    <ul class="forminfo">
    
    	<table>
    		<tr> 
    			<td>编号</td>
    			<td>名称</td>
    			<td>图片地址</td>
    			<td>价格</td>
    		</tr>
		<c:forEach items="${shop }" var="shop" varStatus="status">
			<li>
			<tr>
				<td>${shop.num }</td>
				<td>${shop.name }</td>
				<td>${shop.img }</td>
				<td>${shop.price}</td>
			</tr>
			</li>
		</c:forEach>
	</table>
   		
	</ul>

    
    </div>
</body>
</html>
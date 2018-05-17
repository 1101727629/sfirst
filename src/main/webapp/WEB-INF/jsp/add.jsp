<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
     <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
     <c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" href="${contextPath}/assets/css/css.css" rel="stylesheet" />
<script type="text/javascript" src="${contextPath}/assets/js/jquery.js"></script>
<script type="text/javascript" src="${contextPath}/assets/js/js.js"></script>
</head>
<body>
<span class="green add">[添加]</span>
 <form:form  action="" method="post" commandName="address"  >
   
   <div class="address">
    <div class="addList">
     <label><span class="red">* </span>选择地区:</label>
     <select name="area">
      <option>请选择省</option>
       <option>湖南省</option>
     </select>
     <select name="area">
      <option>请选择市</option>
      <option>长沙市</option>
     </select>
     <select name="area">
      <option>请选择地区</option>
      <option>长沙县</option>
     </select>
    </div><!--addList-->
    <div class="addList">
     <label><span class="red">* </span>详细地址:</label>
     <form:input  type="text" path="address"/>
    </div><!--addList-->
    <div class="addList">
     <label><span class="red">* </span>邮政编码:</label>
     <form:input type="text" path="zip_code"/>
    </div><!--addList-->
    <div class="addList">
     <label><span class="red">* </span>收件人:</label>
     <form:input type="text" path="name" />
    </div><!--addList-->
    <div class="addList">
     <label><span class="red">* </span>手机号码:</label>
     <form:input type="text" path="phone"/> 或者固定电话 <input type="text" path="phone"/>
    </div><!--addList--> 
    <div class="addList2">
     <input  value=" 确 认 " type="submit"  />
    </div><!--addList2/-->
   </div><!--address/-->
    </form:form><!--/-->
</body>
</html>
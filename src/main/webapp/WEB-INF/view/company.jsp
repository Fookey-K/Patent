<%--
  Created by IntelliJ IDEA.
  User: Fookey
  Date: 2017/7/3
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basepath = request.getServletContext().getServletContextName();
    pageContext.setAttribute("basepath", basepath);
%>
<html>
<head>
    <title>Title</title>
    <script language="JavaScript" src="/${basepath}/js/jquery-3.1.1.min.js" type="text/javascript" ></script>
    <link rel="stylesheet" href="/${basepath}/css/crud.css" type="text/css">
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <div id="cmpSearchBox" class="form-inline">
        <%--查询div--%>
        <label class="cmpId">机构编号：</label>
        <input type="text" id="cmpIdx" name="cmpId" value="${cmpMainDto.cmpId}" class="form-control">
        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
        <label class="cmpId">机构名称：</label>
        <input type="text" id="cmpNamenx" name="cmpNamen" value="${cmpMainDto.cmpNamen}" class="form-control">
        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
        <input type="button" id="search" value="查询" class="btn btn-info">
        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
        <input type="reset" id="console" value="取消" class="btn btn-info">
        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
        <button class="form-control" id="addCmpMsg">增加</button>
    </div>

    <div class="cmpMagTabBox">
        <%--列表信息--%>
        <table id="cmpMagTab">
            <tr class="cmpMagTabTr">
                <td>选择</td>
                <td>机构代码</td>
                <td>机构名称</td>
                <td>联系人</td>
                <td>联系电话</td>
                <td>传真</td>
                <td>地址</td>
                <td>删除</td>
            </tr>
        </table>
        <br/>
        <div>
            <%--分页导航--%>
            <div id="pageNavigation"></div>
        </div>

    </div>

    <script type="text/javascript">


    </script>


</body>
</html>

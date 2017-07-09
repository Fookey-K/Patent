<%--
  Created by IntelliJ IDEA.
  User: Fookey
  Date: 2017/7/1
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<% String basepath = request.getServletContext().getServletContextName();
    pageContext.setAttribute("basepath", basepath);
%>
<html>
<head>
    <title>main</title>
    <link rel="stylesheet" type="text/css" href="/${basepath}/easyUi/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/${basepath}/easyUi/themes/icon.css">
    <script type="text/javascript" src="/${basepath}/easyUi/jquery.min.js"></script>
    <script type="text/javascript" src="/${basepath}/easyUi/jquery.easyui.min.js"></script>
    <%--<link type="text/css" href="/${basepath}/css/cssAll.css" rel="stylesheet">--%>
</head>
<body id="main">
    <div class="easyui-layout" style="width:100%;height:100%;">
        <div data-options="region:'north'" style="height:50px">
            <h2>专利管理系统</h2>
        </div>
        <div data-options="region:'south',split:true" style="height:50px;">south</div>
        <div data-options="region:'west',split:true" title="Menu" style="width:200px;">
            <div id="divMenu" class="easyui-accordion" style="width:195px">
            </div>
        </div>
        <div data-options="region:'center',title:'Main Title',iconCls:'icon-ok'">
            <div id="divTab" class="easyui-tabs" style="width:100%;height:100%;"></div>
        </div>
    </div>

    <script>
        $(document).ready(function(){

            //获取数据
            var menu = '<%=request.getAttribute("menuList") %>';
            var menuList = eval("("+menu+")");
            console.log(menuList);

            var menuTypeName = "";
            var x;
            var childMenu = '<ul style="list-style:none;">';
            for(x in menuList){

                if(menuTypeName != "" && menuTypeName != menuList[x].typeName){
                    console.log("menuTypeName:"+menuList[x].typeName);
                    childMenu += "</ul>";
                    //点击事件
                    $('#divMenu').accordion('add',{
                        title:menuTypeName,
                        content:childMenu
                    });
                    childMenu = '<ul style="list-style:none;">';
                }
                //childMenu += '<li><a href="##">'+menuList[x].menuName+'</a></li> ';
                childMenu += '<li><a href="##" class="easyui-linkbutton" onclick="addTab(\''
                    +menuList[x].menuName+'\',\'/<%=basepath %>'+menuList[x].urlAddress+'\')">'+menuList[x].menuName+'</a></li> ';
                    console.log(menuList[x].urlAddress);
                menuTypeName = menuList[x].typeName;
            }
            if (childMenu != '<ul style="list-style:none;">') {
                childMenu += "</ul>"
                //点击事件
                $('#divMenu').accordion('add',{
                    title:menuTypeName,
                    content:childMenu
                });
            }
        });

        //动态添加tab标签
        function addTab(title, url){
            if ($('#divTab').tabs('exists', title)){
                $('#divTab').tabs('select', title);
            } else {
                var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
                $('#divTab').tabs('add',{
                    title:title,
                    content:content,
                    closable:true
                });
            }
        }

    </script>

</body>
</html>

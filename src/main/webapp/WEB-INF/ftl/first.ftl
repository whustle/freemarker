<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <base href="">
    <title>Title</title>
    <link rel="stylesheet" href="css/layui.css"  media="all">
</head>
<body>
<h3>hello </h3>
<h4>welcome ${name} <#if name=="wang">,老板</#if></h4>
<h4>${user.age}&nbsp;${user.username}</h4>
<div class="layui-form">
    <table class="layui-table">
        <colgroup>
            <col width="50">
            <col width="50">
            <col width="50">
            <col>
        </colgroup>
        <thead>
        <tr>
            <th>序号</th>
            <th>姓名</th>
            <th>年龄</th>
        </tr>
        </thead>
        <tbody>
        <#list userList as user >
            <tr>
                <td>${user_index+1}</td>
                <td>${user.username}</td>
                <td>${user.age}</td>
            </tr>
        </#list>
        </tbody>
    </table>
</div>
<#--<#include "/copyright.html">-->
</body>
</html>
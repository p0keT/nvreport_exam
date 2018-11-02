<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
<html>
<head>
    <title>Users</title>
</head>
<body>
        <#if scenes?has_content>
        <ul>
                <#list scenes as scene>
                    <li>${scene.scene_id}</li>
                </#list>
        </ul>
        <#else>
            <p>No Scenes</p>
        </#if>
        <@sf.form action="/scenes" method="post" modelAttribute="line">
            <div>
                <@sf.label path="scene_id">Scene:</@sf.label>
                <@sf.input path="scene_id"/>
                <#--<@sf.errors path="name"/>-->
            </div>
        <input type="submit">
        </@sf.form>
</body>
</html>
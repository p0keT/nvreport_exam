<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
<html>
<head>
    <title>Users</title>
</head>
<body>
    <#if lines?has_content>
    <ul>
        <#list lines as line>
            <li>${line.lineTitle}</li>
        </#list>
    </ul>
    <#else>
    <p>No Lines</p>
    </#if>

        <@sf.form action="/lines" method="post" modelAttribute="linePassingInfo">
            <div>
                <@sf.label path="lineName">lineTitle:</@sf.label>
                <@sf.input path="lineName"/>
                   <#--<@sf.errors path="name"/>-->
            </div>
            <div>
                <@sf.label path="dateTimeStart">Date Start:</@sf.label>
                <@sf.input path="dateTimeStart"/>
                    <#--<@sf.errors path="name"/>-->
            </div>
            <div>
                <@sf.label path="dateTimeEnd">Date End:</@sf.label>
                <@sf.input path="dateTimeEnd"/>
                    <#--<@sf.errors path="name"/>-->
            </div>




        <input type="submit">
        </@sf.form>

</body>
</html>
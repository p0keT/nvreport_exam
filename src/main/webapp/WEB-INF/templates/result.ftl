<html>
<head>
    <title>Users</title>
</head>
<body>

        <table class="datatable" border="1">
            <tr>
                <th>In</th>
                <th>Out</th>
                <th>Hour</th>
            </tr>
            <#list results as result>
              <tr>
                  <td>${result.inNumber}</td>
                  <td>${result.outNumber}</td>
                  <td>${result.hour}</td>
              </tr>
            </#list>
        </table>

</body>
</html>
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <g:set var="entityName" value="${message(code: 'item.label', default: 'Item')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>
<a href="#list-item" class="skip" tabindex="-1"><g:message code="default.link.skip.label"
                                                           default="Skip to content&hellip;"/></a>

<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="create" action="create"><g:message code="default.new.label"
                                                              args="[entityName]"/></g:link></li>
    </ul>
</div>

<div id="list-item" class="content scaffold-list" role="main">
    <h1><g:message code="default.list.label" args="[entityName]"/></h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>

    <table>
        <tr>
            <td>Titulo</td>
            <td>SubTitulo</td>
            <td>Categoria</td>
            <td>Precio</td>
        </tr>
        <g:each in="${itemList}" var="item">

            <tr>
                <td><g:link controller="item" action="show" id="${item.id}">${item.title}</g:link></td>
                <td>${item.subTitle}</td>
                <td>${item.categoryId}</td>
                <td>${item.price}</td>
            </tr>

        </g:each>
    </table>

    <div class="pagination">
        <g:paginate total="${itemCount ?: 0}"/>
    </div>
</div>
</body>
</html>

<script type="text/javascript">
    function showItem(id){
        $(document).ready(function(){
            var URL="${createLink(controller: 'ItemController', action: 'show')}"
            $.ajax({
                url:URL,
                data: {id:id},
                success: function(resp){
                    console.log(resp);
                    alert(resp)
                }
            });
        });
    }
</script>
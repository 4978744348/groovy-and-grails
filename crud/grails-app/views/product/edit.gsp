<!doctype html>
<html>
    <head>

    </head>
    <body>
    <g:form action="Update" id="${product.id}">

        <label> Name: </label>
        <g:textField name="name" value="${product.name}"/><br/>

        <label>sku: </label>
        <g:textField name="sku" value="${product.sku}"/><br/>

        <label>Price: </label>
        <g:textField name="price" value="${product.price}"/><br/>

        <g:actionSubmit value="Update"/>

    </g:form>
    </body>
</html>

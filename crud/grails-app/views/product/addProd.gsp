<!doctype html>
<html>
    <head>

    </head>
    <body>

    <g:form controller="product" action="save">
        <label> Name: </label>
        <g:textField name="name"/><br/>
        <label>sku: </label>
        <g:textField name="sku"/><br/>
        <label>Price: </label>
        <g:textField name="price"/><br/>
        <g:actionSubmit value="Save"/>
    </g:form>


    </body>
</html>

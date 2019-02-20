<!doctype html>
<html>
    <head>

    </head>
    <body>
    Name: ${prod.name}<br />
   Sku: ${prod.sku}<br />
    Price: ${prod.price}<br />
    <g:link action="edit" id="${prod.id}">Edit</g:link><br />
    <g:link action="delete" id="${prod.id}">Delete</g:link>
    </body>
</html>

<!doctype html>
<html>
<head>
    <asset:javascript src="test.js"/>
    <asset:stylesheet src="bootstrap.css"/>
    <title>Welcome to Grails</title>
</head>
<body style="background: whitesmoke; margin: 0px 225px 0px 225px">
<p style="background: #5e5e5e; text-underline-color: whitesmoke">Hello: ${user.username}</p>

  <table class="table table-hover" style="margin: 25px 25px 25px 25px; border: #006dba; " >

    <thead>
    <tr>
      <th scope="col"></th>
      <th scope="col">Name</th>
      <th scope="col">Sku</th>
      <th scope="col">Price</th>
</tr>
</thead>
    <tbody>
      <g:each in="${product}" var="prod">
            <tr class="table-warning>
               <th scope="row"></th>
                <td>
                    ${prod.name}
                </td>
                <td>
                    ${prod.sku}
                </td>
                <td>
                    ${prod.price}
                </td>
                <td>
                  <g:form action="edit" >
                      <input type="hidden" name="id" value="${prod.id}">
                      <input class="btn btn-primary" type="submit" value="edit">
                  </g:form>
                </td>
                <td>
                    <g:link action="delete" id="${prod.id}">Delete</g:link><br>
                </td>
            </tr>

      </g:each>

    </tbody>
  </table>


<input id="testJS" type="button" value="call js">

<g:form controller="product" action="addProd">
<input class="btn btn-primary" type="submit" value="Create">
</g:form><br>



</body>
</html>

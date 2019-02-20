<!doctype html>
<html>
    <head>

    </head>
    <body>
    <h1>List contacts</h1>
    <table border="3">

    <g:each in="${contacts}" var="contact">
          <tr>
              <td>${contact.name}</td>
              <td>${contact.phoneNumber}</td>
              <td>
                  <g:link action="edit" id="${contact.id}">edit</g:link>
              </td>
              <td>
                  <g:link action="delete" id="${contact.id}">delete</g:link>
              </td>

          </tr>







    </g:each>
    </table>
    <g:link action="create">Create new contact</g:link>
    </body>
</html>

<%-- 
    Document   : index
    Created on : 27-04-2023, 20:54:00
    Author     : micke
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <div style="margin: 24px; padding: 24px; border: 1px solid #eee; border-radius: 2em; color: #546E7A">
      <h1 style="color:#37474f">Nuevo Cliente</h1>
      <form action="controller" method="post">
        <p><label>Identificación: </label> <input type="text" name="id" value="" required /></p>
        <p><label>Nombres: </label> <input type="text" name="" value="" required /></p>
        <p><label>Primer Apellido: </label> <input type="text" name="apellido_1" value="" required /></p>
        <p><label>Segundo Apellido: </label> <input type="text" name="apellido_2" value="" required /></p>
        
        <p><label>Mail: </label> <input type="text" name="mail" value="" required /></p>

        <input style="color:#fff; padding: 10px 20px; background: #28892b; border: none; border-radius: 3em; cursor: pointer" type="submit" value="ENVIAR" />
      </form>
    </div>

  </body>
</html>

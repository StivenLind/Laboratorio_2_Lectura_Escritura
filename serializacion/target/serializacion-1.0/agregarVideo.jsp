
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rockola</title>
    </head>
    <body>
         <h1>Sistemas Reproductor de videos</h1>
         <form action="SvVideo" method="POST">
         <label>idVideo:</label>
         <input type="text" name="idVideo"><br>
         
         <label>Titulo:</label>
         <input type="text" name="titulo"><br>
         
         <label>Autor:</label>
         <input type="text" name="autor"><br>
         
         <label>Año:</label>
         <input type="text" name="anio"><br>
         
         <label>Categoria:</label>
         <input type="text" name="categoria"><br>
         
         <label>Url:</label>
         <input type="text" name="url"><br>
         
         <label>Letra:</label>
         <textarea id="id" name="name" rows="5" cols="10"></textarea><br>
         
         <input type="submit" value="Agregar Video">
         </form>
            <a href="index.jsp">Regresar al menu </a>
            
         
    </body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="model.TblProductocl3" %> 
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Actualizar Producto</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f4f8;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            max-width: 500px;
            width: 100%;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            margin-bottom: 5px;
            font-weight: bold;
            color: #555;
        }
        input[type="text"] {
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 14px;
            width: 100%;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: #fff;
            padding: 12px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s ease;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        .error {
            color: red;
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Actualizar Producto</h1>
        <form method="post" action="ControladorProducto">

            <%
                String cod = request.getAttribute("codigo").toString();
                String nombre = (request.getAttribute("nombre") != null) ? request.getAttribute("nombre").toString() : "";
                String precioventa = (request.getAttribute("precioventa") != null) ? request.getAttribute("precioventa").toString() : "";
                String preciocompra = (request.getAttribute("preciocompra") != null) ? request.getAttribute("preciocompra").toString() : "";
                String estado = (request.getAttribute("estado") != null) ? request.getAttribute("estado").toString() : "";
                String descripcion = (request.getAttribute("descripcion") != null) ? request.getAttribute("descripcion").toString() : "";
            %>
            <input type="hidden" name="id" value="<%= cod %>">

            <label for="nombre">Nombre</label>
            <input type="text" id="nombre" name="nombre" value="<%= nombre %>" required>

            <label for="precioventa">Precio Venta</label>
            <input type="text" id="precioventa" name="precioventa" value="<%= precioventa %>" required>

            <label for="preciocompra">Precio Compra</label>
            <input type="text" id="preciocompra" name="preciocompra" value="<%= preciocompra %>" required>

            <label for="estado">Estado</label>
            <input type="text" id="estado" name="estado" value="<%= estado %>" required>

            <label for="descripcion">Descripción</label>
            <input type="text" id="descripcion" name="descripcion" value="<%= descripcion %>" required>

            <input type="submit" value="Actualizar Producto">

            <%
                // Puedes agregar un mensaje de error en caso de que el producto no se haya encontrado
                if (cod == null || cod.isEmpty()) {
            %>
            <p class="error">Error: No se ha encontrado el producto para actualizar.</p>
            <%
                }
            %>
        </form>
    </div>
</body>
</html>
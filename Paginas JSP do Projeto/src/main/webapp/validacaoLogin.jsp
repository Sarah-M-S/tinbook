
<%@page import="org.eclipse.jdt.internal.compiler.ast.ClassLiteralAccess"%>
<%@ page language="java" import="java.sql.*" contentType="text/html" pageEncoding="ISO-8859-1"  %>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@ page import="pacote_codigos_fonte.*" %> 



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
  //Recuperando campos do formulario
  String nome = request.getParameter("cad_nome");
  String sobrenome = request.getParameter("cad_sobrenome");
  String telefone = request.getParameter("cad_fone");
  String email = request.getParameter("cad_email");
  String cpf = request.getParameter("cad_cpf");
  String usuario= request.getParameter("cad_usuario");
  String senha = request.getParameter("cad_senha");
  String submit = request.getParameter("cad_acao");
 
  //Instanciando um objeto de conexao
  Conexao conn = new Conexao();
  conn.cadastrarUsuario(nome, sobrenome, email,telefone, cpf,usuario, senha);
  
  
%>



</body>
</html>
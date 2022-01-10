<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="sgab.model.dto.Pessoa" %>
<%@page import="java.util.List" %>

<%@include file="/core/menu.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <title>SGAB</title>
        <script type="text/javascript" language="JavaScript" src="/sgab/js/validacao.js"></script>
        <script type="text/javascript" language="JavaScript" src="/sgab/js/helper.js"></script>
    </head>
    <body>
        <center>
            <section id="nome-form">
                <h1>Lista de Pessoas</h1>
            </section>
            <a href="/sgab/core/pessoa/inserir.jsp">Nova Pessoa</a>
            <form name="listarPessoa" method="post">
                <input type="hidden" name="table" value="Pessoa">
                <input type="hidden" name="pessoaId" value="">
                
                <table id="pessoa">
                    <tr>
                        <th>
                            Código
                        </th>
                        <th>
                            Login
                        </th>
                        <th>
                            CPF
                        </th>
                        <th>
                            Nome Completo
                        </th>
                        <th>
                            Email
                        </th>
                        <th>
                            Senha
                        </th>
                        <th>
                            &nbsp; &nbsp;
                        </th>
                    </tr>
                    <%
                        List<Pessoa> listPessoas = (List<Pessoa>) request.getAttribute("listPessoas");
                        for (Pessoa pessoa: listPessoas) {
                    %>
                        <tr>
                            <td>
                                <a href="/sgab/main?acao=PessoaAlterar&pessoaId=<%=pessoa.getId()%>"><%=pessoa.getId()%></a>
                            </td>
                            <td>
                                <a href="/sgab/main?acao=PessoaAlterar&pessoaId=<%=pessoa.getId()%>"><%=pessoa.getLogin()%></a>
                            </td>
                            <td>
                                <a href="/sgab/main?acao=PessoaAlterar&pessoaId=<%=pessoa.getId()%>"><%=pessoa.getCpf()%></a>
                            </td>
                            <td>
                                <a href="/sgab/main?acao=PessoaAlterar&pessoaId=<%=pessoa.getId()%>"><%=pessoa.getNome()%></a>
                            </td>
                            <td>
                                <a href="/sgab/main?acao=PessoaAlterar&pessoaId=<%=pessoa.getId()%>"><%=pessoa.getEmail()%></a>
                            </td>
                            <td>
                                <a href="/sgab/main?acao=PessoaAlterar&pessoaId=<%=pessoa.getId()%>"><%=pessoa.getSenha()%></a>
                            </td>
                            <td>
                                <input type="button" value="Excluir" onclick="excluir(<%=pessoa.getId()%>,document.listarPessoa)">
                            </td>
                        </tr>
                    <%  } %>
                </table>
            </form>
        </center> 
    </body>
</html>

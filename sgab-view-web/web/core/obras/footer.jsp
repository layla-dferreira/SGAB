<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="sgab.controller.LoginController"%>
<%@page import="sgab.model.dto.Usuario"%>

<%
    LoginController.validarSessao(request, response);
%>
</main>
<footer>
            <p>SGAB - Sistema de Gestão de Acervo Bibliográfico</p>
        </footer>
    </body>
</html>

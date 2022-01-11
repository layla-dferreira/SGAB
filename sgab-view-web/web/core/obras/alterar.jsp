<%-- 
    Document   : consultaObra
    Created on : 9 de jan. de 2022, 03:05:53
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="sgab.model.dto.Obra" %>
<%@include file="/core/obras/header.jsp" %>

<% 
   Obra obraAlvo = (Obra) request.getAttribute("obra");
%>
<!DOCTYPE html>
<html>
  <body>
  <center><h3>Consulta de Obra</h3></center>
      <section id="form">
        <div id="caixa-form">
          <form name="AlteraObra" method="post">
            <input type="hidden" name="table" value="obra">
            <input type="hidden" name="acao" value="alterar">
            <input type="hidden" name="obraId" value="<%= request.getParameter("obraId") %>">
            <label for="categoria">Categoria</label>
            <select disabled name="categoria" id="categoria">
              <option value="livro">Livro</option>
              <option value="mapa">Mapa</option>
              <option value="docComputacional">Documento computacional</option>
            </select>
            <label for="titulo">Título</label>
            <input
              type="text"
              disabled
              id="titulo"
              name="titulo"
              value="<%= obraAlvo.getTitulo()%>"
            />
            <label for="autor">Nome do(a) autor(a)</label>
            <input
              type="text"
              disabled
              id="autor"
              name="autor"
              placeholder="TODO"
            />
            <label for="assunto">Assunto</label>
            <div id="tags" class="visivel">

            </div>

            
            <label for="nota">Nota</label>
            <input
              type="text"
              disabled
              style="height: 5em;"
              id="nota"
              name="nota"
              value="<%= obraAlvo.getNota()%>"
            />
            <div class="divisao">
              <div>
                <label for="ano">Ano de publicação</label>
                <input
                  type="text"  
                  disabled
                  id="ano"
                  name="ano"
                  value=<%= obraAlvo.getAnoPublicacao()%>
                />
              </div>
              <div>
                <label for="editora">Editora</label>
                <input
                  type="text"
                  disabled
                  id="editora"
                  name="editora"
                  value="<%= obraAlvo.getEditora()%>"
                />
              </div>
            </div>
            <label for="cidEditora">Cidade da Editora</label>
            <input
              type="text"
              disabled
              id="cidEditora"
              name="cidEditora"
              value="<%= obraAlvo.getCidadeEditora()%>"
            />
            <div class="divisao">
              <div>
                <label for="edicao">Edição</label>
                <input
                  type="text"
                  disabled
                  id="edicao"
                  name="edicao"
                  value="<%= obraAlvo.getEdicao()%>"
                />
              </div>
              <div>
                <label for="volume">Volume</label>
                <input
                  type="text"
                  disabled
                  id="volume"
                  name="volume"
                  value="<%= obraAlvo.getVolume()%>"
                />
              </div>
            </div>
            <div id="buttons">
              <button type="button" id="alterar">Alterar</button>
            </div>
          </form>
        </div>
      </section>
  
    <%@include file="/core/obras/footer.jsp" %>
    <script type="text/javascript" language="JavaScript" src="/sgab/js/helper.js"></script>
    <script>
        let alterarEl = document.querySelector("#alterar");

        alterarEl.addEventListener("click", e => {
            let disabled = document.querySelectorAll("*[disabled]");
            disabled.forEach(element => {
                element.removeAttribute("disabled");
            });

            let botaoConfirmarEl = document.createElement("button");
            botaoConfirmarEl.innerHTML = "Confirmar";
            botaoConfirmarEl.setAttribute("type", "button");

            alterarEl.parentNode.appendChild(botaoConfirmarEl);
            alterarEl.parentNode.removeChild(alterarEl);
            
            botaoConfirmarEl.addEventListener("click", e => {
                gravarAlteracao(document.AlteraObra);
            })
        });
    </script>
    
  </body>
</html>
<%-- 
    Document   : consultaObra
    Created on : 9 de jan. de 2022, 03:05:53
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% import sgab.model.dto.Obra;
   Obra obraAlvo = (Obra) request.getAttribute("obra");
%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Consulta</title>
    <meta
      content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
      name="viewport"
    />
    <link rel="stylesheet" href="css/template-form.css" />
  </head>
  <body>
    <header>
      <div id="pagina-inicial">
        <a href="" title="Página Inicial"> Biblioteca </a>
      </div>
      <div id="logo-topo">
        <a
          href="http://www.cefetmg.br/"
          target="_blank"
          title="Centro Federal de Educação Tecnológica de Minas Gerais"
        >
          <img
            src="img-template/logo_topo.png"
            alt="Centro Federal de Educação Tecnológica de Minas Gerais"
          />
        </a>
      </div>
    </header>
    <main>
      <section id="nome-form">
        <h1>Consulta de Obra</h1>
      </section>
      <section id="form">
        <div id="caixa-form">
          <form action="AlteraObra" method="post">
            <label for="categoria">Categoria</label>
            <select disabled name="categoria" id="categoria">
              <option value="">Livro</option>
              <option value="">Mapa</option>
              <option value="">Documento computacional</option>
            </select>
            <label for="titulo">Título</label>
            <input
              disabled
              id="titulo"
              name="titulo"
              placeholder="<%= obraAlvo.getTitulo()%>"
              value="<%= obraAlvo.getTitulo()%>"
            />
            <label for="autor">Nome do(a) autor(a)</label>
            <input
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
              disabled
              style="height: 5em;"
              id="nota"
              name="nota"
              placeholder="<%= obraAlvo.getNota()%>"
              value="<%= obraAlvo.getNota()%>"
            />
            <div class="divisao">
              <div>
                <label for="ano">Ano de publicação</label>
                <input
                  disabled
                  id="ano"
                  name="ano"
                  placeholder="<%= obraAlvo.getAnoPublicacao()%>"
                  value="<%= obraAlvo.getAnoPublicacao()%>"
                />
              </div>
              <div>
                <label for="editora">Editora</label>
                <input
                  disabled
                  id="editora"
                  name="editora"
                  placeholder="<%= obraAlvo.getEditora()%>"
                  value="<%= obraAlvo.getEditora%>"
                />
              </div>
            </div>
            <label for="cidEditora">Cidade da Editora</label>
            <input
              disabled
              id="cidEditora"
              name="cidEditora"
              placeholder="<%= obraAlvo.getCidadeEditora()%>"
              value="<%= obraAlvo.getCidadeEditora()%>"
            />
            <div class="divisao">
              <div>
                <label for="edicao">Edição</label>
                <input
                  disabled
                  id="edicao"
                  name="edicao"
                  placeholder="<%= obraAlvo.getEdicao()%>"
                  value="<%= obraAlvo.getEdicao()%>"
                />
              </div>
              <div>
                <label for="volume">Volume</label>
                <input
                  disabled
                  id="volume"
                  name="volume"
                  placeholder="<%= obraAlvo.getVolume()%>"
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
    </main>
    <footer></footer>
    <script src="consultaObra.js"></script>
  </body>
</html>
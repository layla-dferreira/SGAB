<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% import sgab.model.dto.Obra;
   import java.util.LinkedList;
%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Resultados</title>
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
        <h1>Resultados da pesquisa</h1>
      </section>
      <section id="form">
        <table style="width: 100%;">
          <tr>
            <th class="hpesquisa"></th><th>ID</th><th>TÍTULO</th><th>AUTORES</th><th>EDITORA</th><th>EDIÇÃO</th><th>VOLUME</th><th>ANO</th>
          </tr>
          <% 
          LinkedList<Obra> lista = (LinkedList) request.getAttribute("resultado");
          for(Obra obra : lista){
          %>
          <tr>
              <<!-- a lupa deveria redirecionar para a página "consultaObra" respectiva, mas não consegui pensar em como fazer isso -->
            <td class="pesquisa">&#128270</td><td><%= obra.getId();%></td>
                                              <td><%= obra.getTitulo();%></td>
                                              <td></td>
                                              <td><%= obra.getEditora();%></td>
                                              <td><%= obra.getEdicao();%></td>
                                              <td><%= obra.getVolume();%></td>
                                              <td><%= obra.getAnoPublicacao();%></td>
          </tr>
          <% } %>
        </table>
      </section>
    </main>
    <footer></footer>
  </body>
</html>


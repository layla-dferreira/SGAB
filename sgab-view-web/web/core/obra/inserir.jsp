<%@page contentType="text/html" pageEncoding="UTF-8" %>

<%@include file="/core/header.jsp" %>

        <center><h3>Inserir Obra</h3></center>
            <section id="form">
                <div id="caixa-form">
                   <form name="frmInsereObra" method="post">
                    <input type="hidden" name="table" value="Obra">
                    <input type="hidden" name="acao" value="gravar">
                    <label for="categoria">Categoria</label>
                    <select name="categoria" id="categoria">
                      <option value="livro">Livro</option>
                      <option value="mapa">Mapa</option>
                      <option value="docComputacional">Documento computacional</option>
                    </select>
                    <label for="titulo">Título</label>
                    <input
                      type="text"
                      id="titulo"
                      name="titulo"
                      placeholder="Insira o título da obra"
                    />
                    <!<!-- TODO AUTORES -->
                    <label for="autor">Nome do(a) autor(a)</label>
                    <input
                      type="text"
                      id="autor"
                      name="autor"
                      placeholder="TODO"
                    />
                    <!<!-- TODO ASSUNTOS -->
                    <label for="assunto">Assunto</label>
                    <span style="float: right; font-weight: bolder; font-size: 1.5em;
                    cursor: pointer; user-select: none;" id="expandir">+</span>
                    <div id="tags">

                    </div>

                    <label for="nota">Nota</label>
                    <input
                      type="text"
                      style="height: 5em;"
                      id="nota"
                      name="nota"
                      placeholder="Insira uma breve descrição"
                    />
                    <div class="divisao">
                      <div>
                        <label for="ano">Ano de publicação</label>
                        <input
                          type="number"
                          id="ano"
                          name="ano"
                          placeholder="Ex.: 1987"
                        />
                      </div>
                      <div>
                        <label for="editora">Editora</label>
                        <input
                          type="text"
                          id="editora"
                          name="editora"
                          placeholder="Ex.: Fundamento"
                        />
                      </div>
                    </div>
                    <label for="cidEditora">Cidade da Editora</label>
                    <input
                      type="text"  
                      id="cidEditora"
                      name="cidEditora"
                      placeholder="Ex.: São Paulo"
                    />
                    <div class="divisao">
                      <div>
                        <label for="edicao">Edição</label>
                        <input
                          type="number"
                          id="edicao"
                          name="edicao"
                          placeholder="Insira a edição"
                        />
                      </div>
                      <div>
                        <label for="volume">Volume</label>
                        <input
                          type="number"
                          id="volume"
                          name="volume"
                          placeholder="Ex.: 1"
                        />
                      </div>
                    </div>
                    <div id="buttons">
                        <button type="button" onclick="gravarAlteracao(document.frmInsereObra)">Cadastrar</button>
                    </div>
                  </form>
                </div>
              </section>
    <%@include file="/core/footer.jsp" %>
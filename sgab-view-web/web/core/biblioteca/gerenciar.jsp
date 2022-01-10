<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Gerenciamento Biblioteca</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="../../css/styles.css">
</head>
<body>
    <header>
        <div id="pagina-inicial">
            <a href="../menu.jsp" title="Página Inicial">
                Biblioteca
            </a>
        </div>
        <div id="logo-topo">
            <a href="http://www.cefetmg.br/" target="_blank" title="Centro Federal de Educação Tecnológica de Minas Gerais">
                <img src="../img/logo_topo.png" alt="Centro Federal de Educação Tecnológica de Minas Gerais">
            </a>
        </div>
    </header>
    <main>
        <section id="nome-form">
            <h1>Gerenciamento</h1>
        </section>
        <section id="form">
            <div id="caixa-form">
                <div id="alterarInfo" class="divInputs">
                    <h1>Alterar Informa��es</h1>
                    <form action="/gerenciarServlet" method="POST">
                        <label for="id">Pesquisar por Id</label>
                        <input type="number" id="alterarNomeInput" name="pesquisarPorId" placeholder="Digite o Id">
                        <button type="submit">Pesquisar</button>
                    </form>
                    <form action="/gerenciarServlet" method="POST">
                        <label for="id">Pesquisar por Nome</label>
                        <input type="text" id="alterarNomeInput" name="pesquisarPorNome" placeholder="Digite o Nome">
                        <button type="submit">Pesquisar</button>
                    </form>
                    <form action="/gerenciarServlet" method="POST">
                        <label for="id">Alterar Nome</label>
                        <input type="text" id="alterarNomeInput" name="nome" placeholder="Pesquisa biblioteca pelo Nome">
                        <input type="text" id="alterarNomeInput" name="alterarNomeInput" placeholder="Altera o Nome">
                        <button type="submit">Alterar</button>
                    </form>
                    <form action="/gerenciarServlet" method="POST">
                        <label for="id">Alterar ID</label>
                        <input type="text" id="alterarNomeInput" name="nome" placeholder="Pesquisa biblioteca pelo Nome">
                        <input type="number" id="alterarIDInput" name="alterarIDInput" placeholder="Altera o ID">
                        <button type="submit">Alterar</button>
                    </form>
                    <form action="/gerenciarServlet" method="POST">
                        <label for="id">Alterar Org</label>
                        <input type="text" id="alterarNomeInput" name="nome" placeholder="Pesquisa biblioteca pelo Nome">
                        <input type="text" id="alterarOrgInput" name="alterarOrgInput" placeholder="Altera a Organização">
                        <button type="submit">Alterar</button>
                    </form>
                </div>
            </div>
        </section>
    </main>
    <footer>

    </footer>
</body>
</html>

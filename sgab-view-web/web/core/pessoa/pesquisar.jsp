<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>SGAB | Pesquisa de Pessoa</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="/sgab/css/styles.css">
</head>
<body>
    <header>
        <div id="pagina-inicial">
            <a href=""title="Página Inicial">
                SGAB
            </a>
        </div>
        <div id="logo-topo">
            <a href="http://www.cefetmg.br/" target="_blank" title="Centro Federal de Educação Tecnológica de Minas Gerais">
                <img src="/sgab/images/logo_topo.png" alt="Centro Federal de Educação Tecnológica de Minas Gerais">
            </a>
        </div>
    </header>
    <main>
        <section id="nome-form">
            <h1>Pesquisa de Pessoa</h1>
        </section>
        <section id="form">
            <div id="caixa-form">
                <form name="pesquisarPessoa" method="post">
                    <input type="hidden" name="table" value="Pessoa">
                    <input type="hidden" name="acao" value="pesquisarPorLogin">
                    <div>
                        <label for="login">Informe o Login <span class="input-obrigatorio">*</span></label>
                        <input type="number" id="login" name="login" placeholder="Login" required>
                        <small>Digite um Login válido. </small>
                    </div>
                    <div class="caixa-form-footer">
                       <input type="button" class="button" name="ordem" value="Pesquisar" onclick="pesquisar(document.pesquisarPessoa)">
                    </div>
                </form>
            </div>
        </section>
    </main>
    <footer>
        <p>SGAB - Sistema de Gestão de Acervo Bibliográfico</p>
    </footer>
    <script type="text/javascript" language="JavaScript" src="/sgab/js/validacao.js"></script>
    <script type="text/javascript" language="JavaScript" src="/sgab/js/helper.js"></script>
</body>
</html>

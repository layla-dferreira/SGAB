<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>SGAB | Cadastro de Pessoa</title>
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
            <h1>Cadastro de Pessoa</h1>
        </section>
        <section id="form">
            <div id="caixa-form">
                <form name="inserirPessoa" method="post">
                    <input type="hidden" name="table" value="Pessoa">
                    <input type="hidden" name="acao" value="gravar">
                    <div>
                        <label for="login">Informe o seu Login <span class="input-obrigatorio">*</span></label>
                        <input type="text" id="login" name="login" placeholder="Login" required>
                        <small>Digite um Login válido.</small>
                    </div>
                    <div>
                        <label for="cpf">Informe o seu CPF <span class="input-obrigatorio">*</span></label>
                        <input type="number" id="cpf" name="cpf" placeholder="CPF" required maxlength="11">
                        <small>Digite um CPF válido. Informe apenas números.</small>
                    </div>
                    <div>
                        <label for="nome">Informe o seu nome <span class="input-obrigatorio">*</span></label>
                        <input type="text" id="nome" name="nome" placeholder="Nome" required>
                        <small>Digite seu nome e sobrenome.</small>
                    </div>
                    <div>
                        <label for="email">Informe o seu endereço de email <span class="input-obrigatorio">*</span></label>
                        <input type="text" id="email" name="email" placeholder="Email" required>
                        <small>Digite um endereço de email válido.</small>
                    </div>
                    <div>
                        <label for="senha">Crie uma senha <span class="input-obrigatorio">*</span></label>
                        <input type="password" id="senha" name="senha" placeholder="Senha" required>
                        <small>A senha precisa ter 8 caracteres, pelo menos uma letra maiúscula, uma letra minúscula, um número e um caractere especial.</small>
                    </div>
                    <div>
                        <label for="senha2">Confirme a sua senha <span class="input-obrigatorio">*</span></label>
                        <input type="password" id="senha2" name="senha2" placeholder="Senha" required>
                        <small>As senhas não correspondem.</small>
                    </div>
                    <div class="caixa-form-footer">
                        <input type="button" class="button" name="ordem" value="Cadastrar" onclick="gravarAlteracao(document.inserirPessoa)">
                        <a href="/sgab/main?acao=PessoaListar">Listar Usuários</a><br>
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
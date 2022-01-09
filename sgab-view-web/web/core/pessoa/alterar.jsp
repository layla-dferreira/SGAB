<%@page contentType="text/html" pageEncoding="UTF-8" %>

<%  Pessoa pessoa = (Pessoa) request.getAttribute("pessoa"); %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>SGAB | Resultado de Pessoa</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="../../css/styles.css">
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
                <img src="../../images/logo_topo.png" alt="Centro Federal de Educação Tecnológica de Minas Gerais">
            </a>
        </div>
    </header>
    <main>
        <section id="nome-form">
            <h1>Alteraração de Pessoa</h1>
        </section>
        <section id="form">
            <div id="caixa-form">
                <form name="modificarPessoa" method="post">
                    <div>
                        <label for="cpf">CPF</label>
                        <input type="number" id="cpf" name="cpf" placeholder="CPF" value="<%=pessoa.getCpf()%>" readonly>
                        <small>Digite um CPF válido. Informe apenas números.</small>
                    </div>
                    <div>
                        <label for="nome">Nome</label>
                        <input type="text" id="nome" name="nome" placeholder="Nome" value="<%=pessoa.getNome()%>">
                        <small>Digite seu nome e sobrenome.</small>
                    </div>
                    <div>
                        <label for="email">Email</label>
                        <input type="text" id="email" name="email" placeholder="Email" value="<%=pessoa.getEmail()%>">
                        <small>Digite um endereço de email válido.</small>
                    </div>
                    <div>
                        <label for="senha">Senha</label>
                        <input type="password" id="senha" name="senha" placeholder="Senha" value="<%=pessoa.getSenha()%>">
                        <small>A senha precisa ter 8 caracteres, pelo menos uma letra maiúscula, uma letra minúscula, um número e um caractere especial.</small>
                    </div>
                    <div id="caixa-form-footer">
                        <input type="button" class="button" name="ordem" value="Alterar" onclick="gravarPessoa(document.frmAltUsuario)">
                        <input type="button" class="button" name="ordem" value="Excluir" onclick="excluirPessoa(<%=usuario.getCpf()%>, document.modificarPessoa)">
                    </div>
                </form>
            </div>
        </section>
    </main>
    <footer>
        <p>SGAB - Sistema de Gestão de Acervo Bibliográfico</p>
    </footer>
    <script src="../../js/validacao-pessoa.js"></script>
    <script>
        let senha2DivEl = document.querySelector("#senha2-div");

        senhaEl.addEventListener("change", () => {
            let regexEl = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$/;
            if(regexEl.test(senhaEl.value)) {
                senha2DivEl.style.display = "block";
                senha2DivEl.style.visibility = "visible";
                senha2DivEl.attributes.required = true;
            }
        });
    </script>
</body>
</html>

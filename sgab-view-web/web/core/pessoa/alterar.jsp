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
    <style>
        #nome, #email, #senha {
            background: #fff url(imgs/editar.png) no-repeat 95% center;
            background-size: 18px;
        }

        #senha2-div {
            visibility: hidden;
            display: none;
        }
    </style>
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
                    <input type="hidden" name="table" value="Pessoa">
                    <input type="hidden" name="acao" value="alterar">
                    <div>
                        <label for="cpf">Código</label>
                        <input type="number" id="id" name="id" placeholder="ID" value="<%=pessoa.getId()%>" readonly>
                    </div>
                    <div>
                        <label for="cpf">CPF</label>
                        <input type="number" id="cpf" name="cpf" placeholder="CPF" value="<%=pessoa.getCpf()%>" readonly>
                    </div>
                    <div>
                        <label for="cpf">Login</label>
                        <input type="number" id="login" name="login" placeholder="Login" value="<%=pessoa.getLogin()%>" readonly>
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
                    <div id="senha2-div">
                        <label for="senha2">Confirme a nova senha <span class="input-obrigatorio">*</span></label>
                        <input type="password" id="senha2" name="senha2" placeholder="Senha">
                        <small>As senhas não correspondem.</small>
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
    <script src="../../js/validacao.js"></script>
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

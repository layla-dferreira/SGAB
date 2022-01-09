function validacaoView(inputEl, regexEl, smallEl, labelEl, inputObrigatorioEl) {
    if(regexEl.test(inputEl.value)) {
        smallEl.classList.remove("invalido");
        labelEl.style.color = "#00a65a";
        inputEl.style.borderColor = "#00a65a";
        inputObrigatorioEl.style.visibility = "hidden";
    }
    else {
        smallEl.classList.add("invalido");
        labelEl.style.color = "#dd4b39";
        inputEl.style.borderColor = "#dd4b39";
        inputObrigatorioEl.style.visibility = "visible";
    }
}


let cpfEl = document.querySelector("#cpf");
cpfEl.addEventListener("change", () => {
    let regexEl = /^[0-9]{11}$/;
    let smallEl = document.querySelector("#cpf ~ small");
    let labelEl = document.querySelector("label[for=cpf]");
    let inputObrigatorioEl = document.querySelector("label[for=cpf] .input-obrigatorio");
    
    validacaoView(cpfEl, regexEl, smallEl, labelEl, inputObrigatorioEl);
});

let nomeEl = document.querySelector("#nome");
nomeEl.addEventListener("change", () => {
    let regexEl = /^[A-z]+(\s[A-z]+)+/;
    let smallEl = document.querySelector("#nome ~ small");
    let labelEl = document.querySelector("label[for=nome]");
    let inputObrigatorioEl = document.querySelector("label[for=nome] .input-obrigatorio");

    validacaoView(nomeEl, regexEl, smallEl, labelEl, inputObrigatorioEl);
});

let emailEl = document.querySelector("#email");
emailEl.addEventListener("change", () => {
    let regexEl = /^[^0-9][A-z0-9_]+([.][A-z0-9_]+)*[@][A-z0-9_]+([.][A-z0-9_]+)*[.][A-z]{2,4}$/;
    let smallEl = document.querySelector("#email ~ small");
    let labelEl = document.querySelector("label[for=email]");
    let inputObrigatorioEl = document.querySelector("label[for=email] .input-obrigatorio");

    validacaoView(emailEl, regexEl, smallEl, labelEl, inputObrigatorioEl);
});

let senhaEl = document.querySelector("#senha");
senhaEl.addEventListener("change", () => {
    let regexEl = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$/;
    let smallEl = document.querySelector("#senha ~ small");
    let labelEl = document.querySelector("label[for=senha]");
    let inputObrigatorioEl = document.querySelector("label[for=senha] .input-obrigatorio");

    validacaoView(senhaEl, regexEl, smallEl, labelEl, inputObrigatorioEl);
});

let senha2El = document.querySelector("#senha2");
senha2El.addEventListener("change", () => {
    let regexEl = new RegExp(senhaEl.value);
    let smallEl = document.querySelector("#senha2 ~ small");
    let labelEl = document.querySelector("label[for=senha2]");
    let inputObrigatorioEl = document.querySelector("label[for=senha2] .input-obrigatorio");

    validacaoView(senha2El, regexEl, smallEl, labelEl, inputObrigatorioEl);
});

function validarPessoa(frm) {
    var result = false;
    
    if (frm.cpf.value == "") {
        alert("Informar o cpf!");
        frm.cpf.focus();
    } else if (frm.nome.value === "") {
        alert("Informar o nome!");
        frm.nome.focus();
    } else if (frm.senha.value === "") {
        alert("Informar a senha!");
        frm.senha.focus();
    } else if (frm.email.value === "") {
        alert("Informar o email!");
        frm.email.focus();
    } 
    else
        result = true;
        
    return result;

}


function gravarPessoa(frm) {
    if (validarUsuario(frm)) {
        if (frm.acao.value === "alterar")
            caminhourl = "/sgab/main?acao=PessoaGravarAlteracao";
        else if (frm.acao.value === "gravar")
            caminhourl = "/sgab/main?acao=PessoaGravarInsercao";
    }

    frm.action = caminhourl;
    frm.submit();
}

function excluirPessoa(cpf, frm) {
    if (confirm('Deseja excluir o Usuário com Id = ' + cpf + '?')) {
        frm.cpf.value = cpf;
        frm.action = "/sgab/main?acao=PessoaExcluir";            
        frm.submit();
    }
}
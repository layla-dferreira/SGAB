let alterarEl = document.querySelector("#alterar");

alterarEl.addEventListener("click", e => {
    let disabled = document.querySelectorAll("*[disabled]");
    disabled.forEach(element => {
        element.removeAttribute("disabled");
    });

    let botaoConfirmarEl = document.createElement("button");
    botaoConfirmarEl.innerHTML = "Confirmar";
    botaoConfirmarEl.setAttribute("type", "submit");

    alterarEl.parentNode.appendChild(botaoConfirmarEl);
    alterarEl.parentNode.removeChild(alterarEl);
})

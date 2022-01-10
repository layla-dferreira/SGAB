function validarCadastro(validar) {
  var result = false;

  if (validar.adicionarUnidadeOrgInput.value === " ") {
      window.confirm("Adicionar Unidade Org!");

  } else if (validar.adicionarNomeInput.value === " ") {
      window.confirm("Adicionar Nome!");
  } else if(validar.adicionarIDInput.value === " ") {
      window.confirm("Adicionar ID!");
  }
  else
        result = true;
        
    return result;
}


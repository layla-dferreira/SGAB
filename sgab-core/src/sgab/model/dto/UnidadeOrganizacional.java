package sgab.model.dto;

import sgab.model.dto.util.UnidadeOrganizacionalHelper;

public class UnidadeOrganizacional {
    
    private Long id;
    private String nome;
    private String localizacao;

    public UnidadeOrganizacional() {
        this.id = UnidadeOrganizacionalHelper.getNextId();
    }
    
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}

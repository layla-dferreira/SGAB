package sgab.model.dto;

public class Pessoa {
    
    private Long cpf;
    private String nome;
    private String email;
    private String senha;
    private boolean habilitado;

    public Pessoa (Long cpf, String nome, String email, String senha){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.habilitado = true;
    }
    
    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }    

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    public boolean getHabilitado() {
        return habilitado;
    }

}

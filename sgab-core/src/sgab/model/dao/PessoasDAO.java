package sgab.model.dao;

import sgab.model.dto.Pessoa;
import sgab.model.exception.PersistenciaException;
import sgab.util.PasswordDigest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PessoasDAO implements GenericDeleteDAO<Pessoa, Long>{
    private Map<Long, Pessoa> table = new HashMap<>();

    private static PessoasDAO pessoasDAO;
    static {
        PessoasDAO.pessoasDAO = null;
    }


    private static Long idSequence;
    static {
        PessoasDAO.idSequence = 0L;
    }

    public static Long getNextId() {
        return PessoasDAO.idSequence++;
    } 

    private PessoasDAO() { }

    public static PessoasDAO getInstance() {
        
        if (pessoasDAO == null) {
            pessoasDAO = new PessoasDAO();
            
            // insere administrador do sistema
            Pessoa admin = new Pessoa("admin");
            admin.setCpf(null);
            admin.setNome("Administrador do Sistema");
            admin.setEmail("admin@sgab.cefetmg.br");
            admin.setSenha("admin");
            admin.setHabilitado(true);
        
            pessoasDAO.inserir(admin);
        }
        
        return pessoasDAO;
    }

    @Override
    public void inserir(Pessoa pessoa) {
        if (pesquisarLogin(pessoa.getLogin()) != null)
            throw new PersistenciaException("'" + pessoa.getLogin() 
                                                            + "' precisa ser único.");
        
        Long pessoaId = PessoasDAO.getNextId();
        pessoa.setId(pessoaId);
        
        String pesPasswd = PasswordDigest.passwordDigestMD5(pessoa.getSenha());
        pessoa.setSenha(pesPasswd);
        
        table.put(pessoaId, pessoa);
    }

    public Pessoa pesquisarLogin(String login) {       
        List<Pessoa> listPesssoa = listarTodos();
        for (Pessoa pes: listPesssoa)
            if (pes.getLogin().equals(login))
                return pes;
        
        return null;
    }

    public List<Pessoa> listarAtivos() {
        List<Pessoa> listUsuarios = new ArrayList<>();
        
        for (Pessoa pes: table.values())
            if (pes.getHabilitado() == true)
                listUsuarios.add(pes);
        
        return listUsuarios;
    }

    public List<Pessoa> listarTodos() {
        List<Pessoa> listPessoas = new ArrayList<>();
        
        listPessoas.addAll(table.values());
        
        return listPessoas;
    }
    
    @Override
    public void alterar(Pessoa pessoa){
        Pessoa pes = table.remove(pessoa.getId());
        if (pes == null)
            throw new PersistenciaException("Nenhum usuário com "
                                        + "o id '" + pessoa.getId() + "'.");

        inserir(pessoa);
    }

    @Override
    public Pessoa pesquisar(Long id) {
        return table.get(id);
    }

    public Pessoa pesquisarCpf(Long cpf) {
        List<Pessoa> listPesssoa = listarTodos();
        for (Pessoa pes: listPesssoa)
            if (pes.getCpf().equals(cpf))
                return pes;
        
        return null;
    }

    public Pessoa pesquisarNome(String nome) {
        List<Pessoa> listPesssoa = listarTodos();
        for (Pessoa pes: listPesssoa)
            if (pes.getNome().equals(nome))
                return pes;
        
        return null;
    }

    public Pessoa pesquisarLoginSenha(String login, String senha) {
        Pessoa pes = pesquisarLogin(login);
        
        String passwd = PasswordDigest.passwordDigestMD5(senha);
        
        if (pes.getSenha().equals(passwd))
            return pes;
        
        return null;
    }

    @Override
    public List<Pessoa> pesquisar(List<BasicPair<Long, Pessoa>> parameterList) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


    @Override
    public void delete(Long id){
        Pessoa p = pesquisar(id);
        
        if(p == null)
            throw new PersistenciaException("Nenhum usuário com "
                                        + "o id '" + id + "'.");

        p.setHabilitado(false);
    }
    
}
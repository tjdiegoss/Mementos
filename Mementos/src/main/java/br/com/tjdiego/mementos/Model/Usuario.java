
package br.com.tjdiego.epistemicapp.Model;

/**
 *
 * @author Diego
 */
//Classe Usuario
public class Usuario {
    
    //Atributos da classe Usuario
    private String nome;
    private String sobrenome;
    private String login;
    private String senha;
    private boolean status;
    private Anotacao [] anotacao;
    int contador;

    //Métodos Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Anotacao[] getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(Anotacao[] anotacao) {
        this.anotacao = anotacao;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    

    //Construtor com parâmetros
    public Usuario(String nome, String sobrenome, 
            String login, String senha, boolean status, 
            Anotacao[] anotacao, int contador) {    
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.login = login;
        this.senha = senha;
        this.status = status;
        this.anotacao = anotacao;
        this.contador = contador;
    }

    //Construtor vazio
    public Usuario() {
    }

    //Método ToString
    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }
    
    
    
}

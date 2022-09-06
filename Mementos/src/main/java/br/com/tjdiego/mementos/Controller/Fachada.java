package br.com.tjdiego.epistemicapp.Controller;

import br.com.tjdiego.epistemicapp.Controller.Excecoes.SenhaIncorretaException;
import br.com.tjdiego.epistemicapp.Controller.Excecoes.UsuarioBloquadoException;
import br.com.tjdiego.epistemicapp.Controller.Excecoes.UsuarioInexistenteException;
import br.com.tjdiego.epistemicapp.Model.Anotacao;
import br.com.tjdiego.epistemicapp.Model.Usuario;
import br.com.tjdiego.epistemicapp.View.TelaInicial;
import br.com.tjdiego.epistemicapp.View.TelaLogin;

/**
 *
 * @author Diego
 */
//Classe onde todo o tratamento de informação é feito
public class Fachada {

    
    //Aqui o objeto tipo Usuario utilizou dados predeterminados, pois o aoo não foi conectado ao banco
    String retorna = "";
    Anotacao[] anotacao = new Anotacao[10];
    Usuario user = new Usuario("Diego", "Tenório", "teste",
            "teste", true, anotacao, 0);
    int cont = user.getContador();

    //Método que verifica as credenciais do usuário
    public void verificarLogin(String login, String senha) throws SenhaIncorretaException {
        //Método que pega o e-mil digitado pelo usuário e compara com o emil salvo
        

        if (senha.equals(user.getSenha())&& //Caso o usuário e a senha corresondam
                login.equals(user.getLogin())) { //com o que está salvo, o acesso ao app é liberado
            new TelaInicial();
        } else {
            cont++;
            user.setContador(cont); //Contador utilizado para o blowui do usuário
             if(user.getContador() == 3){
                user.setStatus(false);
            }
            new TelaLogin();
            throw new SenhaIncorretaException
        ("Usuário ou senha incorreto(s)!");
            
        } 

    }

    //Método que verifica se o usuário são esta bloquado no sistema
    
    public void verificarStatus(String s)
            throws UsuarioBloquadoException, SenhaIncorretaException {
        Usuario u = new Usuario();
        if (s == user.getLogin()){
        
            u = user;
        }  
        if (user.isStatus() == false){

        throw new UsuarioBloquadoException
        ("Usuário Bloqueado!");
            
        
    } 
    }

    //Método não implementadp
    public void recuperarSenha() {

    }
    
   /* 
        
        }
         
      
    }*/
    
    //Método que armazena as informações digitadas pelo
    //usuário na tela de Login
    public void receberDados(String login, String senha) 
            throws UsuarioBloquadoException, 
            SenhaIncorretaException, UsuarioInexistenteException{
    
        login = TelaLogin.campoUsuario.getText();
        char[] charSenha = TelaLogin.campoSenha.getPassword();
        senha = new String(charSenha);
        
        verificarStatus(login);
        verificarLogin(login, senha);
    }
    
    
    
    public String retornaNome(){
    
        
        String s = user.getNome();
        return s;
    }
    
    
    public void cadastrarUsuario(Usuario u){
    
        
    }
}

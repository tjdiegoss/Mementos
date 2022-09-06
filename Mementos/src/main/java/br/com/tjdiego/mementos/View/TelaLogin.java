package br.com.tjdiego.epistemicapp.View;

import br.com.tjdiego.epistemicapp.Controller.Excecoes.SenhaIncorretaException;
import br.com.tjdiego.epistemicapp.Controller.Excecoes.UsuarioBloquadoException;
import br.com.tjdiego.epistemicapp.Controller.Excecoes.UsuarioInexistenteException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import br.com.tjdiego.epistemicapp.Controller.Fachada;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
//Primeira tela do sistema
public class TelaLogin extends JFrame implements ActionListener {

    //Atributos
    private JButton btEntrar;
    private JLabel textoUsuario, textoSenha, fundo, 
            versao,senhaesq, cadastro,termos;
    public static JTextField campoUsuario;
    public static JPasswordField campoSenha;
    private JPanel painel;
    private JFrame janela;
    private String text;
    
    //criando um objeto tipo Fachada, onde se localiza a regra de negócio
    Fachada f = new Fachada();

    public TelaLogin() {

        text = "";
        
        btEntrar = new JButton("Entrar");
        btEntrar.setSize(80, 40);
        btEntrar.addActionListener(this);
        
        textoUsuario = new JLabel("Usuário:");
        textoUsuario.setSize(120, 20);
        
        textoSenha = new JLabel("Senha:");
        textoSenha.setSize(120, 20);
        
        senhaesq = new JLabel
        ("Esqueceu sua senha? Clique aqui");
        senhaesq.setSize(180, 40);
        senhaesq.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt){
                new TelaRecSenha();
                janela.dispose();//Deixa o texto cliável
                                 //chamando a tela de recuperação de senha
            }
        });
        
        cadastro = new JLabel("Não tem conta? Cadastre-se");
        cadastro.setSize(180, 20);
        cadastro.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt){
                new TelaCadastro();//Também insere um link no texto
                                    //nesse caso redirecionando para 
                                    //tela de cadastrro
                janela.dispose();                
            }
        });
        
        termos = new JLabel("Termos de uso");
        termos.setSize(180, 20);
        termos.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt){
                new TelaTermos();//Chama a tela de termos de uso
                janela.dispose();                
            }
        });
        
        campoUsuario = new JTextField();
        campoUsuario.setSize(80, 20);
        campoSenha = new JPasswordField();
        campoSenha.setSize(80, 20);
        painel = new JPanel();
        painel.setLayout(null);
        painel.setSize(200, 600);
        painel.add(textoUsuario).setLocation(30, 250);
        painel.add(campoUsuario).setLocation(80, 250);
        painel.add(textoSenha).setLocation(30, 280);
        painel.add(campoSenha).setLocation(80, 280);
        painel.add(btEntrar).setLocation(55, 310);
        painel.add(senhaesq).setLocation(15, 360);
        painel.add(cadastro).setLocation(15, 410);
        painel.add(termos).setLocation(55, 550);
        janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(200, 600);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);
        janela.add(painel);
        janela.setVisible(true);

    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == btEntrar) {
 
 janela.dispose();
 
            try {
                //f.verificarStatus(campoUsuario.getSelectedText());
                f.receberDados(campoUsuario.getSelectedText(),campoSenha.getSelectedText());
            } catch (UsuarioBloquadoException ex) {//Lança a ecxeção de usuário bloqueado
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (SenhaIncorretaException ex) {//Chama a exceção caso a sen ha seja digitada incorretamente
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (UsuarioInexistenteException ex) {//Esse tratamento de exceçao foi destivado poisestava dando conflito
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
 
 }
    }

    
}


package br.com.tjdiego.epistemicapp.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import br.com.tjdiego.epistemicapp.Controller.Fachada;
import static br.com.tjdiego.epistemicapp.View.TelaLogin.campoSenha;
import static br.com.tjdiego.epistemicapp.View.TelaLogin.campoUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
//Tela onde será feita a alteração de senhya
public class TelaAlterarSenha extends JFrame implements ActionListener{
    
    //Declaração de variáveis
    private JButton btSalvar, btCancelar;
    private JLabel textoUsuario, textoNovaSenha,textoRptSenha, fundo;            ;
    public static JPasswordField campoNovaSenha, campoRptSenha;
    private JPanel painel;
    private JFrame janela;
    
    
    
    //Construtor
    public TelaAlterarSenha(){
    
        
        
        
        btSalvar = new JButton("Salvar");
        btSalvar.setSize(100, 40);
        btSalvar.addActionListener(this);
        
        btCancelar = new JButton("Cancelar");
        btCancelar.setSize(100, 40);
        btCancelar.addActionListener(this);
        
        textoUsuario = new JLabel("Usuário:");
        textoUsuario.setSize(120, 20);
        campoUsuario = new JTextField();
        campoUsuario.setSize(120, 20);
        
        textoNovaSenha = new JLabel("Nova Senha:");
        textoNovaSenha.setSize(120, 20);
        campoNovaSenha = new JPasswordField();
        campoNovaSenha.setSize(120, 20);
        
        textoRptSenha = new JLabel("Repetir Senha:");
        textoRptSenha.setSize(120, 20);
        campoRptSenha = new JPasswordField();
        campoRptSenha.setSize(120, 20);
        
        
        
        painel = new JPanel();
        painel.setLayout(null);
        painel.setSize(200, 600);
        painel.add(textoUsuario).setLocation(30, 50);
        painel.add(textoNovaSenha).setLocation(30, 110);
        painel.add(campoNovaSenha).setLocation(30, 140);
        painel.add(textoRptSenha).setLocation(30, 170);
        painel.add(campoRptSenha).setLocation(30, 200);
       painel.add(btSalvar).setLocation(45, 230);
       painel.add(btCancelar).setLocation(45, 290);
      
        janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(200, 600);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);
        janela.add(painel);
        janela.setVisible(true);
    }
    
    

    //Método sobrescrito para eventos de clique de botão
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btCancelar) {
        
            //Aqui foi colocado nessa ordem, primeiro chama a outra tela
            //e depois fecha a atual pra deixar a transicão mais fluída
            new TelaLogin();
            janela.dispose();
        }
        
        if (e.getSource() == btSalvar){
        
            //Mensagem de alerta, pois esse método ainda não foi implementado
            JOptionPane.showMessageDialog(null, "Não implementado!");
        }
    }
    
}


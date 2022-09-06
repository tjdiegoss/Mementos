
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
import javax.swing.Icon;

/**
 *
 * @author Diego
 */
public class TelaRecSenha extends JFrame implements ActionListener{
    
    private JButton btSalvar, btCancelar;
    private JLabel textoUsuario,  fundo;            ;
    public static JTextField campoUsuario;
    private JPanel painel;
    private JFrame janela;
    private Fachada f;
    
    
    public TelaRecSenha(){
    
        btSalvar = new JButton("Salvar");
        btSalvar.setSize(100, 40);
        btSalvar.addActionListener(this);
        
        btCancelar = new JButton("Cancelar");
        btCancelar.setSize(100, 40);
        btCancelar.addActionListener(this);
        
        textoUsuario = new JLabel("E-mail");
        textoUsuario.setSize(120, 20);
        campoUsuario = new JTextField(TelaLogin.campoUsuario.getText());
        campoUsuario.setSize(120, 20);
        
        
        
        
        
        painel = new JPanel();
        painel.setLayout(null);
        painel.setSize(200, 600);
        painel.add(textoUsuario).setLocation(30, 50);
        painel.add(campoUsuario).setLocation(30, 80);
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
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btCancelar) {
        
            new TelaLogin();
            janela.dispose();
        }
        
        if (e.getSource() == btSalvar){
        
            new TelaAlterarSenha();
        }
    }
    
}

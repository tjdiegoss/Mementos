
package br.com.tjdiego.epistemicapp.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Diego
 */
//Tela não implementada
public class TelaConfiguracao extends JFrame implements ActionListener{
    
    private JButton btEntrar;
    private JLabel textoUsuario, textoSenha, fundo, 
            versao,senhaesq, cadastro,termos;
    public static JTextField campoUsuario;
    public static JPasswordField campoSenha;
    private JPanel painel;
    private JFrame janela;
    
    public TelaConfiguracao(){
    
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

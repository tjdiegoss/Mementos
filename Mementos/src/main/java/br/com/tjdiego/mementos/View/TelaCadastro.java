
package br.com.tjdiego.epistemicapp.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Diego
 * 
 * 
 */


public class TelaCadastro extends JFrame implements ActionListener{
    
    //Declaração de atributos (elementos da tela)
    private JButton btCadastrar, btCancelar;
    private JLabel textoEmail, textoSenha,textoRptSenha, 
            fundo, textoNome,textoSobrenome;
    public static JTextField campoEmail,campoNome,campoSobrenome;
    public static JPasswordField campoSenha, campoRptSenha;
    private JPanel painel;
    private JFrame janela;
    
 
    //Método construtor
    public TelaCadastro(){
 
        btCadastrar = new JButton("Cadastrar");
        btCadastrar.setSize(120, 40);
        btCadastrar.addActionListener((ActionListener) this);
        
        btCancelar = new JButton("Cancelar");
        btCancelar.setSize(120, 40);
        btCancelar.addActionListener((ActionListener) this);
        
        textoNome = new JLabel("Nome");
        textoNome.setSize(120, 20);
        campoNome = new JTextField();
        campoNome.setSize(120, 20);
        
        textoSobrenome = new JLabel("Sobrenome");
        textoSobrenome.setSize(120, 20);
        campoSobrenome = new JTextField();
        campoSobrenome.setSize(120, 20);
        
        textoEmail = new JLabel("Email:");
        textoEmail.setSize(120, 20);        
        campoEmail = new JTextField();
        campoEmail.setSize(120, 20);
        
        textoSenha = new JLabel("Senha:");
        textoSenha.setSize(120, 20);
        campoSenha = new JPasswordField();
        campoSenha.setSize(120, 20);
        
        textoRptSenha = new JLabel("Repetir Senha");
        textoRptSenha.setSize(120, 20);
        campoRptSenha = new JPasswordField();
        campoRptSenha.setSize(120, 20);
        
        painel = new JPanel();
        painel.setLayout(null);
        painel.setSize(200, 600);
        
        //Adicionando os elementos g´raficos ao painel
        painel.add(textoNome).setLocation(40, 100);
        painel.add(campoNome).setLocation(40, 130);
        painel.add(textoSobrenome).setLocation(40, 160);
        painel.add(campoSobrenome).setLocation(40, 190);
        painel.add(textoEmail).setLocation(40, 210);
        painel.add(campoEmail).setLocation(40, 240);
        painel.add(textoSenha).setLocation(40, 270);
        painel.add(campoSenha).setLocation(40, 300);
        painel.add(textoRptSenha).setLocation(40, 330);
        painel.add(campoRptSenha).setLocation(40, 360);
        painel.add(btCadastrar).setLocation(40, 400);
        painel.add(btCancelar).setLocation(40, 460);
        
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
        
        if (e.getSource() == btCadastrar){
        
            //Método não implementado
            JOptionPane.showMessageDialog(null, "Não implementado!");
        }
    }

}

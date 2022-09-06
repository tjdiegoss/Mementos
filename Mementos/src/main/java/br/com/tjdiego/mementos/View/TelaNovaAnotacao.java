
package br.com.tjdiego.epistemicapp.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
/**
 *
 * @author Diego
 */
public class TelaNovaAnotacao extends JFrame implements ActionListener {
    
    //Atributos
    private JButton btSalvar, btCancelar;
    private JLabel textoNota, imagemLogo,imagemFundo, 
            fundo, textoNome,imagemAvatar;
    private JTextArea nota;
    private JPanel painel;
    private JFrame janela;
    
    //Construtor
    public TelaNovaAnotacao(){
    
        btSalvar = new JButton("Salvar");
        btSalvar.setSize(120, 40);
        btSalvar.addActionListener(this);
        
        btCancelar = new JButton("Cancelar");
        btCancelar.setSize(120, 40);
        btCancelar.addActionListener(this);
        
        textoNota = new JLabel("Anotação:");
        textoNota.setSize(120, 20);
        
        imagemLogo = new JLabel("imagemLogo:");
        imagemLogo.setSize(120, 20);
        
        imagemFundo = new JLabel("imagemFundo");
        imagemFundo.setSize(180, 40);
        
        textoNome = new JLabel("textoNome");
        textoNome.setSize(180, 20);
        
        imagemAvatar = new JLabel("imagemAvatar");
        imagemAvatar.setSize(180, 20);
        
        nota = new JTextArea();
        nota.setSize(100,200);
                
        painel = new JPanel();
        painel.setLayout(null);
        painel.setSize(200, 600);
        painel.add(imagemLogo).setLocation(80, 10);
        painel.add(imagemAvatar).setLocation(40, 60);
        painel.add(textoNome).setLocation(40, 120);
        painel.add(textoNota).setLocation(40, 150);
        painel.add(nota).setLocation(40, 180);
        painel.add(btSalvar).setLocation(45, 380);
        painel.add(btCancelar).setLocation(45, 430);
        
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
        
            new TelaInicial();
            janela.dispose();
        
    }
        if (e.getSource() == btSalvar){
        
            JOptionPane.showMessageDialog(null, "Não implementado!");
        }
    }
    
    
    
}

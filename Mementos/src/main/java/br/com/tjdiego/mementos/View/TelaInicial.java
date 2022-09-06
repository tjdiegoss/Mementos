
package br.com.tjdiego.epistemicapp.View;

import br.com.tjdiego.epistemicapp.Controller.Fachada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
/**
 *
 * @author Diego
 */
//Tela carregada caso o login seja efetuado com sucesso
public class TelaInicial extends JFrame implements ActionListener{
    
    //Atributos
    private JButton btAddAnotacao;
    private JLabel textoData, imagemLogo,imagemFundo, 
            fundo, textoNome,imagemAvatar;
    private JPanel painel;
    private JFrame janela;
        
    //Construtor
    public TelaInicial(){
        
        Fachada f = new Fachada();
                    
    btAddAnotacao = new JButton("Adicionar");
        btAddAnotacao.setSize(120, 40);
        btAddAnotacao.addActionListener(this);
        
        textoData = new JLabel("data");
        textoData.setSize(120, 20);
        
        imagemLogo = new JLabel("Logo");
        imagemLogo.setSize(180, 20);
        
        imagemFundo = new JLabel("Fundo");
        imagemFundo.setSize(180, 40);
        
        textoNome = new JLabel(f.retornaNome());
        textoNome.setSize(180, 20);
        
        imagemAvatar = new JLabel("Avatar");
        imagemAvatar.setSize(180, 20);
        
                
        painel = new JPanel();
        painel.setLayout(null);
        painel.setSize(200, 600);
        painel.add(imagemLogo).setLocation(80, 10);
        painel.add(imagemAvatar).setLocation(40, 60);
        painel.add(textoNome).setLocation(40, 120);
        painel.add(textoData).setLocation(40, 150);
        painel.add(btAddAnotacao).setLocation(45, 300);
        
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
        if (e.getSource() == btAddAnotacao) {
        
            new TelaNovaAnotacao();
            janela.dispose();
        
    }}
    
    
}

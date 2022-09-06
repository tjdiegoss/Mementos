
package br.com.tjdiego.epistemicapp.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Diego
 */
public class TelaTermos extends JFrame implements ActionListener{
    
    private JButton btVoltar;
    private JLabel termos;
    private JPanel painel;
    private JFrame janela;
    
    public TelaTermos(){
    
        btVoltar = new JButton("Voltar");
        btVoltar.setSize(120, 40);
        btVoltar.addActionListener(this);
        
        termos = new JLabel("Termos de Uso:\n blá blá blá");
        termos.setSize(120, 20);
        
        
        
                
        painel = new JPanel();
        painel.setLayout(null);
        painel.setSize(200, 600);
        painel.add(termos).setLocation(40, 150);
        painel.add(btVoltar).setLocation(45, 300);
        
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
        if (e.getSource() == btVoltar) {
        
            new TelaLogin();
            janela.dispose();
        
    }
    }
    
    
}

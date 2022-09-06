
package br.com.tjdiego.epistemicapp.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Diego
 */

//Super classe Tela, onde todas as outras telas herdarão 
//as caracteristicas dela
//NAO IMPLEMENTADA!

public class Tela extends JFrame implements ItemListener{
    
     public JPanel painel;
     public JLabel fundo;
     public JMenu menu;
     public JMenuBar barramenu;
     public JMenuItem termos, cadastro, sair;
     public JFrame janela;
          
     
     public Tela(){
     
     
         
         
     }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

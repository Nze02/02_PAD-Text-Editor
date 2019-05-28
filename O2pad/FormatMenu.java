/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package O2pad;

import static O2pad.EditorFrame.editorTextArea;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author Emmanuel Nzekwe
 */
public class FormatMenu extends JMenu{
    private EditorFrame editorFrame;
    
    public FormatMenu(String title){
        super(title);
        
        initialiseItems();
    }
    
    //Initialise items
    public void initialiseItems(){
        
        //Adding "font" item to the menu
        JMenuItem fontStyle = new JMenuItem("Font");
        fontStyle.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                FontChooserDialog fontChooser = new FontChooserDialog(editorFrame);
                fontChooser.setVisible(true);
            }
        });
        addFontStyleMenuItem(fontStyle);
        addSeparator();
        
        //JMenu to hold screen colors
        JMenu screenColor = new JMenu("Screen color");
        
        //White background and black texts
        JMenuItem whiteBackground = new JMenuItem("White");
        whiteBackground.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                editorFrame.editorTextArea.setBackground(Color.WHITE);
                editorTextArea.setForeground(Color.BLACK);
            }
        });
        
        //Black background and white texts
        JMenuItem blackBackground = new JMenuItem("Black");
        blackBackground.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                editorTextArea.setBackground(Color.BLACK);
                editorTextArea.setForeground(Color.WHITE);
            }
        });
        
        screenColor.add(whiteBackground);
        screenColor.add(blackBackground);
        
        addFontStyleMenuItem(screenColor);
        
    }
    
    //Add item to menu
    public void addFontStyleMenuItem(JMenuItem fontStyleMenu){
        add(fontStyleMenu);
    }
}

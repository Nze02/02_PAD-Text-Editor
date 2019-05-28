/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package O2pad;

import static O2pad.EditorFrame.editorTextArea;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Emmanuel Nzekwe
 */
public class TextContentArea extends JPanel {
     private EditorFrame editorFrame;
     private Font font;
     private JTextArea textArea;
     
    public TextContentArea(Font font, JTextArea textArea) {
        super();
        setLayout(new BorderLayout());
        this.font = font;
        this.textArea = textArea;
        
        initialiseTextContentArea();
    }
    
    
    public void initialiseTextContentArea(){
        textArea.setFont(font);
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        add(scrollPane, BorderLayout.CENTER);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package O2pad;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Emmanuel Nzekwe
 */
public class EditorFrame extends JFrame{
    protected static JTextArea editorTextArea = new JTextArea();
    private static Font font = new Font("Microsoft Sans Serif", Font.PLAIN, 14);
    
    //public NotepadLaunch(){}
    public EditorFrame(){
        
        setTitle("02_Pad");
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex){}
        
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we){
//                if(!(editorTextArea.getText().isEmpty())){
//                    new NewListener().actionPerformed(null);
//                }
                System.exit(0);
            }
        });
        
        setEditorComponents();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1020, 530);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    public void setEditorComponents(){
        
        O2MenuBar menuBar = new O2MenuBar();
        TextContentArea textArea = new TextContentArea(font, editorTextArea);
        
        setJMenuBar(menuBar);
        add(textArea, BorderLayout.CENTER);
    }
}

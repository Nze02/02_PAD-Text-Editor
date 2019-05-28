 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package O2pad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author Emmanuel Nzekwe
 */
public class Edit extends JMenu{
    private EditorFrame editorFrame;
    
    public Edit(String title){
        super(title);
        
        initialiseEditItem();
    }
    
    
    //Method to initialise edit items
    public void initialiseEditItem(){
        
        final JMenuItem copy;
        final JMenuItem cut;
        final JMenuItem paste;
        final JMenuItem delete;
        final JMenuItem selectAll;
        final JMenuItem timeDate;
        
        
        
        //Add cut menu item
        cut = new JMenuItem("Cut       Ctrl+X");
        cut.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                editorFrame.editorTextArea.cut();
            }
        });
        add(cut);
        
        
        
        //Add copy menu item
        copy = new JMenuItem("Copy      Ctrl+C");
        copy.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                editorFrame.editorTextArea.copy();
            }
        });
        add(copy);
        
        
        
        //Add paste menu item
        paste = new JMenuItem("Paste     Ctrl+V");
        paste.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                editorFrame.editorTextArea.paste();
            }
        });
        add(paste);
        
        
        
        //Add delete menu item
        delete = new JMenuItem("Delete  Del");
        delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
              //  try{
                if(!(editorFrame.editorTextArea.getSelectedText().isEmpty())){
                    String text = editorFrame.editorTextArea.getText();
                    text = text.substring(0, editorFrame.editorTextArea.getSelectionStart()) + text.substring(editorFrame.editorTextArea.getSelectionEnd(), text.length());
                    editorFrame.editorTextArea.setText(text);
                }
            //}catch(Exception ex){}
            }
        });
        add(delete);
        
        
        
        //Add select all menu item
        selectAll = new JMenuItem("Select All       Ctrl+A");
        selectAll.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                editorFrame.editorTextArea.selectAll();
            }
        });
        add(selectAll);
        
        
        
        //Add a seperator
        addSeparator();
        
        
        
        //Add time and date menu item
        timeDate = new JMenuItem("Time/Date     F5");
        timeDate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                TimeDate timeDate = new TimeDate();
                editorFrame.editorTextArea.setText(editorFrame.editorTextArea.getText() + timeDate.getTime() + timeDate.getDate());
            }
        });
        add(timeDate);
        
        
        
        //an event listener to enable and disable edit menu items based on text area content
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent ae){
                if(!(editorFrame.editorTextArea.getText().isEmpty())){
                    
                    cut.setEnabled(true);
                    copy.setEnabled(true);
                    delete.setEnabled(true);
                    
                }
                else{
                    
                    cut.setEnabled(false);
                    copy.setEnabled(false);
                    delete.setEnabled(false);
                    
                }
            }
        });
    }
    
}

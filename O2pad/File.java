/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package O2pad;

import static O2pad.EditorFrame.editorTextArea;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/**
 *
 * @author Emmanuel Nzekwe
 */
public class File extends JMenu {

    private EditorFrame editorFrame;
    private JFileChooser fileChooser = new JFileChooser();

    public File(String title) {
        super(title);

        initialiseFileItems();
    }

    public void initialiseFileItems() {

        final JMenuItem newItemMenu;
        final JMenuItem open;
        final JMenuItem save;
        final JMenuItem saveAs;
        final JMenuItem print;
        final JMenuItem exit;

        
        //initialising new
        newItemMenu = new JMenuItem("New        Ctrl+N");
        newItemMenu.setMnemonic(KeyEvent.VK_N);
        //registering event handler for new
        newItemMenu.addActionListener(new NewListener());
        add(newItemMenu);
        
        
        //initialising open
        open = new JMenuItem("Open      Ctrl+O");
        open.setMnemonic(KeyEvent.VK_O);
        //registering event handler for open
        open.addActionListener(new OpenListener());
        add(open);
        
        
        //initialising save
        save = new JMenuItem("Save      Ctrl+S");
        save.setMnemonic(KeyEvent.VK_S);
        save.addActionListener(new SaveListener());
        saveAs = new JMenuItem("Save As...");
        saveAs.addActionListener(new SaveListener());
        add(save);
        
        
        //initialising print
        print = new JMenuItem("Print");
        print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        //registering event handler for print
        print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    editorFrame.editorTextArea.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(EditorFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        add(print);
        
        
        //initialising exit
        exit = new JMenuItem("Exit");
        exit.setMnemonic(KeyEvent.VK_E);
        //registering event handler for exit
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!(editorFrame.editorTextArea.getText().isEmpty())) {
                    new NewListener().actionPerformed(ae);
                }
                System.exit(0);
            }
        });
        add(exit);

    }

    
    
    
    //a dialog box for creating new file and saving existing file if any
    private class NewDialog extends JDialog {

        private NewDialog() {
            super(editorFrame, "02_Pad", true);
            setLocation(500, 300);
            setPreferredSize(new Dimension(355, 145));
            pack();
            setResizable(false);

            Font font = new Font("Serif", Font.PLAIN, 14);

            JPanel pan1 = new JPanel();
            pan1.setBackground(Color.WHITE);

            //new dialog prompt message
            JLabel label = new JLabel("Do you want to save changes to Untitled?");
            label.setFont(new Font("Serif", Font.PLAIN, 18));
            label.setForeground(Color.BLUE);
            pan1.add(label);

            JPanel pan2 = new JPanel();
            pan2.setBackground(Color.LIGHT_GRAY);

            //new dialog save button
            JButton save = new JButton("Save");
            save.setFont(font);
            save.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    setVisible(false);
                    new SaveListener().actionPerformed(ae);
                    editorFrame.editorTextArea.setText("");
                }
            });

            //new dialog dont save button
            JButton dontSave = new JButton("Don\'t save");
            dontSave.setFont(font);
            dontSave.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    setVisible(false);
                    editorFrame.editorTextArea.setText("");
                }
            });

            //new dialog cancel button
            JButton cancel = new JButton("Cancel");
            cancel.setFont(font);
            cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    setVisible(false);
                }
            });

            pan2.add(save);
            pan2.add(dontSave);
            pan2.add(cancel);

            add(pan1, BorderLayout.CENTER);
            add(pan2, BorderLayout.SOUTH);

        }
    }

    
    //event handler for new
    private class NewListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (!(editorFrame.editorTextArea.getText().isEmpty())) {
                NewDialog nd = new NewDialog();
                nd.setVisible(true);
            }
        }
    }
    
    
    //event handler for open
    private class OpenListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (JFileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(null)) {
                java.io.File file = fileChooser.getSelectedFile();
                editorFrame.editorTextArea.setText("");
                Scanner in = null;
                try {
                    in = new Scanner(file);
                    while (in.hasNext()) {
                        String line = in.nextLine();
                        editorFrame.editorTextArea.append(line + "\n");
                    }
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } finally {
                    in.close();
                }
            }
        }
    }

    
    //event handler for save
    private class SaveListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (JFileChooser.APPROVE_OPTION == fileChooser.showSaveDialog(null)) {
                java.io.File file = fileChooser.getSelectedFile();
                PrintWriter out = null;
                try {
                    out = new PrintWriter(file);
                    String text = editorFrame.editorTextArea.getText();
                    //System.out.println(text);
                    out.println(text);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } finally {
                    try {
                        out.flush();
                    } catch (Exception ex1) {
                    }
                    try {
                        out.close();
                    } catch (Exception ex1) {
                    }
                }
            }
        }
    }

}

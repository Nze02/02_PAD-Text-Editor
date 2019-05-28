/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package O2pad;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Emmanuel Nzekwe
 */
public class HelpMenu extends JMenu{
    private EditorFrame frame;
    
    public HelpMenu(String title){
        super(title);
        setMnemonic(KeyEvent.VK_H);
        
        initialiseItems();
    }
    
    //Initialise menu items
    public void initialiseItems(){
        JMenuItem about = new JMenuItem("About 02-pad");
        about.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                new About02Pad().setVisible(true);
            }
        });
        addHelpMenuItem(about);
        
    }
    
    //Add menu items
    public void addHelpMenuItem(JMenuItem item){
        addSeparator();
        add(item);
    }
    
    //About JDialog box
    private class About02Pad extends JDialog{
        public About02Pad(){
            super(frame, "About 02-Pad", true);
            JPanel mainPanel = new JPanel(new BorderLayout());
            
            JPanel topPanel = new JPanel();
            //topPanel.setBackground(Color.WHITE);
            Icon icon = new ImageIcon(getClass().getResource("mlogo.png"));
            JLabel lab1 = new JLabel();
            lab1.setIcon(icon);
            topPanel.add(lab1);
            //topPanel.setBorder(BorderFactory.createLoweredBevelBorder());
            mainPanel.add(topPanel, BorderLayout.NORTH);
            
            JPanel midPanel = new JPanel();
            //midPanel.setBackground(Color.WHITE);
            JTextArea aboutText = new JTextArea();
            aboutText.setBackground(midPanel.getBackground());
            aboutText.setFont(new Font("Calibri", Font.PLAIN + Font.PLAIN, 14));
            aboutText.setEditable(false);
            aboutText.setText("\n  Nze02 Editor\n  Version 1.0(Build 0002: Service Pack 1)\n"
                    + "  Copyright ©2017 Nze-Codes. All rights reserved.\n  _____________________________________________"
                    + "\n  The Nze02 Editor "
                    + "reads and writes file in various formats"
                    + "\n  and extensions. It has dual screen colours (white and\n  Black) and a variety of fonts."
                    + "\n  Coded by NZEKWE EMMANUEL ABUMCHUKWU."
                    + "\n\n  This product is licenced under the Nze-Codes Licence\n  Terms to:\n       NZEKWE EMMANUEL");
            midPanel.add(aboutText);
            mainPanel.add(midPanel, BorderLayout.CENTER);
            
            JPanel bottomPanel = new JPanel(new BorderLayout());
            //bottomPanel.setBackground(Color.WHITE);
            JButton ok = new JButton("OK");
            ok.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae){
                    setVisible(false);
                }
            });
            bottomPanel.add(ok, BorderLayout.EAST);
            mainPanel.add(bottomPanel, BorderLayout.SOUTH);
            mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            
            add(mainPanel);
            setSize(460,405);
            setLocationRelativeTo(frame);
            setResizable(false);
        }
    }
}

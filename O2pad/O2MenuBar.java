/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package O2pad;

import javax.swing.JMenuBar;

/**
 *
 * @author Emmanuel Nzekwe
 */
public class O2MenuBar extends JMenuBar{
    
    public O2MenuBar(){
        super();
        
        setMenus();
    }
    
    //add each menu to JMenuBar
    public void setMenus(){
        File file = new File("File");
        Edit edit = new Edit("Edit");
        FormatMenu format = new FormatMenu("Format");
        HelpMenu help = new HelpMenu("Help");
        
        add(file);
        add(edit);
        add(format);
        add(help);
    }
}

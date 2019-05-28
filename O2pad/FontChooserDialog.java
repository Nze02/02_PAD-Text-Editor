/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package O2pad;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Emmanuel Nzekwe
 */
public class FontChooserDialog extends JDialog {

    //Font names
    private final String[] fontNames = {"Agency FB", "ALGERIAN", "Arial", "Arial Rounded MT", "Bell MT", "Berlin Sans FB",
        "Book Antiqua", "Bookman Old Style", "Bookshelf Symbol 7", "Bradley Hand ITC", "Britannic", "Broadway", "Calibri",
        "Californian FB", "Calisto MT", "Cambria", "CASTELLAR", "Century Schoolbook", "Comic Sans MS", "Freestyle Script",
        "Harlow Solid", "Lucida Sans", "Microsoft Sans Serif", "Microsoft YaHei UI", "Monotype Corsiva", "MS Sans Serif",
        "MS Serif", "Tahoma", "Times New Roman", "Times New Roman Special G1", "Times New Roman Special G2", "Verdana",
        "Verdana Ref"};

    //Font sizes
    private final String[] fontSizes = {"8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "72"};
    protected static JTextField fontNameField, fontStyleField, fontSizeField;
    protected static JList fontNameList, fontStyleList, fontSizeList;
    private JLabel sampleText;
    private Font sampleFont = null;
    
    //if not displaying  check out object referencing and storage
    private EditorFrame editorFrame;
    FontPattern pattern = new FontPattern();

    public FontChooserDialog(EditorFrame frame) {
        
        setTitle("02-Pad Fonts");
        setModal(true);
        setResizable(false);
        setLocation(500, 100);
        setSize(440, 480);
        
        //initialise 02Pad editor object
        editorFrame = frame;
        JLabel fontNameLabel = new JLabel("Font:");
        JLabel fontStyleLabel = new JLabel("Font style:");
        JLabel fontSizeLabel = new JLabel("Size:");

        
        //initialise font name field
        fontNameField = new JTextField(10);
        //set font name field to have value of the current font name
        fontNameField.setText(editorFrame.editorTextArea.getFont().getName());
        
        
        //initialise font style field
        fontStyleField = new JTextField(10);
        fontStyleField.setText("Regular");
        
        
        //initialise font size field
        fontSizeField = new JTextField(10);
        fontSizeField.setText(editorFrame.editorTextArea.getFont().getSize()+""); //check to see that this works...else set 14 as default.

        
        //A panel to hold font labels and fields
        JPanel fontDetailsDesc = new JPanel(new GridLayout(2, 3, 5, 5));
        
        //Add labels and fields to panel
        fontDetailsDesc.add(fontNameLabel);
        fontDetailsDesc.add(fontStyleLabel);
        fontDetailsDesc.add(fontSizeLabel);
        fontDetailsDesc.add(fontNameField);
        fontDetailsDesc.add(fontStyleField);
        fontDetailsDesc.add(fontSizeField);

        
        //Initialising font name list
        fontNameList = new JList(fontNames);
        fontNameList.setVisibleRowCount(6);
        fontNameList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        fontNameList.addListSelectionListener(new FontNameHandler());
        JScrollPane fontNamePane = new JScrollPane(fontNameList);

        
        
        //Initialising font style list
        fontStyleList = new JList();
        fontStyleList.setVisibleRowCount(6);
        fontStyleList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        //Event handler for font style selection
        fontStyleList.addListSelectionListener(new FontStyleHandler());
        JScrollPane fontStylePane = new JScrollPane(fontStyleList);

        
        
        //Initialising font size list
        fontSizeList = new JList(fontSizes);
        fontSizeList.setVisibleRowCount(7);
        fontSizeList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        fontSizeList.addListSelectionListener(new FontSizeHandler());
        JScrollPane fontSizePane = new JScrollPane(fontSizeList);

        
        
        //Panel to hold all font name, style and size lists
        JPanel fontLists = new JPanel(new GridLayout(1, 3, 5, 5));
        fontLists.add(fontNamePane);
        fontLists.add(fontStylePane);
        fontLists.add(fontSizePane);

        
        //Panel to hold together font labels and lists(top panel)
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(fontDetailsDesc, BorderLayout.NORTH);
        topPanel.add(fontLists, BorderLayout.CENTER);

        
        
        //Sample text initialization
        sampleText = new JLabel("AaBbYyZz", JLabel.CENTER);
        
        
        //Panel to hold together all mid elements(mid panel)
        JPanel midPanel = new JPanel(new BorderLayout());
        midPanel.add(sampleText, BorderLayout.CENTER);
        midPanel.setBorder(BorderFactory.createTitledBorder("Sample"));

        
        
        //Setting up the OK button
        JButton okButton = new JButton("OK");
        //Event handler for OK button
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Font newFont = new Font(fontNameField.getText(), pattern.getFontStyle(fontStyleField.getText()), Integer.parseInt(fontSizeField.getText()));
                editorFrame.editorTextArea.setFont(newFont);
                setVisible(false);
                //dispose();
            }
        });
        
        
        //Setting up Cancel button
        JButton cancelButton = new JButton("Cancel");
        //Event handler for cancelButton bbutton
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
            }
        });
        
        
        
        //Panel to hold buttons together
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);

        
        //Initialising a buttom panel
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(buttonPanel, BorderLayout.EAST);

        
        
        //Initialising a central panel to hold all sub panels...(topPanel, midPanel and buttomPanel)
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(midPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        
        //Attaching main panel to FontChooserDialog
        add(mainPanel);
        
    }

    
    //Event handler to respond to font name selection
    private class FontNameHandler implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent ae) {
            String fontName = fontNames[fontNameList.getSelectedIndex()];
            fontNameField.setText(fontName);
            pattern.initializeStyleList(fontName, fontStyleList, fontStyleField);
            sampleFont = new Font(fontNameField.getText(), pattern.getFontStyle(fontStyleField.getText()), Integer.parseInt(fontSizeField.getText()));
            sampleText.setFont(sampleFont);
        }
    }

    

    
    //Event handler to respond to font name selection
    private class FontStyleHandler implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent lse) {
            fontStyleField.setText(fontStyleList.getSelectedValue().toString());
            sampleFont = new Font(fontNameField.getText(), pattern.getFontStyle(fontStyleField.getText()), Integer.parseInt(fontSizeField.getText()));
            sampleText.setFont(sampleFont);
        }
        
    }

    
    
    //Event handler to respond to font size selection
    private class FontSizeHandler implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent ae) {
            fontSizeField.setText(fontSizes[fontSizeList.getSelectedIndex()]);
            sampleFont = new Font(fontNameField.getText(), pattern.getFontStyle(fontStyleField.getText()), Integer.parseInt(fontSizeField.getText()));
            sampleText.setFont(sampleFont);
        }
    }
}

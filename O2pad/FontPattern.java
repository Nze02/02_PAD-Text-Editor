/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package O2pad;

import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author Emmanuel Nzekwe
 */
public class FontPattern {
    
    public void initializeStyleList(String fontName, JList fontStyleList, JTextField fontStyleField){
        
        if(fontName.equals("Agency FB")){
                    String[] agencyStyles = {"Regular","Bold","Oblique","Bold Oblique"};
                    fontStyleList.setListData(agencyStyles);
                    fontStyleField.setText(agencyStyles[0]);
                }
                else if(fontName.equals("ALGERIAN")){
                    String[] algerianStyles = {"Regular","Bold","Oblique","Bold Oblique"};
                    fontStyleList.setListData(algerianStyles);
                    fontStyleField.setText(algerianStyles[0]);
                }
                else if(fontName.equals("Arial")){
                    String[] arialStyles = {"Narrow","Narrow Italic","Italic","Regular","Narrow Bold","Narrow Bold Italic", 
                        "Bold","Bold Italic","Black","Black Oblique"};
                    fontStyleList.setListData(arialStyles);
                    fontStyleField.setText(arialStyles[0]);
                }
                else if(fontName.equals("Arial Rounded MT")){
                    String[] arialRoundStyles = {"Bold","Bold Oblique"};
                    fontStyleList.setListData(arialRoundStyles);
                    fontStyleField.setText(arialRoundStyles[0]);
                }
                else if(fontName.equals("Bell MT")){
                    String[] bellStyles = {"Regular","Italic","Bold","Bold Oblique"};
                    fontStyleList.setListData(bellStyles);
                    fontStyleField.setText(bellStyles[0]);
                }
                else if(fontName.equals("Berlin Sans FB")){
                    String[] berlinSansStyles = {"Regular","Demi Bold","Bold","Oblique", 
                        "Demi Bold Oblique","Bold Oblique"};
                    fontStyleList.setListData(berlinSansStyles);
                    fontStyleField.setText(berlinSansStyles[0]);
                }
                else if(fontName.equals("Book Antiqua")){
                    String[] bookStyles = {"Regular","Italic","Bold","Bold Italic"};
                    fontStyleList.setListData(bookStyles);
                    fontStyleField.setText(bookStyles[0]);
                }
                else if(fontName.equals("Bookman Old Style")){
                    String[] bookmanStyles = {"Light","Light Italic","Bold","Bold Italic"};
                    fontStyleList.setListData(bookmanStyles);
                    fontStyleField.setText(bookmanStyles[0]);
                }
                else if(fontName.equals("Bookshelf Symbol 7")){
                    String[] bookShelfStyles = {"Regular","Oblique","Bold","Bold Oblique"};
                    fontStyleList.setListData(bookShelfStyles);
                    fontStyleField.setText(bookShelfStyles[0]);
                }
                else if(fontName.equals("Bradley Hand ITC")){
                    String[] bradleyStyles = {"Regular","Oblique","Bold","Bold Oblique"};
                    fontStyleList.setListData(bradleyStyles);
                    fontStyleField.setText(bradleyStyles[0]);
                }
                else if(fontName.equals("Britannic")){
                    String[] britannicStyles = {"Bold","Bold Oblique"};
                    fontStyleList.setListData(britannicStyles);
                    fontStyleField.setText(britannicStyles[0]);
                }
                else if(fontName.equals("Broadway")){
                    String[] broadwayStyles = {"Regular","Oblique","Bold","Bold Oblique"};
                    fontStyleList.setListData(broadwayStyles);
                    fontStyleField.setText(broadwayStyles[0]);
                }
                else if(fontName.equals("Calibri")){
                    String[] calibriStyles = {"Light","Light Italic","Regular","Italic","Bold","Bold Italic"};
                    fontStyleList.setListData(calibriStyles);
                    fontStyleField.setText(calibriStyles[0]);
                }
                else if(fontName.equals("Californian FB")){
                    String[] californianStyles = {"Regular","Italic","Bold","Bold Oblique"};
                    fontStyleList.setListData(californianStyles);
                    fontStyleField.setText(californianStyles[0]);
                }
                else if(fontName.equals("Calisto MT")){
                    String[] calistoStyles = {"Regular","Italic","Bold","Bold Italic"};
                    fontStyleList.setListData(calistoStyles);
                    fontStyleField.setText(calistoStyles[0]);
                }
                else if(fontName.equals("Cambria")){
                    String[] cambriaStyles = {"Regular","Italic","Bold","Bold Italic"};
                    fontStyleList.setListData(cambriaStyles);
                    fontStyleField.setText(cambriaStyles[0]);
                }
                else if(fontName.equals("CASTELLAR")){
                    String[] castellarStyles = {"Regular","Oblique","Bold","Bold Oblique"};
                    fontStyleList.setListData(castellarStyles);
                    fontStyleField.setText(castellarStyles[0]);
                }
                else if(fontName.equals("Century Schoolbook")){
                    String[] centuryStyles = {"Regular","Oblique","Bold","Bold Oblique"};
                    fontStyleList.setListData(centuryStyles);
                    fontStyleField.setText(centuryStyles[0]);
                }
                else if(fontName.equals("Comic Sans MS")){
                    String[] comicStyles = {"Regular","Bold","Oblique","Bold Oblique"};
                    fontStyleList.setListData(comicStyles);
                    fontStyleField.setText(comicStyles[0]);
                }
                else if(fontName.equals("Freestyle Script")){
                    String[] freeStyles = {"Regular","Oblique","Bold","Bold Oblique"};
                    fontStyleList.setListData(freeStyles);
                    fontStyleField.setText(freeStyles[0]);
                }
                else if(fontName.equals("Harlow Solid")){
                    String[] harlowStyles = {"Semi Expanded Italic","Semi Expanded Italic Bold"};
                    fontStyleList.setListData(harlowStyles);
                    fontStyleField.setText(harlowStyles[0]);
                }
                else if(fontName.equals("Lucida Sans")){
                    String[] lucidaStyles = {"Regular","Italic","Demibold Roman","Demibold Italic"};
                    fontStyleList.setListData(lucidaStyles);
                    fontStyleField.setText(lucidaStyles[0]);
                }
                else if(fontName.equals("Microsoft Sans Serif")){
                    String[] microsoftSansStyles = {"Regular","Oblique","Bold","Bold Oblique"};
                    fontStyleList.setListData(microsoftSansStyles);
                    fontStyleField.setText(microsoftSansStyles[0]);
                }
                else if(fontName.equals("Microsoft YaHei UI")){
                    String[] microsoftYaheiStyles = {"Regular","Bold","Oblique","Bold Oblique"};
                    fontStyleList.setListData(microsoftYaheiStyles);
                    fontStyleField.setText(microsoftYaheiStyles[0]);
                }
                else if(fontName.equals("Monotype Corsiva")){
                    String[] monotypeStyles = {"Italic","Italic Bold"};
                    fontStyleList.setListData(monotypeStyles);
                    fontStyleField.setText(monotypeStyles[0]);
                }
                else if(fontName.equals("MS Sans Serif")){
                    String[] msSansStyles = {"Regular","Oblique","Bold","Bold Oblique"};
                    fontStyleList.setListData(msSansStyles);
                    fontStyleField.setText(msSansStyles[0]);
                }
                else if(fontName.equals("MS Serif")){
                    String[] msSerifStyles = {"Regular","Oblique","Bold","Bold Oblique"};
                    fontStyleList.setListData(msSerifStyles);
                    fontStyleField.setText(msSerifStyles[0]);
                }
                else if(fontName.equals("Tahoma")){
                    String[] tahomaStyles = {"Regular","Bold","Oblique","Bold Oblique"};
                    fontStyleList.setListData(tahomaStyles);
                    fontStyleField.setText(tahomaStyles[0]);
                }
                else if(fontName.equals("Times New Roman")){
                    String[] timesNewStyles = {"Regular","Italic","Bold","Bold Italic"};
                    fontStyleList.setListData(timesNewStyles);
                    fontStyleField.setText(timesNewStyles[0]);
                }
                else if(fontName.equals("Times New Roman Special G1")){
                    String[] timesNewG1Styles = {"Regular","Italic","Bold","Bold Italic"};
                    fontStyleList.setListData(timesNewG1Styles);
                    fontStyleField.setText(timesNewG1Styles[0]);
                }
                else if(fontName.equals("Times New Roman Special G2")){
                    String[] timesNewG2Styles = {"Regular","Italic","Bold","Bold Italic"};
                    fontStyleList.setListData(timesNewG2Styles);
                    fontStyleField.setText(timesNewG2Styles[0]);
                }
                else if(fontName.equals("Verdana")){
                    String[] verdanaStyles = {"Regular","Italic","Bold","Bold Italic"};
                    fontStyleList.setListData(verdanaStyles);
                    fontStyleField.setText(verdanaStyles[0]);
                }
                else if(fontName.equals("Verdana Ref")){
                    String[] verdanaRefStyles = {"Regular","Oblique","Bold","Bold Oblique"};
                    fontStyleList.setListData(verdanaRefStyles);
                    fontStyleField.setText(verdanaRefStyles[0]);
                }
    }
    
    public int getFontStyle(String fontListStyle){
        int fontStyle = 0;
                String listFontStyle = fontListStyle;
                
                if(listFontStyle.equalsIgnoreCase("Narrow Bold Italic")){
                    fontStyle = Font.ITALIC + Font.BOLD;
                }
                else if(listFontStyle.equalsIgnoreCase("Narrow Bold Oblique")){
                    fontStyle = Font.ITALIC + Font.BOLD;
                }
                else if(listFontStyle.equalsIgnoreCase("Demi Bold Oblique")){
                    fontStyle = Font.ITALIC + Font.BOLD;
                }
                else if(listFontStyle.equalsIgnoreCase("Semi Expanded Italic Bold")){
                    fontStyle = Font.ITALIC + Font.BOLD;
                }
                else if(listFontStyle.equalsIgnoreCase("Semi Expanded Italic")){
                    fontStyle = Font.ITALIC;
                }
                else if(listFontStyle.equalsIgnoreCase("Bold Oblique")){
                    fontStyle = Font.ITALIC + Font.BOLD;
                }
                else if(listFontStyle.equalsIgnoreCase("Narrow Bold")){
                    fontStyle = Font.PLAIN + Font.BOLD;
                }
                else if(listFontStyle.equalsIgnoreCase("Narrow Italic")){
                    fontStyle =  Font.ITALIC;
                }
                else if(listFontStyle.equalsIgnoreCase("Demibold Roman")){
                    fontStyle = Font.PLAIN + Font.BOLD;
                }
                else if(listFontStyle.equalsIgnoreCase("Demibold Italic")){
                    fontStyle = Font.ITALIC + Font.BOLD;
                }
                else if(listFontStyle.equalsIgnoreCase("Bold Italic")){
                    fontStyle = Font.ITALIC + Font.BOLD;
                }
                else if(listFontStyle.equalsIgnoreCase("Black Oblique")){
                    fontStyle = Font.ITALIC + Font.BOLD;
                }
                else if(listFontStyle.equalsIgnoreCase("Light Italic")){
                    fontStyle = Font.ITALIC;
                }
                else if(listFontStyle.equalsIgnoreCase("Demi Bold")){
                    fontStyle = Font.PLAIN + Font.BOLD;
                }
                else if(listFontStyle.equalsIgnoreCase("Regular")){
                    fontStyle = Font.PLAIN;
                }
                else if(listFontStyle.equalsIgnoreCase("Bold")){
                    fontStyle = Font.BOLD;
                }
                else if(listFontStyle.equalsIgnoreCase("Italic")){
                    fontStyle = Font.ITALIC;
                }
                else if(listFontStyle.equalsIgnoreCase("Oblique")){
                    fontStyle = Font.ITALIC;
                }
                else if(listFontStyle.equalsIgnoreCase("Light")){
                    fontStyle = Font.PLAIN;
                }
                else if(listFontStyle.equalsIgnoreCase("BLACK")){
                    fontStyle = Font.BOLD;
                }
                
                else if(listFontStyle.equalsIgnoreCase("Narrow")){
                    fontStyle = Font.PLAIN;
                }
                else{
                    fontStyle = Font.PLAIN;
                }
        return fontStyle;
    }
}

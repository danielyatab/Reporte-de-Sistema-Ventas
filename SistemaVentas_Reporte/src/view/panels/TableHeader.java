/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.panels;

import table.*;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author yatac
 */
public class TableHeader extends JLabel{
    public TableHeader(String text){
        super(text);
        setOpaque(true);
        setBackground(new Color(250,250,250));
        setFont(new java.awt.Font("sansserif",1,16));
        setForeground(new Color(102,102,102));
        setBorder(new EmptyBorder(10,5,10,5));
    }
}

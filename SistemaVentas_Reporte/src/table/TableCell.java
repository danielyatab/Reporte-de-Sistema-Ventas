/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author yatac
 */
public class TableCell extends JLabel{
    
    
    public TableCell(String value){
        super(value);
        setForeground(new Color(60,60,60));
        setFont(new java.awt.Font("sansserif", 0, 13));
        setForeground(new Color(102,102,102));
        setBorder(new EmptyBorder(6,6,6,6));
    }

    
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(250,250,250));
        g.fillRect(0 , 0, getWidth(),getHeight());
        g.setColor(new Color(255,255,255));
        g.fillRect(0,6,getWidth(), getHeight()-13);
        super.paintComponent(g);
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author yatac
 */
public class MethodsResponsive {   
    public static ImageIcon ScaleIcon(JLabel l , int width, int height){
        // Obtener la imagen actual y escalarla al tamaño del JFrame
        ImageIcon icon = (ImageIcon) l.getIcon();
        Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        // Crear un nuevo ImageIcon con la imagen escalada
        ImageIcon newIcon = new ImageIcon(image);
        return newIcon;
    }
}

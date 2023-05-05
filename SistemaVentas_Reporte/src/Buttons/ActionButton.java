
package Buttons;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author yatac
 */
public class ActionButton extends JButton{
   
    private boolean mousePress;
    
    
    public ActionButton(){
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(3,3,3,3));
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                mousePress = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mousePress = false;
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 =  (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int width = getWidth();
        int heigth =  getHeight();
        int size =(Math.max(width, heigth));
        int x =  (width-size)/2;
        int y =  (heigth-size)/2;
        
        //Pintado circular*/
        if(mousePress){
            g2.setColor(new Color(158,158,158, 69));
        }else {
            g2.setColor(new Color(199,199,199, 0));
        }
        g2.fill(new Ellipse2D.Double(x,y,size,size));
        g2.dispose();
        super.paintComponent(g); 
    }
}

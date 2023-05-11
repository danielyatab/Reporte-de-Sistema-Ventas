
package Buttons;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author yatac
 */
public class PanelActionDetalleVentasDetails extends javax.swing.JPanel {

    public PanelActionDetalleVentasDetails(ModelActionDetalles data) {
        initComponents();
        setOpaque(false);
        /*Accion del Boton*/
        btnDetalle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                data.getEvent().onView(data.getDetalles());
            }
        });
    }
     
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(250,250,250));
        g.fillRect(0 , 0, getWidth(),getHeight());
        g.setColor(new Color(255,255,255));
        g.fillRect(0,6,getWidth(), getHeight()-13);
        super.paintComponent(g);
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDetalle = new Buttons.ActionButton();

        btnDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/BtnDetalles.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
       
    }//GEN-LAST:event_btnDeleteMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Buttons.ActionButton btnDetalle;
    // End of variables declaration//GEN-END:variables
}

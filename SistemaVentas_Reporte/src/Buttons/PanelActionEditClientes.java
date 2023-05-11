
package Buttons;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author yatac
 */
public class PanelActionEditClientes extends javax.swing.JPanel {

    public PanelActionEditClientes(ModelActionClientes data) {
        initComponents();
        setOpaque(false);
        /*Dando acciones a cada boton*/
        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                data.getEvent().onEdit(data.getClientes());
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

        btnEdit = new Buttons.ActionButton();

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/editSkyBlue.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Buttons.ActionButton btnEdit;
    // End of variables declaration//GEN-END:variables
}

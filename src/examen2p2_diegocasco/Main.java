/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_diegocasco;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

/**
 *
 * @author dcasc
 */
public class Main extends javax.swing.JFrame implements Runnable {
    AdminCanciones ac=new AdminCanciones("./canciones.tpm");
    Canciones cancion = null;
    /**
     * Creates new form Main
     */
    
    private JProgressBar barra;
    private boolean avanzar = true;
    Thread hilo = new Thread(this);
    
    public Main() {
        initComponents();
        
        TA_Cancion.setEditable(false);
        ac.cargarArchivo();
        song = ac.getCanciones();
        cargararbol();
        PB_cancion.setMaximum(122-50);
        hilo.start();
    }
    
    

    @Override
    public void run(){
        while (avanzar) {
            
                  PB_cancion.setValue(PB_cancion.getValue()-1);
                System.out.println(PB_cancion.getValue());
            
            if (cancion != null) {
                for(int i=0;i<cancion.getCancion().size();i++){
                    try {
                        JLb_Reproducir.setText("Reproduciendo : "+cancion.getNombre());
                        TA_Cancion.append(cancion.getCancion().get(i).toString());
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } //FIN IF

            try {
                Thread.sleep(100);
            }catch (InterruptedException ex) {
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PB_cancion = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jt_canciones = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        TA_Cancion = new javax.swing.JTextArea();
        Jb_GrabarCancion = new javax.swing.JButton();
        Jb_GuardarCancion = new javax.swing.JButton();
        JB_ReproducirCancion = new javax.swing.JButton();
        JB_PausarCancion = new javax.swing.JButton();
        JLb_Reproducir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Canciones");
        Jt_canciones.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(Jt_canciones);

        TA_Cancion.setColumns(20);
        TA_Cancion.setRows(5);
        TA_Cancion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TA_CancionKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(TA_Cancion);

        Jb_GrabarCancion.setText("Grabar Cancion");
        Jb_GrabarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jb_GrabarCancionActionPerformed(evt);
            }
        });

        Jb_GuardarCancion.setText("Guardar Cancion");
        Jb_GuardarCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jb_GuardarCancionMouseClicked(evt);
            }
        });

        JB_ReproducirCancion.setText("Reproducir Cancion");
        JB_ReproducirCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ReproducirCancionActionPerformed(evt);
            }
        });

        JB_PausarCancion.setText("Pausar Cancion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(PB_cancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLb_Reproducir, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Jb_GrabarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Jb_GuardarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JB_ReproducirCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JB_PausarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2))))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLb_Reproducir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PB_cancion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JB_ReproducirCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JB_PausarCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Jb_GrabarCancion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jb_GuardarCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(2, 2, 2)))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jb_GuardarCancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jb_GuardarCancionMouseClicked
        // TODO add your handling code here:    
        String Categoria =JOptionPane.showInputDialog("Ingrese La categoria");
        String Cancion =JOptionPane.showInputDialog("Ingrese el nombre de la cancion");
        Canciones c =new Canciones(Cancion, Categoria);
        song.add(c);
        String cancion=TA_Cancion.getText();
        for(int i=0;i<cancion.length();i++){
            char ca=cancion.charAt(i);
            song.get(song.size()-1).getCancion().add(ca);
        } 
        ac.cargarArchivo();
        ac.setCanciones(c);
        ac.escribirArchivo();
        TA_Cancion.setEditable(false);
        TA_Cancion.setText("");
        cargararbol();
    }//GEN-LAST:event_Jb_GuardarCancionMouseClicked

    private void cargararbol(){
        DefaultTreeModel m= (DefaultTreeModel) Jt_canciones.getModel();
        DefaultMutableTreeNode raiz= (DefaultMutableTreeNode) m.getRoot();
        raiz.removeAllChildren();
        for (Canciones canciones : song) {
            DefaultMutableTreeNode nodo_categoria = null;  
            for(int i=0;i<raiz.getChildCount();i++)
               if(raiz.getChildAt(i).toString().equals(canciones.getCategoria()))
                    nodo_categoria = (DefaultMutableTreeNode)raiz.getChildAt(i);
                
            if(nodo_categoria == null){
                nodo_categoria = new DefaultMutableTreeNode(canciones.getCategoria());
                raiz.add(nodo_categoria);
            }
            nodo_categoria.add(new DefaultMutableTreeNode(canciones));
        }
        m.reload();
    }
    private void Jb_GrabarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jb_GrabarCancionActionPerformed
        // TODO add your handling code here:
        for(int i=3;i>=0;i--){
        JLb_Reproducir.setText("Grabando en........"+i);
        }
        JLb_Reproducir.setText("Grabando......");
        TA_Cancion.setEditable(true);
    }//GEN-LAST:event_Jb_GrabarCancionActionPerformed

    private void JB_ReproducirCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ReproducirCancionActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode nodo= (DefaultMutableTreeNode)Jt_canciones.getLastSelectedPathComponent();
        cancion= (Canciones)nodo.getUserObject();
        hilo.start();
    }//GEN-LAST:event_JB_ReproducirCancionActionPerformed

    private void TA_CancionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TA_CancionKeyPressed
        // TODO add your handling code here:
        try {
           int num = ((int)evt.getKeyChar());
           PB_cancion.setValue(num-50);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_TA_CancionKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_PausarCancion;
    private javax.swing.JButton JB_ReproducirCancion;
    private javax.swing.JLabel JLb_Reproducir;
    private javax.swing.JButton Jb_GrabarCancion;
    private javax.swing.JButton Jb_GuardarCancion;
    private javax.swing.JTree Jt_canciones;
    private javax.swing.JProgressBar PB_cancion;
    private javax.swing.JTextArea TA_Cancion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    ArrayList<Canciones> song = new ArrayList();
}

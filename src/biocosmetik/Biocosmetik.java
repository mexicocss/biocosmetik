/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biocosmetik;

import biocosmetik.data.Session;
import biocosmetik.ui.MDI;
import javax.swing.JOptionPane;

/**
 *
 * @author 43699891
 */
public class Biocosmetik {

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Session session = new Session();
                boolean connected = session.getSession().isConnected();
                boolean open = session.getSession().isOpen();
                boolean dirty = session.getSession().isDirty();
                if (open && connected && !dirty) {
                    MDI mdi = new MDI(session);
                    mdi.setLocationRelativeTo(null);
                    mdi.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos", "Error de conexión", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}

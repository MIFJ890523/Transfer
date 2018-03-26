package interfaz;

import code.Transfer;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.vfs2.FileSystemException;

/**
 *
 * @author jmiranda
 */
public class MainInterface extends javax.swing.JFrame {

    public String[] userData = new String[5];
    public String type;

    public MainInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * 
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        field_User = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        field_Port = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        field_Pass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        field_LocalPath = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        field_RemotePath = new javax.swing.JTextField();
        button_Ejecutar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        combo_Connection = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transfer");
        setBackground(new java.awt.Color(21, 21, 13));
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(300, 575));
        setPreferredSize(new java.awt.Dimension(300, 575));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 575));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("MenuItem.selectionBackground"));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 468));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 545));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Usuario:");
        jLabel1.setMaximumSize(null);
        jLabel1.setMinimumSize(null);
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 25));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 100, -1, -1));

        field_User.setToolTipText("user@host");
        field_User.setMaximumSize(null);
        field_User.setMinimumSize(null);
        field_User.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(field_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 125, -1, -1));

        jLabel2.setText("Puerto:");
        jLabel2.setMaximumSize(null);
        jLabel2.setMinimumSize(null);
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 25));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 175, -1, -1));

        field_Port.setToolTipText("22");
        field_Port.setMaximumSize(null);
        field_Port.setMinimumSize(null);
        field_Port.setName(""); // NOI18N
        field_Port.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(field_Port, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 200, -1, -1));

        jLabel3.setText("Password:");
        jLabel3.setMaximumSize(null);
        jLabel3.setMinimumSize(null);
        jLabel3.setPreferredSize(new java.awt.Dimension(250, 25));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 250, -1, -1));

        field_Pass.setMaximumSize(null);
        field_Pass.setMinimumSize(null);
        field_Pass.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(field_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 275, -1, -1));

        jLabel4.setText("Ruta de archivo local:");
        jLabel4.setPreferredSize(new java.awt.Dimension(250, 25));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 325, -1, -1));

        field_LocalPath.setToolTipText("/home/user/file.txt");
        field_LocalPath.setMaximumSize(null);
        field_LocalPath.setMinimumSize(null);
        field_LocalPath.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(field_LocalPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 350, -1, -1));

        jLabel5.setText("Ruta de archivo remoto:");
        jLabel5.setPreferredSize(new java.awt.Dimension(250, 25));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 400, -1, -1));

        field_RemotePath.setToolTipText("file.txt");
        field_RemotePath.setMaximumSize(null);
        field_RemotePath.setMinimumSize(null);
        field_RemotePath.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(field_RemotePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 425, -1, -1));

        button_Ejecutar.setText("Descargar");
        button_Ejecutar.setMaximumSize(new java.awt.Dimension(150, 30));
        button_Ejecutar.setMinimumSize(new java.awt.Dimension(150, 30));
        button_Ejecutar.setPreferredSize(new java.awt.Dimension(150, 30));
        button_Ejecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_EjecutarMouseClicked(evt);
            }
        });
        jPanel1.add(button_Ejecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 500, -1, -1));

        jLabel6.setText("Sistema de archivos:");
        jLabel6.setPreferredSize(new java.awt.Dimension(250, 25));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, -1, -1));

        combo_Connection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "http://", "ftp://", "sftp://", "zip:", "smb://" }));
        combo_Connection.setMaximumSize(null);
        combo_Connection.setPreferredSize(new java.awt.Dimension(250, 30));
        combo_Connection.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_ConnectionItemStateChanged(evt);
            }
        });
        jPanel1.add(combo_Connection, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_EjecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_EjecutarMouseClicked

        userData[0] = field_User.getText();
        userData[1] = field_Port.getText();
        userData[2] = field_Pass.getText();
        userData[3] = field_LocalPath.getText();
        userData[4] = field_RemotePath.getText();

        if (userData[0].equals("") || userData[1].equals("") || userData[2].equals("") || userData[3].equals("") || userData[4].equals("")) {
            JOptionPane.showMessageDialog(null, "Campos vacios", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            type = (String) combo_Connection.getSelectedItem();
            Transfer transfer = new Transfer();
            try {
                transfer.download(userData, type);
            } catch (FileSystemException ex) {
                Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_button_EjecutarMouseClicked

    private void combo_ConnectionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_ConnectionItemStateChanged
        if (combo_Connection.getSelectedIndex() == 3) {
            field_User.setToolTipText("ftp://user@host");
        } else {
            field_User.setToolTipText("user@host");
        }
    }//GEN-LAST:event_combo_ConnectionItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Ejecutar;
    private javax.swing.JComboBox<String> combo_Connection;
    private javax.swing.JTextField field_LocalPath;
    private javax.swing.JTextField field_Pass;
    private javax.swing.JTextField field_Port;
    private javax.swing.JTextField field_RemotePath;
    private javax.swing.JTextField field_User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

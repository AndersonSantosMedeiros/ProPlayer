package imd.player.view;

import imd.player.control.ControlFacade;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anderson Santos and Yuri Reinaldo
 */
public class PlaylistScreen extends javax.swing.JDialog {

    private DefaultTableModel musicsDtm;
    private DefaultTableModel playlistDtm;

    /**
     * Creates new form PlaylistScreen
     */
    public PlaylistScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.musicsDtm = new DefaultTableModel();
        this.playlistDtm = new DefaultTableModel();

        Object[] colum = {"Musics"};
        this.musicsDtm.setColumnIdentifiers(colum);
        this.playlistDtm.setColumnIdentifiers(colum);

        for (String musicName : ControlFacade.getInstance().getAllMusicNames()) {
            Object[] music = {musicName};
            this.musicsDtm.addRow(music);
        }
        this.tblMusics.setModel(this.musicsDtm);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMusics = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPlaylistMusics = new javax.swing.JTable();
        btnAddToPlaylist = new javax.swing.JButton();
        btnRemoveFromPlaylist = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        txtPlaylistName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tblMusics.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Music"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMusics);
        if (tblMusics.getColumnModel().getColumnCount() > 0) {
            tblMusics.getColumnModel().getColumn(0).setResizable(false);
        }

        tblPlaylistMusics.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Music"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPlaylistMusics);
        if (tblPlaylistMusics.getColumnModel().getColumnCount() > 0) {
            tblPlaylistMusics.getColumnModel().getColumn(0).setResizable(false);
        }

        btnAddToPlaylist.setText("Add to Playlist ->");
        btnAddToPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToPlaylistActionPerformed(evt);
            }
        });

        btnRemoveFromPlaylist.setText(" Remove  from Playlist");
        btnRemoveFromPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFromPlaylistActionPerformed(evt);
            }
        });

        btnSave.setText("Save Playlist");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Playlist name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAddToPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRemoveFromPlaylist)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPlaylistName)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlaylistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(btnAddToPlaylist)
                                .addGap(43, 43, 43)
                                .addComponent(btnRemoveFromPlaylist))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnSave))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAddToPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToPlaylistActionPerformed
        if (this.tblMusics.getSelectedRow() != -1) {
            String musicName = (String) this.musicsDtm.getValueAt(this.tblMusics.getSelectedRow(), 0);
            Object[] music = {musicName};
            this.playlistDtm.addRow(music);
        }
        this.tblPlaylistMusics.setModel(this.playlistDtm);
    }//GEN-LAST:event_btnAddToPlaylistActionPerformed

    private void btnRemoveFromPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFromPlaylistActionPerformed
        if (this.tblPlaylistMusics.getSelectedRow() != -1) {
            this.playlistDtm.removeRow(this.tblPlaylistMusics.getSelectedRow());
        }
        this.tblPlaylistMusics.setModel(this.playlistDtm);
    }//GEN-LAST:event_btnRemoveFromPlaylistActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(this.tblPlaylistMusics.getRowCount() == 0){
            JOptionPane.showMessageDialog(this, "Select more musics to make a playlist", "Not enough musics", JOptionPane.ERROR_MESSAGE);
        }else if(this.txtPlaylistName.getText().equals("")){
            JOptionPane.showMessageDialog(this, "You must set a name for your playlist", "Set the playlist name", JOptionPane.ERROR_MESSAGE);
        }else{
            ArrayList<String> musicNames = new ArrayList<>();
            for(int i = 0; i < this.tblPlaylistMusics.getRowCount(); i++){
                musicNames.add((String) this.tblPlaylistMusics.getValueAt(i, 0));
            }
            if(!ControlFacade.getInstance().createPlaylist(musicNames, this.txtPlaylistName.getText())){
                JOptionPane.showMessageDialog(this, "Wasn't possible to create a new playlist, check the playlist name", "Error creating a new playlist", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Playlist " + this.txtPlaylistName.getText() + " created", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.txtPlaylistName.setText("");
                Object [] colum = {"Musics"};
                this.playlistDtm = new DefaultTableModel();
                this.playlistDtm.setColumnIdentifiers(colum);
                this.tblPlaylistMusics.setModel(this.playlistDtm);
                MainScreen.updatePLaylistTable();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(PlaylistScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaylistScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaylistScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaylistScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PlaylistScreen dialog = new PlaylistScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToPlaylist;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnRemoveFromPlaylist;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMusics;
    private javax.swing.JTable tblPlaylistMusics;
    private javax.swing.JTextField txtPlaylistName;
    // End of variables declaration//GEN-END:variables
}

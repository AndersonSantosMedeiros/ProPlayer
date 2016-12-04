package imd.player.view;

import imd.player.control.ControlFacade;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javazoom.jl.decoder.JavaLayerException;

public class MainScreen extends javax.swing.JFrame {
    
    private JFileChooser jfc;
    private FileNameExtensionFilter fl;
    private DefaultTableModel dtmFiles;
    private DefaultTableModel dtmPlaylist;
    private static DefaultTableModel dtmPlaylistList;
    
    public MainScreen() {
        initComponents();
        
        if (ControlFacade.getInstance().loggedUserIsAdmin()) {
            this.menuVip.setVisible(true);
            this.panelPlaylist.setVisible(true);
            this.panelPlaylistMusics.setVisible(true);
            this.btnBack.setVisible(true);
            this.btnForward.setVisible(true);
            this.lblPlaylistMusics.setVisible(true);
        }
        
        menuUser.setText(ControlFacade.getInstance().getLoggedUserLogin());
        
        fl = new FileNameExtensionFilter("Mp3 Files", "mp3");
        jfc = new JFileChooser();
        jfc.removeChoosableFileFilter(jfc.getFileFilter());
        
        this.updateFolderTable();
        
        if (ControlFacade.getInstance().loggedUserIsAdmin()) {
            this.updatePLaylistTable();
            String firstPlaylist = "";
            if (this.tblPlaylistList.getRowCount() >= 1) {
                firstPlaylist = (String) this.tblPlaylistList.getValueAt(0, 0);
            }
            if (!firstPlaylist.equals("")) {
                this.updatePlaylistContentstable(firstPlaylist);
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

        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        pbarMusic = new javax.swing.JProgressBar();
        btnBack = new javax.swing.JButton();
        btnForward = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        lblMusicName = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFolder = new javax.swing.JTable();
        btnStop = new javax.swing.JButton();
        lblMusics = new javax.swing.JLabel();
        panelPlaylistMusics = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlaylist = new javax.swing.JTable();
        lblPlaylistMusics = new javax.swing.JLabel();
        panelPlaylist = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPlaylistList = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUser = new javax.swing.JMenu();
        menuLogoff = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuOpenFile = new javax.swing.JMenuItem();
        menuOpenDirectory = new javax.swing.JMenuItem();
        menuVip = new javax.swing.JMenu();
        menuCreatePlaylist = new javax.swing.JMenuItem();
        menuAddUser = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu2.setText("File");
        jMenuBar3.add(jMenu2);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(827, 461));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pbarMusic.setName(""); // NOI18N
        getContentPane().add(pbarMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 348, 803, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        btnBack.setVisible(false);
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 380, 71, -1));

        btnForward.setText("Forward");
        btnForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForwardActionPerformed(evt);
            }
        });
        btnForward.setVisible(false);
        getContentPane().add(btnForward, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 380, -1, -1));

        btnPlay.setText("Pause");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 374, 75, 42));

        lblMusicName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMusicName.setText(" ");
        getContentPane().add(lblMusicName, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 324, 599, -1));

        tblFolder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Music Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFolder.getTableHeader().setReorderingAllowed(false);
        tblFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFolderMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblFolder);
        if (tblFolder.getColumnModel().getColumnCount() > 0) {
            tblFolder.getColumnModel().getColumn(0).setResizable(false);
            tblFolder.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblFolder.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 73, 301, 224));

        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        getContentPane().add(btnStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 374, 75, 42));

        lblMusics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMusics.setText("Musics");
        lblMusics.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblMusics, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 301, -1));

        tblPlaylist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Music Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPlaylist.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblPlaylist);
        if (tblPlaylist.getColumnModel().getColumnCount() > 0) {
            tblPlaylist.getColumnModel().getColumn(0).setResizable(false);
            tblPlaylist.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblPlaylist.getColumnModel().getColumn(1).setResizable(false);
        }

        lblPlaylistMusics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlaylistMusics.setText("Playlist Musics");
        lblPlaylistMusics.setVisible(false);

        javax.swing.GroupLayout panelPlaylistMusicsLayout = new javax.swing.GroupLayout(panelPlaylistMusics);
        panelPlaylistMusics.setLayout(panelPlaylistMusicsLayout);
        panelPlaylistMusicsLayout.setHorizontalGroup(
            panelPlaylistMusicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlaylistMusicsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelPlaylistMusicsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlaylistMusics, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPlaylistMusicsLayout.setVerticalGroup(
            panelPlaylistMusicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlaylistMusicsLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lblPlaylistMusics)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(panelPlaylistMusics, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 310));
        panelPlaylistMusics.setVisible(false);

        tblPlaylistList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Playlists"
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
        tblPlaylistList.getTableHeader().setReorderingAllowed(false);
        tblPlaylistList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlaylistListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPlaylistList);
        if (tblPlaylistList.getColumnModel().getColumnCount() > 0) {
            tblPlaylistList.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout panelPlaylistLayout = new javax.swing.GroupLayout(panelPlaylist);
        panelPlaylist.setLayout(panelPlaylistLayout);
        panelPlaylistLayout.setHorizontalGroup(
            panelPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlaylistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPlaylistLayout.setVerticalGroup(
            panelPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlaylistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(panelPlaylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 190, 320));
        panelPlaylist.setVisible(false);

        menuUser.setText("User");

        menuLogoff.setText("Logoff");
        menuLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoffActionPerformed(evt);
            }
        });
        menuUser.add(menuLogoff);

        jMenuBar1.add(menuUser);

        jMenu1.setText("File");

        menuOpenFile.setText("Open file");
        menuOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenFileActionPerformed(evt);
            }
        });
        jMenu1.add(menuOpenFile);

        menuOpenDirectory.setText("Open directory");
        menuOpenDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenDirectoryActionPerformed(evt);
            }
        });
        jMenu1.add(menuOpenDirectory);

        jMenuBar1.add(jMenu1);

        menuVip.setText("VIP");

        menuCreatePlaylist.setText("Create playlist");
        menuCreatePlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCreatePlaylistActionPerformed(evt);
            }
        });
        menuVip.add(menuCreatePlaylist);

        menuAddUser.setText("Add User");
        menuAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddUserActionPerformed(evt);
            }
        });
        menuVip.add(menuAddUser);

        jMenuBar1.add(menuVip);
        menuVip.setVisible(false);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateFolderTable() {
        this.dtmFiles = new DefaultTableModel();
        
        Object[] identificators = {"Number", "Music name"};
        this.dtmFiles.setColumnIdentifiers(identificators);
        int i = 1;
        for (String musicNames : ControlFacade.getInstance().getAllMusicNames()) {
            Object[] name = {i++, musicNames};
            this.dtmFiles.addRow(name);
        }
        
        this.tblFolder.setModel(this.dtmFiles);
    }
    
    private void updatePlaylistContentstable(String playlistName) {
        this.dtmPlaylist = new DefaultTableModel();
        
        Object[] identificators = {"Number", "Music name"};
        this.dtmPlaylist.setColumnIdentifiers(identificators);
        int i = 1;
        for (String musicNames : ControlFacade.getInstance().getMusicsNamesFromPlaylist(playlistName)) {
            Object[] name = {i++, musicNames};
            this.dtmPlaylist.addRow(name);
        }
        
        this.tblPlaylist.setModel(this.dtmPlaylist);
        this.lblPlaylistMusics.setText(playlistName);
    }
    
    public static void updatePLaylistTable() {
        MainScreen.dtmPlaylistList = new DefaultTableModel();
        
        Object[] identificators = {"Playlists"};
        MainScreen.dtmPlaylistList.setColumnIdentifiers(identificators);
        int i = 1;
        for (String playlistNames : ControlFacade.getInstance().getAllPLaylistsNames()) {
            Object[] name = {playlistNames};
            MainScreen.dtmPlaylistList.addRow(name);
        }
        
        MainScreen.tblPlaylistList.setModel(MainScreen.dtmPlaylistList);
    }
    

    private void menuOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenFileActionPerformed
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        if (jfc.getFileFilter() != fl) {
            jfc.addChoosableFileFilter(fl);
        }
        jfc.showDialog(this, "Open");
        if (jfc.getSelectedFile() != null) {
            if (ControlFacade.getInstance().addNewMusic(jfc.getSelectedFile())) {
                this.updateFolderTable();
            }
        }
    }//GEN-LAST:event_menuOpenFileActionPerformed

    private void menuOpenDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenDirectoryActionPerformed
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jfc.removeChoosableFileFilter(jfc.getFileFilter());
        jfc.showDialog(this, "Open");
        if (jfc.getSelectedFile() != null) {
            ControlFacade.getInstance().addNewDirectoryOfMusics(jfc.getSelectedFile());
        }
        this.updateFolderTable();
    }//GEN-LAST:event_menuOpenDirectoryActionPerformed

    private void menuAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddUserActionPerformed
        AddUserScreen addUser = new AddUserScreen(this, false);
        addUser.setVisible(true);
    }//GEN-LAST:event_menuAddUserActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        if (ControlFacade.getInstance().pauseOrPlayMusic()) {
            btnPlay.setText("Play");
        } else {
            btnPlay.setText("Pause");
        }
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForwardActionPerformed
        ControlFacade.getInstance().playNextMusic();
    }//GEN-LAST:event_btnForwardActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ControlFacade.getInstance().playBackMusic();
    }//GEN-LAST:event_btnBackActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            ControlFacade.getInstance().exit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_formWindowClosing

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        ControlFacade.getInstance().stopMusic();
    }//GEN-LAST:event_btnStopActionPerformed

    private void tblPlaylistListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlaylistListMouseClicked
        String selectedPlaylist = (String) this.tblPlaylistList.getValueAt(this.tblPlaylistList.getSelectedRow(), 0);
        if (this.tblPlaylistList.getRowCount() > 0){
            this.updatePlaylistContentstable(selectedPlaylist);
            try {
                ControlFacade.getInstance().stopMusic();
                ControlFacade.getInstance().playPlaylist(selectedPlaylist, this.pbarMusic, this.lblMusicName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tblPlaylistListMouseClicked

    private void tblFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFolderMouseClicked
        String selectedMusic = (String) this.tblFolder.getValueAt(this.tblFolder.getSelectedRow(), 1);
        if (!selectedMusic.equals("")) {
            try {
                ControlFacade.getInstance().playMusic(selectedMusic, this.pbarMusic, this.lblMusicName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tblFolderMouseClicked

    private void menuCreatePlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCreatePlaylistActionPerformed
        PlaylistScreen playlistScreen = new PlaylistScreen(this, false);
        playlistScreen.setVisible(true);
    }//GEN-LAST:event_menuCreatePlaylistActionPerformed

    private void menuLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoffActionPerformed
        LoginScreen login = new LoginScreen();
        login.setVisible(true);
        ControlFacade.getInstance().stopMusic();
        this.setVisible(false);
    }//GEN-LAST:event_menuLogoffActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnForward;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnStop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblMusicName;
    private javax.swing.JLabel lblMusics;
    private javax.swing.JLabel lblPlaylistMusics;
    private javax.swing.JMenuItem menuAddUser;
    private javax.swing.JMenuItem menuCreatePlaylist;
    private javax.swing.JMenuItem menuLogoff;
    private javax.swing.JMenuItem menuOpenDirectory;
    private javax.swing.JMenuItem menuOpenFile;
    private javax.swing.JMenu menuUser;
    private javax.swing.JMenu menuVip;
    private javax.swing.JPanel panelPlaylist;
    private javax.swing.JPanel panelPlaylistMusics;
    private javax.swing.JProgressBar pbarMusic;
    private javax.swing.JTable tblFolder;
    private javax.swing.JTable tblPlaylist;
    private static javax.swing.JTable tblPlaylistList;
    // End of variables declaration//GEN-END:variables
}

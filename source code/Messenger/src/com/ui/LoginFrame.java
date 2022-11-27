package com.ui;

import com.socket.Message;
import com.socket.SocketClient;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Color;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.UIManager;


public class LoginFrame extends javax.swing.JFrame {

    public SocketClient client;
    public int port;
    public String serverAddr, username, password;
    public Thread clientThread;
    
    public LoginFrame() {
        initComponents();
        this.setTitle("Login");
        jLabelAllert.setVisible(false);

        this.addWindowListener(new WindowListener() {
            @Override public void windowOpened(WindowEvent e) {}
            @Override public void windowClosing(WindowEvent e) {try{clientThread.stop();} catch (Exception ex){}}
            @Override public void windowClosed(WindowEvent e) {}
            @Override public void windowIconified(WindowEvent e) {}
            @Override public void windowDeiconified(WindowEvent e) {}
            @Override public void windowActivated(WindowEvent e) {}
            @Override public void windowDeactivated(WindowEvent e) {}
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextHost = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextPort = new javax.swing.JTextField();
        jButtonConnect = new javax.swing.JButton();
        jTextUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonSignup = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jLabelAllert = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setResizable(false);

        jLabel1.setText("Host Address : ");

        jTextHost.setText("localhost");
        jTextHost.setNextFocusableComponent(jTextPort);
        jTextHost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextHostKeyTyped(evt);
            }
        });

        jLabel2.setText("Host Port : ");

        jTextPort.setText("13000");
        jTextPort.setNextFocusableComponent(jButtonConnect);
        jTextPort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPortKeyTyped(evt);
            }
        });

        jButtonConnect.setText("Connect");
        jButtonConnect.setNextFocusableComponent(jTextUsername);
        jButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectActionPerformed(evt);
            }
        });

        jTextUsername.setText("baoquoc");
        jTextUsername.setNextFocusableComponent(jPassword);
        jTextUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsernameActionPerformed(evt);
            }
        });
        jTextUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextUsernameKeyTyped(evt);
            }
        });

        jLabel3.setText("Password :");

        jLabel4.setText("Username :");

        jButtonSignup.setText("SignUp");
        jButtonSignup.setNextFocusableComponent(jTextHost);
        jButtonSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignupActionPerformed(evt);
            }
        });

        jPassword.setText("password");
        jPassword.setNextFocusableComponent(jButtonLogin);
        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordKeyTyped(evt);
            }
        });

        jButtonLogin.setText("Login");
        jButtonLogin.setFocusCycleRoot(true);
        jButtonLogin.setNextFocusableComponent(jButtonSignup);
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jLabelAllert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAllert.setForeground(java.awt.Color.red);
        jLabelAllert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAllert.setText("jLabelAllert");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/icon.png"))); // NOI18N
        jLabel5.setText(" MESSENGER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextHost)
                                    .addComponent(jTextPort))
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonConnect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextUsername))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 440, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAllert)
                .addGap(217, 217, 217))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConnect)
                    .addComponent(jButtonLogin)
                    .addComponent(jButtonSignup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAllert)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectActionPerformed
        serverAddr = jTextHost.getText();
        port = Integer.parseInt(jTextPort.getText());
        if(!serverAddr.isEmpty() && !jTextPort.getText().isEmpty()){
            try{
                if (client == null) client = new SocketClient(this);
                if (clientThread == null) {
                    clientThread = new Thread(client);
                    clientThread.start();
                }                
                client.send(new Message("test", "testUser", "testContent", "SERVER"));
                jLabelAllert.setVisible(true);
                jLabelAllert.setText("Server OK");
                jLabelAllert.setForeground(Color.GREEN.darker());
            }
            catch(Exception ex){
                jLabelAllert.setVisible(true);
                jLabelAllert.setForeground(Color.RED);
                jLabelAllert.setText("Server not found");
            }
        }
    }//GEN-LAST:event_jButtonConnectActionPerformed
    public void loginFail(int n){
        if (n==0) jLabelAllert.setText("Login Failed");
        else if (n==1) jLabelAllert.setText("Signup Failed");
        jLabelAllert.setForeground(Color.RED);
        jLabelAllert.setVisible(true);
    }
    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        serverAddr = jTextHost.getText();
        port = Integer.parseInt(jTextPort.getText());
        if(!serverAddr.isEmpty() && !jTextPort.getText().isEmpty()){
            try{
                if (client == null) client = new SocketClient(this);
                if (clientThread == null) {
                    clientThread = new Thread(client);
                    clientThread.start();
                }
                client.send(new Message("test", "testUser", "testContent", "SERVER"));
                username = jTextUsername.getText();
                password = jPassword.getText();
                
                if(!username.isEmpty() && !password.isEmpty()){
                    try{
                        client.send(new Message("login", username, password, "SERVER"));
                        jLabelAllert.setVisible(false);
                    }
                    catch (Exception ex){
                        jLabelAllert.setVisible(true);
                        jLabelAllert.setForeground(Color.RED);
                        jLabelAllert.setText("Login Failed");
                    }
                }
            }
            catch(Exception ex){
                jLabelAllert.setVisible(true);
                jLabelAllert.setForeground(Color.RED);
                jLabelAllert.setText("Server not found");
            }
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed
    
    private void jButtonSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignupActionPerformed
        serverAddr = jTextHost.getText();
        port = Integer.parseInt(jTextPort.getText());
        if(!serverAddr.isEmpty() && !jTextPort.getText().isEmpty()){
            try{
                if (client == null) client = new SocketClient(this);
                if (clientThread == null) {
                    clientThread = new Thread(client);
                    clientThread.start();
                }
                client.send(new Message("test", "testUser", "testContent", "SERVER"));
                username = jTextUsername.getText();
                password = jPassword.getText();
                
                if(!username.isEmpty() && !password.isEmpty()){
                    try{
                        client.send(new Message("signup", username, password, "SERVER"));
                        jLabelAllert.setVisible(false);
                    }
                    catch (Exception ex){
                        jLabelAllert.setVisible(true);
                        jLabelAllert.setForeground(Color.RED);
                        jLabelAllert.setText("Signup Failed");
                    }
                }
            }
            catch (Exception ex){
                jLabelAllert.setVisible(true);
                jLabelAllert.setForeground(Color.RED);
                jLabelAllert.setText("Server not found");
            }
        }
    }//GEN-LAST:event_jButtonSignupActionPerformed
    
    private void jTextUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextUsernameKeyTyped
        jLabelAllert.setText("");
    }//GEN-LAST:event_jTextUsernameKeyTyped

    private void jPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyTyped
        jLabelAllert.setText("");
    }//GEN-LAST:event_jPasswordKeyTyped

    private void jTextHostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextHostKeyTyped
        jLabelAllert.setText("");
    }//GEN-LAST:event_jTextHostKeyTyped

    private void jTextPortKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPortKeyTyped
        jLabelAllert.setText("");
    }//GEN-LAST:event_jTextPortKeyTyped

    private void jTextUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsernameActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch(Exception ex){
            System.out.println("Look & Feel exception");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonConnect;
    public javax.swing.JButton jButtonLogin;
    public javax.swing.JButton jButtonSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAllert;
    public javax.swing.JPasswordField jPassword;
    public javax.swing.JTextField jTextHost;
    public javax.swing.JTextField jTextPort;
    public javax.swing.JTextField jTextUsername;
    // End of variables declaration//GEN-END:variables

}

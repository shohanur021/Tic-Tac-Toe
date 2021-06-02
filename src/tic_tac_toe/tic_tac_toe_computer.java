package tic_tac_toe;

import java.awt.Color;
import java.awt.Component;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class tic_tac_toe_computer extends javax.swing.JFrame {
   
    
  
    boolean x = false;  // if match is draw x=false, else x=true

    public tic_tac_toe_computer() {
        initComponents();
        addAction();
        setLocation(350,100);
    }
    
    int x_or_o = 0;  // whose turns, if x_or_o is even,then it is 'X' .  
    
    

    public void winEffect(JButton b1, JButton b2, JButton b3) {

        b1.setBackground(Color.BLACK);
        b2.setBackground(Color.BLACK);
        b3.setBackground(Color.BLACK);

        b1.setForeground(Color.WHITE);
        b2.setForeground(Color.WHITE);
        b3.setForeground(Color.WHITE);


    }

    public void winner() {
        if (jButton1.getText().equals("X") && jButton2.getText().equals("X") && jButton3.getText().equals("X")) {
            winEffect(jButton1, jButton2, jButton3);
            x=true;
            sound_win();
            JOptionPane.showMessageDialog(null,"You win the match"); 
        }

        if (jButton4.getText().equals("X") && jButton5.getText().equals("X") && jButton6.getText().equals("X")) {
            winEffect(jButton4, jButton5, jButton6);
            x=true;
            sound_win();
            JOptionPane.showMessageDialog(null,"You win the match");
        }

        if (jButton7.getText().equals("X") && jButton8.getText().equals("X") && jButton9.getText().equals("X")) {
            winEffect(jButton7, jButton8, jButton9);
            x=true;
            sound_win();
           JOptionPane.showMessageDialog(null,"You win the match");  
        }

        if (jButton1.getText().equals("X") && jButton4.getText().equals("X") && jButton7.getText().equals("X")) {
            winEffect(jButton1, jButton4, jButton7);
            x=true;
            sound_win();
            JOptionPane.showMessageDialog(null,"You win the match");  
        }

        if (jButton2.getText().equals("X") && jButton5.getText().equals("X") && jButton8.getText().equals("X")) {
            winEffect(jButton2, jButton5, jButton8);
            x=true;
            sound_win();
            JOptionPane.showMessageDialog(null,"You win the match"); 
        }

        if (jButton3.getText().equals("X") && jButton6.getText().equals("X") && jButton9.getText().equals("X")) {
            winEffect(jButton3, jButton6, jButton9);
            x=true;
            sound_win();
            JOptionPane.showMessageDialog(null,"You win the match"); 
        }

        if (jButton1.getText().equals("X") && jButton5.getText().equals("X") && jButton9.getText().equals("X")) {
           winEffect(jButton1, jButton5, jButton9);
           x=true;
           sound_win();
           JOptionPane.showMessageDialog(null,"You win the match"); 
        }

        if (jButton3.getText().equals("X") && jButton5.getText().equals("X") && jButton7.getText().equals("X")) {
            winEffect(jButton3, jButton5, jButton7);
            x=true;
            sound_win();
            JOptionPane.showMessageDialog(null,"You win the match");
        }
        
        
        
        

        if (jButton1.getText().equals("O") && jButton2.getText().equals("O") && jButton3.getText().equals("O")) {
            winEffect(jButton1, jButton2, jButton3);
            x=true;
            JOptionPane.showMessageDialog(null,"Computer Wins the match"); 
            sound_loser();
        } 
        
        if (jButton4.getText().equals("O") && jButton5.getText().equals("O") && jButton6.getText().equals("O")) {
            winEffect(jButton4, jButton5, jButton6);
            x=true;
           JOptionPane.showMessageDialog(null,"Computer Wins the match"); 
           sound_loser();
        }

        if (jButton7.getText().equals("O") && jButton8.getText().equals("O") && jButton9.getText().equals("O")) {
            winEffect(jButton7, jButton8, jButton9);
            x=true;
            JOptionPane.showMessageDialog(null,"Computer Wins the match"); 
            sound_loser();
        }

        if (jButton1.getText().equals("O") && jButton4.getText().equals("O") && jButton7.getText().equals("O")) {
            winEffect(jButton1, jButton4, jButton7);
            x=true;
            JOptionPane.showMessageDialog(null,"Computer Wins the match");
            sound_loser();
        }

        if (jButton2.getText().equals("O") && jButton5.getText().equals("O") && jButton8.getText().equals("O")) {
            winEffect(jButton2, jButton5, jButton8);
            x=true;
            JOptionPane.showMessageDialog(null,"Computer Wins the match"); 
            sound_loser();
        }

        if (jButton3.getText().equals("O") && jButton6.getText().equals("O") && jButton9.getText().equals("O")) {
            winEffect(jButton3, jButton6, jButton9);
            x=true;
            JOptionPane.showMessageDialog(null,"Computer Wins the match");
            sound_loser();
        }

        if (jButton1.getText().equals("O") && jButton5.getText().equals("O") && jButton9.getText().equals("O")) {
            winEffect(jButton1, jButton5, jButton9);
            x=true;
            JOptionPane.showMessageDialog(null,"Computer Wins the match"); 
            sound_loser();
        }

        if (jButton3.getText().equals("O") && jButton5.getText().equals("O") && jButton7.getText().equals("O")) {
            winEffect(jButton3, jButton5, jButton7);
            x=true;
            JOptionPane.showMessageDialog(null,"Computer Wins the match"); 
            sound_loser();
        }
               
    }
    
    
    public void computer(int r){
    if(r==0){
        if(jButton5.getText()==""){
            jButton5.setText("O");
            jButton5.setForeground(Color.RED); 
        }
        else if(jButton3.getText()==""){
            jButton3.setText("O");
            jButton3.setForeground(Color.RED); 
        } 
        else if(jButton1.getText()==""){
            jButton1.setText("O");
            jButton1.setForeground(Color.RED); 
        } 
        else if(jButton7.getText()==""){
            jButton7.setText("O");
            jButton7.setForeground(Color.RED); 
        } 
        else if(jButton9.getText()==""){
            jButton9.setText("O");
            jButton9.setForeground(Color.RED); 
        } 
        else if(jButton2.getText()==""){
            jButton2.setText("O");
            jButton2.setForeground(Color.RED); 
        } 
        else if(jButton8.getText()==""){
            jButton8.setText("O");
            jButton8.setForeground(Color.RED); 
        } 
        else if(jButton6.getText()==""){
            jButton6.setText("O");
            jButton6.setForeground(Color.RED); 
        }
        else if(jButton4.getText()==""){
            jButton4.setText("O");
            jButton4.setForeground(Color.RED); 
        }
    }
    
    if(r==1){
         if(jButton9.getText()==""){
            jButton9.setText("O");
            jButton9.setForeground(Color.RED); 
        }
        else if(jButton5.getText()==""){
            jButton5.setText("O");
            jButton5.setForeground(Color.RED); 
        } 
        else if(jButton1.getText()==""){
            jButton1.setText("O");
            jButton1.setForeground(Color.RED); 
        } 
        else if(jButton8.getText()==""){
            jButton8.setText("O");
            jButton8.setForeground(Color.RED); 
        } 
        else if(jButton6.getText()==""){
            jButton6.setText("O");
            jButton6.setForeground(Color.RED); 
        } 
        else if(jButton7.getText()==""){
            jButton7.setText("O");
            jButton7.setForeground(Color.RED); 
        } 
        else if(jButton2.getText()==""){
            jButton2.setText("O");
            jButton2.setForeground(Color.RED); 
        } 
        else if(jButton4.getText()==""){
            jButton4.setText("O");
            jButton4.setForeground(Color.RED); 
        }
        else if(jButton3.getText()==""){
            jButton3.setText("O");
            jButton3.setForeground(Color.RED); 
        }
    }
        
    if(r==2){
         if(jButton5.getText()==""){
            jButton5.setText("O");
            jButton5.setForeground(Color.RED); 
        }
        else if(jButton3.getText()==""){
            jButton3.setText("O");
            jButton3.setForeground(Color.RED); 
        } 
        else if(jButton1.getText()==""){
            jButton1.setText("O");
            jButton1.setForeground(Color.RED); 
        } 
        else if(jButton7.getText()==""){
            jButton7.setText("O");
            jButton7.setForeground(Color.RED); 
        } 
        else if(jButton9.getText()==""){
            jButton9.setText("O");
            jButton9.setForeground(Color.RED); 
        } 
        else if(jButton2.getText()==""){
            jButton2.setText("O");
            jButton2.setForeground(Color.RED); 
        } 
        else if(jButton8.getText()==""){
            jButton8.setText("O");
            jButton8.setForeground(Color.RED); 
        } 
        else if(jButton6.getText()==""){
            jButton6.setText("O");
            jButton6.setForeground(Color.RED); 
        }
        else if(jButton4.getText()==""){
            jButton4.setText("O");
            jButton4.setForeground(Color.RED); 
        }
    }
    sound_clicked();  
    winner();
    x_or_o++;
    }
    
    private void sound_clicked(){
        
        try{
            File sound;
            sound = new File("G:\\2.1\\SD Lab\\Tic-Tac-Toe\\press.wav");
            Clip c=AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
            }catch(Exception e){    
            }        
    }
    
    private void sound_win(){
        try{
            File sound;
            sound = new File("G:\\2.1\\SD Lab\\Tic-Tac-Toe\\src\\tic_tac_toe\\winner.wav");
            Clip c=AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        }catch(Exception e){    
        }
    }
    
    private void sound_loser(){
        try{
            File sound;
            sound = new File("G:\\2.1\\SD Lab\\Tic-Tac-Toe\\src\\tic_tac_toe\\loser.wav");
            Clip c=AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        }catch(Exception e){    
        }
    }
    
   

    public ActionListener createAction(JButton button) {
        ActionListener a1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (button.getText().equals("")) {
                    if (x_or_o % 2 == 0 && x == false) {
                        x_or_o++;
                        button.setText("X");
                        button.setForeground(Color.BLUE);  
                        winner();
                        sound_clicked();
                        Timer timer = new Timer(1100, new ActionListener() {
                            
                             public void actionPerformed(ActionEvent evt) {
                                if(x == false){
                                   Random rand = new Random();
                                   int random=rand.nextInt(3);
                                   computer(random);  
                                } 
                            }
                        });
                        timer.setRepeats(false);
                        timer.start();
                    } 
                }
            }
        };
    return a1;
    }

    
    public void addAction() {
        Component[] comps = jPanel1.getComponents();

        for (Component comp : comps) {
            if (comp instanceof JButton) {

                JButton button = (JButton) comp;
                button.addActionListener(createAction(button));
            }
        }
    }
    
    
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(10, 126, 126));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 85)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 85)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 85)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Trebuchet MS", 1, 85)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 85)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 85)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Trebuchet MS", 1, 85)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Trebuchet MS", 1, 85)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Trebuchet MS", 1, 85)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jButton11.setBackground(new java.awt.Color(204, 0, 204));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tic_tac_toe/Replay-512.png"))); // NOI18N
        jButton11.setText("REPLAY");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(204, 0, 204));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tic_tac_toe/Button-Close-icon (3).png"))); // NOI18N
        jButton12.setText("EXIT");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(204, 0, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tic_tac_toe/arrow-back-icon (4).png"))); // NOI18N
        jButton10.setText("BACK");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       
        Component[] comps = jPanel1.getComponents();

        for (Component comp : comps) {
            if (comp instanceof JButton) {
                JButton button = (JButton) comp;
                button.setText("");
                button.setBackground(Color.WHITE);
            } 
        }  
        x_or_o = 0;
        x = false;
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      menu mn = new menu();
      this.setVisible(false); 
      mn.setVisible(true); 
    }//GEN-LAST:event_jButton10ActionPerformed
      
   
    public static void main(String args[]){
    
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tic_tac_toe_computer().setVisible(true);
            }
        });
        
         
    }
    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
  
}

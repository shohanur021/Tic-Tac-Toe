package tic_tac_toe;


import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class start extends javax.swing.JFrame {

   
    public start() {
        initComponents();
        setLocation(210,100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bar = new javax.swing.JProgressBar();
        progress = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        bar.setForeground(new java.awt.Color(255, 141, 10));
        jPanel1.add(bar);
        bar.setBounds(240, 320, 500, 20);

        progress.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        progress.setForeground(new java.awt.Color(255, 255, 255));
        progress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        progress.setText("0 %");
        jPanel1.add(progress);
        progress.setBounds(470, 370, 40, 30);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tic_tac_toe/IMG_20.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 920, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]){
      
        start st=new start();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                st.setVisible(true);
            }
        });
       
        menu mn = new menu();
        try{
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(30);
                st.bar.setValue(i);
                st.progress.setText(Integer.toString(i)+"%");
            }
        }catch(Exception e){ 
        }
        st.dispose();
        mn.setVisible(true); 
      
        
    }
        
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel progress;
    // End of variables declaration//GEN-END:variables
}


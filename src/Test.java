
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author priya
 */
public class Test extends javax.swing.JFrame {

    /**
     * Creates new form question
     */
    public Test() {
        initComponents();
        connect();
        LoadQuestions();
    }
    static int unique_roll;
    static  int flag=0;
    static int question_no=0;
    static  int securedmark=0;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String given_answer=null;
    String currect_answer=null;
    String option1=null;
    String option2=null;
    String option3=null;
    String option4=null;
    public  void connect()
    {
        String className="com.mysql.cj.jdbc.Driver";
        try{
           Class.forName(className);
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinexam","root","Meher@123");
            System.out.println("Loades successfully");     
        }catch(Exception e)
        {
            //e.printStackTrace();
            System.out.println("DRIVER FAILED TO LOAD".toUpperCase());
        }
    }
    public  void  LoadQuestions()
    {
        String query=" SELECT * FROM question";
        Statement st=null;
        try {
            st=con.createStatement();
            rs=st.executeQuery(query);  
            while(rs.next())
            {
                qu_name.setText(rs.getString(2));
                qu_no.setText(rs.getString(1));
                rs1.setText(rs.getString(3));
                 option1=rs.getString(3);
                rs2.setText(rs.getString(4));
                 option2=rs.getString(4);
                rs3.setText(rs.getString(5));
                 option3=rs.getString(5);
                rs4.setText(rs.getString(6));
                 option4=rs.getString(6);
                currect_answer=rs.getString(7);
                question_no=question_no+1;
                break;
            }
            
            
        } catch (Exception e) {
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        qu_name = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rs1 = new javax.swing.JRadioButton();
        rs2 = new javax.swing.JRadioButton();
        rs3 = new javax.swing.JRadioButton();
        rs4 = new javax.swing.JRadioButton();
        qu_no = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        minute_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        time_label = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Marks");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 51, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Online Test");

        qu_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        qu_name.setForeground(new java.awt.Color(51, 51, 255));
        qu_name.setText("Questions");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(rs1);
        rs1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rs1.setText("jRadioButton1");
        rs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rs2);
        rs2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rs2.setText("jRadioButton2");
        rs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rs3);
        rs3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rs3.setText("jRadioButton3");
        rs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rs4);
        rs4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rs4.setText("jRadioButton4");
        rs4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rs4)
                    .addComponent(rs3)
                    .addComponent(rs2)
                    .addComponent(rs1))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(rs1)
                .addGap(18, 18, 18)
                .addComponent(rs2)
                .addGap(27, 27, 27)
                .addComponent(rs3)
                .addGap(18, 18, 18)
                .addComponent(rs4)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        qu_no.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        qu_no.setForeground(new java.awt.Color(51, 51, 255));
        qu_no.setText("No");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("MARK");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 255));
        jLabel2.setText("Current Mark :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Qu No:");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 204));
        jButton3.setText("Start ");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        minute_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText(":");

        time_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 51));
        jButton4.setText("SUBMIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(qu_name, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(minute_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(qu_no, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(time_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minute_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qu_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qu_no, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    public int get_Higestnumber() 
    {
        int max_no=0;
        String query="SELECT MAX(id) FROM question";
        String max_id=null;
        Statement st=null;
        try {
                 st=con.createStatement();
            ResultSet rs=st.executeQuery(query);  
               max_id=null;
            if (rs.next()) {
                 max_id=rs.getString(1);
            }
           
        } catch (Exception e) {
        }
        System.out.println("max id is"+max_id);
        return  max_no+Integer.parseInt(max_id);
    }
    public void update(int id)
    {
     Statement st=null;
        String query="UPDATE question SET givenanswer = '"+given_answer+"' WHERE id = "+id ; 
        try {
             st=con.createStatement();
            int  k=st.executeUpdate(query);
            if(k>=0)
            {
                System.out.println("updation done");
            }
            else
            {
                System.out.println("failed to update ");
            }
        } catch (Exception e) {
            System.out.println("ERROR IN THE UPDATIN PART "+e);
        }
    } 
    public void updateMark(String ans,int id)
    {
        String str="SELECT answer FROM question WHERE id = "+id;
        String temp="";
        try {
            Statement st=con.createStatement();
            rs=st.executeQuery(str);
            if (rs.next()) {
               temp+=rs.getString(1);
            }
        } catch (Exception e) {
        }
        if (temp.equals(ans)) {
            System.out.println("currect abs");
            securedmark+=1;
        }else
        {
            System.out.println("wrong ans ");
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(flag!=1)
        {
        JOptionPane.showMessageDialog(rootPane,"Start The timer please ","Alert",0);        
        }
        if(flag==1)
        {
        update(question_no);
        updateMark(given_answer,question_no);
        jLabel4.setText(String.valueOf(securedmark));
        String query1="SELECT * FROM question where id = "+(question_no+1);
         if (question_no==get_Higestnumber()) {
                JOptionPane.showMessageDialog(this,"Exam Completed");
                String query=" UPDATE student SET exam_score = "+securedmark+" WHERE id = "+unique_roll;
         try {
           Statement st=con.createStatement();
           int k=st.executeUpdate(query);
             if (k>=0) {
                 System.out.println("Sucessfiull update");
             }
        } catch (Exception e) {
        }
                
                JOptionPane.showMessageDialog(this,"You Scured ".toUpperCase()+securedmark+" out of ".toLowerCase()+String.valueOf(get_Higestnumber()).toUpperCase());
                try {
                   Thread.sleep(1000);
                } catch (Exception e) {
                }
         System.exit(0);   
         } 
        try {
            Statement st=con.createStatement();
            ResultSet rs44=st.executeQuery(query1);  
            while(rs44.next())
            {
                if(rs44.getString(1).equals("10"))
                {
                   qu_no.setText("10"); 
                }else
                {
                    qu_no.setText(rs44.getString(1));
                }
                qu_name.setText(rs44.getString(2));
                
                rs1.setText(rs44.getString(3));
                option1=rs44.getString(3);
                rs2.setText(rs44.getString(4));
                option2=rs44.getString(4);
                rs3.setText(rs44.getString(5));
                option3=rs44.getString(5);
                rs4.setText(rs44.getString(6));
                option4=rs44.getString(6);                
                currect_answer=rs44.getString(7);
                question_no=question_no+1;
                break;
            }
          
        } catch (Exception e) {
        }       
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs2ActionPerformed
        given_answer=option2;
        System.out.println("I am chicked by priyansh "+given_answer);
    }//GEN-LAST:event_rs2ActionPerformed

    private void rs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs1ActionPerformed
        // TODO add your handling code here:
            given_answer=option1;
        System.out.println("I am chicked by priyansh "+given_answer);
    
    }//GEN-LAST:event_rs1ActionPerformed

    private void rs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs3ActionPerformed
        // TODO add your handling code here:
        given_answer=option3;
        System.out.println("I am chicked by priyansh "+given_answer);
    }//GEN-LAST:event_rs3ActionPerformed

    private void rs4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs4ActionPerformed
        // TODO add your handling code here:
        given_answer=option4;
        System.out.println("I am chicked by priyansh "+given_answer);
    }//GEN-LAST:event_rs4ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        
         Thread thread = new Thread() {
            @Override
            public void run() {
                // Define the code to run in the new thread
               
            }

             @Override
             public void start() {
                 super.start(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
             }
            
        };
        
    }//GEN-LAST:event_jButton3MouseClicked

    
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         // Create a runnable for the countdown
         flag=1;
        Runnable countdownRunnable = new Runnable() {
            int count_down_minute=5;
            int countdownSeconds = 60;
            @Override
            public void run() {
                try {
                    while (count_down_minute!=-1) {  
                         countdownSeconds = 60;
                         minute_label.setText(""+count_down_minute);
                         for (int i = countdownSeconds; i >= 0; i--)
                         {
                          time_label.setText(""+i);
                          countdownSeconds--;
                          Thread.sleep(1000); 
                         }
                          if (count_down_minute!=-1)
                         {
                          minute_label.setText(""+count_down_minute);
                          count_down_minute--;
                          Thread.sleep(10); 
                         }
                       } 
                    
                     if (count_down_minute==-1) {
                     JOptionPane.showMessageDialog(rootPane,"Time UP","Stopprd",0);                          }
                    System.out.println("Countdown finished!");
                     try {
                      Thread.sleep(1000);
                       } catch (Exception e) {
                      }
                       System.exit(0);
                } catch (InterruptedException e) {
                    System.out.println("Countdown was interrupted.");
                }
            }
        };

        // Create and start the countdown thread
        Thread countdownThread = new Thread(countdownRunnable);
        countdownThread.start();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         update(question_no);
         updateMark(given_answer,question_no);
         jLabel4.setText(String.valueOf(securedmark));
         JOptionPane.showMessageDialog(this,"You Scured ".toUpperCase()+securedmark+" out of ".toLowerCase()+String.valueOf(get_Higestnumber()).toUpperCase());
         String query=" UPDATE student SET exam_score = "+securedmark+" WHERE id = "+unique_roll;
         try {
           Statement st=con.createStatement();
           int k=st.executeUpdate(query);
             if (k>=0) {
                 System.out.println("Sucessfiull update");
             }
        } catch (Exception e) {
        }
         try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
         System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel minute_label;
    private javax.swing.JLabel qu_name;
    private javax.swing.JLabel qu_no;
    private javax.swing.JRadioButton rs1;
    private javax.swing.JRadioButton rs2;
    private javax.swing.JRadioButton rs3;
    private javax.swing.JRadioButton rs4;
    private javax.swing.JLabel time_label;
    // End of variables declaration//GEN-END:variables
    
  //  @Override
  
}

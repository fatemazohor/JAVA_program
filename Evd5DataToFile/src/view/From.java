/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class From extends javax.swing.JFrame {

    /**
     * Creates new form From
     */
    public From() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        panBackground = new javax.swing.JPanel();
        panHeader = new javax.swing.JPanel();
        lvlHeader = new javax.swing.JLabel();
        lvlName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lvlAddress = new javax.swing.JLabel();
        lvlDoB = new javax.swing.JLabel();
        lvlsub = new javax.swing.JLabel();
        lvlhobby = new javax.swing.JLabel();
        lvlGender = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboSub = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jRadioMale = new javax.swing.JRadioButton();
        jRadioFemale = new javax.swing.JRadioButton();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panBackground.setBackground(new java.awt.Color(255, 255, 255));

        panHeader.setBackground(new java.awt.Color(204, 255, 204));

        lvlHeader.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lvlHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvlHeader.setText("Data Entry From");

        javax.swing.GroupLayout panHeaderLayout = new javax.swing.GroupLayout(panHeader);
        panHeader.setLayout(panHeaderLayout);
        panHeaderLayout.setHorizontalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lvlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panHeaderLayout.setVerticalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lvlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );

        lvlName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lvlName.setText("Name");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lvlAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lvlAddress.setText("Address:");

        lvlDoB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lvlDoB.setText("DOB");

        lvlsub.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lvlsub.setText("Subject");

        lvlhobby.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lvlhobby.setText("Hobby");

        lvlGender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lvlGender.setText("Gender");

        jComboSub.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboSub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Select a Subject ---", "HTML", "JavaScript", "MySql", "Java" }));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox1.setText("Travaling");

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox2.setText("Gaming");

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox3.setText("Reading");

        buttonGroup1.add(jRadioMale);
        jRadioMale.setText("Male");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jRadioMale, org.jdesktop.beansbinding.ELProperty.create("${actionCommand}"), jRadioMale, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        buttonGroup1.add(jRadioFemale);
        jRadioFemale.setText("Female");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jRadioFemale, org.jdesktop.beansbinding.ELProperty.create("${actionCommand}"), jRadioFemale, org.jdesktop.beansbinding.BeanProperty.create("actionCommand"));
        bindingGroup.addBinding(binding);

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("Show");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panBackgroundLayout = new javax.swing.GroupLayout(panBackground);
        panBackground.setLayout(panBackgroundLayout);
        panBackgroundLayout.setHorizontalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lvlsub, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lvlDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lvlhobby, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lvlGender, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lvlName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lvlAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addComponent(jRadioMale)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioFemale))
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox3))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboSub, 0, 258, Short.MAX_VALUE)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addComponent(btnSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(46, 46, 46))
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        panBackgroundLayout.setVerticalGroup(
            panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackgroundLayout.createSequentialGroup()
                .addComponent(panHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBackgroundLayout.createSequentialGroup()
                        .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lvlName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lvlAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lvlDoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboSub, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lvlsub, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lvlhobby, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3))
                        .addGap(18, 18, 18)
                        .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lvlGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioMale)
                            .addComponent(jRadioFemale)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(jButton1))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String getHobby() {
        List<String> list = new ArrayList<>();

        if (jCheckBox1.isSelected()) {
            list.add(jCheckBox1.getText());
        }
        if (jCheckBox2.isSelected()) {
            list.add(jCheckBox2.getText());
        }
        if (jCheckBox3.isSelected()) {
            list.add(jCheckBox3.getText());
        }

        String hobby = "";
        if (!(list.isEmpty())) {
            hobby = list.toString();
        } else {
            hobby = "NOt Selected";
        }
        return hobby;
    }

    private String getDate() {
        String date;
        jDateChooser1.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");

        date = dateFormat.format(jDateChooser1.getDate());

        return date;
    }
    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked

        // TODO add your handling code here:
        String name = txtName.getText().trim();
        String address = txtaddress.getText().trim();
        String dateDob = getDate();
        String subject = jComboSub.getSelectedItem().toString();
        String hobby = getHobby();
        String gender = buttonGroup1.getSelection().getActionCommand();
        System.out.println(dateDob);

        PrintWriter pw = null;
        try {
            pw = new PrintWriter("dataEntry.txt");

            pw.print("Name:    " + name + "\n");
            pw.print("Address: " + address + "\n");
            pw.print("DOB:     " + dateDob + "\n");
            pw.print("Subject: " + subject + "\n");
            pw.print("Hobby:   " + hobby + "\n");
            pw.print("Gender:  " + gender);
            pw.close();
            JOptionPane.showMessageDialog(rootPane, "Data Saved");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(From.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSubmitMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String name = txtName.getText().trim();
        String address = txtaddress.getText().trim();
        String dateDob = getDate();
        String subject = jComboSub.getSelectedItem().toString();
        String hobby = getHobby();
        String gender = buttonGroup1.getSelection().getActionCommand();
        System.out.println(dateDob);

        String[] columnNames = {"Name", "Address","BirthDate", "Subject", "Hobby", "Gender"};
        int row = 0;
        int col = columnNames.length;
        System.out.println(col);
        String[][] data = new String[1][col];
        
        
            data[0][0] = name;
            data[0][1] = address;
            data[0][2] = dateDob;
            data[0][3] = subject;
            data[0][4] = hobby;
            data[0][5] = gender;
//        //use multidimension array
        DefaultTableModel dtm = new DefaultTableModel(data, columnNames);
        jTable1.setModel(dtm);
            //addrow methods
//        DefaultTableModel dtm = new DefaultTableModel();
//        
//        dtm.setColumnIdentifiers(columnNames);
//        dtm.addRow(new Object[]{name,address,dateDob,subject,hobby,gender});
//        jTable1.setModel(dtm);

    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new From().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboSub;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JRadioButton jRadioFemale;
    private javax.swing.JRadioButton jRadioMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lvlAddress;
    private javax.swing.JLabel lvlDoB;
    private javax.swing.JLabel lvlGender;
    private javax.swing.JLabel lvlHeader;
    private javax.swing.JLabel lvlName;
    private javax.swing.JLabel lvlhobby;
    private javax.swing.JLabel lvlsub;
    private javax.swing.JPanel panBackground;
    private javax.swing.JPanel panHeader;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtaddress;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

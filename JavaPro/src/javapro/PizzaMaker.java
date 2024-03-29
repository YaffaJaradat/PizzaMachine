/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapro;

import java.awt.ComponentOrientation;
import java.awt.im.InputContext;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;  
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import jdk.jfr.events.FileWriteEvent;
//import javax.swing.table.DefultTableModel;
//import javax.swing.table.TableRowSorter;
/**
 *
 * @author yaffa Jaradat
 */
public class PizzaMaker extends javax.swing.JFrame {

    /**
     * Creates new form PizzaMaker
     */
     ArrayList <Ingredients> arrDough = new ArrayList <>(); 
    ArrayList <Ingredients> arrPan = new ArrayList <>(); 
    
   
    public PizzaMaker() {
        initComponents();
    }
   
    
    int price ; 
    double calories =0 ; 
    double ww = 0 ; 
    String item , type; 
    
    
     public void clear (){
        lblsmall.setSelected(false);
        lblmed.setSelected(false);
        lbllarg.setSelected(false);
        lbldeep.setSelected(false);
        lblpan.setSelected(false);
        cheese.setSelected(false);
        tom.setSelected(false);
        gar.setSelected(false);
        on.setSelected(false);
        sau.setSelected(false);
        ore.setSelected(false);
        txttotal.setText(""); 
        txtcal.setText(""); 
        txtww.setText(""); 
       calpersl.setText(""); 
        
    }
    
//    DefultTableModel model ; 
 
     public void display() {
        String [] arr = new String[arrPan.size()];
        for (int i = 0; i < arrPan.size(); i++) {
            Ingredients ingr = arrPan.get(i);
            arr[i] = ingr.toString();
        }
        
        orderlist.setListData(arr);
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        Sizegroup = new javax.swing.ButtonGroup();
        typegroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblsmall = new javax.swing.JRadioButton();
        lblmed = new javax.swing.JRadioButton();
        lbllarg = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        lbldeep = new javax.swing.JRadioButton();
        lblpan = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        cheese = new javax.swing.JRadioButton();
        tom = new javax.swing.JRadioButton();
        gar = new javax.swing.JRadioButton();
        on = new javax.swing.JRadioButton();
        sau = new javax.swing.JRadioButton();
        ore = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderlist = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        txtww = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        calpersl = new javax.swing.JTextField();
        file = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lblqty = new javax.swing.JLabel();
        txtqty = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        sliceno = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btninoice = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizza Machine");

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Pizza Ordering Machine   ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setToolTipText("Please Select one Size !");

        Sizegroup.add(lblsmall);
        lblsmall.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblsmall.setText("Small");

        Sizegroup.add(lblmed);
        lblmed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmed.setText("Medium");

        Sizegroup.add(lbllarg);
        lbllarg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbllarg.setText("Larg");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbllarg)
                    .addComponent(lblmed)
                    .addComponent(lblsmall))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblsmall)
                .addGap(18, 18, 18)
                .addComponent(lblmed)
                .addGap(18, 18, 18)
                .addComponent(lbllarg)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setToolTipText("Please Select One Type !!");

        typegroup.add(lbldeep);
        lbldeep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldeep.setText("Deep Dish");

        typegroup.add(lblpan);
        lblpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblpan.setText("Pan");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldeep)
                    .addComponent(lblpan))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbldeep)
                .addGap(18, 18, 18)
                .addComponent(lblpan)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cheese.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cheese.setText("Mozzarella Cheese");

        tom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tom.setText("Tomatoes");

        gar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gar.setText("Garlic");

        on.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        on.setText("Onion");

        sau.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sau.setText("Pizza Sauce");

        ore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ore.setText("Oregano");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cheese)
                    .addComponent(tom)
                    .addComponent(gar)
                    .addComponent(ore)
                    .addComponent(on)
                    .addComponent(sau))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cheese)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(on)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ore)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        orderlist.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingredients consumed"));
        orderlist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                orderlistValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(orderlist);
        orderlist.getAccessibleContext().setAccessibleName("Reviwe");

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtww.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Weight");

        txtcal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Calories");

        txttotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Price");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cal Per Slice :");

        calpersl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        file.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        file.setText("Save File");
        file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcal, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(txtww, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(calpersl)))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(file, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtww, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(calpersl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(file, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblqty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblqty.setText("Quantity");

        txtqty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtqty.setName("counter "); // NOI18N
        txtqty.setValue(1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("How many Slices?");

        sliceno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sliceno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slicenoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblqty, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtqty, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(sliceno))
                .addGap(29, 29, 29))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblqty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sliceno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 0));

        btninoice.setBackground(new java.awt.Color(51, 102, 255));
        btninoice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btninoice.setText("Print Invoice");
        btninoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninoiceActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(51, 102, 255));
        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btninoice, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninoice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        try{
            arrDough.add(new Ingredients("Flour", 120, 408  )); // weight in KG and amount of cal in cal
        arrDough.add(new Ingredients("Salt", 15, 2 ));
        arrDough.add(new Ingredients("Yeast", 20, 21  ));
        arrDough.add(new Ingredients("Water")); 
        for (int i = 0; i < arrDough.size(); i++) {
             calories +=  arrDough.get(i).getCal(); 
             ww += arrDough.get(i).getWeight(); 
        }
        if (lbldeep.isSelected() == true){
            calories *= 2 ; 
            ww *= 2 ; 
            price += 5 ; 
            type = "Deep Dish"; 
        }
        else if (lblpan.isSelected() == true){
            calories *= 1 ; 
            ww *= 1 ;
            type = "Pan";
        }
        
        if(cheese.isSelected() == true){
            arrPan.add(new Ingredients("Onion",150 , 60)); 
            calories +=  60;
            ww += 150 ; 
        }
        if(tom.isSelected() == true){
            arrPan.add(new Ingredients("Tomatoes",100 , 18)); 
            calories +=  18;
            ww += 100 ; 
        }
        if(gar.isSelected() == true){
            arrPan.add(new Ingredients("Garlic",3 , 4.5)); 
            calories +=  4.5;
            ww += 3 ; 
        }
        if(on.isSelected() == true){
            arrPan.add(new Ingredients("Onion",110 , 44)); 
            calories +=  44;
            ww += 110 ; 
        }
        if(sau.isSelected() == true){
            arrPan.add(new Ingredients("Suace",100 , 53.75)); 
            calories +=  53.75;
            ww += 100 ; 
        }
        if(ore.isSelected() == true){
            arrPan.add(new Ingredients("Oregano",2 , 20)); 
            calories +=  20;
            ww += 2 ; 
        }
        

        
        
        if(lblsmall.isSelected() == true){
            price = 20 ;              
            item = "Small" ;
        }
        else if(lblmed.isSelected() == true){
            calories *= 1.5 ; 
            ww *= 1.5 ; 
            price = 30 ;   
            item = "Medium "; 
        }
        else if(lbllarg.isSelected() == true){
            calories *= 2;
            ww *= 2 ; 
            price = 50 ;
            item = "Larg "; 
        }
        
        
        
        double quantity  = Double.parseDouble(txtqty.getValue().toString()); 
        double tot = quantity * price;
        txtcal.setText(calories+"   "+"Cal");
        txtww.setText(ww+"   "+"Gram");
        txttotal.setText(tot+"   "+"₪");
        double slice = calories / quantity / Double.parseDouble(sliceno.getText())  ; 
        calpersl.setText(slice+"");
       
        display(); 
        
        
//        model = (DefultTableModel)jTable1.getModel();
//        model.addRow(new Object[]
//                { 
//                item,
//                 price,
//                quantity,
//                tot
//             });
           
////        
        }catch (Exception e ){
            JOptionPane.showMessageDialog(this, e.toString());
        }
        
//        
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void orderlistValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_orderlistValueChanged
        // TODO add your handling code here:
       
       
    }//GEN-LAST:event_orderlistValueChanged

    private void slicenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slicenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slicenoActionPerformed

    private void btninoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninoiceActionPerformed
        // TODO add your handling code here:
       try{
          String mess  = "Thank you for your Order, We wish you love the Pizza\n\n\n The Size of your Pizza is  "+ item +".\n\n With Typy "+type + ".\n\n Your Payment is: "+ price+"  ₪.";
        JOptionPane.showMessageDialog(this, mess);  
         clear (); 
       }catch (Exception e ){
            JOptionPane.showMessageDialog(this, e.toString());
        }
       
    }//GEN-LAST:event_btninoiceActionPerformed

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser(); 
        fc.showOpenDialog(this); 
        File f = fc.getSelectedFile(); 
        try{
           FileWriter fw = new FileWriter(f); 
           String text =  "The size:"+ item +".\n  Typy :"+type + ".\n Payment : "+ price+"  ₪.";
           fw.write(text);
           fw.close(); 
           
        }catch(IOException e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_fileActionPerformed

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
            java.util.logging.Logger.getLogger(PizzaMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaMaker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaMaker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Sizegroup;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btninoice;
    private javax.swing.JTextField calpersl;
    private javax.swing.JRadioButton cheese;
    private javax.swing.JButton file;
    private javax.swing.JRadioButton gar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton lbldeep;
    private javax.swing.JRadioButton lbllarg;
    private javax.swing.JRadioButton lblmed;
    private javax.swing.JRadioButton lblpan;
    private javax.swing.JLabel lblqty;
    private javax.swing.JRadioButton lblsmall;
    private javax.swing.JRadioButton on;
    private javax.swing.JList<String> orderlist;
    private javax.swing.JRadioButton ore;
    private javax.swing.JRadioButton sau;
    private javax.swing.JTextField sliceno;
    private javax.swing.JRadioButton tom;
    private javax.swing.JTextField txtcal;
    private javax.swing.JSpinner txtqty;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txtww;
    private javax.swing.ButtonGroup typegroup;
    // End of variables declaration//GEN-END:variables
}

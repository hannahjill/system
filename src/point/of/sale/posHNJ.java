
package point.of.sale;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class posHNJ extends javax.swing.JFrame {

    /**
     * Creates new form posHNJ
     */
    public posHNJ() {
        initComponents();
    }
    
    public void addTable (String Name, int Quantity, Double Price) {
        
        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();  
        
        //sa quantity
        for (int row = 0; row < jTable1.getRowCount(); row++) {
            if (Name == jTable1.getValueAt(row, 0)) {
                tm.removeRow(jTable1.convertRowIndexToModel(row));
            }
        
        }
        
        //tama dapat ang total sa pila kabuok quantity
        DecimalFormat df = new DecimalFormat("00.00");
        double totalprice = Price * Double.valueOf(Quantity);
        String TotalPrice = df.format(totalprice);
        
        Vector v = new Vector();
        v.add(Name);
        v.add(Quantity);
        v.add(TotalPrice);
        
        tm.addRow(v);    
    }
    
    //total values
    public void cal(){
        
        int numOfRow = jTable1.getRowCount();
        double total = 0.0;
        
        for (int x = 0; x < numOfRow; x++) {
            double value = Double.valueOf(jTable1.getValueAt(x, 2).toString());
            total += value;
        }
        
        DecimalFormat df = new DecimalFormat("00.00");
        jTextTotal.setText(df.format(total));    
    }
    
    
   

    @SuppressWarnings("unchecked")
    
 
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jL = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        q7 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        q9 = new javax.swing.JLabel();
        q10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        q11 = new javax.swing.JLabel();
        q12 = new javax.swing.JLabel();
        q13 = new javax.swing.JLabel();
        q14 = new javax.swing.JLabel();
        q15 = new javax.swing.JLabel();
        q16 = new javax.swing.JLabel();
        q17 = new javax.swing.JLabel();
        q18 = new javax.swing.JLabel();
        q19 = new javax.swing.JLabel();
        q20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        q21 = new javax.swing.JLabel();
        q22 = new javax.swing.JLabel();
        q23 = new javax.swing.JLabel();
        q24 = new javax.swing.JLabel();
        q25 = new javax.swing.JLabel();
        q26 = new javax.swing.JLabel();
        q27 = new javax.swing.JLabel();
        q28 = new javax.swing.JLabel();
        q29 = new javax.swing.JLabel();
        q30 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        q31 = new javax.swing.JLabel();
        q32 = new javax.swing.JLabel();
        q33 = new javax.swing.JLabel();
        q34 = new javax.swing.JLabel();
        q35 = new javax.swing.JLabel();
        q38 = new javax.swing.JLabel();
        q39 = new javax.swing.JLabel();
        q40 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        q36 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        q37 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jButton47 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        q41 = new javax.swing.JLabel();
        q42 = new javax.swing.JLabel();
        q43 = new javax.swing.JLabel();
        q44 = new javax.swing.JLabel();
        q45 = new javax.swing.JLabel();
        q46 = new javax.swing.JLabel();
        q47 = new javax.swing.JLabel();
        q48 = new javax.swing.JLabel();
        q49 = new javax.swing.JLabel();
        q50 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jTextTotal = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        jcmboPayments = new javax.swing.JComboBox<>();
        jLabel109 = new javax.swing.JLabel();
        jTextDisplay = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        bal = new javax.swing.JTextField();
        jButton52 = new javax.swing.JButton();
        jbttnPay = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jbttn9 = new javax.swing.JButton();
        jbttn8 = new javax.swing.JButton();
        jbttn7 = new javax.swing.JButton();
        jbttn6 = new javax.swing.JButton();
        jbttn5 = new javax.swing.JButton();
        jbttn4 = new javax.swing.JButton();
        jbttn3 = new javax.swing.JButton();
        jbttn2 = new javax.swing.JButton();
        jbttn1 = new javax.swing.JButton();
        jbttn0 = new javax.swing.JButton();
        jbttnDot = new javax.swing.JButton();
        jTextClr = new javax.swing.JButton();
        jbttnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KAININ MO, KAININ KO DIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(509, 509, 509)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel2.setBackground(new java.awt.Color(176, 147, 152));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Starters/garlic bread.jpg"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 200, 170));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Starters/guacamole.jpg"))); // NOI18N
        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 200, 170));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Starters/bacon pickle fries.jpg"))); // NOI18N
        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 170));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Starters/baked mussels with chees.jpg"))); // NOI18N
        jButton4.setText("jButton1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 170));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Starters/italian sausage.jpg"))); // NOI18N
        jButton5.setText("jButton1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 200, 170));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Starters/onion rings.jpg"))); // NOI18N
        jButton6.setText("jButton1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 200, 170));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Starters/bruchetta.jpg"))); // NOI18N
        jButton7.setText("jButton1");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 170));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Starters/chicken wings.jpg"))); // NOI18N
        jButton8.setText("jButton1");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 200, 170));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Starters/fish and chips.jpg"))); // NOI18N
        jButton9.setText("jButton1");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 200, 170));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Starters/smoked salmon salad.jpg"))); // NOI18N
        jButton10.setText("jButton1");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 200, 170));

        jL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jL.setText("Bacon Pickle Fries");
        jPanel2.add(jL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Fries and Chips");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 140, -1));

        q1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q1.setForeground(new java.awt.Color(255, 0, 0));
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("0");
        jPanel2.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 30, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Bacon Mussels w Cheese");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 140, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Bruschetta");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 140, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Chicken Wings");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 140, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Garlic Bread");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 180, 120, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Guacamole");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 180, 140, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Italian Sausage");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 140, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Onion Rings");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 100, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Smoked Salmon Salad");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 140, -1));

        q2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q2.setForeground(new java.awt.Color(255, 0, 0));
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("0");
        jPanel2.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 30, -1));

        q3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q3.setForeground(new java.awt.Color(255, 0, 0));
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setText("0");
        jPanel2.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 30, -1));

        q4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q4.setForeground(new java.awt.Color(255, 0, 0));
        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setText("0");
        jPanel2.add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 30, -1));

        q5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q5.setForeground(new java.awt.Color(255, 0, 0));
        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setText("0");
        jPanel2.add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 180, 30, -1));

        q6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q6.setForeground(new java.awt.Color(255, 0, 0));
        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setText("0");
        jPanel2.add(q6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 180, 30, -1));

        q7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q7.setForeground(new java.awt.Color(255, 0, 0));
        q7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q7.setText("0");
        jPanel2.add(q7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 180, 30, -1));

        q8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q8.setForeground(new java.awt.Color(255, 0, 0));
        q8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q8.setText("0");
        jPanel2.add(q8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 30, -1));

        q9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q9.setForeground(new java.awt.Color(255, 0, 0));
        q9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q9.setText("0");
        jPanel2.add(q9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 30, -1));

        q10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q10.setForeground(new java.awt.Color(255, 0, 0));
        q10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q10.setText("0");
        jPanel2.add(q10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 380, 30, -1));

        jTabbedPane1.addTab("Starters", jPanel2);

        jPanel3.setBackground(new java.awt.Color(176, 147, 152));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main Dish/beef ribs.jpg"))); // NOI18N
        jButton11.setText("jButton1");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 170));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main Dish/grilled salmon.jpg"))); // NOI18N
        jButton12.setText("jButton1");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 200, 170));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main Dish/pasta bolognese.jpg"))); // NOI18N
        jButton13.setText("jButton1");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 200, 170));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main Dish/beef steak.jpg"))); // NOI18N
        jButton14.setText("jButton1");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 170));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main Dish/creamy mushroom soup.jpg"))); // NOI18N
        jButton15.setText("jButton1");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 170));

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main Dish/rice with tuna.jpg"))); // NOI18N
        jButton16.setText("jButton1");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 200, 170));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main Dish/chicken alfredo lasagna.jpg"))); // NOI18N
        jButton17.setText("jButton1");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 200, 170));

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main Dish/greek salad.jpg"))); // NOI18N
        jButton18.setText("jButton1");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 200, 170));

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main Dish/seafood bucket.jpg"))); // NOI18N
        jButton19.setText("jButton1");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 200, 170));

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main Dish/spicy chicken pasta.jpg"))); // NOI18N
        jButton20.setText("jButton1");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 200, 170));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Braised Beef Ribs");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Beef Steak");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 140, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Creamy Mushroom Soup");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 140, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Chicken Alfredo Lasagna");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 140, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("Greek Salad");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 140, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Grilled Salmon");
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 180, 120, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("Pasta Bolognese");
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 180, 140, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("Rice with Tuna");
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 140, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("Spicy Chicken Pasta");
        jPanel3.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 140, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setText("Seafood Bucket");
        jPanel3.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 140, -1));

        q11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q11.setForeground(new java.awt.Color(255, 0, 0));
        q11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q11.setText("0");
        jPanel3.add(q11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 30, -1));

        q12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q12.setForeground(new java.awt.Color(255, 0, 0));
        q12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q12.setText("0");
        jPanel3.add(q12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 30, -1));

        q13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q13.setForeground(new java.awt.Color(255, 0, 0));
        q13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q13.setText("0");
        jPanel3.add(q13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 30, -1));

        q14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q14.setForeground(new java.awt.Color(255, 0, 0));
        q14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q14.setText("0");
        jPanel3.add(q14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 30, -1));

        q15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q15.setForeground(new java.awt.Color(255, 0, 0));
        q15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q15.setText("0");
        jPanel3.add(q15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 180, 30, -1));

        q16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q16.setForeground(new java.awt.Color(255, 0, 0));
        q16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q16.setText("0");
        jPanel3.add(q16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 180, 30, -1));

        q17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q17.setForeground(new java.awt.Color(255, 0, 0));
        q17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q17.setText("0");
        jPanel3.add(q17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 180, 30, -1));

        q18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q18.setForeground(new java.awt.Color(255, 0, 0));
        q18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q18.setText("0");
        jPanel3.add(q18, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 30, -1));

        q19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q19.setForeground(new java.awt.Color(255, 0, 0));
        q19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q19.setText("0");
        jPanel3.add(q19, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 30, -1));

        q20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q20.setForeground(new java.awt.Color(255, 0, 0));
        q20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q20.setText("0");
        jPanel3.add(q20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 380, 30, -1));

        jTabbedPane1.addTab("Main Dish", jPanel3);

        jPanel4.setBackground(new java.awt.Color(176, 147, 152));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Side Dish/fried mushrooms.jpg"))); // NOI18N
        jButton21.setText("jButton1");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 200, 170));

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Side Dish/asparagus.jpg"))); // NOI18N
        jButton22.setText("jButton1");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 170));

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Side Dish/cheddar biscuits.jpg"))); // NOI18N
        jButton23.setText("jButton1");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 170));

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Side Dish/fried rice.jpg"))); // NOI18N
        jButton24.setText("jButton1");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 200, 170));

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Side Dish/coleslaw.jpg"))); // NOI18N
        jButton25.setText("jButton1");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 170));

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Side Dish/mashed potatoes.jpg"))); // NOI18N
        jButton26.setText("jButton1");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 200, 170));

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Side Dish/egg rolls.jpg"))); // NOI18N
        jButton27.setText("jButton1");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 200, 170));

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Side Dish/steamed broccoli.jpg"))); // NOI18N
        jButton28.setText("jButton1");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 200, 170));

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Side Dish/stir fry veggies.jpg"))); // NOI18N
        jButton29.setText("jButton1");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 200, 170));

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Side Dish/french fries.jpg"))); // NOI18N
        jButton30.setText("jButton1");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 200, 170));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setText("Asparagus");
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setText("Cheddar Biscuit");
        jPanel4.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 140, -1));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setText("Coleslaw");
        jPanel4.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 140, -1));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel49.setText("Egg Rolls");
        jPanel4.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 140, -1));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel51.setText("French Fries");
        jPanel4.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 140, -1));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel53.setText("Fried Mushrooms");
        jPanel4.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 180, 120, -1));

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel55.setText("Fried Rice");
        jPanel4.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 180, 140, -1));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel57.setText("Mashed Potatoes");
        jPanel4.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 140, -1));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel59.setText("Steamed Broccoli");
        jPanel4.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 140, -1));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel61.setText("Stir and Fry Veggies");
        jPanel4.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 140, -1));

        q21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q21.setForeground(new java.awt.Color(255, 0, 0));
        q21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q21.setText("0");
        jPanel4.add(q21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 30, -1));

        q22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q22.setForeground(new java.awt.Color(255, 0, 0));
        q22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q22.setText("0");
        jPanel4.add(q22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 30, -1));

        q23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q23.setForeground(new java.awt.Color(255, 0, 0));
        q23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q23.setText("0");
        jPanel4.add(q23, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 30, -1));

        q24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q24.setForeground(new java.awt.Color(255, 0, 0));
        q24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q24.setText("0");
        jPanel4.add(q24, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 30, -1));

        q25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q25.setForeground(new java.awt.Color(255, 0, 0));
        q25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q25.setText("0");
        jPanel4.add(q25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 180, 30, -1));

        q26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q26.setForeground(new java.awt.Color(255, 0, 0));
        q26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q26.setText("0");
        jPanel4.add(q26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 180, 30, -1));

        q27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q27.setForeground(new java.awt.Color(255, 0, 0));
        q27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q27.setText("0");
        jPanel4.add(q27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 180, 30, -1));

        q28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q28.setForeground(new java.awt.Color(255, 0, 0));
        q28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q28.setText("0");
        jPanel4.add(q28, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 30, -1));

        q29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q29.setForeground(new java.awt.Color(255, 0, 0));
        q29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q29.setText("0");
        jPanel4.add(q29, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 30, -1));

        q30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q30.setForeground(new java.awt.Color(255, 0, 0));
        q30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q30.setText("0");
        jPanel4.add(q30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 380, 30, -1));

        jTabbedPane1.addTab("Side Dish", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(176, 147, 152));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel63.setText("Banana Pudding");
        jPanel7.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, -1));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel65.setText("Cheese Burger");
        jPanel7.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 140, -1));

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel67.setText("Cheese Cake");
        jPanel7.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 140, -1));

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel69.setText("Chocolate Brownies");
        jPanel7.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 140, -1));

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel71.setText("Chocolate Waffle");
        jPanel7.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 140, -1));

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel77.setText("Ice Cream");
        jPanel7.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 140, -1));

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel79.setText("Tiramisu Cake");
        jPanel7.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 140, -1));

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel81.setText("Vegan Burger");
        jPanel7.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 140, -1));

        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desserts/chocolate brownies.jpg"))); // NOI18N
        jButton37.setText("jButton1");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 200, 170));

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desserts/tiramisu cake.jpg"))); // NOI18N
        jButton40.setText("jButton1");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 200, 170));

        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desserts/cheese cake.jpg"))); // NOI18N
        jButton36.setText("jButton1");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 170));

        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desserts/ice cream.jpg"))); // NOI18N
        jButton35.setText("jButton1");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 200, 170));

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desserts/cheese burger.jpg"))); // NOI18N
        jButton32.setText("jButton1");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 170));

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desserts/banana pudding.jpg"))); // NOI18N
        jButton31.setText("jButton1");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 170));

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desserts/chocolate waffle.jpg"))); // NOI18N
        jButton38.setText("jButton1");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 200, 170));

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desserts/vegan burger.jpg"))); // NOI18N
        jButton39.setText("jButton1");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 200, 170));

        q31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q31.setForeground(new java.awt.Color(255, 0, 0));
        q31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q31.setText("0");
        jPanel7.add(q31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 30, -1));

        q32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q32.setForeground(new java.awt.Color(255, 0, 0));
        q32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q32.setText("0");
        jPanel7.add(q32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 30, -1));

        q33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q33.setForeground(new java.awt.Color(255, 0, 0));
        q33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q33.setText("0");
        jPanel7.add(q33, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 30, -1));

        q34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q34.setForeground(new java.awt.Color(255, 0, 0));
        q34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q34.setText("0");
        jPanel7.add(q34, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 30, -1));

        q35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q35.setForeground(new java.awt.Color(255, 0, 0));
        q35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q35.setText("0");
        jPanel7.add(q35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 180, 30, -1));

        q38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q38.setForeground(new java.awt.Color(255, 0, 0));
        q38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q38.setText("0");
        jPanel7.add(q38, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 30, -1));

        q39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q39.setForeground(new java.awt.Color(255, 0, 0));
        q39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q39.setText("0");
        jPanel7.add(q39, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 30, -1));

        q40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q40.setForeground(new java.awt.Color(255, 0, 0));
        q40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q40.setText("0");
        jPanel7.add(q40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 380, 30, -1));

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desserts/croissant.jpg"))); // NOI18N
        jButton33.setText("jButton1");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 200, 170));

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel73.setText("Croissants");
        jPanel7.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 180, 120, -1));

        q36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q36.setForeground(new java.awt.Color(255, 0, 0));
        q36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q36.setText("0");
        jPanel7.add(q36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 180, 30, -1));

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Desserts/custards.jpg"))); // NOI18N
        jButton34.setText("jButton1");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 200, 170));

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel75.setText("Custards");
        jPanel7.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 180, 140, -1));

        q37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q37.setForeground(new java.awt.Color(255, 0, 0));
        q37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q37.setText("0");
        jPanel7.add(q37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 180, 30, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, -1));

        jTabbedPane1.addTab("Desserts", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(176, 147, 152));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel83.setText("Americano");
        jPanel8.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, -1));

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel85.setText("Double Expresso");
        jPanel8.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 140, -1));

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel87.setText("Hot Chocolate");
        jPanel8.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 140, -1));

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel89.setText("Iced Coffee");
        jPanel8.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 140, -1));

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel91.setText("Martini");
        jPanel8.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 140, -1));

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel93.setText("Milk Shake");
        jPanel8.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 180, 120, -1));

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel95.setText("Soda");
        jPanel8.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 180, 140, -1));

        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel97.setText("Vodka");
        jPanel8.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 140, -1));

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel99.setText("Whisky");
        jPanel8.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 140, -1));

        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel101.setText("Wine");
        jPanel8.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 140, -1));

        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drinks/iced coffee.jpg"))); // NOI18N
        jButton47.setText("jButton1");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 200, 170));

        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drinks/whiskey.jpg"))); // NOI18N
        jButton50.setText("jButton1");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 200, 170));

        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drinks/hot chocolate.jpg"))); // NOI18N
        jButton45.setText("jButton1");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 170));

        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drinks/vodka.jpg"))); // NOI18N
        jButton46.setText("jButton1");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 200, 170));

        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drinks/double espresso.jpg"))); // NOI18N
        jButton44.setText("jButton1");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 170));

        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drinks/soda.jpg"))); // NOI18N
        jButton43.setText("jButton1");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 200, 170));

        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drinks/americano.jpg"))); // NOI18N
        jButton41.setText("jButton1");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 170));

        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drinks/milk shakes.jpg"))); // NOI18N
        jButton42.setText("jButton1");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 200, 170));

        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drinks/martini.jpg"))); // NOI18N
        jButton48.setText("jButton1");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 200, 170));

        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drinks/wine.jpg"))); // NOI18N
        jButton49.setText("jButton1");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 200, 170));

        q41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q41.setForeground(new java.awt.Color(255, 0, 0));
        q41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q41.setText("0");
        jPanel8.add(q41, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 30, -1));

        q42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q42.setForeground(new java.awt.Color(255, 0, 0));
        q42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q42.setText("0");
        jPanel8.add(q42, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 30, -1));

        q43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q43.setForeground(new java.awt.Color(255, 0, 0));
        q43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q43.setText("0");
        jPanel8.add(q43, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 30, -1));

        q44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q44.setForeground(new java.awt.Color(255, 0, 0));
        q44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q44.setText("0");
        jPanel8.add(q44, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 30, -1));

        q45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q45.setForeground(new java.awt.Color(255, 0, 0));
        q45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q45.setText("0");
        jPanel8.add(q45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 180, 30, -1));

        q46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q46.setForeground(new java.awt.Color(255, 0, 0));
        q46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q46.setText("0");
        jPanel8.add(q46, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 180, 30, -1));

        q47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q47.setForeground(new java.awt.Color(255, 0, 0));
        q47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q47.setText("0");
        jPanel8.add(q47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 180, 30, -1));

        q48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q48.setForeground(new java.awt.Color(255, 0, 0));
        q48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q48.setText("0");
        jPanel8.add(q48, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 30, -1));

        q49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q49.setForeground(new java.awt.Color(255, 0, 0));
        q49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q49.setText("0");
        jPanel8.add(q49, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 30, -1));

        q50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        q50.setForeground(new java.awt.Color(255, 0, 0));
        q50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q50.setText("0");
        jPanel8.add(q50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 380, 30, -1));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, -1));

        jTabbedPane1.addTab("Drinks", jPanel6);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(253, 236, 239));
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 520, 310));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(191, 205, 224));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel104.setText("Total");

        jTextTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel108.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel108.setText("Payment Method");

        jcmboPayments.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcmboPayments.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Gcash", "Card" }));

        jLabel109.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel109.setText("Cash");

        jTextDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel110.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel110.setText("Change");

        bal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel108)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcmboPayments, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel110)
                            .addComponent(jLabel104)
                            .addComponent(jLabel109))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextDisplay)
                                .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(jcmboPayments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel109))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel110))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 200));

        jButton52.setBackground(new java.awt.Color(209, 153, 182));
        jButton52.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton52.setText("PRINT");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jbttnPay.setBackground(new java.awt.Color(237, 173, 199));
        jbttnPay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbttnPay.setText("PAY");
        jbttnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnPayActionPerformed(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jbttn9.setBackground(new java.awt.Color(155, 106, 108));
        jbttn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbttn9.setText("9");
        jbttn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttn9ActionPerformed(evt);
            }
        });

        jbttn8.setBackground(new java.awt.Color(155, 106, 108));
        jbttn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbttn8.setText("8");
        jbttn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttn8ActionPerformed(evt);
            }
        });

        jbttn7.setBackground(new java.awt.Color(155, 106, 108));
        jbttn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbttn7.setText("7");
        jbttn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttn7ActionPerformed(evt);
            }
        });

        jbttn6.setBackground(new java.awt.Color(155, 106, 108));
        jbttn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbttn6.setText("6");
        jbttn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttn6ActionPerformed(evt);
            }
        });

        jbttn5.setBackground(new java.awt.Color(155, 106, 108));
        jbttn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbttn5.setText("5");
        jbttn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttn5ActionPerformed(evt);
            }
        });

        jbttn4.setBackground(new java.awt.Color(155, 106, 108));
        jbttn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbttn4.setText("4");
        jbttn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttn4ActionPerformed(evt);
            }
        });

        jbttn3.setBackground(new java.awt.Color(155, 106, 108));
        jbttn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbttn3.setText("3");
        jbttn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttn3ActionPerformed(evt);
            }
        });

        jbttn2.setBackground(new java.awt.Color(155, 106, 108));
        jbttn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbttn2.setText("2");
        jbttn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttn2ActionPerformed(evt);
            }
        });

        jbttn1.setBackground(new java.awt.Color(155, 106, 108));
        jbttn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbttn1.setText("1");
        jbttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttn1ActionPerformed(evt);
            }
        });

        jbttn0.setBackground(new java.awt.Color(155, 106, 108));
        jbttn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbttn0.setText("0");
        jbttn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttn0ActionPerformed(evt);
            }
        });

        jbttnDot.setBackground(new java.awt.Color(155, 106, 108));
        jbttnDot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbttnDot.setText(".");
        jbttnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnDotActionPerformed(evt);
            }
        });

        jTextClr.setBackground(new java.awt.Color(155, 106, 108));
        jTextClr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextClr.setText("CLEAR");
        jTextClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextClrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jbttn5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbttn4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbttn3))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jbttn9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbttn8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbttn7))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jbttn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbttn0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbttnDot)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbttn2)
                    .addComponent(jTextClr)
                    .addComponent(jbttn6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel11Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextClr, jbttn0, jbttn1, jbttn2, jbttn3, jbttn4, jbttn5, jbttn6, jbttn7, jbttn8, jbttn9, jbttnDot});

        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbttn9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbttn8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbttn7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbttn6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbttn5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbttn4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbttn3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbttn2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbttn1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbttn0, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbttnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextClr, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel11Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextClr, jbttn0, jbttn1, jbttn2, jbttn3, jbttn4, jbttn5, jbttn6, jbttn7, jbttn8, jbttn9, jbttnDot});

        jbttnDelete.setBackground(new java.awt.Color(255, 51, 51));
        jbttnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbttnDelete.setForeground(new java.awt.Color(255, 255, 255));
        jbttnDelete.setText("Delete");
        jbttnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 103, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jbttnDelete)
                        .addGap(76, 76, 76)
                        .addComponent(jbttnPay)
                        .addGap(89, 89, 89)
                        .addComponent(jButton52))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbttnDelete)
                            .addComponent(jbttnPay)
                            .addComponent(jButton52)))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        int x = Integer.valueOf(q43.getText());
        ++x;
        q43.setText(String.valueOf(x));
        
        addTable("Hot Chocolate", x, 207.00);
        cal();
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        int x = Integer.valueOf(q33.getText());
        ++x;
        q33.setText(String.valueOf(x));
        
        addTable("Cheese Cake", x, 2300.75);
        cal();
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        int x = Integer.valueOf(q23.getText());
        ++x;
        q23.setText(String.valueOf(x));
        
        addTable("Coleslaw", x, 120.75);
        cal();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        int x = Integer.valueOf(q21.getText());
        ++x;
        q21.setText(String.valueOf(x));
        
        addTable("Asparagus", x, 290.50);
        cal();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        MessageFormat header = new MessageFormat("Printing in progress");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try {
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);
        } 
        catch (java.awt.print.PrinterException e) {
            System.err.format("No Printer found", e.getMessage());
        }
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jbttn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttn9ActionPerformed
        String enternumber = jTextDisplay.getText();
        if (enternumber == "")
        {
            jTextDisplay.setText(jbttn9.getText());        
        }
        else
        {
            enternumber = jTextDisplay.getText() + jbttn9.getText();
            jTextDisplay.setText(enternumber);
        }                
    }//GEN-LAST:event_jbttn9ActionPerformed

    private void jbttn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttn8ActionPerformed
        String enternumber = jTextDisplay.getText();
        if (enternumber == "")
        {
            jTextDisplay.setText(jbttn8.getText());        
        }
        else
        {
            enternumber = jTextDisplay.getText() + jbttn8.getText();
            jTextDisplay.setText(enternumber);
        }
    }//GEN-LAST:event_jbttn8ActionPerformed

    private void jbttn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttn2ActionPerformed
        String enternumber = jTextDisplay.getText();
        if (enternumber == "")
        {
            jTextDisplay.setText(jbttn2.getText());        
        }
        else
        {
            enternumber = jTextDisplay.getText() + jbttn2.getText();
            jTextDisplay.setText(enternumber);
        }
    }//GEN-LAST:event_jbttn2ActionPerformed

    private void jbttn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttn7ActionPerformed
        String enternumber = jTextDisplay.getText();
        if (enternumber == "")
        {
            jTextDisplay.setText(jbttn7.getText());        
        }
        else
        {
            enternumber = jTextDisplay.getText() + jbttn7.getText();
            jTextDisplay.setText(enternumber);
        }
    }//GEN-LAST:event_jbttn7ActionPerformed

    private void jbttn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttn6ActionPerformed
        String enternumber = jTextDisplay.getText();
        if (enternumber == "")
        {
            jTextDisplay.setText(jbttn6.getText());        
        }
        else
        {
            enternumber = jTextDisplay.getText() + jbttn6.getText();
            jTextDisplay.setText(enternumber);
        }
    }//GEN-LAST:event_jbttn6ActionPerformed

    private void jbttn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttn5ActionPerformed
        String enternumber = jTextDisplay.getText();
        if (enternumber == "")
        {
            jTextDisplay.setText(jbttn5.getText());        
        }
        else
        {
            enternumber = jTextDisplay.getText() + jbttn5.getText();
            jTextDisplay.setText(enternumber);
        }
    }//GEN-LAST:event_jbttn5ActionPerformed

    private void jbttn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttn4ActionPerformed
        String enternumber = jTextDisplay.getText();
        if (enternumber == "")
        {
            jTextDisplay.setText(jbttn4.getText());        
        }
        else
        {
            enternumber = jTextDisplay.getText() + jbttn4.getText();
            jTextDisplay.setText(enternumber);
        }
    }//GEN-LAST:event_jbttn4ActionPerformed

    private void jbttn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttn3ActionPerformed
        String enternumber = jTextDisplay.getText();
        if (enternumber == "")
        {
            jTextDisplay.setText(jbttn3.getText());        
        }
        else
        {
            enternumber = jTextDisplay.getText() + jbttn3.getText();
            jTextDisplay.setText(enternumber);
        }
    }//GEN-LAST:event_jbttn3ActionPerformed

    private void jbttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttn1ActionPerformed
        String enternumber = jTextDisplay.getText();
        if (enternumber == "")
        {
            jTextDisplay.setText(jbttn1.getText());        
        }
        else
        {
            enternumber = jTextDisplay.getText() + jbttn1.getText();
            jTextDisplay.setText(enternumber);
        }
    }//GEN-LAST:event_jbttn1ActionPerformed

    private void jbttn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttn0ActionPerformed
        String enternumber = jTextDisplay.getText();
        if (enternumber == "")
        {
            jTextDisplay.setText(jbttn0.getText());        
        }
        else
        {
            enternumber = jTextDisplay.getText() + jbttn0.getText();
            jTextDisplay.setText(enternumber);
        }
    }//GEN-LAST:event_jbttn0ActionPerformed

    private void jTextClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextClrActionPerformed
        jTextDisplay.setText("");
        bal.setText("");
    }//GEN-LAST:event_jTextClrActionPerformed

    private void jbttnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnDotActionPerformed
        if (! jTextDisplay.getText().contains("."))
        {
            jTextDisplay.setText(jTextDisplay.getText() + jbttnDot.getText());        
        }
    }//GEN-LAST:event_jbttnDotActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int x = Integer.valueOf(q1.getText());
        ++x;
        q1.setText(String.valueOf(x));
        
        addTable("Bacon Pickle Fries", x, 224.00);
        cal();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int x = Integer.valueOf(q2.getText());
        ++x;
        q2.setText(String.valueOf(x));
        
        addTable("Bacon Mussels with Cheese", x, 552.00);
        cal();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int x = Integer.valueOf(q3.getText());
        ++x;
        q3.setText(String.valueOf(x));
        
        addTable("Bruschetta", x, 335.00);
        cal();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int x = Integer.valueOf(q4.getText());
        ++x;
        q4.setText(String.valueOf(x));
        
        addTable("Chicken Wings", x, 250.00);
        cal();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int x = Integer.valueOf(q5.getText());
        ++x;
        q5.setText(String.valueOf(x));
        
        addTable("Fries and Chips", x, 895.00);
        cal();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int x = Integer.valueOf(q6.getText());
        ++x;
        q6.setText(String.valueOf(x));
        
        addTable("Garlic Bread", x, 200.00);
        cal();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x = Integer.valueOf(q7.getText());
        ++x;
        q7.setText(String.valueOf(x));
        
        addTable("Guacamole", x, 200.00);
        cal();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int x = Integer.valueOf(q8.getText());
        ++x;
        q8.setText(String.valueOf(x));
        
        addTable("Italian Sausage", x, 370.00);
        cal();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int x = Integer.valueOf(q9.getText());
        ++x;
        q9.setText(String.valueOf(x));
        
        addTable("Onion Rings", x, 360.00);
        cal();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int x = Integer.valueOf(q10.getText());
        ++x;
        q10.setText(String.valueOf(x));
        
        addTable("Smoked Salmon Salad", x, 466.00);
        cal();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int x = Integer.valueOf(q11.getText());
        ++x;
        q11.setText(String.valueOf(x));
        
        addTable("Braised Beef Ribs", x, 1230.00);
        cal();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        int x = Integer.valueOf(q12.getText());
        ++x;
        q12.setText(String.valueOf(x));
        
        addTable("Beef Steak", x, 324.00);
        cal();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        int x = Integer.valueOf(q13.getText());
        ++x;
        q13.setText(String.valueOf(x));
        
        addTable("Creamy Mushroom Soup", x, 300.00);
        cal();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        int x = Integer.valueOf(q14.getText());
        ++x;
        q14.setText(String.valueOf(x));
        
        addTable("Chicken Alfredo Lasagna", x, 250.00);
        cal();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        int x = Integer.valueOf(q15.getText());
        ++x;
        q15.setText(String.valueOf(x));
        
        addTable("Greek Salad", x, 270.00);
        cal();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int x = Integer.valueOf(q16.getText());
        ++x;
        q16.setText(String.valueOf(x));
        
        addTable("Grilled Salmon", x, 790.00);
        cal();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int x = Integer.valueOf(q17.getText());
        ++x;
        q17.setText(String.valueOf(x));
        
        addTable("Pasta Bolognese", x, 504.00);
        cal();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        int x = Integer.valueOf(q18.getText());
        ++x;
        q18.setText(String.valueOf(x));
        
        addTable("Rice with Tuna", x, 85.00);
        cal();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        int x = Integer.valueOf(q19.getText());
        ++x;
        q19.setText(String.valueOf(x));
        
        addTable("Spicy Chicken Pasta", x, 787.00);
        cal();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        int x = Integer.valueOf(q20.getText());
        ++x;
        q20.setText(String.valueOf(x));
        
        addTable("Seafood Bucket", x, 3299.00);
        cal();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        int x = Integer.valueOf(q22.getText());
        ++x;
        q22.setText(String.valueOf(x));
        
        addTable("Cheddar BIscuit", x, 168.00);
        cal();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        int x = Integer.valueOf(q24.getText());
        ++x;
        q24.setText(String.valueOf(x));
        
        addTable("Egg Rolls", x, 245.00);
        cal();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        int x = Integer.valueOf(q25.getText());
        ++x;
        q25.setText(String.valueOf(x));
        
        addTable("French Fries", x, 100.00);
        cal();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        int x = Integer.valueOf(q26.getText());
        ++x;
        q26.setText(String.valueOf(x));
        
        addTable("Fried Mushrooms", x, 337.00);
        cal();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        int x = Integer.valueOf(q27.getText());
        ++x;
        q27.setText(String.valueOf(x));
        
        addTable("Fried Rice", x, 150.00);
        cal();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        int x = Integer.valueOf(q28.getText());
        ++x;
        q28.setText(String.valueOf(x));
        
        addTable("Mashed Potatoes", x, 85.00);
        cal();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        int x = Integer.valueOf(q29.getText());
        ++x;
        q29.setText(String.valueOf(x));
        
        addTable("Steamed Broccoli", x, 168.00);
        cal();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        int x = Integer.valueOf(q30.getText());
        ++x;
        q30.setText(String.valueOf(x));
        
        addTable("Stir and Fry Veggies", x, 249.00);
        cal();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        int x = Integer.valueOf(q31.getText());
        ++x;
        q31.setText(String.valueOf(x));
        
        addTable("Banana Pudding", x, 224.00);
        cal();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        int x = Integer.valueOf(q32.getText());
        ++x;
        q32.setText(String.valueOf(x));
        
        addTable("Cheese Burger", x, 270.00);
        cal();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        int x = Integer.valueOf(q34.getText());
        ++x;
        q34.setText(String.valueOf(x));
        
        addTable("Chocolate Brownies", x, 125.00);
        cal();
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        int x = Integer.valueOf(q35.getText());
        ++x;
        q35.setText(String.valueOf(x));
        
        addTable("Chocolate Waffle", x, 85.00);
        cal();
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        int x = Integer.valueOf(q36.getText());
        ++x;
        q36.setText(String.valueOf(x));
        
        addTable("Croissants", x, 190.00);
        cal();
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        int x = Integer.valueOf(q37.getText());
        ++x;
        q37.setText(String.valueOf(x));
        
        addTable("Custards", x, 100.00);
        cal();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        int x = Integer.valueOf(q38.getText());
        ++x;
        q38.setText(String.valueOf(x));
        
        addTable("Ice Cream", x, 50.00);
        cal();
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        int x = Integer.valueOf(q39.getText());
        ++x;
        q39.setText(String.valueOf(x));
        
        addTable("Tiramisu Cake", x, 450.00);
        cal();
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        int x = Integer.valueOf(q40.getText());
        ++x;
        q40.setText(String.valueOf(x));
        
        addTable("Vegan Burger", x, 237.00);
        cal();
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        int x = Integer.valueOf(q41.getText());
        ++x;
        q41.setText(String.valueOf(x));
        
        addTable("Americano", x, 200.00);
        cal();
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        int x = Integer.valueOf(q42.getText());
        ++x;
        q42.setText(String.valueOf(x));
        
        addTable("Double Espresso", x, 150.00);
        cal();
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        int x = Integer.valueOf(q44.getText());
        ++x;
        q44.setText(String.valueOf(x));
        
        addTable("Iced Coffee", x, 55.00);
        cal();
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        int x = Integer.valueOf(q45.getText());
        ++x;
        q45.setText(String.valueOf(x));
        
        addTable("Martini", x, 2519.00);
        cal();
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        int x = Integer.valueOf(q46.getText());
        ++x;
        q46.setText(String.valueOf(x));
        
        addTable("Milk Shake", x, 109.00);
        cal();
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        int x = Integer.valueOf(q47.getText());
        ++x;
        q47.setText(String.valueOf(x));
        
        addTable("Soda", x, 50.00);
        cal();
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        int x = Integer.valueOf(q48.getText());
        ++x;
        q48.setText(String.valueOf(x));
        
        addTable("Vodka", x, 2050.00);
        cal();
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        int x = Integer.valueOf(q49.getText());
        ++x;
        q49.setText(String.valueOf(x));
        
        addTable("Whisky", x, 1650.00);
        cal();
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        int x = Integer.valueOf(q50.getText());
        ++x;
        q50.setText(String.valueOf(x));
        
        addTable("Wine", x, 999.00);
        cal();
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jbttnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnDeleteActionPerformed
        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
        
        String wow = tm.getValueAt(jTable1.getSelectedColumn(), 0).toString();
        
        //hawa product
        int bmw = jTable1.getSelectedRow();
        tm.removeRow(bmw);
        
         // hawa label
        switch (wow) {
            
            case "1":
                q1.setText("0");
                break;
            case "2":
                q2.setText("0");
                break;    
            case "3":
                q3.setText("0");
                break;
            case "4":
                q4.setText("0");
                break; 
            case "5":
                q5.setText("0");
                break;
            case "6":
                q6.setText("0");
                break; 
            case "7":
                q7.setText("0");
                break;
            case "8":
                q8.setText("0");
                break; 
            case "9":
                q9.setText("0");
                break;
            case "10":
                q10.setText("0");
                break; 
            case "11":
                q11.setText("0");
                break;
            case "12":
                q12.setText("0");
                break; 
            case "13":
                q13.setText("0");
                break;
            case "14":
                q14.setText("0");
                break; 
            case "15":
                q15.setText("0");
                break;
            case "16":
                q16.setText("0");
                break; 
            case "17":
                q17.setText("0");
                break;
            case "18":
                q18.setText("0");
                break;
            case "19":
                q19.setText("0");
                break;
            case "20":
                q20.setText("0");
                break;
            case "21":
                q21.setText("0");
                break;
            case "22":
                q22.setText("0");
                break;
            case "23":
                q23.setText("0");
                break;
            case "24":
                q24.setText("0");
                break;
            case "25":
                q25.setText("0");
                break;
            case "26":
                q26.setText("0");
                break;
            case "27":
                q27.setText("0");
                break;
            case "28":
                q28.setText("0");
                break;
            case "29":
                q29.setText("0");
                break;
            case "30":
                q30.setText("0");
                break;
            case "31":
                q31.setText("0");
                break;
            case "32":
                q32.setText("0");
                break;
            case "33":
                q33.setText("0");
                break;
            case "34":
                q34.setText("0");
                break;
            case "35":
                q35.setText("0");
                break;
            case "36":
                q36.setText("0");
                break;
            case "37":
                q37.setText("0");
                break;
            case "38":
                q38.setText("0");
                break;
            case "39":
                q39.setText("0");
                break;
            case "40":
                q40.setText("0");
                break;
            case "41":
                q41.setText("0");
                break;
            case "42":
                q42.setText("0");
                break;
            case "43":
                q43.setText("0");
                break;
            case "44":
                q44.setText("0");
                break;
            case "45":
                q45.setText("0");
                break;
            case "46":
                q46.setText("0");
                break;
            case "47":
                q47.setText("0");
                break;
            case "48":
                q48.setText("0");
                break;
            case "49":
                q49.setText("0");
                break;
            case "50":
                q50.setText("0");
                break;  
        }
    }//GEN-LAST:event_jbttnDeleteActionPerformed

    private void jbttnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttnPayActionPerformed
        double tot = Double.valueOf(jTextTotal.getText());
        double pp = Double.valueOf(jTextDisplay.getText());
        double balance = pp - tot;
        
        DecimalFormat df = new DecimalFormat("00.00");
        
        bal.setText(String.valueOf(df.format(balance)));        
    }//GEN-LAST:event_jbttnPayActionPerformed

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
            java.util.logging.Logger.getLogger(posHNJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(posHNJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(posHNJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(posHNJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new posHNJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jTextClr;
    private javax.swing.JTextField jTextDisplay;
    private javax.swing.JTextField jTextTotal;
    private javax.swing.JButton jbttn0;
    private javax.swing.JButton jbttn1;
    private javax.swing.JButton jbttn2;
    private javax.swing.JButton jbttn3;
    private javax.swing.JButton jbttn4;
    private javax.swing.JButton jbttn5;
    private javax.swing.JButton jbttn6;
    private javax.swing.JButton jbttn7;
    private javax.swing.JButton jbttn8;
    private javax.swing.JButton jbttn9;
    private javax.swing.JButton jbttnDelete;
    private javax.swing.JButton jbttnDot;
    private javax.swing.JButton jbttnPay;
    private javax.swing.JComboBox<String> jcmboPayments;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q10;
    private javax.swing.JLabel q11;
    private javax.swing.JLabel q12;
    private javax.swing.JLabel q13;
    private javax.swing.JLabel q14;
    private javax.swing.JLabel q15;
    private javax.swing.JLabel q16;
    private javax.swing.JLabel q17;
    private javax.swing.JLabel q18;
    private javax.swing.JLabel q19;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q20;
    private javax.swing.JLabel q21;
    private javax.swing.JLabel q22;
    private javax.swing.JLabel q23;
    private javax.swing.JLabel q24;
    private javax.swing.JLabel q25;
    private javax.swing.JLabel q26;
    private javax.swing.JLabel q27;
    private javax.swing.JLabel q28;
    private javax.swing.JLabel q29;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q30;
    private javax.swing.JLabel q31;
    private javax.swing.JLabel q32;
    private javax.swing.JLabel q33;
    private javax.swing.JLabel q34;
    private javax.swing.JLabel q35;
    private javax.swing.JLabel q36;
    private javax.swing.JLabel q37;
    private javax.swing.JLabel q38;
    private javax.swing.JLabel q39;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q40;
    private javax.swing.JLabel q41;
    private javax.swing.JLabel q42;
    private javax.swing.JLabel q43;
    private javax.swing.JLabel q44;
    private javax.swing.JLabel q45;
    private javax.swing.JLabel q46;
    private javax.swing.JLabel q47;
    private javax.swing.JLabel q48;
    private javax.swing.JLabel q49;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q50;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    // End of variables declaration//GEN-END:variables
}

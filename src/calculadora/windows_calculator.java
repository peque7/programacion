/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author pequesillo
 */
public class windows_calculator extends javax.swing.JFrame {

    /**
     * Creates new form windows_calculator
     */
    Capturar Cap = new Capturar();
    public windows_calculator() {
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

        p_contenedor = new javax.swing.JPanel();
        p_number = new javax.swing.JPanel();
        p_cuenta = new javax.swing.JPanel();
        l_cuenta = new javax.swing.JLabel();
        p_resultado = new javax.swing.JPanel();
        l_resultado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_borrar = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_nose4 = new javax.swing.JButton();
        btn_retrocede = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_total = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_divicion = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_nose2 = new javax.swing.JButton();
        btn_borrar21 = new javax.swing.JButton();
        btn_nose3 = new javax.swing.JButton();
        btn_porciento = new javax.swing.JButton();
        btn_nose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        p_contenedor.setBackground(new java.awt.Color(255, 255, 255));
        p_contenedor.setLayout(null);

        p_number.setBackground(new java.awt.Color(255, 255, 255));
        p_number.setLayout(null);

        p_cuenta.setBackground(new java.awt.Color(255, 255, 255));

        l_cuenta.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        l_cuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout p_cuentaLayout = new javax.swing.GroupLayout(p_cuenta);
        p_cuenta.setLayout(p_cuentaLayout);
        p_cuentaLayout.setHorizontalGroup(
            p_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_cuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        p_cuentaLayout.setVerticalGroup(
            p_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l_cuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        p_number.add(p_cuenta);
        p_cuenta.setBounds(0, 0, 360, 60);

        p_resultado.setBackground(new java.awt.Color(255, 255, 255));

        l_resultado.setFont(new java.awt.Font("MV Boli", 0, 48)); // NOI18N
        l_resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout p_resultadoLayout = new javax.swing.GroupLayout(p_resultado);
        p_resultado.setLayout(p_resultadoLayout);
        p_resultadoLayout.setHorizontalGroup(
            p_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_resultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        p_resultadoLayout.setVerticalGroup(
            p_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l_resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        p_number.add(p_resultado);
        p_resultado.setBounds(0, 60, 360, 90);

        p_contenedor.add(p_number);
        p_number.setBounds(0, 0, 360, 150);

        jPanel1.setLayout(null);

        btn_borrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_borrar.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_borrar.setForeground(new java.awt.Color(102, 102, 102));
        btn_borrar.setText("CE");
        btn_borrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_borrar.setFocusable(false);
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_borrar);
        btn_borrar.setBounds(10, 11, 55, 55);

        btn_7.setBackground(new java.awt.Color(255, 255, 255));
        btn_7.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_7.setForeground(new java.awt.Color(102, 102, 102));
        btn_7.setText("7");
        btn_7.setBorder(null);
        btn_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_7.setFocusable(false);
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_7);
        btn_7.setBounds(10, 72, 55, 55);

        btn_4.setBackground(new java.awt.Color(255, 255, 255));
        btn_4.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_4.setForeground(new java.awt.Color(102, 102, 102));
        btn_4.setText("4");
        btn_4.setBorder(null);
        btn_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_4.setFocusable(false);
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_4);
        btn_4.setBounds(10, 133, 55, 55);

        btn_1.setBackground(new java.awt.Color(255, 255, 255));
        btn_1.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_1.setForeground(new java.awt.Color(102, 102, 102));
        btn_1.setText("1");
        btn_1.setBorder(null);
        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1.setFocusable(false);
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_1);
        btn_1.setBounds(10, 194, 55, 55);

        btn_nose4.setBackground(new java.awt.Color(255, 255, 255));
        btn_nose4.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_nose4.setForeground(new java.awt.Color(102, 102, 102));
        btn_nose4.setText("+-");
        btn_nose4.setBorder(null);
        btn_nose4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nose4.setFocusable(false);
        btn_nose4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nose4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_nose4);
        btn_nose4.setBounds(10, 255, 55, 55);

        btn_retrocede.setBackground(new java.awt.Color(255, 255, 255));
        btn_retrocede.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_retrocede.setForeground(new java.awt.Color(102, 102, 102));
        btn_retrocede.setText("C");
        btn_retrocede.setBorder(null);
        btn_retrocede.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_retrocede.setFocusable(false);
        btn_retrocede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retrocedeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_retrocede);
        btn_retrocede.setBounds(71, 11, 55, 55);

        btn_8.setBackground(new java.awt.Color(255, 255, 255));
        btn_8.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_8.setForeground(new java.awt.Color(102, 102, 102));
        btn_8.setText("8");
        btn_8.setBorder(null);
        btn_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_8.setFocusable(false);
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_8);
        btn_8.setBounds(71, 72, 55, 55);

        btn_5.setBackground(new java.awt.Color(255, 255, 255));
        btn_5.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_5.setForeground(new java.awt.Color(102, 102, 102));
        btn_5.setText("5");
        btn_5.setBorder(null);
        btn_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_5.setFocusable(false);
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_5);
        btn_5.setBounds(71, 133, 55, 55);

        btn_2.setBackground(new java.awt.Color(255, 255, 255));
        btn_2.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_2.setForeground(new java.awt.Color(102, 102, 102));
        btn_2.setText("2");
        btn_2.setBorder(null);
        btn_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2.setFocusable(false);
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_2);
        btn_2.setBounds(71, 194, 55, 55);

        btn_0.setBackground(new java.awt.Color(255, 255, 255));
        btn_0.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_0.setForeground(new java.awt.Color(102, 102, 102));
        btn_0.setText("0");
        btn_0.setBorder(null);
        btn_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_0.setFocusable(false);
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_0);
        btn_0.setBounds(71, 255, 55, 55);

        btn_6.setBackground(new java.awt.Color(255, 255, 255));
        btn_6.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_6.setForeground(new java.awt.Color(102, 102, 102));
        btn_6.setText("6");
        btn_6.setBorder(null);
        btn_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_6.setFocusable(false);
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_6);
        btn_6.setBounds(132, 133, 55, 55);

        btn_punto.setBackground(new java.awt.Color(255, 255, 255));
        btn_punto.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(102, 102, 102));
        btn_punto.setText(".");
        btn_punto.setBorder(null);
        btn_punto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_punto.setFocusable(false);
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_punto);
        btn_punto.setBounds(132, 255, 55, 55);

        btn_3.setBackground(new java.awt.Color(255, 255, 255));
        btn_3.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_3.setForeground(new java.awt.Color(102, 102, 102));
        btn_3.setText("3");
        btn_3.setBorder(null);
        btn_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3.setFocusable(false);
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_3);
        btn_3.setBounds(132, 194, 55, 55);

        btn_atras.setBackground(new java.awt.Color(255, 255, 255));
        btn_atras.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_atras.setForeground(new java.awt.Color(102, 102, 102));
        btn_atras.setText("<-");
        btn_atras.setBorder(null);
        btn_atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_atras.setFocusable(false);
        jPanel1.add(btn_atras);
        btn_atras.setBounds(132, 11, 55, 55);

        btn_9.setBackground(new java.awt.Color(255, 255, 255));
        btn_9.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_9.setForeground(new java.awt.Color(102, 102, 102));
        btn_9.setText("9");
        btn_9.setBorder(null);
        btn_9.setBorderPainted(false);
        btn_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_9.setDoubleBuffered(true);
        btn_9.setFocusable(false);
        btn_9.setOpaque(false);
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_9);
        btn_9.setBounds(132, 72, 55, 55);

        btn_resta.setBackground(new java.awt.Color(255, 255, 255));
        btn_resta.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_resta.setForeground(new java.awt.Color(102, 102, 102));
        btn_resta.setText("-");
        btn_resta.setBorder(null);
        btn_resta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_resta.setFocusable(false);
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_resta);
        btn_resta.setBounds(193, 133, 55, 55);

        btn_total.setBackground(new java.awt.Color(255, 255, 255));
        btn_total.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_total.setForeground(new java.awt.Color(102, 102, 102));
        btn_total.setText("=");
        btn_total.setBorder(null);
        btn_total.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_total.setFocusable(false);
        btn_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_totalActionPerformed(evt);
            }
        });
        jPanel1.add(btn_total);
        btn_total.setBounds(193, 255, 55, 55);

        btn_suma.setBackground(new java.awt.Color(255, 255, 255));
        btn_suma.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(102, 102, 102));
        btn_suma.setText("+");
        btn_suma.setBorder(null);
        btn_suma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_suma.setFocusable(false);
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_suma);
        btn_suma.setBounds(193, 194, 55, 55);

        btn_divicion.setBackground(new java.awt.Color(255, 255, 255));
        btn_divicion.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_divicion.setForeground(new java.awt.Color(102, 102, 102));
        btn_divicion.setText("/");
        btn_divicion.setBorder(null);
        btn_divicion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_divicion.setFocusable(false);
        btn_divicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divicionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_divicion);
        btn_divicion.setBounds(193, 11, 55, 55);

        btn_multiplicacion.setBackground(new java.awt.Color(255, 255, 255));
        btn_multiplicacion.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_multiplicacion.setForeground(new java.awt.Color(102, 102, 102));
        btn_multiplicacion.setText("X");
        btn_multiplicacion.setBorder(null);
        btn_multiplicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_multiplicacion.setFocusable(false);
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_multiplicacion);
        btn_multiplicacion.setBounds(193, 72, 55, 55);

        btn_nose2.setBackground(new java.awt.Color(255, 255, 255));
        btn_nose2.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_nose2.setForeground(new java.awt.Color(102, 102, 102));
        btn_nose2.setText("x2");
        btn_nose2.setBorder(null);
        btn_nose2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nose2.setFocusable(false);
        jPanel1.add(btn_nose2);
        btn_nose2.setBounds(254, 133, 55, 55);

        btn_borrar21.setBackground(new java.awt.Color(255, 255, 255));
        btn_borrar21.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_borrar21.setForeground(new java.awt.Color(102, 102, 102));
        btn_borrar21.setText("CE");
        btn_borrar21.setBorder(null);
        btn_borrar21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_borrar21.setFocusable(false);
        jPanel1.add(btn_borrar21);
        btn_borrar21.setBounds(254, 255, 55, 55);

        btn_nose3.setBackground(new java.awt.Color(255, 255, 255));
        btn_nose3.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_nose3.setForeground(new java.awt.Color(102, 102, 102));
        btn_nose3.setText("1/x");
        btn_nose3.setBorder(null);
        btn_nose3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nose3.setFocusable(false);
        jPanel1.add(btn_nose3);
        btn_nose3.setBounds(254, 194, 55, 55);

        btn_porciento.setBackground(new java.awt.Color(255, 255, 255));
        btn_porciento.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_porciento.setForeground(new java.awt.Color(102, 102, 102));
        btn_porciento.setText("%");
        btn_porciento.setBorder(null);
        btn_porciento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_porciento.setFocusable(false);
        jPanel1.add(btn_porciento);
        btn_porciento.setBounds(254, 11, 55, 55);

        btn_nose.setBackground(new java.awt.Color(255, 255, 255));
        btn_nose.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        btn_nose.setForeground(new java.awt.Color(102, 102, 102));
        btn_nose.setText("/2");
        btn_nose.setBorder(null);
        btn_nose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nose.setFocusable(false);
        jPanel1.add(btn_nose);
        btn_nose.setBounds(254, 72, 55, 55);

        p_contenedor.add(jPanel1);
        jPanel1.setBounds(0, 150, 320, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        l_resultado.setText(l_resultado.getText()+"0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        l_resultado.setText(l_resultado.getText()+"1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        l_resultado.setText(l_resultado.getText()+"3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        l_resultado.setText(l_resultado.getText()+"2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        l_resultado.setText(l_resultado.getText()+"4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
        l_resultado.setText(l_resultado.getText()+"5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
        l_resultado.setText(l_resultado.getText()+"6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
        l_resultado.setText(l_resultado.getText()+"7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
        l_resultado.setText(l_resultado.getText()+"8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
        l_resultado.setText(l_resultado.getText()+"9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        // TODO add your handling code here:
        l_resultado.setText(l_resultado.getText()+".");
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_nose4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nose4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nose4ActionPerformed

    private void btn_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_totalActionPerformed
        // TODO add your handling code here:
        
        l_cuenta.setText(l_resultado.getText());
        l_resultado.setText(String.valueOf(Cap.ingresaCaracter(l_resultado.getText())));
    }//GEN-LAST:event_btn_totalActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        // TODO add your handling code here:
        l_resultado.setText(l_resultado.getText()+"+");
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        // TODO add your handling code here:
        l_resultado.setText(l_resultado.getText()+"-");
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacionActionPerformed
        // TODO add your handling code here:
        l_resultado.setText(l_resultado.getText()+"*");
    }//GEN-LAST:event_btn_multiplicacionActionPerformed

    private void btn_divicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divicionActionPerformed
        // TODO add your handling code here:
        l_resultado.setText(l_resultado.getText()+"/");
    }//GEN-LAST:event_btn_divicionActionPerformed

    private void btn_retrocedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retrocedeActionPerformed
        // TODO add your handling code here:
        //String cadenaNueva = cadena.substring(0, cadena.length()-1); 
        l_resultado.setText(l_resultado.getText().substring(0, l_resultado.getText().length()-1));
    }//GEN-LAST:event_btn_retrocedeActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        // TODO add your handling code here:
         l_resultado.setText("");
    }//GEN-LAST:event_btn_borrarActionPerformed

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
            java.util.logging.Logger.getLogger(windows_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windows_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windows_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windows_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windows_calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_borrar21;
    private javax.swing.JButton btn_divicion;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_nose;
    private javax.swing.JButton btn_nose2;
    private javax.swing.JButton btn_nose3;
    private javax.swing.JButton btn_nose4;
    private javax.swing.JButton btn_porciento;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_retrocede;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton btn_total;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_cuenta;
    private javax.swing.JLabel l_resultado;
    private javax.swing.JPanel p_contenedor;
    private javax.swing.JPanel p_cuenta;
    private javax.swing.JPanel p_number;
    private javax.swing.JPanel p_resultado;
    // End of variables declaration//GEN-END:variables
}

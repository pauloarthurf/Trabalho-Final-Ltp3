/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;

/**
 *
 * @author Iara
 */
public class FrmCadastrarQuarto extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmCadastrarQuarto
     */
    public FrmCadastrarQuarto() {
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

        PnlQuarto = new javax.swing.JPanel();
        TxtNumero = new javax.swing.JTextField();
        LblNumero = new javax.swing.JLabel();
        LblBanheiro = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        BtnLimpar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        RbtnSim = new javax.swing.JRadioButton();
        RbtnNao = new javax.swing.JRadioButton();
        LblIdPredio = new javax.swing.JLabel();
        TxtIdPredio = new javax.swing.JTextField();

        setTitle("Cadastrar Quarto");

        PnlQuarto.setBackground(new java.awt.Color(255, 255, 255));
        PnlQuarto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Quarto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 3, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        PnlQuarto.setAutoscrolls(true);

        LblNumero.setText("Numero:");

        LblBanheiro.setText("Banheiro:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        BtnLimpar.setText("Limpar Campo");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        RbtnSim.setText("Sim");

        RbtnNao.setText("Não");

        LblIdPredio.setText("Id Predio:");

        javax.swing.GroupLayout PnlQuartoLayout = new javax.swing.GroupLayout(PnlQuarto);
        PnlQuarto.setLayout(PnlQuartoLayout);
        PnlQuartoLayout.setHorizontalGroup(
            PnlQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlQuartoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PnlQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlQuartoLayout.createSequentialGroup()
                        .addGroup(PnlQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblNumero)
                            .addComponent(LblIdPredio)
                            .addComponent(LblBanheiro))
                        .addGap(46, 46, 46)
                        .addGroup(PnlQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNumero)
                            .addComponent(TxtIdPredio)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlQuartoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addGroup(PnlQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlQuartoLayout.createSequentialGroup()
                                .addComponent(RbtnSim)
                                .addGap(18, 18, 18)
                                .addComponent(RbtnNao))
                            .addGroup(PnlQuartoLayout.createSequentialGroup()
                                .addComponent(BtnLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(BtnCancelar)))))
                .addGap(73, 73, 73))
        );
        PnlQuartoLayout.setVerticalGroup(
            PnlQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlQuartoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PnlQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNumero))
                .addGap(18, 18, 18)
                .addGroup(PnlQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblIdPredio)
                    .addComponent(TxtIdPredio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PnlQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlQuartoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(LblBanheiro))
                    .addGroup(PnlQuartoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PnlQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RbtnNao)
                            .addComponent(RbtnSim))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(PnlQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(BtnLimpar)
                    .addComponent(BtnCancelar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlQuarto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlQuarto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
       
    }//GEN-LAST:event_BtnLimparActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        
    }//GEN-LAST:event_BtnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JLabel LblBanheiro;
    private javax.swing.JLabel LblIdPredio;
    private javax.swing.JLabel LblNumero;
    private javax.swing.JPanel PnlQuarto;
    private javax.swing.JRadioButton RbtnNao;
    private javax.swing.JRadioButton RbtnSim;
    private javax.swing.JTextField TxtIdPredio;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JButton btnSalvar;
    // End of variables declaration//GEN-END:variables
}

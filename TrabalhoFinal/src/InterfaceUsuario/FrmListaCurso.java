/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUsuario;

/**
 *
 * @author Iara
 */
public class FrmListaCurso extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmListaCurso
     */
    public FrmListaCurso() {
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

        PnlListaCurso = new javax.swing.JPanel();
        SpnlListaCurso = new javax.swing.JScrollPane();
        TblListaCurso = new javax.swing.JTable();
        TxtPesquisar = new javax.swing.JTextField();
        BtnPesquisar = new javax.swing.JButton();
        BtnVoltar = new javax.swing.JButton();

        PnlListaCurso.setBackground(new java.awt.Color(255, 255, 255));
        PnlListaCurso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Curso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 3, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        TblListaCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nome"
            }
        ));
        TblListaCurso.getTableHeader().setReorderingAllowed(false);
        TblListaCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblListaCursoMouseClicked(evt);
            }
        });
        SpnlListaCurso.setViewportView(TblListaCurso);

        BtnPesquisar.setText("Pesquisar");
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        BtnVoltar.setText("Voltar");
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlListaCursoLayout = new javax.swing.GroupLayout(PnlListaCurso);
        PnlListaCurso.setLayout(PnlListaCursoLayout);
        PnlListaCursoLayout.setHorizontalGroup(
            PnlListaCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListaCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpnlListaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PnlListaCursoLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(TxtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnPesquisar)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlListaCursoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnVoltar)
                .addContainerGap())
        );
        PnlListaCursoLayout.setVerticalGroup(
            PnlListaCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListaCursoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PnlListaCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPesquisar))
                .addGap(26, 26, 26)
                .addComponent(SpnlListaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlListaCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlListaCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TblListaCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblListaCursoMouseClicked
        
    }//GEN-LAST:event_TblListaCursoMouseClicked

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed
        
    }//GEN-LAST:event_BtnPesquisarActionPerformed

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
       
    }//GEN-LAST:event_BtnVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JPanel PnlListaCurso;
    private javax.swing.JScrollPane SpnlListaCurso;
    private javax.swing.JTable TblListaCurso;
    private javax.swing.JTextField TxtPesquisar;
    // End of variables declaration//GEN-END:variables
}

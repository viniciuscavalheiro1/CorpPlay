/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import conexao.Cadastrar;


/**
 *
 * @author vinicius
 */
public class CadastrarBebida extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarBebida
     */
    public CadastrarBebida() {
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

        jLabel2 = new javax.swing.JLabel();
        ml = new javax.swing.JTextField();
        codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        preco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        validade = new javax.swing.JTextField();
        fabricante = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        quantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cadastrarBebida = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Quantidade ml");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 290, 100, 16);

        ml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mlActionPerformed(evt);
            }
        });
        getContentPane().add(ml);
        ml.setBounds(500, 310, 160, 33);

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });
        getContentPane().add(codigo);
        codigo.setBounds(50, 310, 160, 33);

        jLabel3.setText("Código");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 290, 44, 16);

        jLabel5.setText("Preço R$");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 290, 60, 16);

        preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoActionPerformed(evt);
            }
        });
        getContentPane().add(preco);
        preco.setBounds(270, 310, 160, 33);

        jLabel4.setText("Validade lote");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(530, 370, 100, 16);

        validade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validadeActionPerformed(evt);
            }
        });
        getContentPane().add(validade);
        validade.setBounds(500, 390, 160, 33);

        fabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fabricanteActionPerformed(evt);
            }
        });
        getContentPane().add(fabricante);
        fabricante.setBounds(50, 390, 150, 33);

        jLabel6.setText("Fabricante");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 370, 65, 16);

        jLabel7.setText("Quantidade");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 370, 90, 16);

        quantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(quantidade);
        quantidade.setBounds(270, 390, 160, 33);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/perfil.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 0, 300, 280);

        cadastrarBebida.setText("Cadastrar");
        cadastrarBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBebidaActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarBebida);
        cadastrarBebida.setBounds(500, 456, 160, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backbutton_104978.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 450, 42, 42);

        setBounds(0, 0, 710, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void mlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mlActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoActionPerformed

    private void validadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validadeActionPerformed

    private void fabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fabricanteActionPerformed

    private void quantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeActionPerformed

    private void cadastrarBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBebidaActionPerformed
        // TODO add your handling code here:
        Cadastrar cad = new Cadastrar();
        
       
        cad.CadastrarBebida(codigo.getText(), Float.parseFloat(preco.getText()), Integer.parseInt(ml.getText()), fabricante.getText(), Integer.parseInt(quantidade.getText()), validade.getText());
        
       
    }//GEN-LAST:event_cadastrarBebidaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarBebida;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField fabricante;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField ml;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField quantidade;
    private javax.swing.JTextField validade;
    // End of variables declaration//GEN-END:variables
}

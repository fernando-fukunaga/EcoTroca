/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ecosolucoes.ecotroca.views.descarte;

import br.com.ecosolucoes.ecotroca.models.Cidadao;
import br.com.ecosolucoes.ecotroca.models.Descarte;
import br.com.ecosolucoes.ecotroca.models.Material;
import br.com.ecosolucoes.ecotroca.models.MaterialDescarte;
import br.com.ecosolucoes.ecotroca.views.usuario.*;
import br.com.ecosolucoes.ecotroca.models.Pessoa;
import br.com.ecosolucoes.ecotroca.models.Usuario;
import br.com.ecosolucoes.ecotroca.models.dao.CidadaoDAO;
import br.com.ecosolucoes.ecotroca.models.dao.DescarteDAO;
import br.com.ecosolucoes.ecotroca.models.dao.MaterialDAO;
import br.com.ecosolucoes.ecotroca.models.dao.MaterialDescarteDAO;
import br.com.ecosolucoes.ecotroca.models.dao.PessoaDAO;
import br.com.ecosolucoes.ecotroca.models.dao.UsuarioDAO;
import static br.com.ecosolucoes.ecotroca.views.TelaLogin.usuarioLogado;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class TelaNovoDescarte extends javax.swing.JFrame {

    /**
     * Creates new form TelaPesquisarUsuario
     */
    public TelaNovoDescarte() {
        super("Novo Descarte");
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public static int idDescarte;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscarPeloCpfTextField = new javax.swing.JTextField();
        nomeCidadaoTextField = new javax.swing.JTextField();
        buscarPeloCpfButton = new javax.swing.JButton();
        idCidadaoTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        materialDescarteTable = new javax.swing.JTable();
        buscarMaterialPeloIdTextField = new javax.swing.JTextField();
        nomeMaterialTextField = new javax.swing.JTextField();
        pesoDescartadoTextField = new javax.swing.JTextField();
        buscarMaterialPeloIdButton = new javax.swing.JButton();
        adicionarMaterialDescarteButton = new javax.swing.JButton();
        registrarDescarteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(336, 484));
        setMinimumSize(new java.awt.Dimension(336, 484));
        setResizable(false);

        buscarPeloCpfTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Insira o CPF do cidadão"));

        nomeCidadaoTextField.setEditable(false);
        nomeCidadaoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome cidadão"));

        buscarPeloCpfButton.setText("Buscar");
        buscarPeloCpfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPeloCpfButtonActionPerformed(evt);
            }
        });

        idCidadaoTextField.setEditable(false);
        idCidadaoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("ID cidadão"));

        materialDescarteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material", "Peso (kg)", "Pontos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(materialDescarteTable);

        buscarMaterialPeloIdTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Insira o ID do material"));

        nomeMaterialTextField.setEditable(false);
        nomeMaterialTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome material"));

        pesoDescartadoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Peso (kg) descartado"));

        buscarMaterialPeloIdButton.setText("Buscar");
        buscarMaterialPeloIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMaterialPeloIdButtonActionPerformed(evt);
            }
        });

        adicionarMaterialDescarteButton.setText("Adicionar Material");
        adicionarMaterialDescarteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarMaterialDescarteButtonActionPerformed(evt);
            }
        });

        registrarDescarteButton.setBackground(new java.awt.Color(50, 168, 82));
        registrarDescarteButton.setText("Registrar Descarte");
        registrarDescarteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDescarteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(adicionarMaterialDescarteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscarMaterialPeloIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarMaterialPeloIdButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nomeMaterialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pesoDescartadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buscarPeloCpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarPeloCpfButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeCidadaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idCidadaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(registrarDescarteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscarPeloCpfTextField)
                    .addComponent(buscarPeloCpfButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCidadaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idCidadaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscarMaterialPeloIdTextField)
                    .addComponent(buscarMaterialPeloIdButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeMaterialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesoDescartadoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(adicionarMaterialDescarteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registrarDescarteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarPeloCpfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPeloCpfButtonActionPerformed
        // TODO add your handling code here:
        Pessoa pessoa = PessoaDAO.procurarPessoaPeloCpf(buscarPeloCpfTextField.getText());
        nomeCidadaoTextField.setText(pessoa.getNome()+" "+pessoa.getSobrenome());
        Cidadao cidadao = CidadaoDAO.buscarCidadaoPeloIdPessoa(pessoa.getId());
        idCidadaoTextField.setText(String.valueOf(cidadao.getId()));
        Descarte descarte = new Descarte();
        descarte.setIdCidadao(cidadao.getId());
        descarte.setIdUsuario(usuarioLogado.getId());
        int idDescarteGerado = DescarteDAO.createDescarte(descarte);
        idDescarte = idDescarteGerado;
    }//GEN-LAST:event_buscarPeloCpfButtonActionPerformed

    private void buscarMaterialPeloIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMaterialPeloIdButtonActionPerformed
        // TODO add your handling code here:
        Material material = MaterialDAO.readMaterial(Integer.parseInt(buscarMaterialPeloIdTextField.getText()));
        nomeMaterialTextField.setText(material.getTipoMaterial());
    }//GEN-LAST:event_buscarMaterialPeloIdButtonActionPerformed

    private void adicionarMaterialDescarteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarMaterialDescarteButtonActionPerformed
        // TODO add your handling code here:
        MaterialDescarte materialDescarte = new MaterialDescarte();
        materialDescarte.setIdDescarte(idDescarte);
        materialDescarte.setIdMaterial(Integer.parseInt(buscarMaterialPeloIdTextField.getText()));
        materialDescarte.setPesoDescartado(Double.parseDouble(pesoDescartadoTextField.getText()));
        MaterialDescarteDAO.createMaterialDescarte(materialDescarte);
    }//GEN-LAST:event_adicionarMaterialDescarteButtonActionPerformed

    private void registrarDescarteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDescarteButtonActionPerformed
        // TODO add your handling code here:
        DescarteDAO.atualizarPesoEPontosDescarte(idDescarte);
    }//GEN-LAST:event_registrarDescarteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNovoDescarte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNovoDescarte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNovoDescarte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNovoDescarte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNovoDescarte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarMaterialDescarteButton;
    private javax.swing.JButton buscarMaterialPeloIdButton;
    private javax.swing.JTextField buscarMaterialPeloIdTextField;
    private javax.swing.JButton buscarPeloCpfButton;
    private javax.swing.JTextField buscarPeloCpfTextField;
    private javax.swing.JTextField idCidadaoTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable materialDescarteTable;
    private javax.swing.JTextField nomeCidadaoTextField;
    private javax.swing.JTextField nomeMaterialTextField;
    private javax.swing.JTextField pesoDescartadoTextField;
    private javax.swing.JButton registrarDescarteButton;
    // End of variables declaration//GEN-END:variables
}

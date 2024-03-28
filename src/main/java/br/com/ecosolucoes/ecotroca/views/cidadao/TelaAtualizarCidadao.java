/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ecosolucoes.ecotroca.views.cidadao;

import br.com.ecosolucoes.ecotroca.models.Cidadao;
import br.com.ecosolucoes.ecotroca.views.*;
import br.com.ecosolucoes.ecotroca.models.Pessoa;
import br.com.ecosolucoes.ecotroca.models.Usuario;
import br.com.ecosolucoes.ecotroca.models.Usuario.Perfil;
import br.com.ecosolucoes.ecotroca.models.dao.CidadaoDAO;
import br.com.ecosolucoes.ecotroca.models.dao.PessoaDAO;
import br.com.ecosolucoes.ecotroca.models.dao.UsuarioDAO;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author fanna
 */
public class TelaAtualizarCidadao extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public TelaAtualizarCidadao() {
        super("Buscar cadastro");
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        sobrenomeTextField = new javax.swing.JTextField();
        pontuacaoTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        telefoneTextField = new javax.swing.JTextField();
        cpfTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        enderecoTextArea = new javax.swing.JTextArea();
        dataTextField = new javax.swing.JTextField();
        pesquisaTextField = new javax.swing.JTextField();
        pesquisarButton = new javax.swing.JButton();
        atualizarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(417, 547));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insira abaixo um CPF para localizar registro (apenas números):");

        nomeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        sobrenomeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Sobrenome"));

        pontuacaoTextField.setEditable(false);
        pontuacaoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de pontos"));

        emailTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("E-mail"));

        telefoneTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));

        cpfTextField.setEditable(false);
        cpfTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));

        enderecoTextArea.setColumns(20);
        enderecoTextArea.setRows(5);
        enderecoTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        jScrollPane2.setViewportView(enderecoTextArea);

        dataTextField.setEditable(false);
        dataTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Nascimento"));

        pesquisaTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pesquisarButton.setText("Pesquisar");
        pesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarButtonActionPerformed(evt);
            }
        });

        atualizarButton.setBackground(new java.awt.Color(194, 148, 23));
        atualizarButton.setText("Atualizar");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pontuacaoTextField)
                            .addComponent(nomeTextField)
                            .addComponent(sobrenomeTextField)
                            .addComponent(emailTextField)
                            .addComponent(telefoneTextField)
                            .addComponent(cpfTextField)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addComponent(dataTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(atualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(pesquisarButton))
                            .addComponent(pesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisarButton)
                .addGap(30, 30, 30)
                .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sobrenomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pontuacaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(dataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pontuacaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontuacaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pontuacaoTextFieldActionPerformed

    private void pesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarButtonActionPerformed
        // TODO add your handling code here:
        String cpf = pesquisaTextField.getText();
        Pessoa pessoa = PessoaDAO.procurarPessoaPeloCpf(cpf);
        Cidadao cidadao = CidadaoDAO.buscarCidadaoPeloIdPessoa(pessoa.getId());
        nomeTextField.setText(pessoa.getNome());
        sobrenomeTextField.setText(pessoa.getSobrenome());
        pontuacaoTextField.setText(String.valueOf(cidadao.getSaldoPontuacao()));
        emailTextField.setText(pessoa.getEmail());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String strDataNascimento = dateFormat.format(pessoa.getDataNascimento());
        dataTextField.setText(strDataNascimento);
        enderecoTextArea.setText(pessoa.getEndereco());
        telefoneTextField.setText(pessoa.getTelefone());
        cpfTextField.setText(pessoa.getCpf());
    }//GEN-LAST:event_pesquisarButtonActionPerformed

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        // TODO add your handling code here:
        String cpf = pesquisaTextField.getText();
        Pessoa pessoa = PessoaDAO.procurarPessoaPeloCpf(cpf);
        pessoa.setNome(nomeTextField.getText());
        pessoa.setSobrenome(sobrenomeTextField.getText());
        pessoa.setEmail(emailTextField.getText());
        pessoa.setEndereco(enderecoTextArea.getText());
        pessoa.setTelefone(telefoneTextField.getText());
        PessoaDAO.updatePessoa(pessoa);
    }//GEN-LAST:event_atualizarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAtualizarCidadao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarCidadao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarCidadao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarCidadao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtualizarCidadao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButton;
    private javax.swing.JTextField cpfTextField;
    private javax.swing.JTextField dataTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextArea enderecoTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JTextField sobrenomeTextField;
    private javax.swing.JTextField pesquisaTextField;
    private javax.swing.JButton pesquisarButton;
    private javax.swing.JTextField pontuacaoTextField;
    private javax.swing.JTextField telefoneTextField;
    // End of variables declaration//GEN-END:variables
}

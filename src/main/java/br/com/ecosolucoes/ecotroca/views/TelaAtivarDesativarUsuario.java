/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ecosolucoes.ecotroca.views;

import br.com.ecosolucoes.ecotroca.models.Pessoa;
import br.com.ecosolucoes.ecotroca.models.Usuario;
import br.com.ecosolucoes.ecotroca.models.dao.PessoaDAO;
import br.com.ecosolucoes.ecotroca.models.dao.UsuarioDAO;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class TelaAtivarDesativarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaPesquisarUsuario
     */
    public TelaAtivarDesativarUsuario() {
        super("Ativar ou Desativar Usuários");
        initComponents();
        this.setLocationRelativeTo(null);
        ativarButton.setVisible(false);
        desativarButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscarPeloIdTextField = new javax.swing.JTextField();
        buscarPeloLoginTextField = new javax.swing.JTextField();
        buscarPeloIdButton = new javax.swing.JButton();
        buscarPeloLoginButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        emailTextField = new javax.swing.JTextField();
        loginTextField = new javax.swing.JTextField();
        perfilAcessoTextField = new javax.swing.JTextField();
        usuarioAtivoTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        ativarButton = new javax.swing.JButton();
        desativarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(813, 484));
        setResizable(false);

        buscarPeloIdTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar usuário pelo ID"));

        buscarPeloLoginTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar usuário pelo nome de login"));

        buscarPeloIdButton.setText("Buscar");
        buscarPeloIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPeloIdButtonActionPerformed(evt);
            }
        });

        buscarPeloLoginButton.setText("Buscar");
        buscarPeloLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPeloLoginButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        emailTextField.setEditable(false);
        emailTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("E-mail"));
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        loginTextField.setEditable(false);
        loginTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome de Login"));
        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });

        perfilAcessoTextField.setEditable(false);
        perfilAcessoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Perfil de Acesso"));
        perfilAcessoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilAcessoTextFieldActionPerformed(evt);
            }
        });

        usuarioAtivoTextField.setEditable(false);
        usuarioAtivoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário Ativo"));
        usuarioAtivoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioAtivoTextFieldActionPerformed(evt);
            }
        });

        idTextField.setEditable(false);
        idTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("ID do Usuário"));
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        ativarButton.setBackground(new java.awt.Color(50, 168, 82));
        ativarButton.setText("Ativar");
        ativarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ativarButtonActionPerformed(evt);
            }
        });

        desativarButton.setBackground(new java.awt.Color(194, 23, 23));
        desativarButton.setText("Desativar");
        desativarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desativarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(perfilAcessoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(usuarioAtivoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(ativarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addComponent(desativarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioAtivoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perfilAcessoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ativarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desativarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 208, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buscarPeloLoginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarPeloIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarPeloIdButton)
                            .addComponent(buscarPeloLoginButton))
                        .addGap(201, 201, 201))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscarPeloIdTextField)
                    .addComponent(buscarPeloIdButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscarPeloLoginTextField)
                    .addComponent(buscarPeloLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldActionPerformed

    private void perfilAcessoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilAcessoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perfilAcessoTextFieldActionPerformed

    private void usuarioAtivoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioAtivoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioAtivoTextFieldActionPerformed

    private void buscarPeloIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPeloIdButtonActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(buscarPeloIdTextField.getText());
        Usuario usuario = UsuarioDAO.readUsuario(id);
        if (usuario != null) {
            JOptionPane.showMessageDialog(null, "Busca realizada com sucesso.");
            Pessoa pessoa = PessoaDAO.readPessoa(usuario.getIdPessoa());
            loginTextField.setText(usuario.getLogin());
            emailTextField.setText(pessoa.getEmail());
            idTextField.setText(String.valueOf(usuario.getId()));
            perfilAcessoTextField.setText(usuario.getPerfilAcesso().name());
            String strUsuarioAtivo;
            if (usuario.isUsuarioAtivo()) {strUsuarioAtivo = "Sim";} else {strUsuarioAtivo = "Não";}
            usuarioAtivoTextField.setText(strUsuarioAtivo);
            ativarButton.setVisible(true);
            desativarButton.setVisible(true);
        }        
    }//GEN-LAST:event_buscarPeloIdButtonActionPerformed

    private void buscarPeloLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPeloLoginButtonActionPerformed
        // TODO add your handling code here:
        String login = buscarPeloLoginTextField.getText();
        Usuario usuario = UsuarioDAO.buscarUsuarioPeloLogin(login);
        if (usuario != null) {
            JOptionPane.showMessageDialog(null, "Busca realizada com sucesso.");
            Pessoa pessoa = PessoaDAO.readPessoa(usuario.getIdPessoa());
            loginTextField.setText(usuario.getLogin());
            emailTextField.setText(pessoa.getEmail());
            idTextField.setText(String.valueOf(usuario.getId()));
            perfilAcessoTextField.setText(usuario.getPerfilAcesso().name());
            String strUsuarioAtivo;
            if (usuario.isUsuarioAtivo()) {strUsuarioAtivo = "Sim";} else {strUsuarioAtivo = "Não";}
            usuarioAtivoTextField.setText(strUsuarioAtivo);
            ativarButton.setVisible(true);
            desativarButton.setVisible(true);
        }        
    }//GEN-LAST:event_buscarPeloLoginButtonActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void ativarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ativarButtonActionPerformed
        // TODO add your handling code here:
        UsuarioDAO.ativarUsuario(Integer.parseInt(idTextField.getText()));
    }//GEN-LAST:event_ativarButtonActionPerformed

    private void desativarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desativarButtonActionPerformed
        // TODO add your handling code here:
        UsuarioDAO.desativarUsuario(Integer.parseInt(idTextField.getText()));
    }//GEN-LAST:event_desativarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAtivarDesativarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtivarDesativarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtivarDesativarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtivarDesativarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtivarDesativarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ativarButton;
    private javax.swing.JButton buscarPeloIdButton;
    private javax.swing.JTextField buscarPeloIdTextField;
    private javax.swing.JButton buscarPeloLoginButton;
    private javax.swing.JTextField buscarPeloLoginTextField;
    private javax.swing.JButton desativarButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JTextField perfilAcessoTextField;
    private javax.swing.JTextField usuarioAtivoTextField;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ecosolucoes.ecotroca.views;

import br.com.ecosolucoes.ecotroca.models.dao.DescarteDAO;
import br.com.ecosolucoes.ecotroca.models.dao.MaterialDAO;
import br.com.ecosolucoes.ecotroca.views.usuario.TelaAtivarDesativarUsuario;
import br.com.ecosolucoes.ecotroca.views.usuario.TelaPesquisarUsuario;
import br.com.ecosolucoes.ecotroca.models.dao.UsuarioDAO;
import static br.com.ecosolucoes.ecotroca.views.TelaLogin.usuarioLogado;
import br.com.ecosolucoes.ecotroca.views.cidadao.TelaAtualizarCidadao;
import br.com.ecosolucoes.ecotroca.views.cidadao.TelaExcluirCidadao;
import br.com.ecosolucoes.ecotroca.views.cidadao.TelaNovoCidadao;
import br.com.ecosolucoes.ecotroca.views.cidadao.TelaPesquisarCidadao;
import br.com.ecosolucoes.ecotroca.views.descarte.TelaNovoDescarte;
import br.com.ecosolucoes.ecotroca.views.descarte.TelaPesquisarDescarte;
import br.com.ecosolucoes.ecotroca.views.material.TelaEditarMaterial;
import br.com.ecosolucoes.ecotroca.views.material.TelaExcluirMaterial;
import br.com.ecosolucoes.ecotroca.views.material.TelaNovoMaterial;
import br.com.ecosolucoes.ecotroca.views.material.TelaPesquisarMaterial;
import br.com.ecosolucoes.ecotroca.views.usuario.TelaAlterarAcessoUsuario;
import br.com.ecosolucoes.ecotroca.views.usuario.TelaExcluirUsuario;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fanna
 */
public class TelaHome extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    
    public TelaHome() {
        super("EcoTroca");
        initComponents();
        this.setLocationRelativeTo(null);
        mainPanel.setVisible(true);
        dashboardPanel.setVisible(false);
        gerenciarDescartesPanel.setVisible(false);
        gerenciarUsuariosPanel.setVisible(false);
        gerenciarMateriaisPanel.setVisible(false);
        gerenciarCidadaosPanel.setVisible(false);
        minhaContaPanel.setVisible(false); 
        
        DefaultTableModel modelUsuarios = (DefaultTableModel) usuariosTable.getModel();
        ArrayList<Object[]> objetos;
        objetos = UsuarioDAO.listarUsuariosParaTabela();
        for (Object[] objeto : objetos) {
            modelUsuarios.addRow(objeto);
        }
        
        DefaultTableModel modelDescartes = (DefaultTableModel) descartesTable.getModel();
        ArrayList<Object[]> descartes;
        descartes = DescarteDAO.listarDescartesParaTabela();
        for (Object[] descarte : descartes) {
            modelDescartes.addRow(descarte);
        }

        DefaultTableModel modelMateriais = (DefaultTableModel) materiaisTable.getModel();
        ArrayList<Object[]> materiais;
        materiais = MaterialDAO.listarMateriaisParaTabela();
        for (Object[] material : materiais) {
            modelMateriais.addRow(material);
        }        
    }

    public void deixaTodosOsPanelsInvisiveis() {
        Component[] arrayPanels = {dashboardPanel,gerenciarDescartesPanel,gerenciarUsuariosPanel,gerenciarMateriaisPanel,gerenciarCidadaosPanel,minhaContaPanel};
        for (Component component : arrayPanels) {
            component.setVisible(false);
        }
    }
    
    public void deixaTodosOsTogglesDoMenuNaCorPadrao() {
        Component[] arrayToggles = {dashboardTogglePanel,gerenciarDescartesTogglePanel,gerenciarUsuariosTogglePanel,gerenciarMateriaisTogglePanel,gerenciarCidadaosTogglePanel,minhaContaTogglePanel};
        for (Component component : arrayToggles) {
            component.setBackground(sideMenuPanel.getBackground());
        }
    }
    
    public void atualizarTabelaUsuarios() {     
        DefaultTableModel modelUsuarios = (DefaultTableModel) usuariosTable.getModel();
        modelUsuarios.setRowCount(0);
        ArrayList<Object[]> objetos;
        objetos = UsuarioDAO.listarUsuariosParaTabela();
        for (Object[] objeto : objetos) {
            modelUsuarios.addRow(objeto);
        }
    }
    
    public void atualizarTabelaDescartes() {
        DefaultTableModel modelDescartes = (DefaultTableModel) descartesTable.getModel();
        modelDescartes.setRowCount(0);
        ArrayList<Object[]> descartes;
        descartes = DescarteDAO.listarDescartesParaTabela();
        for (Object[] descarte : descartes) {
            modelDescartes.addRow(descarte);
        }    
    }
    
    public void atualizarTabelaMateriais() {
        DefaultTableModel modelMateriais = (DefaultTableModel) materiaisTable.getModel();
        modelMateriais.setRowCount(0);
        ArrayList<Object[]> materiais;
        materiais = MaterialDAO.listarMateriaisParaTabela();
        for (Object[] material : materiais) {
            modelMateriais.addRow(material);
        }    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoPanel = new javax.swing.JPanel();
        sideMenuPanel = new javax.swing.JPanel();
        dashboardTogglePanel = new javax.swing.JPanel();
        dashboardToggleLabel = new javax.swing.JLabel();
        gerenciarDescartesTogglePanel = new javax.swing.JPanel();
        gerenciarDescartesToggleLabel = new javax.swing.JLabel();
        gerenciarUsuariosTogglePanel = new javax.swing.JPanel();
        gerenciarUsuariosToggleLabel = new javax.swing.JLabel();
        gerenciarMateriaisTogglePanel = new javax.swing.JPanel();
        gerenciarMateriaisToggleLabel = new javax.swing.JLabel();
        minhaContaTogglePanel = new javax.swing.JPanel();
        minhaContaToggleLabel = new javax.swing.JLabel();
        gerenciarCidadaosTogglePanel = new javax.swing.JPanel();
        gerenciarCidadaosToggleLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        dashboardPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        gerenciarDescartesPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descartesTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        novoDescarteButton = new javax.swing.JButton();
        pesquisarDescarteButton = new javax.swing.JButton();
        atualizarTabelaDescartesButton = new javax.swing.JButton();
        gerenciarUsuariosPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        usuariosTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        ativarOuDesativarUsuarioButton = new javax.swing.JButton();
        alterarAcessoUsuarioButton = new javax.swing.JButton();
        excluirUsuarioButton = new javax.swing.JButton();
        pesquisarUsuarioButton = new javax.swing.JButton();
        atualizarTabelaUsuariosButton = new javax.swing.JButton();
        gerenciarMateriaisPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        materiaisTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        novoMaterialButton = new javax.swing.JButton();
        pesquisarMaterialButton = new javax.swing.JButton();
        editarMaterialButton = new javax.swing.JButton();
        excluirMaterialButton = new javax.swing.JButton();
        atualizarTabelaMateriaisButton = new javax.swing.JButton();
        minhaContaPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        editarMeusDadosPessoaisButton = new javax.swing.JButton();
        editarMeusDadosDeLoginButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        gerenciarCidadaosPanel = new javax.swing.JPanel();
        cadastrarCidadaoButton = new javax.swing.JButton();
        pesquisarCidadaoButton = new javax.swing.JButton();
        editarCidadaoButton = new javax.swing.JButton();
        excluirCidadãoButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1018, 593));
        setResizable(false);

        logoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logoPanel.setMaximumSize(new java.awt.Dimension(162, 162));
        logoPanel.setMinimumSize(new java.awt.Dimension(162, 162));
        logoPanel.setPreferredSize(new java.awt.Dimension(162, 162));

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        sideMenuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sideMenuPanel.setMaximumSize(new java.awt.Dimension(162, 425));
        sideMenuPanel.setMinimumSize(new java.awt.Dimension(162, 425));
        sideMenuPanel.setName(""); // NOI18N

        dashboardTogglePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dashboardTogglePanel.setPreferredSize(new java.awt.Dimension(150, 55));
        dashboardTogglePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardTogglePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardTogglePanelMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dashboardTogglePanelMouseReleased(evt);
            }
        });

        dashboardToggleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardToggleLabel.setText("Dashboard");

        javax.swing.GroupLayout dashboardTogglePanelLayout = new javax.swing.GroupLayout(dashboardTogglePanel);
        dashboardTogglePanel.setLayout(dashboardTogglePanelLayout);
        dashboardTogglePanelLayout.setHorizontalGroup(
            dashboardTogglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardTogglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboardToggleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dashboardTogglePanelLayout.setVerticalGroup(
            dashboardTogglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardTogglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboardToggleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        gerenciarDescartesTogglePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gerenciarDescartesTogglePanel.setPreferredSize(new java.awt.Dimension(150, 55));
        gerenciarDescartesTogglePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gerenciarDescartesTogglePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gerenciarDescartesTogglePanelMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                gerenciarDescartesTogglePanelMouseReleased(evt);
            }
        });

        gerenciarDescartesToggleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gerenciarDescartesToggleLabel.setText("Gerenciar Descartes");

        javax.swing.GroupLayout gerenciarDescartesTogglePanelLayout = new javax.swing.GroupLayout(gerenciarDescartesTogglePanel);
        gerenciarDescartesTogglePanel.setLayout(gerenciarDescartesTogglePanelLayout);
        gerenciarDescartesTogglePanelLayout.setHorizontalGroup(
            gerenciarDescartesTogglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gerenciarDescartesTogglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gerenciarDescartesToggleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        gerenciarDescartesTogglePanelLayout.setVerticalGroup(
            gerenciarDescartesTogglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gerenciarDescartesTogglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gerenciarDescartesToggleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        gerenciarUsuariosTogglePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gerenciarUsuariosTogglePanel.setPreferredSize(new java.awt.Dimension(150, 55));
        gerenciarUsuariosTogglePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gerenciarUsuariosTogglePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gerenciarUsuariosTogglePanelMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                gerenciarUsuariosTogglePanelMouseReleased(evt);
            }
        });

        gerenciarUsuariosToggleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gerenciarUsuariosToggleLabel.setText("Gerenciar Usuários");

        javax.swing.GroupLayout gerenciarUsuariosTogglePanelLayout = new javax.swing.GroupLayout(gerenciarUsuariosTogglePanel);
        gerenciarUsuariosTogglePanel.setLayout(gerenciarUsuariosTogglePanelLayout);
        gerenciarUsuariosTogglePanelLayout.setHorizontalGroup(
            gerenciarUsuariosTogglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gerenciarUsuariosTogglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gerenciarUsuariosToggleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        gerenciarUsuariosTogglePanelLayout.setVerticalGroup(
            gerenciarUsuariosTogglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gerenciarUsuariosTogglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gerenciarUsuariosToggleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        gerenciarMateriaisTogglePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gerenciarMateriaisTogglePanel.setPreferredSize(new java.awt.Dimension(150, 55));
        gerenciarMateriaisTogglePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gerenciarMateriaisTogglePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gerenciarMateriaisTogglePanelMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                gerenciarMateriaisTogglePanelMouseReleased(evt);
            }
        });

        gerenciarMateriaisToggleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gerenciarMateriaisToggleLabel.setText("Gerenciar Materiais");

        javax.swing.GroupLayout gerenciarMateriaisTogglePanelLayout = new javax.swing.GroupLayout(gerenciarMateriaisTogglePanel);
        gerenciarMateriaisTogglePanel.setLayout(gerenciarMateriaisTogglePanelLayout);
        gerenciarMateriaisTogglePanelLayout.setHorizontalGroup(
            gerenciarMateriaisTogglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gerenciarMateriaisTogglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gerenciarMateriaisToggleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        gerenciarMateriaisTogglePanelLayout.setVerticalGroup(
            gerenciarMateriaisTogglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gerenciarMateriaisTogglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gerenciarMateriaisToggleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        minhaContaTogglePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        minhaContaTogglePanel.setPreferredSize(new java.awt.Dimension(150, 55));
        minhaContaTogglePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minhaContaTogglePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minhaContaTogglePanelMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minhaContaTogglePanelMouseReleased(evt);
            }
        });

        minhaContaToggleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minhaContaToggleLabel.setText("Minha Conta");

        javax.swing.GroupLayout minhaContaTogglePanelLayout = new javax.swing.GroupLayout(minhaContaTogglePanel);
        minhaContaTogglePanel.setLayout(minhaContaTogglePanelLayout);
        minhaContaTogglePanelLayout.setHorizontalGroup(
            minhaContaTogglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minhaContaTogglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minhaContaToggleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        minhaContaTogglePanelLayout.setVerticalGroup(
            minhaContaTogglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minhaContaTogglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minhaContaToggleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        gerenciarCidadaosTogglePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gerenciarCidadaosTogglePanel.setPreferredSize(new java.awt.Dimension(150, 55));
        gerenciarCidadaosTogglePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gerenciarCidadaosTogglePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gerenciarCidadaosTogglePanelMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                gerenciarCidadaosTogglePanelMouseReleased(evt);
            }
        });

        gerenciarCidadaosToggleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gerenciarCidadaosToggleLabel.setText("Gerenciar Cidadãos");

        javax.swing.GroupLayout gerenciarCidadaosTogglePanelLayout = new javax.swing.GroupLayout(gerenciarCidadaosTogglePanel);
        gerenciarCidadaosTogglePanel.setLayout(gerenciarCidadaosTogglePanelLayout);
        gerenciarCidadaosTogglePanelLayout.setHorizontalGroup(
            gerenciarCidadaosTogglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gerenciarCidadaosTogglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gerenciarCidadaosToggleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        gerenciarCidadaosTogglePanelLayout.setVerticalGroup(
            gerenciarCidadaosTogglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarCidadaosTogglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gerenciarCidadaosToggleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout sideMenuPanelLayout = new javax.swing.GroupLayout(sideMenuPanel);
        sideMenuPanel.setLayout(sideMenuPanelLayout);
        sideMenuPanelLayout.setHorizontalGroup(
            sideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardTogglePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gerenciarDescartesTogglePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gerenciarUsuariosTogglePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gerenciarMateriaisTogglePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gerenciarCidadaosTogglePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minhaContaTogglePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        sideMenuPanelLayout.setVerticalGroup(
            sideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboardTogglePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gerenciarDescartesTogglePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gerenciarUsuariosTogglePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gerenciarMateriaisTogglePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gerenciarCidadaosTogglePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minhaContaTogglePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainPanel.setMaximumSize(new java.awt.Dimension(850, 593));
        mainPanel.setMinimumSize(new java.awt.Dimension(850, 593));
        mainPanel.setPreferredSize(new java.awt.Dimension(850, 593));

        dashboardPanel.setMaximumSize(new java.awt.Dimension(850, 593));
        dashboardPanel.setMinimumSize(new java.awt.Dimension(850, 593));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de usuários ativos"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dashboard");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de descartes recebidos"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Total de material recebido (kg)"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Total de pontos gerados"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        gerenciarDescartesPanel.setMaximumSize(new java.awt.Dimension(850, 593));
        gerenciarDescartesPanel.setMinimumSize(new java.awt.Dimension(850, 593));

        descartesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID do descarte", "ID do cidadão", "Nome do cidadão", "Login do funcionário", "Data e hora do descarte", "Peso total do descarte (kg)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(descartesTable);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Gerenciamento de Descartes");

        novoDescarteButton.setBackground(new java.awt.Color(50, 168, 82));
        novoDescarteButton.setText("Novo Descarte");
        novoDescarteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoDescarteButtonActionPerformed(evt);
            }
        });

        pesquisarDescarteButton.setBackground(new java.awt.Color(25, 110, 247));
        pesquisarDescarteButton.setText("Pesquisar Descarte");
        pesquisarDescarteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarDescarteButtonActionPerformed(evt);
            }
        });

        atualizarTabelaDescartesButton.setText("Atualizar tabela");
        atualizarTabelaDescartesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarTabelaDescartesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gerenciarDescartesPanelLayout = new javax.swing.GroupLayout(gerenciarDescartesPanel);
        gerenciarDescartesPanel.setLayout(gerenciarDescartesPanelLayout);
        gerenciarDescartesPanelLayout.setHorizontalGroup(
            gerenciarDescartesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarDescartesPanelLayout.createSequentialGroup()
                .addGroup(gerenciarDescartesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gerenciarDescartesPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gerenciarDescartesPanelLayout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(atualizarTabelaDescartesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(gerenciarDescartesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gerenciarDescartesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gerenciarDescartesPanelLayout.createSequentialGroup()
                        .addComponent(novoDescarteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(pesquisarDescarteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        gerenciarDescartesPanelLayout.setVerticalGroup(
            gerenciarDescartesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gerenciarDescartesPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(gerenciarDescartesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisarDescarteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(novoDescarteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(atualizarTabelaDescartesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        gerenciarUsuariosPanel.setMaximumSize(new java.awt.Dimension(850, 593));
        gerenciarUsuariosPanel.setMinimumSize(new java.awt.Dimension(850, 593));

        usuariosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Login Usuário", "Nome Completo", "E-mail", "Perfil Acesso", "ID Usuario", "Usuario Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usuariosTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(usuariosTable);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Gerenciamento de Usuários");

        ativarOuDesativarUsuarioButton.setBackground(new java.awt.Color(25, 110, 247));
        ativarOuDesativarUsuarioButton.setText("Ativar/Desativar Usuario");
        ativarOuDesativarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ativarOuDesativarUsuarioButtonActionPerformed(evt);
            }
        });

        alterarAcessoUsuarioButton.setBackground(new java.awt.Color(194, 148, 23));
        alterarAcessoUsuarioButton.setText("Alterar Acesso de Usuario");
        alterarAcessoUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarAcessoUsuarioButtonActionPerformed(evt);
            }
        });

        excluirUsuarioButton.setBackground(new java.awt.Color(194, 23, 23));
        excluirUsuarioButton.setText("Excluir Usuario");
        excluirUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirUsuarioButtonActionPerformed(evt);
            }
        });

        pesquisarUsuarioButton.setBackground(new java.awt.Color(25, 110, 247));
        pesquisarUsuarioButton.setText("Pesquisar Usuario");
        pesquisarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarUsuarioButtonActionPerformed(evt);
            }
        });

        atualizarTabelaUsuariosButton.setText("Atualizar tabela");
        atualizarTabelaUsuariosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarTabelaUsuariosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gerenciarUsuariosPanelLayout = new javax.swing.GroupLayout(gerenciarUsuariosPanel);
        gerenciarUsuariosPanel.setLayout(gerenciarUsuariosPanelLayout);
        gerenciarUsuariosPanelLayout.setHorizontalGroup(
            gerenciarUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarUsuariosPanelLayout.createSequentialGroup()
                .addGroup(gerenciarUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gerenciarUsuariosPanelLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gerenciarUsuariosPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(pesquisarUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(ativarOuDesativarUsuarioButton)
                        .addGap(30, 30, 30)
                        .addComponent(alterarAcessoUsuarioButton)
                        .addGap(26, 26, 26)
                        .addComponent(excluirUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gerenciarUsuariosPanelLayout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addGroup(gerenciarUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gerenciarUsuariosPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gerenciarUsuariosPanelLayout.createSequentialGroup()
                        .addComponent(atualizarTabelaUsuariosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(339, 339, 339))))
        );
        gerenciarUsuariosPanelLayout.setVerticalGroup(
            gerenciarUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gerenciarUsuariosPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(gerenciarUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ativarOuDesativarUsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(alterarAcessoUsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(excluirUsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(pesquisarUsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(atualizarTabelaUsuariosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        gerenciarMateriaisPanel.setMaximumSize(new java.awt.Dimension(850, 593));
        gerenciarMateriaisPanel.setMinimumSize(new java.awt.Dimension(850, 593));

        materiaisTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Material", "Nome Material", "Descrição", "Pontuação a cada 100g"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(materiaisTable);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Tabela de pontos");

        novoMaterialButton.setBackground(new java.awt.Color(50, 168, 82));
        novoMaterialButton.setText("Novo Material");
        novoMaterialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoMaterialButtonActionPerformed(evt);
            }
        });

        pesquisarMaterialButton.setBackground(new java.awt.Color(25, 110, 247));
        pesquisarMaterialButton.setText("Pesquisar Material");
        pesquisarMaterialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarMaterialButtonActionPerformed(evt);
            }
        });

        editarMaterialButton.setBackground(new java.awt.Color(194, 148, 23));
        editarMaterialButton.setText("Editar Material");
        editarMaterialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarMaterialButtonActionPerformed(evt);
            }
        });

        excluirMaterialButton.setBackground(new java.awt.Color(194, 23, 23));
        excluirMaterialButton.setText("Excluir Material");
        excluirMaterialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirMaterialButtonActionPerformed(evt);
            }
        });

        atualizarTabelaMateriaisButton.setText("Atualizar tabela");
        atualizarTabelaMateriaisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarTabelaMateriaisButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gerenciarMateriaisPanelLayout = new javax.swing.GroupLayout(gerenciarMateriaisPanel);
        gerenciarMateriaisPanel.setLayout(gerenciarMateriaisPanelLayout);
        gerenciarMateriaisPanelLayout.setHorizontalGroup(
            gerenciarMateriaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarMateriaisPanelLayout.createSequentialGroup()
                .addGroup(gerenciarMateriaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gerenciarMateriaisPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gerenciarMateriaisPanelLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gerenciarMateriaisPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(novoMaterialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(pesquisarMaterialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(editarMaterialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(excluirMaterialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gerenciarMateriaisPanelLayout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(atualizarTabelaMateriaisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        gerenciarMateriaisPanelLayout.setVerticalGroup(
            gerenciarMateriaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarMateriaisPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(gerenciarMateriaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoMaterialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarMaterialButton, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(editarMaterialButton, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(excluirMaterialButton, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(atualizarTabelaMateriaisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        minhaContaPanel.setMaximumSize(new java.awt.Dimension(850, 593));
        minhaContaPanel.setMinimumSize(new java.awt.Dimension(850, 593));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(186, 186));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );

        editarMeusDadosPessoaisButton.setText("Editar meus dados pessoais");

        editarMeusDadosDeLoginButton.setText("Editar meus dados de login");

        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout minhaContaPanelLayout = new javax.swing.GroupLayout(minhaContaPanel);
        minhaContaPanel.setLayout(minhaContaPanelLayout);
        minhaContaPanelLayout.setHorizontalGroup(
            minhaContaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minhaContaPanelLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addGroup(minhaContaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editarMeusDadosPessoaisButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(editarMeusDadosDeLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        minhaContaPanelLayout.setVerticalGroup(
            minhaContaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minhaContaPanelLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editarMeusDadosPessoaisButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarMeusDadosDeLoginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sairButton)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        gerenciarCidadaosPanel.setMaximumSize(new java.awt.Dimension(850, 593));
        gerenciarCidadaosPanel.setMinimumSize(new java.awt.Dimension(850, 593));

        cadastrarCidadaoButton.setBackground(new java.awt.Color(50, 168, 82));
        cadastrarCidadaoButton.setText("Cadastrar Cidadão");
        cadastrarCidadaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarCidadaoButtonActionPerformed(evt);
            }
        });

        pesquisarCidadaoButton.setBackground(new java.awt.Color(25, 110, 247));
        pesquisarCidadaoButton.setText("Pesquisar Cidadão");
        pesquisarCidadaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarCidadaoButtonActionPerformed(evt);
            }
        });

        editarCidadaoButton.setBackground(new java.awt.Color(194, 148, 23));
        editarCidadaoButton.setText("Editar Cidadão");
        editarCidadaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCidadaoButtonActionPerformed(evt);
            }
        });

        excluirCidadãoButton.setBackground(new java.awt.Color(194, 23, 23));
        excluirCidadãoButton.setText("Excluir Cidadão");
        excluirCidadãoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirCidadãoButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Gerenciamento de Cidadãos");

        javax.swing.GroupLayout gerenciarCidadaosPanelLayout = new javax.swing.GroupLayout(gerenciarCidadaosPanel);
        gerenciarCidadaosPanel.setLayout(gerenciarCidadaosPanelLayout);
        gerenciarCidadaosPanelLayout.setHorizontalGroup(
            gerenciarCidadaosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarCidadaosPanelLayout.createSequentialGroup()
                .addGroup(gerenciarCidadaosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gerenciarCidadaosPanelLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(gerenciarCidadaosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editarCidadaoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastrarCidadaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(142, 142, 142)
                        .addGroup(gerenciarCidadaosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(excluirCidadãoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesquisarCidadaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(gerenciarCidadaosPanelLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        gerenciarCidadaosPanelLayout.setVerticalGroup(
            gerenciarCidadaosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarCidadaosPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel9)
                .addGap(58, 58, 58)
                .addGroup(gerenciarCidadaosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarCidadaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarCidadaoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addGap(113, 113, 113)
                .addGroup(gerenciarCidadaosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarCidadaoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(excluirCidadãoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addGap(195, 195, 195))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(dashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gerenciarDescartesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(gerenciarUsuariosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gerenciarMateriaisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(minhaContaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(gerenciarCidadaosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(dashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gerenciarDescartesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(gerenciarUsuariosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gerenciarMateriaisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(minhaContaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(gerenciarCidadaosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sideMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sideMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardTogglePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardTogglePanelMouseEntered
        // TODO add your handling code here:
        dashboardTogglePanel.setBackground(new Color(25, 110, 247));
    }//GEN-LAST:event_dashboardTogglePanelMouseEntered

    private void dashboardTogglePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardTogglePanelMouseExited
        // TODO add your handling code here:
        if (!dashboardPanel.isVisible()) {
            dashboardTogglePanel.setBackground(sideMenuPanel.getBackground());
        }
    }//GEN-LAST:event_dashboardTogglePanelMouseExited

    private void dashboardTogglePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardTogglePanelMouseReleased
        // TODO add your handling code here:
        if (dashboardPanel.isVisible()) {
            dashboardPanel.setVisible(false);
        }
        else {            
            deixaTodosOsPanelsInvisiveis();
            deixaTodosOsTogglesDoMenuNaCorPadrao();
            dashboardPanel.setVisible(true);
            dashboardTogglePanel.setBackground(new Color(25, 110, 247));            
        }
    }//GEN-LAST:event_dashboardTogglePanelMouseReleased

    private void gerenciarDescartesTogglePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarDescartesTogglePanelMouseEntered
        // TODO add your handling code here:
        gerenciarDescartesTogglePanel.setBackground(new Color(25, 110, 247));
    }//GEN-LAST:event_gerenciarDescartesTogglePanelMouseEntered

    private void gerenciarDescartesTogglePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarDescartesTogglePanelMouseExited
        // TODO add your handling code here:
        if (!gerenciarDescartesPanel.isVisible()) {
            gerenciarDescartesTogglePanel.setBackground(sideMenuPanel.getBackground());
        }                 
    }//GEN-LAST:event_gerenciarDescartesTogglePanelMouseExited

    private void gerenciarDescartesTogglePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarDescartesTogglePanelMouseReleased
        // TODO add your handling code here:
        if (gerenciarDescartesPanel.isVisible()) {
            gerenciarDescartesPanel.setVisible(false);
        }
        else {
            deixaTodosOsPanelsInvisiveis();
            deixaTodosOsTogglesDoMenuNaCorPadrao();           
            gerenciarDescartesPanel.setVisible(true);
            gerenciarDescartesTogglePanel.setBackground(new Color(25, 110, 247));
        }
    }//GEN-LAST:event_gerenciarDescartesTogglePanelMouseReleased

    private void gerenciarUsuariosTogglePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarUsuariosTogglePanelMouseEntered
        // TODO add your handling code here:
        gerenciarUsuariosTogglePanel.setBackground(new Color(25, 110, 247));
    }//GEN-LAST:event_gerenciarUsuariosTogglePanelMouseEntered

    private void gerenciarUsuariosTogglePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarUsuariosTogglePanelMouseExited
        // TODO add your handling code here:
        if (!gerenciarUsuariosPanel.isVisible()) {
            gerenciarUsuariosTogglePanel.setBackground(sideMenuPanel.getBackground());
        }       
    }//GEN-LAST:event_gerenciarUsuariosTogglePanelMouseExited

    private void gerenciarUsuariosTogglePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarUsuariosTogglePanelMouseReleased
        // TODO add your handling code here:
        if (gerenciarUsuariosPanel.isVisible()) {
            gerenciarUsuariosPanel.setVisible(false);
        }
        else {
            deixaTodosOsPanelsInvisiveis();
            deixaTodosOsTogglesDoMenuNaCorPadrao();           
            gerenciarUsuariosPanel.setVisible(true);
            gerenciarUsuariosTogglePanel.setBackground(new Color(25, 110, 247));
        }        
    }//GEN-LAST:event_gerenciarUsuariosTogglePanelMouseReleased

    private void gerenciarMateriaisTogglePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarMateriaisTogglePanelMouseEntered
        // TODO add your handling code here:
        gerenciarMateriaisTogglePanel.setBackground(new Color(25, 110, 247));
    }//GEN-LAST:event_gerenciarMateriaisTogglePanelMouseEntered

    private void gerenciarMateriaisTogglePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarMateriaisTogglePanelMouseExited
        // TODO add your handling code here:
        if (!gerenciarMateriaisPanel.isVisible()) {
            gerenciarMateriaisTogglePanel.setBackground(sideMenuPanel.getBackground());
        }       
    }//GEN-LAST:event_gerenciarMateriaisTogglePanelMouseExited

    private void gerenciarMateriaisTogglePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarMateriaisTogglePanelMouseReleased
        // TODO add your handling code here:
        if (gerenciarMateriaisPanel.isVisible()) {
            gerenciarMateriaisPanel.setVisible(false);
        }
        else {
            deixaTodosOsPanelsInvisiveis();
            deixaTodosOsTogglesDoMenuNaCorPadrao();           
            gerenciarMateriaisPanel.setVisible(true);
            gerenciarMateriaisTogglePanel.setBackground(new Color(25, 110, 247));
        }         
    }//GEN-LAST:event_gerenciarMateriaisTogglePanelMouseReleased

    private void minhaContaTogglePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minhaContaTogglePanelMouseEntered
        // TODO add your handling code here:
        minhaContaTogglePanel.setBackground(new Color(25, 110, 247));
    }//GEN-LAST:event_minhaContaTogglePanelMouseEntered

    private void minhaContaTogglePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minhaContaTogglePanelMouseExited
        // TODO add your handling code here:
        if (!minhaContaPanel.isVisible()) {
            minhaContaTogglePanel.setBackground(sideMenuPanel.getBackground());
        }        
    }//GEN-LAST:event_minhaContaTogglePanelMouseExited

    private void minhaContaTogglePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minhaContaTogglePanelMouseReleased
        // TODO add your handling code here:
        if (minhaContaPanel.isVisible()) {
            minhaContaPanel.setVisible(false);
        }
        else {
            deixaTodosOsPanelsInvisiveis();
            deixaTodosOsTogglesDoMenuNaCorPadrao();           
            minhaContaPanel.setVisible(true);
            minhaContaTogglePanel.setBackground(new Color(25, 110, 247));
        }         
    }//GEN-LAST:event_minhaContaTogglePanelMouseReleased

    private void excluirUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirUsuarioButtonActionPerformed
        // TODO add your handling code here:
        if (usuarioLogado.getPerfilAcesso().name().equals("admin")) {
            TelaExcluirUsuario teu = new TelaExcluirUsuario();
            teu.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null,"Você não pode acessar essa funcionalidade!");
        }
    }//GEN-LAST:event_excluirUsuarioButtonActionPerformed

    private void pesquisarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarUsuarioButtonActionPerformed
        // TODO add your handling code here:
        TelaPesquisarUsuario tpu = new TelaPesquisarUsuario();
        tpu.setVisible(true);
    }//GEN-LAST:event_pesquisarUsuarioButtonActionPerformed

    private void ativarOuDesativarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ativarOuDesativarUsuarioButtonActionPerformed
        // TODO add your handling code here:
        if (usuarioLogado.getPerfilAcesso().name().equals("admin")) {
            TelaAtivarDesativarUsuario tadu = new TelaAtivarDesativarUsuario();
            tadu.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null,"Você não pode acessar essa funcionalidade!");
        }        
    }//GEN-LAST:event_ativarOuDesativarUsuarioButtonActionPerformed

    private void atualizarTabelaUsuariosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarTabelaUsuariosButtonActionPerformed
        // TODO add your handling code here:
        atualizarTabelaUsuarios();
    }//GEN-LAST:event_atualizarTabelaUsuariosButtonActionPerformed

    private void alterarAcessoUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarAcessoUsuarioButtonActionPerformed
        // TODO add your handling code here:
        if (usuarioLogado.getPerfilAcesso().name().equals("admin")) {
            TelaAlterarAcessoUsuario taau = new TelaAlterarAcessoUsuario();
            taau.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null,"Você não pode acessar essa funcionalidade!");
        }        
    }//GEN-LAST:event_alterarAcessoUsuarioButtonActionPerformed

    private void gerenciarCidadaosTogglePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarCidadaosTogglePanelMouseEntered
        // TODO add your handling code here:
        gerenciarCidadaosTogglePanel.setBackground(new Color(25, 110, 247));
    }//GEN-LAST:event_gerenciarCidadaosTogglePanelMouseEntered

    private void gerenciarCidadaosTogglePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarCidadaosTogglePanelMouseExited
        // TODO add your handling code here:
        if (!gerenciarCidadaosPanel.isVisible()) {
            gerenciarCidadaosTogglePanel.setBackground(sideMenuPanel.getBackground());
        }
    }//GEN-LAST:event_gerenciarCidadaosTogglePanelMouseExited

    private void gerenciarCidadaosTogglePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarCidadaosTogglePanelMouseReleased
        // TODO add your handling code here:
        if (gerenciarCidadaosPanel.isVisible()) {
            gerenciarCidadaosPanel.setVisible(false);
        }
        else {
            deixaTodosOsPanelsInvisiveis();
            deixaTodosOsTogglesDoMenuNaCorPadrao();           
            gerenciarCidadaosPanel.setVisible(true);
            gerenciarCidadaosTogglePanel.setBackground(new Color(25, 110, 247));
        }        
    }//GEN-LAST:event_gerenciarCidadaosTogglePanelMouseReleased

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void novoDescarteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoDescarteButtonActionPerformed
        // TODO add your handling code here:
        TelaNovoDescarte tnd = new TelaNovoDescarte();
        tnd.setVisible(true);
    }//GEN-LAST:event_novoDescarteButtonActionPerformed

    private void atualizarTabelaDescartesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarTabelaDescartesButtonActionPerformed
        // TODO add your handling code here:
        atualizarTabelaDescartes();
    }//GEN-LAST:event_atualizarTabelaDescartesButtonActionPerformed

    private void pesquisarDescarteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarDescarteButtonActionPerformed
        // TODO add your handling code here:
        TelaPesquisarDescarte tpd = new TelaPesquisarDescarte();
        tpd.setVisible(true);
    }//GEN-LAST:event_pesquisarDescarteButtonActionPerformed

    private void atualizarTabelaMateriaisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarTabelaMateriaisButtonActionPerformed
        // TODO add your handling code here:
        atualizarTabelaMateriais();
    }//GEN-LAST:event_atualizarTabelaMateriaisButtonActionPerformed

    private void novoMaterialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoMaterialButtonActionPerformed
        // TODO add your handling code here:
        if (usuarioLogado.getPerfilAcesso().name().equals("admin")) {
            TelaNovoMaterial tnm = new TelaNovoMaterial();
            tnm.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null,"Você não pode acessar essa funcionalidade!");
        }        
    }//GEN-LAST:event_novoMaterialButtonActionPerformed

    private void pesquisarMaterialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarMaterialButtonActionPerformed
        // TODO add your handling code here:
        TelaPesquisarMaterial tpm = new TelaPesquisarMaterial();
        tpm.setVisible(true);        
    }//GEN-LAST:event_pesquisarMaterialButtonActionPerformed

    private void editarMaterialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarMaterialButtonActionPerformed
        // TODO add your handling code here:
        if (usuarioLogado.getPerfilAcesso().name().equals("admin")) {
            TelaEditarMaterial tem = new TelaEditarMaterial();
            tem.setVisible(true);
        } 
        else {
            JOptionPane.showMessageDialog(null,"Você não pode acessar essa funcionalidade!");
        }        
    }//GEN-LAST:event_editarMaterialButtonActionPerformed

    private void excluirMaterialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirMaterialButtonActionPerformed
        // TODO add your handling code here:
        if (usuarioLogado.getPerfilAcesso().name().equals("admin")) {
            TelaExcluirMaterial tem = new TelaExcluirMaterial();
            tem.setVisible(true);
        }  
        else {
            JOptionPane.showMessageDialog(null,"Você não pode acessar essa funcionalidade!");
        }        
    }//GEN-LAST:event_excluirMaterialButtonActionPerformed

    private void excluirCidadãoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirCidadãoButtonActionPerformed
        // TODO add your handling code here:
        if (usuarioLogado.getPerfilAcesso().name() == "admin") {
            TelaExcluirCidadao tec = new TelaExcluirCidadao();
            tec.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null,"Você não pode acessar essa funcionalidade!");
        }
    }//GEN-LAST:event_excluirCidadãoButtonActionPerformed

    private void cadastrarCidadaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarCidadaoButtonActionPerformed
        // TODO add your handling code here:
        TelaNovoCidadao tnc = new TelaNovoCidadao();
        tnc.setVisible(true);
    }//GEN-LAST:event_cadastrarCidadaoButtonActionPerformed

    private void pesquisarCidadaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarCidadaoButtonActionPerformed
        // TODO add your handling code here:
        TelaPesquisarCidadao tpc = new TelaPesquisarCidadao();
        tpc.setVisible(true);
    }//GEN-LAST:event_pesquisarCidadaoButtonActionPerformed

    private void editarCidadaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCidadaoButtonActionPerformed
        // TODO add your handling code here:
        TelaAtualizarCidadao tac = new TelaAtualizarCidadao();
        tac.setVisible(true);
    }//GEN-LAST:event_editarCidadaoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarAcessoUsuarioButton;
    private javax.swing.JButton ativarOuDesativarUsuarioButton;
    private javax.swing.JButton atualizarTabelaDescartesButton;
    private javax.swing.JButton atualizarTabelaMateriaisButton;
    private javax.swing.JButton atualizarTabelaUsuariosButton;
    private javax.swing.JButton cadastrarCidadaoButton;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel dashboardToggleLabel;
    private javax.swing.JPanel dashboardTogglePanel;
    private javax.swing.JTable descartesTable;
    private javax.swing.JButton editarCidadaoButton;
    private javax.swing.JButton editarMaterialButton;
    private javax.swing.JButton editarMeusDadosDeLoginButton;
    private javax.swing.JButton editarMeusDadosPessoaisButton;
    private javax.swing.JButton excluirCidadãoButton;
    private javax.swing.JButton excluirMaterialButton;
    private javax.swing.JButton excluirUsuarioButton;
    private javax.swing.JPanel gerenciarCidadaosPanel;
    private javax.swing.JLabel gerenciarCidadaosToggleLabel;
    private javax.swing.JPanel gerenciarCidadaosTogglePanel;
    private javax.swing.JPanel gerenciarDescartesPanel;
    private javax.swing.JLabel gerenciarDescartesToggleLabel;
    private javax.swing.JPanel gerenciarDescartesTogglePanel;
    private javax.swing.JPanel gerenciarMateriaisPanel;
    private javax.swing.JLabel gerenciarMateriaisToggleLabel;
    private javax.swing.JPanel gerenciarMateriaisTogglePanel;
    private javax.swing.JPanel gerenciarUsuariosPanel;
    private javax.swing.JLabel gerenciarUsuariosToggleLabel;
    private javax.swing.JPanel gerenciarUsuariosTogglePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable materiaisTable;
    private javax.swing.JPanel minhaContaPanel;
    private javax.swing.JLabel minhaContaToggleLabel;
    private javax.swing.JPanel minhaContaTogglePanel;
    private javax.swing.JButton novoDescarteButton;
    private javax.swing.JButton novoMaterialButton;
    private javax.swing.JButton pesquisarCidadaoButton;
    private javax.swing.JButton pesquisarDescarteButton;
    private javax.swing.JButton pesquisarMaterialButton;
    private javax.swing.JButton pesquisarUsuarioButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JPanel sideMenuPanel;
    private javax.swing.JTable usuariosTable;
    // End of variables declaration//GEN-END:variables
}

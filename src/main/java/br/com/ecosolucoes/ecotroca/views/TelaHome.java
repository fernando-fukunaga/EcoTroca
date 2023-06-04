/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ecosolucoes.ecotroca.views;

import java.awt.Color;
import javax.swing.JPanel;

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
        mainPanel = new javax.swing.JPanel();
        dashboardPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        gerenciarDescartesPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        gerenciarUsuariosPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        gerenciarMateriaisPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        minhaContaPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1018, 593));
        setMinimumSize(new java.awt.Dimension(1018, 593));
        setResizable(false);

        logoPanel.setMaximumSize(new java.awt.Dimension(162, 162));
        logoPanel.setMinimumSize(new java.awt.Dimension(162, 162));
        logoPanel.setPreferredSize(new java.awt.Dimension(162, 162));

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

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
                .addComponent(minhaContaToggleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );
        minhaContaTogglePanelLayout.setVerticalGroup(
            minhaContaTogglePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minhaContaTogglePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minhaContaToggleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
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
                    .addComponent(minhaContaTogglePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(minhaContaTogglePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        mainPanel.setMaximumSize(new java.awt.Dimension(850, 593));
        mainPanel.setMinimumSize(new java.awt.Dimension(850, 593));
        mainPanel.setPreferredSize(new java.awt.Dimension(850, 593));

        dashboardPanel.setMaximumSize(new java.awt.Dimension(850, 593));
        dashboardPanel.setMinimumSize(new java.awt.Dimension(850, 593));

        jLabel1.setText("dashboard");

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        gerenciarDescartesPanel.setMaximumSize(new java.awt.Dimension(850, 593));
        gerenciarDescartesPanel.setMinimumSize(new java.awt.Dimension(850, 593));

        jLabel2.setText("descartes");

        javax.swing.GroupLayout gerenciarDescartesPanelLayout = new javax.swing.GroupLayout(gerenciarDescartesPanel);
        gerenciarDescartesPanel.setLayout(gerenciarDescartesPanelLayout);
        gerenciarDescartesPanelLayout.setHorizontalGroup(
            gerenciarDescartesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarDescartesPanelLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        gerenciarDescartesPanelLayout.setVerticalGroup(
            gerenciarDescartesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarDescartesPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        gerenciarUsuariosPanel.setMaximumSize(new java.awt.Dimension(850, 593));
        gerenciarUsuariosPanel.setMinimumSize(new java.awt.Dimension(850, 593));

        jLabel3.setText("usuarios");

        javax.swing.GroupLayout gerenciarUsuariosPanelLayout = new javax.swing.GroupLayout(gerenciarUsuariosPanel);
        gerenciarUsuariosPanel.setLayout(gerenciarUsuariosPanelLayout);
        gerenciarUsuariosPanelLayout.setHorizontalGroup(
            gerenciarUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarUsuariosPanelLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        gerenciarUsuariosPanelLayout.setVerticalGroup(
            gerenciarUsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarUsuariosPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        gerenciarMateriaisPanel.setMaximumSize(new java.awt.Dimension(850, 593));
        gerenciarMateriaisPanel.setMinimumSize(new java.awt.Dimension(850, 593));

        jLabel4.setText("materiais");

        javax.swing.GroupLayout gerenciarMateriaisPanelLayout = new javax.swing.GroupLayout(gerenciarMateriaisPanel);
        gerenciarMateriaisPanel.setLayout(gerenciarMateriaisPanelLayout);
        gerenciarMateriaisPanelLayout.setHorizontalGroup(
            gerenciarMateriaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarMateriaisPanelLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        gerenciarMateriaisPanelLayout.setVerticalGroup(
            gerenciarMateriaisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gerenciarMateriaisPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        minhaContaPanel.setMaximumSize(new java.awt.Dimension(850, 593));
        minhaContaPanel.setMinimumSize(new java.awt.Dimension(850, 593));

        jLabel5.setText("minha conta");

        javax.swing.GroupLayout minhaContaPanelLayout = new javax.swing.GroupLayout(minhaContaPanel);
        minhaContaPanel.setLayout(minhaContaPanelLayout);
        minhaContaPanelLayout.setHorizontalGroup(
            minhaContaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minhaContaPanelLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        minhaContaPanelLayout.setVerticalGroup(
            minhaContaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minhaContaPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
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
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(gerenciarDescartesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(gerenciarUsuariosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(gerenciarMateriaisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(minhaContaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
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
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(gerenciarDescartesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(gerenciarUsuariosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(gerenciarMateriaisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(minhaContaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
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
        dashboardTogglePanel.setBackground(sideMenuPanel.getBackground());
    }//GEN-LAST:event_dashboardTogglePanelMouseExited

    private void dashboardTogglePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardTogglePanelMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_dashboardTogglePanelMouseReleased

    private void gerenciarDescartesTogglePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarDescartesTogglePanelMouseEntered
        // TODO add your handling code here:
        gerenciarDescartesTogglePanel.setBackground(new Color(25, 110, 247));
    }//GEN-LAST:event_gerenciarDescartesTogglePanelMouseEntered

    private void gerenciarDescartesTogglePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarDescartesTogglePanelMouseExited
        // TODO add your handling code here:
        gerenciarDescartesTogglePanel.setBackground(sideMenuPanel.getBackground());         
    }//GEN-LAST:event_gerenciarDescartesTogglePanelMouseExited

    private void gerenciarDescartesTogglePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarDescartesTogglePanelMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_gerenciarDescartesTogglePanelMouseReleased

    private void gerenciarUsuariosTogglePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarUsuariosTogglePanelMouseEntered
        // TODO add your handling code here:
        gerenciarUsuariosTogglePanel.setBackground(new Color(25, 110, 247));
    }//GEN-LAST:event_gerenciarUsuariosTogglePanelMouseEntered

    private void gerenciarUsuariosTogglePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarUsuariosTogglePanelMouseExited
        // TODO add your handling code here:
        gerenciarUsuariosTogglePanel.setBackground(sideMenuPanel.getBackground());
    }//GEN-LAST:event_gerenciarUsuariosTogglePanelMouseExited

    private void gerenciarUsuariosTogglePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarUsuariosTogglePanelMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_gerenciarUsuariosTogglePanelMouseReleased

    private void gerenciarMateriaisTogglePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarMateriaisTogglePanelMouseEntered
        // TODO add your handling code here:
        gerenciarMateriaisTogglePanel.setBackground(new Color(25, 110, 247));
    }//GEN-LAST:event_gerenciarMateriaisTogglePanelMouseEntered

    private void gerenciarMateriaisTogglePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarMateriaisTogglePanelMouseExited
        // TODO add your handling code here:
        gerenciarMateriaisTogglePanel.setBackground(sideMenuPanel.getBackground());
    }//GEN-LAST:event_gerenciarMateriaisTogglePanelMouseExited

    private void gerenciarMateriaisTogglePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciarMateriaisTogglePanelMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_gerenciarMateriaisTogglePanelMouseReleased

    private void minhaContaTogglePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minhaContaTogglePanelMouseEntered
        // TODO add your handling code here:
        minhaContaTogglePanel.setBackground(new Color(25, 110, 247));
    }//GEN-LAST:event_minhaContaTogglePanelMouseEntered

    private void minhaContaTogglePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minhaContaTogglePanelMouseExited
        // TODO add your handling code here:
        minhaContaTogglePanel.setBackground(sideMenuPanel.getBackground());
    }//GEN-LAST:event_minhaContaTogglePanelMouseExited

    private void minhaContaTogglePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minhaContaTogglePanelMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_minhaContaTogglePanelMouseReleased

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
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel dashboardToggleLabel;
    private javax.swing.JPanel dashboardTogglePanel;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel minhaContaPanel;
    private javax.swing.JLabel minhaContaToggleLabel;
    private javax.swing.JPanel minhaContaTogglePanel;
    private javax.swing.JPanel sideMenuPanel;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import model.Login;
import dao.JogadorDAO;
import java.awt.Toolkit;
import javax.swing.UIManager;

/**
 *
 * @author Luiz
 */
public class TelaSelecaoHeroisGUI extends javax.swing.JFrame {

    public String usuario;
    public String apelido;
    public int idJogador;
    private String nomeHeroi;

    /**
     * Creates new form TelaSelecaoHerois
     */
    public TelaSelecaoHeroisGUI() {
        initComponents();
        
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoHerois = new javax.swing.ButtonGroup();
        painelHerois = new javax.swing.JPanel();
        botaoAprendiz = new javax.swing.JToggleButton();
        botaoCiborg = new javax.swing.JToggleButton();
        botaoAndroid = new javax.swing.JToggleButton();
        botaoPyro = new javax.swing.JToggleButton();
        botaoViking = new javax.swing.JToggleButton();
        painelTexto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextoHeroi = new javax.swing.JTextArea();
        painelBotoes = new javax.swing.JPanel();
        botaoCancelar = new javax.swing.JButton();
        botaoAceitar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BROKEN WORDS BATTLE");
        setResizable(false);

        painelHerois.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecao de Herois", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N

        botaoAprendiz.setBackground(new java.awt.Color(153, 0, 255));
        grupoHerois.add(botaoAprendiz);
        botaoAprendiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemAprendiz.png"))); // NOI18N
        botaoAprendiz.setFocusPainted(false);
        botaoAprendiz.setFocusable(false);
        botaoAprendiz.setOpaque(true);
        botaoAprendiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAprendizActionPerformed(evt);
            }
        });

        botaoCiborg.setBackground(new java.awt.Color(0, 0, 0));
        grupoHerois.add(botaoCiborg);
        botaoCiborg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemCiborgMenor.png"))); // NOI18N
        botaoCiborg.setEnabled(false);
        botaoCiborg.setFocusPainted(false);
        botaoCiborg.setFocusable(false);
        botaoCiborg.setOpaque(true);
        botaoCiborg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCiborgActionPerformed(evt);
            }
        });

        botaoAndroid.setBackground(new java.awt.Color(153, 153, 255));
        grupoHerois.add(botaoAndroid);
        botaoAndroid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemAndroidMenor.png"))); // NOI18N
        botaoAndroid.setEnabled(false);
        botaoAndroid.setFocusPainted(false);
        botaoAndroid.setFocusable(false);
        botaoAndroid.setOpaque(true);
        botaoAndroid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAndroidActionPerformed(evt);
            }
        });

        botaoPyro.setBackground(new java.awt.Color(204, 0, 0));
        grupoHerois.add(botaoPyro);
        botaoPyro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemPyroMenor.png"))); // NOI18N
        botaoPyro.setEnabled(false);
        botaoPyro.setFocusPainted(false);
        botaoPyro.setFocusable(false);
        botaoPyro.setOpaque(true);
        botaoPyro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPyroActionPerformed(evt);
            }
        });

        botaoViking.setBackground(new java.awt.Color(0, 153, 51));
        grupoHerois.add(botaoViking);
        botaoViking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemVikingMenor.png"))); // NOI18N
        botaoViking.setEnabled(false);
        botaoViking.setFocusPainted(false);
        botaoViking.setFocusable(false);
        botaoViking.setOpaque(true);
        botaoViking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVikingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelHeroisLayout = new javax.swing.GroupLayout(painelHerois);
        painelHerois.setLayout(painelHeroisLayout);
        painelHeroisLayout.setHorizontalGroup(
            painelHeroisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHeroisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoAprendiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoCiborg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAndroid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPyro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoViking)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelHeroisLayout.setVerticalGroup(
            painelHeroisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHeroisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelHeroisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoViking)
                    .addComponent(botaoPyro)
                    .addComponent(botaoAndroid)
                    .addComponent(botaoCiborg)
                    .addComponent(botaoAprendiz))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        areaTextoHeroi.setEditable(false);
        areaTextoHeroi.setBackground(new java.awt.Color(240, 240, 240));
        areaTextoHeroi.setColumns(20);
        areaTextoHeroi.setFont(new java.awt.Font("Maiandra GD", 1, 10)); // NOI18N
        areaTextoHeroi.setLineWrap(true);
        areaTextoHeroi.setRows(3);
        areaTextoHeroi.setWrapStyleWord(true);
        jScrollPane1.setViewportView(areaTextoHeroi);

        javax.swing.GroupLayout painelTextoLayout = new javax.swing.GroupLayout(painelTexto);
        painelTexto.setLayout(painelTextoLayout);
        painelTextoLayout.setHorizontalGroup(
            painelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        painelTextoLayout.setVerticalGroup(
            painelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        botaoCancelar.setBackground(new java.awt.Color(102, 0, 0));
        botaoCancelar.setFont(new java.awt.Font("Maiandra GD", 1, 10)); // NOI18N
        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemCancelar.png"))); // NOI18N
        botaoCancelar.setText("CANCELAR");
        botaoCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoAceitar.setBackground(new java.awt.Color(0, 153, 0));
        botaoAceitar.setFont(new java.awt.Font("Maiandra GD", 1, 10)); // NOI18N
        botaoAceitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemAceitar.png"))); // NOI18N
        botaoAceitar.setText("ACEITAR");
        botaoAceitar.setEnabled(false);
        botaoAceitar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAceitar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoAceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAceitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(botaoAceitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(painelTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelHerois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelHerois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/iconeJogo.png")));
    }
    
    private void botaoAceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAceitarActionPerformed
        Login login = new Login(apelido, usuario, "");

        JogadorDAO jogadorDao = new JogadorDAO();

        jogadorDao.atualizaHeroi(nomeHeroi, idJogador);

        TelaInformacoesGUI telaInformacoes = new TelaInformacoesGUI();

        telaInformacoes.populaTela(login);

        telaInformacoes.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_botaoAceitarActionPerformed

    private void botaoAprendizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAprendizActionPerformed
        nomeHeroi = "APRENDIZ";
        botaoAceitar.setEnabled(true);

        areaTextoHeroi.setText("Descrição: Aprendiz de herói!!" + "\n\n"
                + "Habilidade: Não desenvolveu habilidades.");
    }//GEN-LAST:event_botaoAprendizActionPerformed

    private void botaoCiborgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCiborgActionPerformed
        nomeHeroi = "CIBORG";
        botaoAceitar.setEnabled(true);

        areaTextoHeroi.setText("Descrição: Seu visor interfere os eletrônicos!!\n\n"
                + "Habilidade: Dobra a pontuação atual.");
    }//GEN-LAST:event_botaoCiborgActionPerformed

    private void botaoAndroidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAndroidActionPerformed
        nomeHeroi = "ANDROID";
        botaoAceitar.setEnabled(true);

        areaTextoHeroi.setText("Descrição: Ajuda os necessitados!!\n\n"
                + "Habilidade: Cura toda a vida do jogador.");
    }//GEN-LAST:event_botaoAndroidActionPerformed

    private void botaoPyroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPyroActionPerformed
        nomeHeroi = "PYRO";
        botaoAceitar.setEnabled(true);

        areaTextoHeroi.setText("Descrição: Cuidado para não queimar!!\n"
                + "Habilidade: Pule o nível e ganhe pontuação bônus.");
    }//GEN-LAST:event_botaoPyroActionPerformed

    private void botaoVikingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVikingActionPerformed
        nomeHeroi = "VIKING";
        botaoAceitar.setEnabled(true);

        areaTextoHeroi.setText("Descrição: Consegue manipular o tempo!!\n"
                + "Habilidade: Dobra o tempo de jogo atual.");
    }//GEN-LAST:event_botaoVikingActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        Login login = new Login(apelido, usuario, "");

        TelaInformacoesGUI telaInformacoes = new TelaInformacoesGUI();

        telaInformacoes.populaTela(login);

        telaInformacoes.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaSelecaoHeroisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSelecaoHeroisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSelecaoHeroisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSelecaoHeroisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSelecaoHeroisGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextoHeroi;
    private javax.swing.JButton botaoAceitar;
    public javax.swing.JToggleButton botaoAndroid;
    public javax.swing.JToggleButton botaoAprendiz;
    private javax.swing.JButton botaoCancelar;
    public javax.swing.JToggleButton botaoCiborg;
    public javax.swing.JToggleButton botaoPyro;
    public javax.swing.JToggleButton botaoViking;
    private javax.swing.ButtonGroup grupoHerois;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelHerois;
    private javax.swing.JPanel painelTexto;
    // End of variables declaration//GEN-END:variables
}
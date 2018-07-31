/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import model.Heroi;
import model.Login;
import model.Rank;
import dao.RankDAO;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.UIManager;

/**
 *
 * @author carvalui
 */
public class TelaRankGUI extends javax.swing.JFrame {

    private Timer timer;
    private TimerTask task;

    private int tempo;
    
    public String apelido;
    public String usuario;

    /**
     * Creates new form TelaRank
     */
    public TelaRankGUI() {
        initComponents();

        populaRank();
        
        tempoTela();
        
        iniciarTempo();

        setIcon();
    }

    private void tempoTela() {
        tempo = 20;

        timer = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                textoSegundos.setText("Retornando para o perfil do jogador em " + tempo + " segundos, ou clique aqui para retornar");

                if (tempo == 0) {
                    fecharTela();
                    pararTempo();
                }

                tempo--;
            }
        };
    }

    private void iniciarTempo() {
        timer.schedule(task, 0, 1000);
    }

    private void pararTempo() {
        timer.cancel();
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/iconeJogo.png")));
    }

    private void fecharTela() {
        Login login = new Login(apelido, usuario, "");

        TelaInformacoesGUI telaInformacoes = new TelaInformacoesGUI();

        telaInformacoes.populaTela(login);

        telaInformacoes.setVisible(true);

        this.dispose();
    }

    public void populaRank() {
        RankDAO rankDao = new RankDAO();

        LinkedList<Rank> lista = rankDao.pesquisaRank();

        Rank rank;
        Heroi heroi;

        rank = lista.poll();

        heroi = new Heroi(rank.getHeroi());
        heroi.defineHeroi();

        imagemPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource(heroi.getImagemHeroi())));
        campoApelidoPrimeiro.setText(rank.getApelido());
        campoUsuarioPrimeiro.setText(rank.getUsuario());
        textoPontuacaoPrimeiro.setText(Integer.toString(rank.getPontuacao()));

        rank = lista.poll();

        heroi = new Heroi(rank.getHeroi());
        heroi.defineHeroi();

        imagemSegundo.setIcon(new javax.swing.ImageIcon(getClass().getResource(heroi.getImagemHeroi())));
        campoApelidoSegundo.setText(rank.getApelido());
        campoUsuarioSegundo.setText(rank.getUsuario());
        textoPontuacaoSegundo.setText(Integer.toString(rank.getPontuacao()));

        rank = lista.poll();

        heroi = new Heroi(rank.getHeroi());
        heroi.defineHeroi();

        imagemTerceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource(heroi.getImagemHeroi())));
        campoApelidoTerceiro.setText(rank.getApelido());
        campoUsuarioTerceiro.setText(rank.getUsuario());
        textoPontuacaoTerceiro.setText(Integer.toString(rank.getPontuacao()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelPrimeiro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        imagemPrimeiro = new javax.swing.JLabel();
        textoPontuacaoPrimeiro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoApelidoPrimeiro = new javax.swing.JTextField();
        campoUsuarioPrimeiro = new javax.swing.JTextField();
        painelSegundo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        imagemSegundo = new javax.swing.JLabel();
        textoPontuacaoSegundo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        campoApelidoSegundo = new javax.swing.JTextField();
        campoUsuarioSegundo = new javax.swing.JTextField();
        painelTerceiro = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        imagemTerceiro = new javax.swing.JLabel();
        textoPontuacaoTerceiro = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        campoApelidoTerceiro = new javax.swing.JTextField();
        campoUsuarioTerceiro = new javax.swing.JTextField();
        textoSegundos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BROKEN WORDS BATTLE");
        setResizable(false);

        painelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Top 3 Jogadores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N

        painelPrimeiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "1ª Colocado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemPrimeiroLugar.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 50));

        imagemPrimeiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemAprendiz.png"))); // NOI18N
        imagemPrimeiro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        textoPontuacaoPrimeiro.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        textoPontuacaoPrimeiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPontuacaoPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemPontuacao.png"))); // NOI18N
        textoPontuacaoPrimeiro.setText("0");
        textoPontuacaoPrimeiro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Pontuação:");

        campoApelidoPrimeiro.setEditable(false);
        campoApelidoPrimeiro.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        campoApelidoPrimeiro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoApelidoPrimeiro.setText("Apelido");

        campoUsuarioPrimeiro.setEditable(false);
        campoUsuarioPrimeiro.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        campoUsuarioPrimeiro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoUsuarioPrimeiro.setText("Usuario");

        javax.swing.GroupLayout painelPrimeiroLayout = new javax.swing.GroupLayout(painelPrimeiro);
        painelPrimeiro.setLayout(painelPrimeiroLayout);
        painelPrimeiroLayout.setHorizontalGroup(
            painelPrimeiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrimeiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imagemPrimeiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrimeiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoApelidoPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoUsuarioPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPrimeiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoPontuacaoPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrimeiroLayout.setVerticalGroup(
            painelPrimeiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrimeiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrimeiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagemPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPrimeiroLayout.createSequentialGroup()
                        .addGroup(painelPrimeiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoApelidoPrimeiro)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPrimeiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoPontuacaoPrimeiro)
                            .addComponent(campoUsuarioPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        painelSegundo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "2ª Colocado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(153, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemSegundoLugar.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel7.setPreferredSize(new java.awt.Dimension(50, 50));

        imagemSegundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemSegundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemAprendiz.png"))); // NOI18N
        imagemSegundo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        textoPontuacaoSegundo.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        textoPontuacaoSegundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPontuacaoSegundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemPontuacao.png"))); // NOI18N
        textoPontuacaoSegundo.setText("0");
        textoPontuacaoSegundo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel12.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Pontuação:");

        campoApelidoSegundo.setEditable(false);
        campoApelidoSegundo.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        campoApelidoSegundo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoApelidoSegundo.setText("Apelido");

        campoUsuarioSegundo.setEditable(false);
        campoUsuarioSegundo.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        campoUsuarioSegundo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoUsuarioSegundo.setText("Usuario");

        javax.swing.GroupLayout painelSegundoLayout = new javax.swing.GroupLayout(painelSegundo);
        painelSegundo.setLayout(painelSegundoLayout);
        painelSegundoLayout.setHorizontalGroup(
            painelSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSegundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imagemSegundo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoApelidoSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoUsuarioSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoPontuacaoSegundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        painelSegundoLayout.setVerticalGroup(
            painelSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSegundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagemSegundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSegundoLayout.createSequentialGroup()
                        .addGroup(painelSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoApelidoSegundo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoPontuacaoSegundo)
                            .addComponent(campoUsuarioSegundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTerceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "3ª Colocado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 12))); // NOI18N

        jLabel13.setBackground(new java.awt.Color(102, 51, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemTerceiroLugar.png"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel13.setPreferredSize(new java.awt.Dimension(50, 50));

        imagemTerceiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemTerceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemAprendiz.png"))); // NOI18N
        imagemTerceiro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        textoPontuacaoTerceiro.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        textoPontuacaoTerceiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPontuacaoTerceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemPontuacao.png"))); // NOI18N
        textoPontuacaoTerceiro.setText("0");
        textoPontuacaoTerceiro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel18.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Pontuação:");

        campoApelidoTerceiro.setEditable(false);
        campoApelidoTerceiro.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        campoApelidoTerceiro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoApelidoTerceiro.setText("Apelido");

        campoUsuarioTerceiro.setEditable(false);
        campoUsuarioTerceiro.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        campoUsuarioTerceiro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoUsuarioTerceiro.setText("Usuario");

        javax.swing.GroupLayout painelTerceiroLayout = new javax.swing.GroupLayout(painelTerceiro);
        painelTerceiro.setLayout(painelTerceiroLayout);
        painelTerceiroLayout.setHorizontalGroup(
            painelTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTerceiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(imagemTerceiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoApelidoTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoUsuarioTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoPontuacaoTerceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        painelTerceiroLayout.setVerticalGroup(
            painelTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTerceiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagemTerceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTerceiroLayout.createSequentialGroup()
                        .addGroup(painelTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoApelidoTerceiro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoPontuacaoTerceiro)
                            .addComponent(campoUsuarioTerceiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelSegundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTerceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        textoSegundos.setFont(new java.awt.Font("Maiandra GD", 1, 10)); // NOI18N
        textoSegundos.setForeground(new java.awt.Color(0, 153, 153));
        textoSegundos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoSegundos.setText("Texto");
        textoSegundos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoSegundosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textoSegundos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoSegundos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textoSegundosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoSegundosMouseClicked
        fecharTela();
    }//GEN-LAST:event_textoSegundosMouseClicked

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
            java.util.logging.Logger.getLogger(TelaRankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRankGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRankGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoApelidoPrimeiro;
    private javax.swing.JTextField campoApelidoSegundo;
    private javax.swing.JTextField campoApelidoTerceiro;
    private javax.swing.JTextField campoUsuarioPrimeiro;
    private javax.swing.JTextField campoUsuarioSegundo;
    private javax.swing.JTextField campoUsuarioTerceiro;
    private javax.swing.JLabel imagemPrimeiro;
    private javax.swing.JLabel imagemSegundo;
    private javax.swing.JLabel imagemTerceiro;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel painelPrimeiro;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelSegundo;
    private javax.swing.JPanel painelTerceiro;
    private javax.swing.JLabel textoPontuacaoPrimeiro;
    private javax.swing.JLabel textoPontuacaoSegundo;
    private javax.swing.JLabel textoPontuacaoTerceiro;
    private javax.swing.JLabel textoSegundos;
    // End of variables declaration//GEN-END:variables
}
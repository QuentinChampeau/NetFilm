/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netfilm;

/**
 *
 * @author Mathieu
 */
public class PanelHeader extends javax.swing.JPanel {

    private NetFilm netFilm;
    
    /**
     * Creates new form PanelHeader
     */
    public PanelHeader() {
        initComponents();
    }
    
    public void init(NetFilm n) {
        this.netFilm = n;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textRechercherFilm = new javax.swing.JTextField();
        jBRechercher = new javax.swing.JButton();
        jRCinema = new javax.swing.JRadioButton();
        jRFilm = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        textRechercherFilm.setEditable(false);
        textRechercherFilm.setToolTipText("Rechercher un film, un cinéma...");
        textRechercherFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textRechercherFilmActionPerformed(evt);
            }
        });

        jBRechercher.setText("Rechercher");
        jBRechercher.setToolTipText("");
        jBRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRechercherActionPerformed(evt);
            }
        });

        jRCinema.setText("Cinéma");
        jRCinema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRCinemaActionPerformed(evt);
            }
        });

        jRFilm.setSelected(true);
        jRFilm.setText("Film");
        jRFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRFilmActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Choisissez, Réservez, Profitez");

        jLabel1.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NetFilm");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRFilm)
                        .addGap(36, 36, 36)
                        .addComponent(jRCinema)
                        .addGap(19, 19, 19))
                    .addComponent(textRechercherFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBRechercher)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textRechercherFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRechercher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRCinema)
                    .addComponent(jRFilm))
                .addGap(0, 13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textRechercherFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textRechercherFilmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textRechercherFilmActionPerformed

    private void jBRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRechercherActionPerformed
        switch (netFilm.getEtatType()) {
            case CINEMA:
                netFilm.afficherRechercheCinema();
                break;
            case FILM:
                netFilm.afficherRechercheFilm();
                break;
        }
    }//GEN-LAST:event_jBRechercherActionPerformed

    private void jRFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRFilmActionPerformed
        netFilm.setEtatTypeFilm();
        jRCinema.setSelected(false);
        jRFilm.setSelected(true);
    }//GEN-LAST:event_jRFilmActionPerformed

    private void jRCinemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRCinemaActionPerformed
        netFilm.setEtatTypeCinema();
        jRCinema.setSelected(true);
        jRFilm.setSelected(false);
    }//GEN-LAST:event_jRCinemaActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        netFilm.afficherAccueil();
    }//GEN-LAST:event_jLabel1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRechercher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRCinema;
    private javax.swing.JRadioButton jRFilm;
    private javax.swing.JTextField textRechercherFilm;
    // End of variables declaration//GEN-END:variables
}

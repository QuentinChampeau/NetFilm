/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netfilm;

/**
 *
 * @author Champeau
 */
public class NetFilm extends javax.swing.JFrame {

    /**
     * Creates new form NetFilm
     */
    public NetFilm() {
        initComponents();
        initDependencies();

        et = EtatType.FILM;
        disconnect();

        afficherAccueil();
    }

    public void setEtatTypeFilm() {
        et = EtatType.FILM;
    }

    public void setEtatTypeCinema() {
        et = EtatType.CINEMA;
    }

    public EtatType getEtatType() {
        return (et);
    }

    public void initDependencies() {
        accueil1.init(this);
        jPanelConnecté1.init(this);
        jPanelDéconnecté1.init(this);
        pageCinéma1.init(this);
        detailFilm1.init(this);
        prochainesSorties1.init(this);
        rechercheCinéma1.init(this);
        rechercheFilm1.init(this);
        filmsALAffiche1.init(this);
        monCompteConnecté2.init(this);
        monCompteDéconnecté2.init(this);
        panelHeader1.init(this);
        reservation1.init(this);
    }

    public void connect() {
        this.ec = EtatConnexion.CONNECTE;
        jPanel3.removeAll();
        jPanel3.add(jPanelConnecté1);
        jPanel3.repaint();
        jPanel3.revalidate();

        if (ePage == EtatPage.COMPTE) {
            afficherMonCompte();
        } else if(ePage == EtatPage.FILM_2) {
            afficherPageFilm(2);
        }
    }

    public void disconnect() {
        this.ec = EtatConnexion.DECONNECT;
        jPanel3.removeAll();
        jPanel3.add(jPanelDéconnecté1);
        jPanel3.repaint();
        jPanel3.revalidate();

        if (ePage == EtatPage.COMPTE) {
            afficherMonCompte();
        } else if(ePage == EtatPage.FILM_2) {
            afficherPageFilm(2);
        }
    }

    public void afficherAccueil() {
        ePage = EtatPage.ACCUEIL;

        jPanel2.removeAll();
        jPanel2.add(accueil1);
        jPanel2.repaint();
        jPanel2.revalidate();

        jBAccueil.setEnabled(false);
        jBFAffiche.setEnabled(true);
        jBMCompte.setEnabled(true);
        jBPSortie.setEnabled(true);
    }

    public void afficherFilmAffiche() {
        ePage = EtatPage.FILMS_AFFICHE;

        jPanel2.removeAll();
        jPanel2.add(filmsALAffiche1);
        jPanel2.repaint();
        jPanel2.revalidate();

        jBAccueil.setEnabled(true);
        jBFAffiche.setEnabled(false);
        jBMCompte.setEnabled(true);
        jBPSortie.setEnabled(true);
    }

    public void afficherMonCompte() {
        ePage = EtatPage.COMPTE;

        jPanel2.removeAll();
        switch (ec) {
            case CONNECTE:
                jPanel2.add(monCompteConnecté2);
                break;
            case DECONNECT:
                jPanel2.add(monCompteDéconnecté2);
                break;
        }
        jPanel2.repaint();
        jPanel2.revalidate();

        jBAccueil.setEnabled(true);
        jBFAffiche.setEnabled(true);
        jBMCompte.setEnabled(false);
        jBPSortie.setEnabled(true);
    }

    public void afficherProchaineSortie() {
        ePage = EtatPage.PROCHAINES_SORTIES;

        jPanel2.removeAll();
        jPanel2.add(prochainesSorties1);
        jPanel2.repaint();
        jPanel2.revalidate();

        jBAccueil.setEnabled(true);
        jBFAffiche.setEnabled(true);
        jBMCompte.setEnabled(true);
        jBPSortie.setEnabled(false);
    }

    public void afficherRechercheCinema() {
        ePage = EtatPage.RECH_CINEMA;

        jPanel2.removeAll();
        jPanel2.add(rechercheCinéma1);
        jPanel2.repaint();
        jPanel2.revalidate();

        jBAccueil.setEnabled(true);
        jBFAffiche.setEnabled(true);
        jBMCompte.setEnabled(true);
        jBPSortie.setEnabled(true);
    }

    public void afficherRechercheFilm() {
        ePage = EtatPage.RECH_FILM;

        jPanel2.removeAll();
        jPanel2.add(rechercheFilm1);
        jPanel2.repaint();
        jPanel2.revalidate();

        jBAccueil.setEnabled(true);
        jBFAffiche.setEnabled(true);
        jBMCompte.setEnabled(true);
        jBPSortie.setEnabled(true);
    }

    public void afficherPageCinema() {
        ePage = EtatPage.CINEMA;

        jPanel2.removeAll();
        jPanel2.add(pageCinéma1);
        jPanel2.repaint();
        jPanel2.revalidate();

        jBAccueil.setEnabled(true);
        jBFAffiche.setEnabled(true);
        jBMCompte.setEnabled(true);
        jBPSortie.setEnabled(true);
    }

    public void afficherPageFilm(int tab) {
        switch (tab) {
            case 1:
                ePage = EtatPage.FILM_1;
                break;
            case 2:
                ePage = EtatPage.FILM_2;
                break;
            default:
                ePage = EtatPage.FILM_0;
                break;
        }

        detailFilm1.afficherTab(tab);

        jPanel2.removeAll();
        jPanel2.add(detailFilm1);
        jPanel2.repaint();
        jPanel2.revalidate();

        jBAccueil.setEnabled(true);
        jBFAffiche.setEnabled(true);
        jBMCompte.setEnabled(true);
        jBPSortie.setEnabled(true);
    }
    
    public void afficherReservation() {
        jPanel2.removeAll();
        jPanel2.add(reservation1);
        jPanel2.repaint();
        jPanel2.revalidate();
        
        jBAccueil.setEnabled(true);
        jBFAffiche.setEnabled(true);
        jBMCompte.setEnabled(true);
        jBPSortie.setEnabled(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBAccueil = new javax.swing.JButton();
        jBFAffiche = new javax.swing.JButton();
        jBPSortie = new javax.swing.JButton();
        jBMCompte = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        filmsALAffiche1 = new netfilm.FilmsALAffiche();
        rechercheFilm1 = new netfilm.RechercheFilm();
        rechercheCinéma1 = new netfilm.RechercheCinéma();
        prochainesSorties1 = new netfilm.ProchainesSorties();
        pageCinéma1 = new netfilm.PageCinéma();
        accueil1 = new netfilm.Accueil();
        monCompteConnecté2 = new netfilm.MonCompteConnecté();
        monCompteDéconnecté2 = new netfilm.MonCompteDéconnecté();
        detailFilm1 = new netfilm.DetailFilm();
        reservation1 = new netfilm.Reservation();
        jPanel3 = new javax.swing.JPanel();
        jPanelDéconnecté1 = new netfilm.JPanelDéconnecté();
        jPanelConnecté1 = new netfilm.JPanelConnecté();
        panelHeader1 = new netfilm.PanelHeader();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NetFilm");
        setMinimumSize(new java.awt.Dimension(740, 643));
        setResizable(false);

        jBAccueil.setText("Accueil");
        jBAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAccueilActionPerformed(evt);
            }
        });

        jBFAffiche.setText("Films à l'affiche");
        jBFAffiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFAfficheActionPerformed(evt);
            }
        });

        jBPSortie.setText("Prochaines sorties");
        jBPSortie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPSortieActionPerformed(evt);
            }
        });

        jBMCompte.setText("Mon compte");
        jBMCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMCompteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jBAccueil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBFAffiche)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPSortie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMCompte)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAccueil)
                    .addComponent(jBFAffiche)
                    .addComponent(jBPSortie)
                    .addComponent(jBMCompte))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setMinimumSize(new java.awt.Dimension(715, 398));
        jPanel2.setPreferredSize(new java.awt.Dimension(715, 398));
        jPanel2.setLayout(new java.awt.CardLayout());

        filmsALAffiche1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filmsALAffiche1KeyPressed(evt);
            }
        });
        jPanel2.add(filmsALAffiche1, "card2");
        jPanel2.add(rechercheFilm1, "card3");
        jPanel2.add(rechercheCinéma1, "card4");
        jPanel2.add(prochainesSorties1, "card5");
        jPanel2.add(pageCinéma1, "card7");
        jPanel2.add(accueil1, "card8");
        jPanel2.add(monCompteConnecté2, "card12");

        monCompteDéconnecté2.setMaximumSize(new java.awt.Dimension(715, 398));
        jPanel2.add(monCompteDéconnecté2, "card10");
        jPanel2.add(detailFilm1, "card11");
        jPanel2.add(reservation1, "card11");

        jPanel3.setLayout(new java.awt.CardLayout());
        jPanel3.add(jPanelDéconnecté1, "card2");
        jPanel3.add(jPanelConnecté1, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBMCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMCompteActionPerformed
        /**
         * Bouton mon compte cliqué.
         */
        afficherMonCompte();
    }//GEN-LAST:event_jBMCompteActionPerformed

    private void jBAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAccueilActionPerformed
        /**
         * Bouton Film à l'affiche cliqué.
         */
        afficherAccueil();
    }//GEN-LAST:event_jBAccueilActionPerformed

    private void jBFAfficheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFAfficheActionPerformed
        /**
         * Bouton Film à l'affiche cliqué.
         */
        afficherFilmAffiche();
    }//GEN-LAST:event_jBFAfficheActionPerformed

    private void jBPSortieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPSortieActionPerformed
        /**
         * Bouton des prochaines sorties cliqué.
         */
        afficherProchaineSortie();
    }//GEN-LAST:event_jBPSortieActionPerformed

    private void filmsALAffiche1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filmsALAffiche1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_filmsALAffiche1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private netfilm.Accueil accueil1;
    private netfilm.DetailFilm detailFilm1;
    private netfilm.FilmsALAffiche filmsALAffiche1;
    private javax.swing.JButton jBAccueil;
    private javax.swing.JButton jBFAffiche;
    private javax.swing.JButton jBMCompte;
    private javax.swing.JButton jBPSortie;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private netfilm.JPanelConnecté jPanelConnecté1;
    private netfilm.JPanelDéconnecté jPanelDéconnecté1;
    private netfilm.MonCompteConnecté monCompteConnecté2;
    private netfilm.MonCompteDéconnecté monCompteDéconnecté2;
    private netfilm.PageCinéma pageCinéma1;
    private netfilm.PanelHeader panelHeader1;
    private netfilm.ProchainesSorties prochainesSorties1;
    private netfilm.RechercheCinéma rechercheCinéma1;
    private netfilm.RechercheFilm rechercheFilm1;
    private netfilm.Reservation reservation1;
    // End of variables declaration//GEN-END:variables

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
            java.util.logging.Logger.getLogger(NetFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NetFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NetFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NetFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                /*JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(new Accueil());
                frame.pack();
                frame.setVisible(true);*/
                new NetFilm().setVisible(true);
            }
        });
    }
    private EtatConnexion ec;
    private EtatType et;
    private EtatPage ePage;

    public boolean isConnected() {
        return ec == EtatConnexion.CONNECTE;
    }

    void setEtatPage(EtatPage etatPage) {
        ePage = etatPage;
    }
}

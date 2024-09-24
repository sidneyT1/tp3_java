package sio.capdc.metier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tests {
    public static void main(String[] args) {

        ProduitPhytosanitaire produit1 = new ProduitPhytosanitaire("P1", "A");
        ProduitPhytosanitaire produit2 = new ProduitPhytosanitaire("P2", "B");


        Parcelle maParcelle = new Parcelle("P1", "H", "Blé", LocalDate.of(2024, 3, 1), LocalDate.of(2024, 8, 22), 5);


        TraitementSemence traitementSemence1 = new TraitementSemence("TS1", produit1, maParcelle, 1.0);
        TraitementSemence traitementSemence2 = new TraitementSemence("TS2", produit2, maParcelle, 0.5);
        maParcelle.AjouteUnTraitement(traitementSemence1);
        maParcelle.AjouteUnTraitement(traitementSemence2);


        TraitementEnChamp traitementEnChamp = new TraitementEnChamp("TC1", produit1, maParcelle);


        traitementEnChamp.getLesPulverisations().add(new Pulverisation("P1", 0.25, LocalDate.of(2024, 6, 1)));
        traitementEnChamp.getLesPulverisations().add(new Pulverisation("P2", 0.30, LocalDate.of(2024, 6, 15)));
        traitementEnChamp.getLesPulverisations().add(new Pulverisation("P3", 0.20, LocalDate.of(2024, 7, 1)));
        traitementEnChamp.getLesPulverisations().add(new Pulverisation("P4", 0.15, LocalDate.of(2024, 7, 15)));


        maParcelle.AjouteUnTraitement(traitementEnChamp);

        System.out.println("Liste  :");
        for (TraitementPhytosanitaire traitement : maParcelle.GetLesTraitementsPhytosanitaires()) {
            String typeTraitement = traitement instanceof TraitementSemence ? "Traitement Semence" : "Traitement en Champ";
            String produit = traitement.getLeProduitPhyto().getLibelle();
            double quantiteAppliquee = traitement.QuantiteAppliquee();

            System.out.println("Type : " + typeTraitement + ", Produit : " + produit + ", Quantité appliquée : " + quantiteAppliquee);
        }


        double tauxTraitementSemence = maParcelle.GetTauxTraitementSemence();
        System.out.println("Taux de traitement en semence : " + tauxTraitementSemence + "%");




    }
}

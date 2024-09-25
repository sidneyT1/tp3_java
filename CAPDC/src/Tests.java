import sio.capdc.metier.*;

import java.time.LocalDate;

public class Tests {
    public static void main(String[] args)
    {

        Parcelle parcelle = new Parcelle("P1", "Exploitant1", "Maïs", LocalDate.of(2022, 3, 15), LocalDate.of(2022, 9, 15), 10000);


        ProduitPhytosanitaire produit1 = new ProduitPhytosanitaire("P1", "Produit1");
        ProduitPhytosanitaire produit2 = new ProduitPhytosanitaire("P2", "Produit2");

        TraitementSemence traitementSemence1 = new TraitementSemence("TS1", produit1, parcelle, 0.1);
        TraitementSemence traitementSemence2 = new TraitementSemence("TS2", produit2, parcelle, 0.2);


        parcelle.AjouteUnTraitement(traitementSemence1);
        parcelle.AjouteUnTraitement(traitementSemence2);


        TraitementEnChamp traitementEnChamp = new TraitementEnChamp("TEC1", produit1, parcelle);


        Pulverisation pulverisation1 = new Pulverisation("P1", 5, LocalDate.of(2022, 4, 15));
        Pulverisation pulverisation2 = new Pulverisation("P2", 10, LocalDate.of(2022, 5, 15));
        Pulverisation pulverisation3 = new Pulverisation("P3", 15, LocalDate.of(2022, 6, 15));
        Pulverisation pulverisation4 = new Pulverisation("P4", 20, LocalDate.of(2022, 7, 15));


        traitementEnChamp.getLesPulverisations().add(pulverisation1);
        traitementEnChamp.getLesPulverisations().add(pulverisation2);
        traitementEnChamp.getLesPulverisations().add(pulverisation3);
        traitementEnChamp.getLesPulverisations().add(pulverisation4);


        parcelle.AjouteUnTraitement(traitementEnChamp);


        for (TraitementPhytosanitaire traitement : parcelle.GetLesTraitementsPhytosanitaires())
        {
            System.out.println("Type " + traitement.getClass().getSimpleName());
            System.out.println("Produit " + traitement.getLeProduitPhyto().getLibelle());
            System.out.println("Quantité appliquée "+ traitement.QuantiteAppliquee());
            System.out.println();
        }


        System.out.println("Taux traitement semence " + parcelle.GetTauxTraitementSemence() + "%");
    }
}
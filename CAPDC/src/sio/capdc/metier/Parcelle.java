package sio.capdc.metier;

import java.time.LocalDate;
import java.util.ArrayList;

public class Parcelle {
    // attributs privés
    private String id;
    private String nomExploitant;
    private String especeCultivee;
    private LocalDate dateSemis;
    private LocalDate dateRecoltePrevue;
    private double surface;
    private ArrayList<TraitementPhytosanitaire> lesTraitementsPhyto;

    // constructeur
    public Parcelle(String unId, String unExploitant, String uneEspece, LocalDate uneDateSemis, LocalDate uneDateRecolte, double uneSurface){
        this.id = unId;
        this.nomExploitant = unExploitant;
        this.especeCultivee = uneEspece;
        this.dateSemis = uneDateSemis;
        this.dateRecoltePrevue = uneDateRecolte;
        this.surface = uneSurface;
        this.lesTraitementsPhyto = new ArrayList<TraitementPhytosanitaire>();
    }
    // méthodes
    public double GetSurface()
    {
        return this.surface;
    }

    public ArrayList<TraitementPhytosanitaire> GetLesTraitementsPhytosanitaires()
    {
        return this.lesTraitementsPhyto;
    }

    public void AjouteUnTraitement(TraitementPhytosanitaire unTraitement){
        this.lesTraitementsPhyto.add(unTraitement);
    }

    public double GetTauxTraitementSemence()
    {
        int nbTraitementsSemence = 0;
        int nbTraitementsTotal = lesTraitementsPhyto.size();


        for (TraitementPhytosanitaire traitement : lesTraitementsPhyto) {
            if (traitement instanceof TraitementSemence) {
                nbTraitementsSemence++;
            }
        }


        if (nbTraitementsTotal == 0) {
            return 0;
        }


        return ((double) nbTraitementsSemence / nbTraitementsTotal) * 100;
    }
}

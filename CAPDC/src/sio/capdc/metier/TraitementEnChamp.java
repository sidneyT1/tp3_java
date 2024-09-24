package sio.capdc.metier;

import java.util.ArrayList;

public class TraitementEnChamp extends TraitementPhytosanitaire
{
    private ArrayList<Pulverisation> lesPulverisations;

    public TraitementEnChamp(String unId, ProduitPhytosanitaire leProduitPhyto, Parcelle laParcelleCultivee) {
        super(unId, leProduitPhyto, laParcelleCultivee);
    }

    public ArrayList<Pulverisation> getLesPulverisations() {
        return lesPulverisations;
    }
    @Override
    public double QuantiteAppliquee()
    {
        double totalQuantite = 0;


        for (Pulverisation pulv : lesPulverisations)
        {
            totalQuantite += pulv.getDosage() * super.getLaParcelleCultivee().GetSurface();
        }

        return totalQuantite;

    }


}


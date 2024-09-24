package sio.capdc.metier;

public class TraitementSemence extends TraitementPhytosanitaire
{
    private double dosageTraitementSemence;

    public TraitementSemence(String unId, ProduitPhytosanitaire leProduitPhyto, Parcelle laParcelleCultivee, double unDosage) {

        super(unId, leProduitPhyto, laParcelleCultivee);
        this.dosageTraitementSemence = unDosage;
    }

    @Override
    public double QuantiteAppliquee()
    {
        return this.dosageTraitementSemence * super.getLaParcelleCultivee().GetSurface();
    }
}



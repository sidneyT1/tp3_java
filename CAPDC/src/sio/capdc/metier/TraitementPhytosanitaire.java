package sio.capdc.metier;

public abstract class TraitementPhytosanitaire {
    private String id;
    private ProduitPhytosanitaire leProduitPhyto;
    private Parcelle laParcelleCultivee;

    // Constructeur
    public TraitementPhytosanitaire(String unId, ProduitPhytosanitaire leProduitPhyto, Parcelle laParcelleCultivee) {
        this.id = unId;
        this.leProduitPhyto = leProduitPhyto;
        this.laParcelleCultivee = laParcelleCultivee;
    }


    public Parcelle getLaParcelleCultivee()
    {
        return laParcelleCultivee;
    }

    public ProduitPhytosanitaire getLeProduitPhyto() {
        return leProduitPhyto;
    }

    public abstract double QuantiteAppliquee();



}

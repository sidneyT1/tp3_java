package sio.capdc.metier;

public class ProduitPhytosanitaire {
    // Attributs privés
    private String id;
    private String libelle;

    // constructeur
    public ProduitPhytosanitaire(String unId, String unLibelle) {
        this.id = unId;
        this.libelle = unLibelle;
    }

    public String getLibelle() {
        return libelle;
    }



}


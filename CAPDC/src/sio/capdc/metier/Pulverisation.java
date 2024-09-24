package sio.capdc.metier;

import java.time.LocalDate;

public class Pulverisation
{
    private String id;
    private final double unDosage;
    private final LocalDate uneDate;
    private double dosagePulverisation;
    private LocalDate datePulverisation;

    public Pulverisation (String unId, double unDosage, LocalDate uneDate)
    {
        id = unId;
        this.unDosage = unDosage;
        this.uneDate = uneDate;

    }


    public double getDosage() {
        return dosagePulverisation;
    }
}


//Subklass med interface inbakad
public class CarnivorousPlant extends Plant {
    // en inkapslad konstant
    private static final double PROTEIN_PER_METER = 0.2;
    private static final double PROTEIN_BASE_DAILY = 0.1;


    public CarnivorousPlant(String plantName, double plantLength) {
        super(plantName, plantLength, Fluidity.PROTEIN);
    }

    //Här sker min polymorfism
    @Override
    public double nurr() {
        return PROTEIN_BASE_DAILY + PROTEIN_PER_METER * getPlantLength();
    }
}

//Subklass med interface inbakad
public class Palm extends Plant {
    // en inkapslad konstant
    private static final double WATER_PER_METER = 0.5;

    public Palm(String plantName, double plantLength) {
        super(plantName, plantLength, Fluidity.KRANVATTEN);
    }

    //Här sker min polymorfism
    @Override
    public double nurr() {
        return WATER_PER_METER * getPlantLength();
    }
}


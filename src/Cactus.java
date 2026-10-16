//Subklass med interface inbakad
public class Cactus extends Plant {
    // en inkapslad konstant
    private static final double DAILY_WATER = 0.02;

    public Cactus(String plantName, double plantLength) {
        super(plantName, plantLength, Fluidity.MINERALVATTEN);
    }

    //Här sker min polymorfism
    @Override
    public double nurr() {
        return DAILY_WATER;
    }
}

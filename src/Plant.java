//Skapade en abstract superklass för att enbart behöva implementera min interface, då jag inte vill använda mig av metoden i min superklass utan i mina subklasser.
//Eftersom implementeringen sker i superklassen så ärver även mina subklasser metoden.
// Superklass.
public abstract class Plant implements Calc {
    //Dessa tre variabler är inkapslade
    private final String plantName;
    private final double plantLength;
    private final Fluidity plantNur;


    public Plant(String plantName, double plantLength, Fluidity plantNur) {
        this.plantName = plantName;
        this.plantLength = plantLength;
        this.plantNur = plantNur;

    }

    public String getPlantName() {
        return plantName;
    }

    public double getPlantLength() {
        return plantLength;
    }

    public Fluidity getPlantNurr() {
        return plantNur;
    }
}
// Detta är min interface som alla Subklasser av Plant tar del av.
interface Calc {
    double nurr();
}


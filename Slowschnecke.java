public class Slowschnecke extends Rennschnecke implements Kriechbar {
    int counter = 0;
    
    public Slowschnecke(String name, double vMax) {
        super(name, vMax);
        
    }

    public void krieche(int turbo) {
        if (counter < 10) {
            setvMax(getvMax() / 2);
            super.krieche();
            setvMax(getvMax() * 2);
            counter ++;
        }
        else {
            setvMax (getvMax () * turbo * 10);
            super.krieche ();
            setvMax (getvMax () /turbo / 10);
            counter = 0;




































            
        }
    }
}

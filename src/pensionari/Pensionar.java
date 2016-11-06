package pensionari;

import p.Actiuni;
import p.Person;

/**
 * Created by icondor on 05/11/16.
 */
public class Pensionar extends Person implements Actiuni{

    public int getPensie() {
        return pensie;
    }

    public void setPensie(int pensie) {
        this.pensie = pensie;
    }

    private int pensie;

    public void conduce() {
        System.out.println("pensionarul conduce troleul ");
    }
    public void canta() {
        System.out.println("doarme");

    }
    public void danseaza() {
        System.out.println("gata");

    }
    public void bea() {
        System.out.println("cat de mult ");
    }



}

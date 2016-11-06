package medici;

import p.Actiuni;
import p.Person;
/**
 * Created by icondor on 05/11/16.
 */
public class Chirurg extends Person implements Actiuni {

    public Chirurg() {
        System.out.println("chirug default constructor");
    }

    private String[] specializari;

    public String[] getSpecializari() {
        return specializari;
    }

    public void setSpecializari(String[] specializari) {
        this.specializari = specializari;
    }

    public void conduce() {
        System.out.println("chirurgul conduce bmw");
    }
    public void canta() {
        System.out.println("chi chiu");

    }
    public void danseaza() {
        System.out.println("dans cjiu");

    }
    public void bea() {
        System.out.println("beau chiu ");
    }
}

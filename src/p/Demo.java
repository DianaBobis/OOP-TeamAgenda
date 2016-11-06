package p;

import medici.Chirurg;
import p.Person;
import pensionari.Pensionar;

/**
 * Created by icondor on 05/11/16.
 */
public class Demo {
    public static void main(String[] args) {




        Person p = new Person(46456457);
       p.setAnulNasterii(1987);


       // System.out.println(p.getAge());

        Chirurg ion = new Chirurg();
        ion.conduce();

        Pensionar pe = new Pensionar();
        pe.setPensie(4500);
        pe.conduce();

      Actiuni[] om = new Actiuni[2];
        om[0]=new Chirurg();
        om[1]=new Pensionar();

        om[0].conduce();
        om[1].conduce();



    }
}

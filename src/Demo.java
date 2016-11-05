/**
 * Created by icondor on 05/11/16.
 */
public class Demo {
    public static void main(String[] args) {

        Person p = new Person(46456457);
       p.setAge(14);

        CI buletin = new CI();
        buletin.setNumarul(34345);
        buletin.setSeria("KX");



        p.setCi(buletin);



        System.out.println(p.getCi().getSeria());

        CI buletinulLuiP;
        buletinulLuiP = p.getCi();
        String seria = buletinulLuiP.getSeria();

    }
}

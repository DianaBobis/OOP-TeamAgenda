package p;

/**
 * Created by icondor on 29/10/16.
 */
public class Person {

    // fields, or data memebers , put them PRIVATE all the time
    int age;
    private int anulNasterii;
    private String name;
    private String phoneNumber;
    private long cnp;
    private CI ci;


    //constructor
    public Person(long cnp) {
        System.out.println("person constructor with args");
        this.cnp = cnp;
    }

    // default constructor, it will not be created if you have at least one with params , see above
    public Person() {
        System.out.println("person default constructor");
    }


    // getter
    public int getAnulNasterii() {
        return anulNasterii;
    }

    //setter
    public void setAnulNasterii(int anulNasterii) {
        this.anulNasterii = anulNasterii;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        age = 2018 - anulNasterii;
        return age;
    }

    public void sing() {
        // defualt
    }

    public void dance() {

    }

    public void sing(String song) {


        singCore();
    }

    public void sing(int song) {

    }

    private void singCore() {
        //chestii comune
    }

    public CI getCi() {
        return ci;
    }

    public void setCi(CI ci) {
        this.ci = ci;
    }

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

}

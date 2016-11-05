/**
 * Created by icondor on 29/10/16.
 */
public class Person {


    // methods
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
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    private void singCore()
    {
        //chestii comune
    }

    // fields, data members
    private String name;
    private String phoneNumber;
    private int age;
    private long cnp;
    private CI ci;

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

    Person(long cnp) {
        System.out.println("cucu bau s-a creat persoana");
        this.cnp=cnp;
    }

    Person() {
        System.out.println("cucu bau");
    }

}

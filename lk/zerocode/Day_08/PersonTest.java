public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        System.out.println(p1.age);//default value
        System.out.println(p1.name);
        System.out.println(p1);// memory location


        p1.age = 20;
        p1.name = "Amal";
        Person.setAge(10);

        System.out.println(p1.age);
        System.out.println(p1.name);

       System.out.println("-----------------------------------");

//create new object
        Person p2 = new Person();

        System.out.println(p2.age);
        System.out.println(p2.name);

        p2.age = 40;
        p2.name="Nimal";

        System.out.println(p2.age);
        System.out.println(p2.name);

        System.out.println("-----------------------------------");

        System.out.println(p1.age);
        System.out.println(p1.name);
        System.out.println(p2.age);
        System.out.println(p2.name);
    }
    
}

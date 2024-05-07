package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapulate obj = new Encapulate();
        //setting values of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);

        //displaying values of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: " +obj.getAge());
        System.out.println("Prime's rollNo: " +obj.getRollNo());

    }
}

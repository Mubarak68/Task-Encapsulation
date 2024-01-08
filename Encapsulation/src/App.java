public class App {
    public static void main(String[] args) throws Exception {

        Student student1 = new Student(null, 0, 0);
        student1.setName("Mubarak");
        student1.setAge(22);
        student1.setGpa(3.82);

        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("GPA: " + student1.getGpa());

    }
}
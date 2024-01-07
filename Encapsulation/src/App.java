public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student(null, 0, 0);
        s1.setName("Mubarak");
        s1.setAge(22);
        s1.setGpa(3.82);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("GPA: " + s1.getGpa());

    }
}
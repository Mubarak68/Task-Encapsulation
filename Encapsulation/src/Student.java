public class Student {

    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGpa(double gpa) {

        if (gpa <= 0.0 || gpa >= 4) {

            gpa = 0;

        } else {

            this.gpa = gpa;
        }

    }

    public String getGpa() {

        if (gpa > 3) {
            return "Excellent";
        } else if (gpa >= 2 && gpa <= 3) {
            return "Good";
        } else if (gpa < 2 && gpa > 0) {
            return "Needs Improvement";
        } else {
            return "error";
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
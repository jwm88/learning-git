public class Student {
    String name;
    int year;
    String grade;

    public Student(String name, int year, String grade) {
        //Student constructor
        this.name = name;
        this.year = year;
        this.grade = grade;
    }

    public void printDetails() {
        System.out.println("I am " + this.name + ". I am in year " 
        + this.year + ". I have an " + this.grade + " grade.");

    }

    public static void main(String[] args) {
        Student Sebin = new Student("Sebin", 10, "A");
        Student Jamie = new Student("Jamie", 11, "A");
        Student Vania = new Student("Jamie", 12, "A");
        Student Lee = new Student("Jamie", 13, "A");

        Jamie.printDetails();
        Sebin.printDetails();
        Vania.printDetails();
        Lee.printDetails();
    }
    
}
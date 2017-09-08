public class Student {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}


Student s = new Student();
s.setName("Danielle");
String name = s.getName();

Student.setName("Bob"); // Will not work!
Student.getName(); // Will not work!

public class Teacher {
    String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void assignHomework (Student student){
        System.out.println("Teacher "+ name+" " + "gave homework to the Student "+ student.getName());
    }
}

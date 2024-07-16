public class Student {

    String name;
    int grade;
    float gpa;
    int age;

    public Student(String name, int grade, float gpa,int age) {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}

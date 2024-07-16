public class Programmer extends Person {
    private String programmingLanguage;
    private int yearsOfExperience;

    public Programmer(String name, int age, String programmingLanguage, int yearsOfExperience) {
        super(name, age);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, my name is " + getName() + " and I am a programmer.");
        System.out.println("I have " + yearsOfExperience + " years of experience in " + programmingLanguage + ".");
    }

    // New method specific to Programmer
    public void code() {
        System.out.println(getName() + " is coding in " + programmingLanguage + ".");
    }
}

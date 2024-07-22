public class Tester extends ITworker{

    public Tester(String username, String email) {
        super(username, email);
    }

    @Override
    public void performDuties() {
        System.out.println("Tester "+getUsername()+" is testing");
    }
}

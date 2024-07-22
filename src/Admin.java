public class Admin extends ITworker{
    public Admin(String username, String email) {
        super(username, email);
    }
    @Override
    public  void performDuties(){
        System.out.println("Admin "+getUsername()+" is managing the IT infrastructure.");
    }


}

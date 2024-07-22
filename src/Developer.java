public class Developer extends ITworker{
    private String language;
    public Developer(String username, String email,String language) {
        super(username, email);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void performDuties() {
        System.out.println("Developer "+getUsername()+" is coding in "+getLanguage());
    }
}

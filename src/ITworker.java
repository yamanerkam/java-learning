abstract class ITworker {
    private String username;
    private String email;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ITworker(String username, String email){
        this.username = username;
        this.email = email;
    }

    public  abstract void performDuties();
    public void login(){
        System.out.println(this.username+" logged in!");
    }
    public void logout(){
        System.out.println(this.username+" logged out!");
    }



}

public class EmailLogger extends BaseLogger {
    @Override
    public void Logger(String msg) {
        System.out.println("email-logger: "+msg);
    }
}

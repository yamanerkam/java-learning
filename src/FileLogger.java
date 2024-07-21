public class FileLogger extends BaseLogger{
    @Override
    public void Logger(String msg) {
        System.out.println("file-logger: "+msg);
    }
}

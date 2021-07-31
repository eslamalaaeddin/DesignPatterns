package ChainOfResponsibilityPattern.logger;


public class FileLogger extends Logger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("FileLogger: " + message + "Level: "+ level);
    }
}

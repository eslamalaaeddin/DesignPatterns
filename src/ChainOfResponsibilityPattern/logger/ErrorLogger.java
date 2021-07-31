package ChainOfResponsibilityPattern.logger;


public class ErrorLogger extends Logger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ErrorLogger: " + message + "Level: "+ level);
    }
}
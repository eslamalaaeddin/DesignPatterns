package StatePattern.state;

public class Ringing implements MobileAlertState {


    @Override
    public void alert() {
        int dots = 3;
        System.out.print("Ringing");
        for (int i = 0 ; i < dots ; i++){
            try {
                Thread.sleep(1000);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}

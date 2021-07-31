package StatePattern.state;

public class Vibration implements MobileAlertState {

    @Override
    public void alert() {
        int dots = 3;
        System.out.print("Vibrating");
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

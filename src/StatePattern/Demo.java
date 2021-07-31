package StatePattern;

import StatePattern.context.MobileContext;
import StatePattern.state.Ringing;
import StatePattern.state.Vibration;

public class Demo {
    public static void main(String[] args) {
        MobileContext mobileContext = new MobileContext();

        mobileContext.alert();
        mobileContext.setState(new Vibration());
        mobileContext.alert();
        mobileContext.setState(new Ringing());
        mobileContext.alert();
    }
}

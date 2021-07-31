package StatePattern.context;


import StatePattern.state.MobileAlertState;
import StatePattern.state.Silent;

public class MobileContext {

    private MobileAlertState mobileAlertState;

    public MobileContext(){
        mobileAlertState = new Silent();
    }


    public void setState(MobileAlertState state){
        mobileAlertState = state;
    }

    public void alert(){
        mobileAlertState.alert();
    }
}

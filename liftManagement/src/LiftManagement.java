import view.LiftSetupView;

public class LiftManagement {
    private static LiftManagement liftManagement;
    private LiftManagement(){}
    public static LiftManagement getInstance(){
        if(liftManagement == null){
            liftManagement = new LiftManagement();
        }
        return liftManagement;
    }

    public static void main(String[] args) {
        LiftManagement.getInstance().init();
    }

    private void init() {
        new LiftSetupView().init();
    }
}

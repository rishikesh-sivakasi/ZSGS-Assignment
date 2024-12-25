package view;

import model.LiftSetupModel;
import presenter.LiftSetupPresenter;
import util.Read;

import java.util.*;

public class LiftSetupView implements LiftSetupPresenter {
    private LiftSetupModel liftSetupModel;

    public LiftSetupView(){
        LiftSetupPresenter liftSetupPresenter = this;
        liftSetupModel = new LiftSetupModel(liftSetupPresenter);
    }
    public void init(){
        liftSetup();
    }

    private void liftSetup(){
        System.out.print("Enter the number of lifts : ");
        int liftCount = Read.getScanner().nextInt();
        Read.getScanner().nextLine();
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1; i <= liftCount; i++){
            System.out.print("Enter the "+"L"+i+" access floors : ");
            String line = Read.getScanner().nextLine();
            String[] numbers = line.split(" ");
            List<Integer> temp = new ArrayList<>();

            for (String num : numbers) {
                temp.add(Integer.parseInt(num));
            }
            list.add(new ArrayList<>(temp));
        }
        liftSetupModel.LiftCreation(liftCount , list);
    }

    @Override
    public void onLiftCreationSuccess() {
        System.out.println("Lift created successfully");
        new DisplayLifts().init();
    }
}

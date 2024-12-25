package view;

import dto.Lift;
import repository.LiftRepository;

import java.util.List;

public class DisplayLifts {
    public void init() {
        displayLift();
    }

    private void displayLift() {
        List<Lift> liftList=LiftRepository.getInstance().getLiftList();
        System.out.print("Lift  : ");
        for(int i = 0;i<liftList.size(); i++){
            System.out.print(liftList.get(i).getLiftName()+" ");
        }
        System.out.print("\nFloor : ");
        for(int i = 0;i<liftList.size(); i++){
            System.out.print(liftList.get(i).getCurrentPlace()+"  ");
        }
        new UserInputView().init();
    }
}

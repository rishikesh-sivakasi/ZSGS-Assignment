package model;

import dto.Lift;
import presenter.LiftSetupPresenter;
import repository.LiftRepository;

import java.util.*;

public class LiftSetupModel{
    LiftSetupPresenter liftSetupPresenter;
    public LiftSetupModel(LiftSetupPresenter liftSetupPresenter){
        this.liftSetupPresenter = liftSetupPresenter;
    }

    public void LiftCreation(int liftCount, List<List<Integer>> list) {
        for (int i = 0; i<liftCount; i++){
            Lift lift = new Lift();
            lift.setLiftName("L"+(i+1));
            lift.setCurrentPlace(list.get(i).get(0));
            lift.setRestrictLift(list.get(i));
            LiftRepository.getInstance().addLift(lift);
        }
        liftSetupPresenter.onLiftCreationSuccess();
    }
}

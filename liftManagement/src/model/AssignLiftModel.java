package model;

import dto.Lift;
import presenter.UserInputPresenter;
import repository.LiftRepository;

import java.util.*;

public class AssignLiftModel {

    private UserInputPresenter userInputPresenter;
    public AssignLiftModel(UserInputPresenter userInputPresenter) {
        this.userInputPresenter = userInputPresenter;
    }

    public void assignList(int source, int destination) {
        // Module 4
        List<Lift> liftList = LiftRepository.getInstance().getLiftList();
        int findLift = Integer.MAX_VALUE;
        int nearestLift = 0;
        int previous = 0;
        int stopCount = 0;
        for (int i = 0; i < liftList.size(); i++) {
            List<Integer> restrictLift = liftList.get(i).getRestrictLift();
            if(restrictLift.contains(source) && restrictLift.contains(destination)){
                int difference = Math.abs(source - liftList.get(i).getCurrentPlace());
                if(findLift > difference) {
                    findLift = difference;
                    nearestLift = i;
                    stopCount = Math.abs(restrictLift.indexOf(source) - restrictLift.indexOf(destination));
                    previous = liftList.get(i).getCurrentPlace();
                }else if(findLift == difference && previous != liftList.get(i).getCurrentPlace()){
                    int temp = liftList.get(i).getCurrentPlace();
                    if((source <= temp && destination <= temp) || (source >= temp && destination >= temp)){
                        nearestLift = i;
                    }
                }
            }
        }

        liftList.get(nearestLift).setCurrentPlace(destination);
        userInputPresenter.onLiftAssignedSuccess(liftList.get(nearestLift).getLiftName());

    }
}

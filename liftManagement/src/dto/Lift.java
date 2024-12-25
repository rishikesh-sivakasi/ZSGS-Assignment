package dto;

import java.util.List;

public class Lift {
    private String liftName;
    private int currentPlace;
    private List<Integer> restrictLift;

    public List<Integer> getRestrictLift() {
        return restrictLift;
    }

    public void setRestrictLift(List<Integer> restrictLift) {
        this.restrictLift = restrictLift;
    }

    public String getLiftName() {
        return liftName;
    }

    public void setLiftName(String liftName) {
        this.liftName = liftName;
    }

    public int getCurrentPlace() {
        return currentPlace;
    }

    public void setCurrentPlace(int currentPlace) {
        this.currentPlace = currentPlace;
    }

}

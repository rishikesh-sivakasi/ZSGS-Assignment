package repository;

import dto.Lift;
import presenter.LiftSetupPresenter;

import java.util.ArrayList;
import java.util.List;

public class LiftRepository {
    private static LiftRepository liftRepository;
    private List<Lift> liftList ;
    private LiftRepository(){
        liftList = new ArrayList<>();
    }

    public static LiftRepository getInstance(){
        if(liftRepository == null){
            liftRepository = new LiftRepository();
        }
        return liftRepository;
    }

    public List<Lift> getLiftList() {
        return liftList;
    }

    public void addLift(Lift lift){
        liftList.add(lift);
    }

}

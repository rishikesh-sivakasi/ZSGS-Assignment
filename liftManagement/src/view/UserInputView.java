package view;

import model.AssignLiftModel;
import presenter.UserInputPresenter;
import util.Read;

public class UserInputView implements UserInputPresenter {

    private AssignLiftModel assignLiftModel;
    public UserInputView(){
        UserInputPresenter userInputPresenter = this;
        assignLiftModel = new AssignLiftModel(userInputPresenter);
    }

    public void init(){
        getUserInput();
    }

    private void getUserInput() {
        System.out.print("\nInput : ");
        int source = Read.getScanner().nextInt();
        int destination = Read.getScanner().nextInt();
        assignLiftModel.assignList(source,destination);
    }

    @Override
    public void onLiftAssignedSuccess(String liftName) {
        System.out.println(liftName +" is assigned");
        new DisplayLifts().init();
    }
}

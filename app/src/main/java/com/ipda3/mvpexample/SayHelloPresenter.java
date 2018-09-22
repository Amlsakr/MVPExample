package com.ipda3.mvpexample;

/**
 * Created by aml on 22/09/18.
 */

public class SayHelloPresenter implements SayHelloContract.Presenter {

    private Person mPerson ;
    private SayHelloContract.View mView ;

    public SayHelloPresenter(SayHelloContract.View mView) {
        this.mView = mView;
        mPerson = new Person();
    }

    @Override
    public void loadMessage() {
        if (mPerson.getFirstName() == null && mPerson.getLastName() == null){

            mView.showError("no person name found");
            return;
        }

        String message = "Hi " +mPerson.getFirstName() + "  !";
        mView.showMessage(message);
    }

    @Override
    public void saveName(String firstName, String lastName) {
        mPerson.setFirstName(firstName);
        mPerson.setLastName(lastName);

    }
}

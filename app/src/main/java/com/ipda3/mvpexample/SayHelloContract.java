package com.ipda3.mvpexample;

/**
 * Created by aml on 22/09/18.
 */


/** Helps us track the relationship between the View and the Presenter in a central place */
public interface SayHelloContract {

    // represent view in mvp

    interface View {
        void showMessage (String message);
        void showError (String error);
    }

    // represent presenter in mvp

    interface Presenter {

        void loadMessage ();
        void saveName(String firstName , String lastName);
    }
}

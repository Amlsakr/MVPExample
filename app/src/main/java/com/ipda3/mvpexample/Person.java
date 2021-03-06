package com.ipda3.mvpexample;

/**
 * Created by aml on 22/09/18.
 */


/** Represents the Model in MVP architecture */

public class Person {


        private String mFirstName;
        private String mLastName;

        public Person() {
        }

        public Person(String firstName, String lastName) {
            mFirstName = firstName;
            mLastName = lastName;
        }

        public String getFirstName() {
            return mFirstName;
        }

        public String getLastName() {
            return mLastName;
        }

        public void setFirstName(String firstName) {
            this.mFirstName = firstName;
        }

        public void setLastName(String lastName) {
            this.mLastName = lastName;
        }

        public String getName() {
            return mFirstName + " " + mLastName;
        }
    }


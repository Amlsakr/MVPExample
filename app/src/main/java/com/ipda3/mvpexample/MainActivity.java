package com.ipda3.mvpexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SayHelloContract.View , View.OnClickListener{

    private SayHelloContract.Presenter mPresenter ;

    //UI properties
    private TextView mMessageView;
    private EditText mFirstNameView;
    private EditText mLastNameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        mPresenter = new SayHelloPresenter(this);
    }

    @Override
    public void showMessage(String message) {
        mMessageView.setText(message);

    }

    @Override
    public void showError(String error) {
        Toast.makeText(getApplicationContext() ,error ,Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.update :
                mPresenter.saveName(mFirstNameView.getText().toString() , mLastNameView.getText().toString());
                break;
            case R.id.showMessage :
                mPresenter.loadMessage();
                break;
        }

    }

    private void initViews() {
        mMessageView = (TextView) findViewById(R.id.message);
        mFirstNameView = (EditText) findViewById(R.id.firstName);
        mLastNameView = (EditText) findViewById(R.id.lastName);

        findViewById(R.id.update).setOnClickListener(this);
        findViewById(R.id.showMessage).setOnClickListener(this);
    }

}

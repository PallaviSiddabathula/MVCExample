package com.example.purnatva.mvcexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements IViewContract {

    private TextView greet ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Controller<IViewContract> obj = new Controller<IViewContract>(this);

        greet = (TextView) findViewById(R.id.greeting);
        obj.showGreeting();
    }

    @Override
    public void setGreetings(String greetingMessage) {
        greet.setText(greetingMessage);
    }
}

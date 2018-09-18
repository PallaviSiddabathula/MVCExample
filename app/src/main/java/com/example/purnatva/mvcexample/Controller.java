package com.example.purnatva.mvcexample;

/**
 * Created by Pallavi on 22-04-2017.
 *
 */

public class Controller<IViewContract> {

    private MainActivity myView;

    public Controller(IViewContract view) {
           myView = (MainActivity) view;
    }

    void showGreeting() {
        myView.setGreetings("Hello, This is MVC !");
    }

}

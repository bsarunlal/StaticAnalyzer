package com.webview.arun.helloworldapp;

import android.os.Environment;

/**
 * Created by aberisanka001 on 3/29/2018.
 */

public abstract class Car {
    public abstract void start(Environment c);

    public void stop(Environment c) {
        //c.freeze(this);
    }
}

//Ideally it should be
/*
* public interface Car {
  public void start(Environment c);

  public default void stop(Environment c) {
    c.freeze(this);
  }
}
*
* */
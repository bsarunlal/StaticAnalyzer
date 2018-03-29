package com.webview.arun.helloworldapp;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import android.R;
import android.support.annotation.Nullable;

/**
 * Created by aberisanka001 on 3/29/2018.
 */

public class NewJava_Test {

    //Adding unused variables
    private boolean isUnused = false;
    public String mMemberVariable = null;

    void method1() {
        int i=0;
        if(mMemberVariable != null) {

        }
    }

    void ruleIndexOf() {
        String color = "blue";
        String name = "ishmael";

        List<String> strings = new ArrayList<String>();
        strings.add(color);
        strings.add(name);

        if (strings.indexOf(color) > 0) {  // Noncompliant
            // ...
        }
    }

    void ruleFileDelete(String path) {
        File file = new File(path);
        if (!file.delete()) {  // Noncompliant
            //...
        }

        //Path iPath = Paths.get("C:\\Users\\Java\\examples");
        //Files.delete(iPath);
    }

    void ruleSwitchCase(int myVariable) {
        switch (myVariable) {
            case 0: // Noncompliant: 6 lines till next case
                methodCall1("");
                methodCall2("");
                methodCall3("");
                methodCall4("");
                break;
        }
    }
    private void methodCall4(String s) {
    }

    private void methodCall3(String s) {
    }

    private void methodCall2(String s) {
    }

    private void methodCall1(String s) {
    }

    public int lengthPlus(String str) {
        int len = 2;
        try {
            len += str.length();
        }
        catch (NullPointerException e) {
            //do some operation
        }
        return len;
    }

    void ruleCurley() {
        if(true) {
            methodCall1("");}

        if (true){
            //do nothing
        }
    }

    public void doSomething () {
        Optional<String> optional = getOptional();
        if (optional != null) {  // Noncompliant
            // do something with optional...
        }
/*        optional.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {

            }
        });*/
    }

    @Nullable // Noncompliant
    public Optional<String> getOptional() {
        // ...
        return null;  // Noncompliant
        //return Optional.empty();
    }
}

class Raspberry   // Noncompliant; no serialVersionUID.
        implements Serializable {
    private String variety;

    public void setVariety(String variety) {}
    public void getVarity() {}
}

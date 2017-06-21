package com.example.brandellpetty.brandell2017summer.audio;

import java.io.Serializable;

/**
 * Created by brandellpetty on 6/21/17.
 */

public class BaseBean implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String string) {
        this.name = string;
    }
}

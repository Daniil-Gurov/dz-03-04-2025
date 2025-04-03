package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class FieldInjectionBean {
    @Autowired
    private MyBean myBean;

    public void display() {
        myBean.display();
    }
}

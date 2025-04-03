package org.example;

public class ConstructorBean {
    private MyBean myBean;

    // Внедрение через конструктор
    public ConstructorBean(MyBean myBean) {
        this.myBean = myBean;
    }

    public void display() {
        myBean.display();
    }
}

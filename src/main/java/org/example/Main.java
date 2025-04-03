package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Внедрение через метод
        MyBean myBean = (MyBean) context.getBean("myBean");
        myBean.display();

        // Внедрение через конструктор
        ConstructorBean anotherBean = (ConstructorBean) context.getBean("anotherBean");
        anotherBean.display();

        // Внедрение через поле
        FieldInjectionBean fieldInjectionBean = (FieldInjectionBean) context.getBean("fieldInjectionBean");
        fieldInjectionBean.display();
    }
}
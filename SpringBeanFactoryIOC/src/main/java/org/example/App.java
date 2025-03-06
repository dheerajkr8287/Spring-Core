package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");

//        Car car1 = applicationContext.getBean(Car.class);
////        Car car2=applicationContext.getBean(Car.class);
//        car1.driver();

//        System.out.println(car1.hashCode());
//        System.out.println(car2.hashCode());
//        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//        here we request to load the dependencies
//        Car car = factory.getBean(Car.class); //class jo hai Class class ka variable h jo object deta h


    }
}

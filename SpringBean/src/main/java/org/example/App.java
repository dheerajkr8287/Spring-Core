package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //Why it works?
        //registerShutdownHook() ensures Spring closes the context before JVM exits, allowing stop() to run properly.

//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");
        // Use ConfigurableApplicationContext instead of ApplicationContext
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");

        // Register a shutdown hook to ensure stop() is called when JVM shuts down
        applicationContext.registerShutdownHook();
    }
}

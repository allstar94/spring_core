package hello.core.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class BeanLifeCycleTest {

    @Test
    public void LifeCycleTest(){
        System.out.println("BeanLifeCycleTest.LifeCycleTest");
        ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        Networkclient client = ac.getBean(Networkclient.class);
        ac.close();
    }

    @Configuration
    static class LifeCycleConfig{
//        @Bean(initMethod = "init", destroyMethod = "close")
        @Bean
        public Networkclient networkclient(){
            System.out.println("LifeCycleConfig.networkclient");
            Networkclient networkclient = new Networkclient();
            networkclient.setUrl("http://hello-spring.dev");
            return networkclient;
        }
    }
}

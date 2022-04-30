package org.soumitra.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstRestApplication {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        int i=0;
        while(i<100) {
            i=i+1;
            System.out.println(i);
        }
        SpringApplication.run(FirstRestApplication.class, args);
    }
}

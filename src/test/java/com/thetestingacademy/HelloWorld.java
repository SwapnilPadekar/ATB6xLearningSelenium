package com.thetestingacademy;

import org.openqa.selenium.edge.EdgeDriver;

public class HelloWorld {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver(); //POST request to create a new session
        driver.get("https://courses.thetestingacademy.com/");
        //driver.get - API POST request to navigate to URL
        //Every statement in the script will be GET/POST/PUT/PATCH request to the driver run on the browsers
    }
}

package com.whizlabs.spring.beginner.ioc.scanning.data;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

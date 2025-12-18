package com.tnsif.scanner;


public class School {
    private String name;

    
    public School() {
        this.name = "Default School";
    }

    
    public School(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "Unknown School";
        }
    }

    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return "School [name=" + name + "]";
    }
}
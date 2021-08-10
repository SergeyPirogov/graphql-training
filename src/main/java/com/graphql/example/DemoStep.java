package com.graphql.example;

public class DemoStep {

    TestData testData = new TestData();

    public void createUser(){
        var data = testData.getUserData();

    }

}


class TestData {

    private final String envName = System.getenv("env");

    public String getUserData(){
        if ("qa".equals(envName)){
            return "";
        }
        return null;
    }


}


// mvn -Denv=qa
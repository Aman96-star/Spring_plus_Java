package com.nit;

public class Test {
    private String id;
    private String model;
    private int num;
    private TestDi testDi;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public TestDi getTestDi() {
        return testDi;
    }

    public void setTe(TestDi testDi) {
        this.testDi = testDi;
    }

    @Override
    public String toString() {
        return "Test [id=" + id + ", model=" + model + ", num=" + num + ", testDi=" + testDi + "]";
    }
}

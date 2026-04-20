package com.nit;

public class TestDi {
    private int code;

    public TestDi(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "TestDi [code=" + code + "]";
    }
}

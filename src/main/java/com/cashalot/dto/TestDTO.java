package com.cashalot.dto;


import java.util.ArrayList;
import java.util.List;

public class TestDTO {
    String str;

    List<String> strings = new ArrayList<>();

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

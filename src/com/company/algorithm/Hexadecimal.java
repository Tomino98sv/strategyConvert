package com.company.algorithm;

import com.company.Strategy;

public class Hexadecimal implements Strategy {
    @Override
    public String convert(int number) {
        return "Hexadecimal: "+Integer.toHexString(number);
    }
}

package com.company.algorithm;

import com.company.Strategy;

public class Binary implements Strategy {
    @Override
    public String convert(int number) {
        return "Binary: "+ Integer.toBinaryString(number);
    }
}

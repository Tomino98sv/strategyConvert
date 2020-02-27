package com.company.algorithm;

import com.company.Strategy;

public class Octa implements Strategy {
    @Override
    public String convert(int number) {
        return "Octa: "+Integer.toOctalString(number);
    }
}

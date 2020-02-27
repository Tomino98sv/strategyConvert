package com.company;

import com.company.algorithm.Binary;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public String execute() {
        return strategy.convert();
    }
}

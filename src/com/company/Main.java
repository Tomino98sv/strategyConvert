package com.company;

import com.company.algorithm.Binary;
import com.company.algorithm.Hexadecimal;
import com.company.algorithm.Octa;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Context binary = new Context(new Binary());
        Context octa = new Context(new Octa());
        Context hexa = new Context(new Hexadecimal());


    }
}

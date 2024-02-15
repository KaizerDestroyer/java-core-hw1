package com.iksgroup.mainpack;

import com.iksgroup.services.Calculator;
import com.iksgroup.printres.Printer;

public class Program {
    public static void main(String[] args) {
        int result = Calculator.add(5,5);
        System.out.println(Printer.printVal(result));
        result = Calculator.div(5,5);
        System.out.println(Printer.printVal(result));
        result = Calculator.mul(5,5);
        System.out.println(Printer.printVal(result));
        result = Calculator.sub(5,5);
        System.out.println(Printer.printVal(result));
    }
}

package com.company;

import com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI;

public class Main {

    public static void main(String[] args){

        AdvanceCalculator calc1 = new AdvanceCalculator();
        int add = calc1.add( 8, 4);
        System.out.println("8+4 = " +add);
        int subtract = calc1.subtract(6, 3);
        System.out.println("6-3 = " +subtract);

        double multiply = calc1.multiply(3, 9);
        System.out.println("3*9 = " +multiply);

        double divide = calc1.divide(60, 3);
        System.out.println("60/3 = " +divide);


    }
}

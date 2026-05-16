package com.example;

public class ConversionDeTipos {
    public static void demostrarCastingImplicitito() {
        // TODO
    }   int variable1 = 5;
        double variable2 = variable1;

    public static void demostrarCastingExplicito() {
        // TODO
            double variable3 = 31.53;
            int variable4 = (int) variable3; 
    }

    public static void demostrarProblemasDePrecision() {
        // TODO
        long numeroGigante = 96325874154L;
        short numeroCorto = (short) numeroGigante;
    }
}
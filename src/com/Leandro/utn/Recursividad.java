package com.Leandro.utn;

public class Recursividad {

    private Integer numero;

    public Recursividad(){

    }

    public int Factorial(int Num) {
        if (Num == 0) {
            return 1;
        } else {
            if (Num > 0) {
                Num *= Factorial(Num - 1);
            }

            return Num;
        }
    }
}

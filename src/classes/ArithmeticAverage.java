package classes;

import interfaces.AverageCalc;

public class ArithmeticAverage implements AverageCalc {
    public float calcAverage(float n1, float n2) {
        return (n1 + n2) / 2;
    }
}

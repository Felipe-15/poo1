package classes;

import interfaces.AverageCalc;

public class WeightedAverage implements AverageCalc {
    public float calcAverage(float n1, float n2) {
        return (n1 * 2 + n2 * 3) / 5;
    }
}
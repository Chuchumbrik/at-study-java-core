package lesson3.task1;

public class Calculator {
    int summ(int... summands) {
        int summ = 0;
        for (int summand: summands) {
            summ += summand;
        }
        return summ;
    }

    int substract(int reducedValue, int... deductible) {
        int difference = 0;
        for (int item: deductible) {
            difference = reducedValue - item;
        }
        return difference;
    }

    int multiply(int... multipliers) {
        int composition = 1;
        for (int multiplier: multipliers) {
            composition *= multiplier;
        }
        return composition;
    }

    int divide(int divisible, int... divisors) {
        int partial = 0;
        for (int divisor: divisors) {
            partial = divisible / divisor;
        }
        return partial;
    }
}

package pl.ttpsc.cleancode;

import javax.naming.OperationNotSupportedException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NumberCountTracker {

    Map<Integer, Integer> numbersToCounts = new HashMap<Integer, Integer>();

    private int largestNumberInSet = Integer.MIN_VALUE;
    private int leastNumberInSet = Integer.MAX_VALUE;

    public void insertSetOfNumbers(List<Integer> numbers) {
        for(int number : numbers){
            insertNumber(numbers.get(number));
        }
    }

    public void insertNumber(Integer number) {
        if (numbersToCounts.containsKey(number)) {
            increaseAmountOfNumber(number);
        } else {
            insertNewNumber();
        }

        adjustExtrema(number);
    }

    private void increaseAmountOfNumber(Integer number) {
        Integer value = numbersToCounts.get(number);
        numbersToCounts.put(number, value + 1);
    }

    private void insertNewNumber() {
        numbersToCounts.put(1, 1);
    }

    private void adjustExtrema(Integer number) {
        if (number > largestNumberInSet) {
            largestNumberInSet = number;
        }

        if (number < leastNumberInSet) {
            leastNumberInSet = number;
        }
    }

    public int getAmountOfNumberInstances(int number) {
        return numbersToCounts.getOrDefault(number, 0);
    }

    public double getWeightedArithmeticMeanOfSet() throws OperationNotSupportedException {
        double sumOfWeightedValues = 0;
        double sumOfWeights = 0;
        for (Entry<Integer, Integer> u : numbersToCounts.entrySet()) {
            sumOfWeights += u.getValue();
            sumOfWeightedValues += u.getKey() * u.getValue();
        }

        if(sumOfWeights == 0){
            throw new OperationNotSupportedException();
        }

        return sumOfWeightedValues / sumOfWeights;
    }
}
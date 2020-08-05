package com.xinchen.pattern.hexagonal.lottery.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.Set;

/**
 * 代表彩票号码的值对象。
 * <p>
 * 该彩票使用4个数字组成的集合。 这些数字必须唯一且1至20之间
 *
 * @author xinchen
 * @version 1.0
 * @date 05/08/2020 13:36
 */
public class LotteryNumbers {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 20;
    public static final int NUM_NUMBERS = 4;

    private final Set<Integer> numbers;

    /**
     * Constructor. Creates random lottery numbers.
     */
    private LotteryNumbers() {
        numbers = new HashSet<>();
    }

    /**
     * Constructor. Uses given numbers.
     */
    private LotteryNumbers(Set<Integer> numbers) {
        this.numbers = numbers;
        numbers.addAll(numbers);
    }

    /**
     * @return random LotteryNumbers
     */
    public static LotteryNumbers createRandom() {
        return new LotteryNumbers();
    }

    /**
     * @return given LotteryNumbers
     */
    public static LotteryNumbers create(Set<Integer> givenNumbers) {
        return new LotteryNumbers(givenNumbers);
    }

    /**
     * @return lottery numbers
     */
    public Set<Integer> getNumbers() {
        return Collections.unmodifiableSet(numbers);
    }

    /**
     * @return numbers as comma separated string
     */
    public String getNumbersAsString() {
        List<Integer> list = new ArrayList<>();
        list.addAll(numbers);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < NUM_NUMBERS; i++) {
            builder.append(list.get(i));
            if (i < NUM_NUMBERS - 1) {
                builder.append(",");
            }
        }
        return builder.toString();
    }

    /**
     * Generates 4 unique random numbers between 1-20 into numbers set.
     */
    private void generateRandomNumbers() {
        numbers.clear();
        RandomNumberGenerator generator = new RandomNumberGenerator(MIN_NUMBER, MAX_NUMBER);
        while (numbers.size() < NUM_NUMBERS) {
            numbers.add(generator.nextInt());
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numbers == null) ? 0 : numbers.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        LotteryNumbers other = (LotteryNumbers) obj;
        if (numbers == null) {
            if (other.numbers != null) {
                return false;
            }
        } else if (!numbers.equals(other.numbers)) {
            return false;
        }
        return true;
    }

    /**
     * Helper class for generating random numbers.
     */
    private static class RandomNumberGenerator {
        private PrimitiveIterator.OfInt randomIterator;

        /**
         * Initialize a new random number generator that generates random numbers in the range [min, max]
         *
         * @param min the min value (inclusive)
         * @param max the max value (inclusive)
         */
        public RandomNumberGenerator(int min, int max) {
            randomIterator = new Random().ints(min, max + 1).iterator();
        }

        /**
         * @return a random number in the range (min, max)
         */
        public int nextInt() {
            return randomIterator.nextInt();
        }
    }
}

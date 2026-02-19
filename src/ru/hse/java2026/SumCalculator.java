package ru.hse.java2026;

public class SumCalculator {
    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            String[] parts = arg.split("\\s+");
            for (String part : parts) {
                if (part.isEmpty()) continue;
                try {
                    sum += Integer.parseInt(part);
                } catch (NumberFormatException e) {
                    System.err.println("Не число: " + part);
                }
            }
        }

        System.out.println(sum);
    }
}
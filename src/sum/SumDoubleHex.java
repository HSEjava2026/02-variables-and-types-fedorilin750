package sum;

public class SumDoubleHex {
    public static void main(String[] args) {
        double sum = 0.0;

        for (String arg : args) {
            String[] parts = arg.split("\\s+");
            for (String part : parts) {
                if (part.isEmpty()) continue;

                try {
                    sum += Double.parseDouble(part);
                } catch (NumberFormatException e) {
                    // игнор
                }
            }
        }

        System.out.println(sum);
    }
}
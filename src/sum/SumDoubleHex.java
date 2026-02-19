package sum;

public class SumDoubleHex {
    public static void main(String[] args) {
        double sum = 0.0;
        for (String arg : args) {
            for (String part : arg.split("\\s+")) {
                if (part.isEmpty()) continue;
                try {
                    sum += Double.parseDouble(part);
                } catch (NumberFormatException e) {
                    if (part.startsWith("0x")) {
                        sum += Long.parseLong(part.substring(2), 16);
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
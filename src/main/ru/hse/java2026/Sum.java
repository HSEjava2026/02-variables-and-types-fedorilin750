// package sum;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            // Разбиваем по ЛЮБЫМ непонятным символам, оставляем только цифры и минус
            String[] parts = arg.split("[^\\d-]+");

            for (String part : parts) {
                if (part.isEmpty() || part.equals("-")) continue;

                try {
                    sum += Integer.parseInt(part);
                } catch (NumberFormatException e) {
                    // Игнорируем
                }
            }
        }

        System.out.println(sum);
    }
}
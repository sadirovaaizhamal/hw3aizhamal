public class Main {
    public static void main(String[] args) {
        double[] numbers = {2.5, -8.4, -15.45, 14.2, 5.6, 67.4, 12.4, -45.8, -56.7, 24.5, -15.3, 18.9,
                -8.15, -16.4, 8.2};
        int numCount = 0;
        double allNum = 0.0;
        boolean check = false;
        for (double cast : numbers) {
            if (cast < 0) {
                check = true;
            } else if (cast > 0 && check) {
                numCount++;
                allNum += cast;
                System.out.println(cast);
            }
        }
        System.out.println("Среднее арифметическое число" + allNum / numCount);
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    double teamp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = teamp;
                }
            }
        }
    }
}
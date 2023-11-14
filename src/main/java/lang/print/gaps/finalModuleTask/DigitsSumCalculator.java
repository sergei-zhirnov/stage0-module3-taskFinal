package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int s1 = number % 10;
        number = number / 10;

        int s2 = number % 10;
        number = number / 10;

        int s3 = number % 10;
        number = number / 10;

        int s4 = number % 10;

        int result = s1 + s2 + s3 + s4;

        System.out.println(result);
    }
}

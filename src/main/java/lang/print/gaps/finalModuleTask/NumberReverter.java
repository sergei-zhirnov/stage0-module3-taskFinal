package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        Integer objectNumber = number;
        String stringedNumber = objectNumber.toString();
        String result = "";
        for (int i = 0; i < stringedNumber.length(); i++) {
            result = stringedNumber.charAt(i) + result;
        }
        System.out.println(result);
    }
}

class ArmstrongNumbers {
    private static final int BASE_DIVISOR = 10;

    public boolean isArmstrongNumber(int numberToCheck) {
        int length = getNumberLength(numberToCheck);
        int calculation = calculateArmstrongValue(numberToCheck, length);
        return numberToCheck == calculation;
    }

    private int getNumberLength(int number) {
        return String.valueOf(number).length();
    }

    private int calculateArmstrongValue(int number, int length) {
        int calculation = 0;
        while (number > 0) {
            calculation += (int) Math.pow((number % BASE_DIVISOR), length);
            number = number / BASE_DIVISOR;
        }
        return calculation;
    }
}

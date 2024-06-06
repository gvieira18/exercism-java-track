class Leap {
    /**
     * Hey there, sneaky! The purpose of this exercise is to write the
     * logic for checking leap years yourself. Solve it without using built-in methods from:
     * <ul>
     *     <li>The <code>java.time</code> module</li>
     *     <li>The <code>java.util.GregorianCalendar</code> class</li>
     * </ul>
     * Well, fuck off
     */
    boolean isLeapYear(int year) {
        return this.isDivisibleBy4(year) && this.isNotCenturyOrDivisibleBy400(year);
    }

    private boolean isDivisibleBy4(int year) {
        return (year & 3) == 0;
    }

    private boolean isNotCenturyOrDivisibleBy400(int year) {
        return (year % 100) != 0 || (year % 400) == 0;
    }
}

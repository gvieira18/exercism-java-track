class Darts {
    private int getPoints(double radius) {
        if (radius > 10) {
            return 0;
        } else if (radius > 5) {
            return 1;
        } else if (radius > 1) {
            return 5;
        }
        
        return 10;
    }

    int score(double xOfDart, double yOfDart) {
        double radius = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);
        return this.getPoints(radius);
    }
}

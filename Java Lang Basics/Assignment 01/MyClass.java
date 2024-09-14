class MyClass {
    private int number;

    public MyClass() {
        this.number = 0;
    }

    public MyClass(int number) {
        this.number = number;
    }

    public boolean isOdd() {
        return (this.number % 2) != 0;
    }

    public boolean isEven() {
        return (this.number % 2) == 0;
    }

    public boolean isNegative() {
        return number < 0;
    }

    public boolean isPositive() {
        return number > 0;
    }

    public boolean isZero() {
        return (number == 0);
    }
}

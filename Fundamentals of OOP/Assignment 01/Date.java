class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        day = 1;
        month = 1;
        year = 2024;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date getDate() {
        System.out.println(day);
        return this;
    }

    public void setDate(Date d) {
        this.day = d.day;
        this.month = d.month;
        this.year = d.year;
    }

    public void displayWithFormat(char ch) {
        System.out.println(day + "" + ch + "" + month + "" + ch + "" + year);
    }

    public void display() {
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }
}

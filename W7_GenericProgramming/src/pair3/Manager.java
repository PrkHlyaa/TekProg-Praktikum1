package pair3;

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double bonus, int year, int month, int day) {
        super(name);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
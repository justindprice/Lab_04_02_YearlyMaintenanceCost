public class Main {
    public static void main(String[] args) {
        double springCost = 150.00;
        double summerCost = 250.50;
        double fallCost = 100.00;
        double winterCost = 300.25;
        double totalYearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Maintenance Costs: Spring $" + springCost + ", Summer $" + summerCost +
                ", Fall $" + fallCost + ", Winter $" + winterCost);
        System.out.println("The total yearly maintenance cost is $" + totalYearlyCost);
    }
}
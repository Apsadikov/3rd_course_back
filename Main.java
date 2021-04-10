public class Main {
    public static void main(String[] args) {
        ShippingCalculator shippingCalculator = new ShippingCalculator(new CalculatorFactory().create(FedexCalculatorStategy.class));
        double cost = shippingCalculator.calculate();
        new ShippingCostEmail().sendEmailWithShippingCost(cost);
    }
}

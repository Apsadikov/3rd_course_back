public class ShippingCalculator {
    private CalculationStrategy calculationStrategy;

    public ShippingCalculator(CalculationStrategy calculationStrategy) {
        this.calculationStrategy = calculationStrategy;
    }

    public double calculate() {
        return calculationStrategy.calculate();
    }
}

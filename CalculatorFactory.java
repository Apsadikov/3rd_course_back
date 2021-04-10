public class CalculatorFactory {
    public CalculationStrategy create(Class type) {
        if (type.getName().equals(USPSCalculatorStategy.class.getName())) {
            return new USPSCalculatorStategy();
        } else if (type.getName().equals(FedexCalculatorStategy.class.getName())) {
            return new FedexCalculatorStategy();
        } else if (type.getName().equals(UPSCalculatorStategy.class.getName())) {
            return new FedexCalculatorStategy();
        } else {
            throw new UnsupportedOperationException("not postal service found");
        }
    }
}

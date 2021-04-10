public class ShippingCostEmail {
    private BaseEmail baseEmail;

    public ShippingCostEmail() {
        baseEmail = new BaseEmail();
    }

    public void sendEmailWithShippingCost(double cost) {
        baseEmail.sendEmail(new Mail("to@example.com", "price", String.valueOf(cost)));
    }
}

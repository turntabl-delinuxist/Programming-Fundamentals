package Trade;

public class BondTrade extends Trade{
    private final double dividend;

    public BondTrade(String id, String symbol, int quantity, double price, double dividend){
        super(id,symbol,quantity,price);
        this.dividend = dividend;
    }
    @Override
    public double calcDividend() {
        return dividend;
    }
}

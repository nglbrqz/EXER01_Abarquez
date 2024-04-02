package MyLib.LotManagement;

/**
 *
 * @author Angela
 */
public class Price {
    
    private double value;
    private char currency='₱';

    public Price(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    public String generatePriceString(){
        value = this.value;
        currency = this.currency;
        return currency + " " + value;
    }
    
}

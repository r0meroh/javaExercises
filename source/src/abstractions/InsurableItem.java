package abstractions;

public interface InsurableItem extends Transportable, Sellable {
    // returns the value of insured item
    public int insuredValue();
}

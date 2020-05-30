package abstractions;

// interface for the sellable ADT
public interface Sellable {

    // description of th sellable type
    public String description();

    // list of the price in cents
    public int listPrice();

    // lowest price accepted
    public int lowestPrice();

}


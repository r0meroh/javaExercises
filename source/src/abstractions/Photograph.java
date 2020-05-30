package abstractions;

// a class for photographs that can be sold through the implementation of the Sellable Interface
public class Photograph implements Sellable {
    // Photograph object

    // class variables
    private String descript; //string to name the photo
    private int price; // price of individual photo
    private boolean color; // true or false value for the inclusion of color in the photo

    // object constructor
    public Photograph(String desc, int prce, boolean colr){
        this.descript = desc;
        this.price = prce;
        this.color = colr;
    }

    // class overloaded methods

    public String description(){
        return descript;
    }

    public int listPrice(){
        return price;
    }

    public int lowestPrice(){
        return price/2;
    }

    public boolean isColor(){ return color;}
}

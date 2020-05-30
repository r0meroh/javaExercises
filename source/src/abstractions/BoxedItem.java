package abstractions;

// object class that implements two different ADT interfaces at once
public class BoxedItem implements Sellable, Transportable {
    // private class variables
    private  String descript; // item description
    private int price; // box price
    private int weight; // box weight
    private boolean hazardous; // is hazardous

    // box dimensions
    private int height = 0;
    private int width = 0;
    private int depth = 0;

    // constructor
    public BoxedItem(String desc, int pric, int wght, boolean haz){
        this.descript = desc;
        this.price = pric;
        this.hazardous = haz;
        this.weight = wght;
    }

    // overloaded class methods

    public String description(){ return descript;}
    public int listPrice(){ return price;}
    public int lowestPrice(){ return price/2;}
    public int weight(){ return weight;}
    public boolean isHazardous(){ return hazardous;}

    // class specific methods
    public int insuredValue(){ return price * 2;}
    public void createBox(int hgth, int wid, int dep){
        this.height = hgth;
        this.width = wid;
        this.depth = dep;
    }
    public int[] boxDimensions(){
        int[] dimensions = {height, width, depth};
        return dimensions;
    }
    public void printDimensions(int[] dims){
        for(int x = 0; x < dims.length; x++){
            System.out.print(dims[x] + " ");
        }
    }
}

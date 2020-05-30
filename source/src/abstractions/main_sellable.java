package abstractions;

public class main_sellable {
    public static void main(String[] args){

        Photograph photo = new Photograph("selfie", 11, true);

        System.out.println(photo.description());
        System.out.println(photo.isColor());
        System.out.println(photo.listPrice());

        BoxedItem boxy = new BoxedItem("Heavy Box", 100, 39, false);
        boxy.createBox(10,19,20);
        System.out.println(boxy.description());
        System.out.println("The box is valued at " + boxy.listPrice());
        System.out.println("The lowest appraisal is " + boxy.lowestPrice());
        System.out.println("The box weighs " + boxy.weight());
        System.out.println("Is the package hazardous? " + boxy.isHazardous());
        System.out.println("The shipment is insured for " + boxy.insuredValue() + " to compensate both parties");
        System.out.println(" the height, width and depth are : " );
        boxy.printDimensions(boxy.boxDimensions());

    }
}

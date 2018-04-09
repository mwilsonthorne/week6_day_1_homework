public class Runner {

    public static void main(String[] args) {

        Bottle volume = new Bottle(100);

        System.out.println("The starting volume is " + volume.getVolume() + " Litres");
        System.out.println("Someone has taken a drink so the volume is now " + volume.getDrink()+ " Litres");
        System.out.println("The water bottle has been emptied as the volume is now " + volume.getEmpty() + " Litres");
        System.out.println("The water bottle has been refilled as the volume is now " + volume.getFill() + " Litres");

    }
}

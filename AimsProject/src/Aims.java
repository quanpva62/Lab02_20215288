		//5
public class Aims {
    public static void main(String[] args) {
        //10
    	Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Movie 1");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Comedy", "Movie 2", 9.99);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Action", "Director A", "Movie 3", 12.99);

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        System.out.println("Total cost: $" + cart.totalCost());
        //11
        cart.removeDigitalVideoDisc(dvd2);
        System.out.println("Total cost after removing dvd2: $" + cart.totalCost());

    }
}


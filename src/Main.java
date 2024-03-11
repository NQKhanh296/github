public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        Flower rose = new Rose();
        Flower rose1 = new Rose();
        Flower rose2 = new Rose();
        Flower rose3 = new Rose();
        Flower rose4 = new Rose();
        Flower rose5 = new Rose();
        try {
            farm.addFlower(rose);
            farm.addFlower(rose1);
            farm.addFlower(rose2);
            farm.addFlower(rose3);
            farm.addFlower(rose4);
            farm.addFlower(rose5);
        } catch (Exception e) {
            System.out.println("limit is 5");
        }

    }
}
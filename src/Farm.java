import java.util.ArrayList;
import java.util.Random;

public class Farm {
    private ArrayList<Animal> animals;
    private ArrayList<Flower> flowers;
    private int area;

    public Farm() {
        animals= new ArrayList<>();
        flowers = new ArrayList<>();
        area = 100;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    public void addFlower(Flower flower) throws Exception {
        int limit = 5;
        int ha = 0;
        for(int i = 0; i< flowers.size(); i++){
            ha+=flowers.get(i).neededArea;
        }
        if(flowers.size()<limit && ha<area){
            flowers.add(flower);
        }else throw new Exception();
    }
    public void waterTheFlower(int flowerNumber){
        Random random = new Random();
        int percentage = random.nextInt(5)+1;
        flowers.get(flowerNumber).chanceOfGrowth+=percentage;
    }
    public void harvest(int flowerNumber){
        flowers.remove(flowerNumber);
    }

}

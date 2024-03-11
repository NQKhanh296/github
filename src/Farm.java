import java.util.ArrayList;

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

}

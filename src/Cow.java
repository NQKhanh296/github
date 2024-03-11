public class Cow extends Animal{
    protected String type;
    protected String name;
    protected Size size;
    protected String specialCare;

    public Cow(String type, String name, Size size, String specialCare) {
        this.type = type;
        this.name = name;
        this.size = size;
        this.specialCare = specialCare;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }
}

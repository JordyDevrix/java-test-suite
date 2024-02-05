import java.util.Objects;

public class Data {

    private String brand;

    private String model;

    private Integer year;

    public Data(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getSingleCarData() {
        return String.format("car brand: %s%ncar model: %s%ncar year: %s%n", brand, model, year);
    }

    public String getCarBrand() {
        if (Objects.equals(brand, "Mercedes")) {
            return "haha tüt tüt mottafückah, is mij grote trüts";
        }
        return null;
    }
}
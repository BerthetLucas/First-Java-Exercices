public class VideoGame {

    private String name;
    private double price;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public VideoGame(String name, double price, String gender) {
        this.name = name;
        this.price = price;
        this.gender = gender;
    }

    public String priceToString() {
        return String.format("%.2f", price);
    }

    public String toString() {
        return "[name=" + name + ", price=" + priceToString() + ", gender=" + gender + "]";
    }

}

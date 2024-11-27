public class FlowerPackage {

    private String type;
    private int num;
    private int time;
    private double price;

    public FlowerPackage(String type, int num, int time, double price) {
        this.type = type;
        this.num = num;
        this.time = time;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FlowerPackage{" +
                "type='" + type + '\'' +
                ", num=" + num +
                ", time=" + time +
                ", price=" + price +
                '}';
    }

    public FlowerPackage(String type, double price){ // סעיף א'
        this(type, 2000, 12, price);
    }

    public static void compensation(FlowerPackage[] arr, int flyTime){
        double totalLoss = 0;
        for (FlowerPackage fp : arr){
            if (fp.getTime() < flyTime){
                double loss = fp.getNum() * fp.getPrice();
                System.out.println("Invalid package: " + fp);
                System.out.println("Loss: "+loss);
                totalLoss += loss;
            }
        }

        System.out.println("Total loss: " +totalLoss);

    }

}

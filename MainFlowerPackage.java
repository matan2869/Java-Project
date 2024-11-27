public class MainFlowerPackage {
    public static void main(String[] args) {

        FlowerPackage standardPackage = new FlowerPackage("Lily", 1.5);
        System.out.println(standardPackage);

        FlowerPackage customPackage = new FlowerPackage("Rose", 50, 24, 2.5);
        System.out.println(customPackage);

        customPackage.setNum(60);
        customPackage.setNum(30);
        System.out.println("Update package: " + customPackage);

        FlowerPackage [] packages = {
                new FlowerPackage("Lily", 2000, 10, 1.5),
        new FlowerPackage("Rose", 1000, 15, 2.5),
                new FlowerPackage("Tulip", 3000, 8, 1.2)

      };

        int flyTime = 12;
    }
}
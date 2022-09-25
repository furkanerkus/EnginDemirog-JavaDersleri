public class Main {

    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "ASUS Laptop", 5000.0, 3, "Blue");
//        Product product = new Product();
//        product.setName("Laptop");
//        product.setId(1);
//        product.setDescription("ASUS Laptop");
//        product.setPrice(5000.0);
//        product.setStockAmount(3);
//        product.setColor("Blue");

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getCode());

    }
}

public class Main {
    public static void main(String[] args) {


        Product product=new Product(1,"Laptop","Asus laptop",3000,2,"siyah");
        Product product2=new Product();

    product2.setName("Laptop");
        product2.setId(1);
        product2.setDescription("asus laptop");
        product2.setPrice(5000);
        product2.setStockAmount(7);
        product2.setRenk("");




        ProductManager productManager=new ProductManager();
        productManager.Add(product);
       // productManager.Add2(1,"","",2,200);
       // productManager.Add2(1,"","",2,200);
       // productManager.Add2(1,"","",2,200);
        //productManager.Add2(1,"","",2,200);

        System.out.println(product.getName());
        System.out.println(product.getKod());
    }
}
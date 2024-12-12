//program demonstrating instance variables:

class Product{
//instance Variable
int productId;
String productName;
String productType;
int productPrice;
static String brandName;
//instance method
void productDetails(){
System.out.println("Product Details:"+productId+","+productName+","+productType+","+productPrice+","+brandName);
}
static void getBrand(){
System.out.println(brandName);
}
}
public class ProductDemo{
public static void main(String args[]){
//Product product1=new product();
Product product1=new Product();
product1.productId=1203;
product1.productName="Shirt";
product1.productType="Cloth";
product1.productPrice=2999;
Product.brandName="Adidas";
Product.getBrand();
Product product2=new Product();

product2.productId=1204;
product2.productName="Jacket";
product2.productType="Cloth";
product2.productPrice=2999;
Product.brandName="Adidas";
Product.getBrand();
}
public
}


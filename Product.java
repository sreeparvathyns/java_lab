public class Product{
int pcode;
String pname;
int price;

public static void main(String[] args) {
Product obj1= new Product();
Product obj2= new Product();
Product obj3= new Product();
obj1.pcode=123;
obj1.pname="flour";
obj1.price=100;
obj2.pcode=124;
obj2.pname="milk";
obj2.price=50;
obj3.pcode=125;
obj3.pname="spices";
obj3.price=75;
System.out.println("Product Name: " + obj1.pname );
System.out.println("Product Code: " + obj1.pcode );
System.out.println("Product Price: " + obj1.price );
System.out .println("-----------------------------");
System.out.println("Product Name: " + obj2.pname );
System.out.println("Product Code: " + obj2.pcode );
System.out.println("Product Price: " + obj2.price );
System.out .println("-----------------------------");
System.out.println("Product Name: " + obj3.pname );
System.out.println("Product Code: " + obj3.pcode );
System.out.println("Product Price: " + obj3.price );
System.out .println("-----------------------------");
if (obj1.price<obj2.price && obj1.price<obj3.price){
System.out.println("Product with lowest price is" +" "+obj1.pname );
}
else if (obj2.price<obj1.price && obj2.price<obj3.price){
System.out.println( "Product with lowest price is" +" "+obj2.pname );
}
else{
System.out.println("Product with lowest price is" +" "+obj3.pname);
}
}
}
	


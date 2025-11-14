
public static void main(String[] args){
  
Product laptop = new Product("12345", "Laptop", "1.0", 1000.00);
License licenta = new License("123456789", "2023-12-31", laptop);
User john = new User("John Doe", "john.doe@example.com", licenta);

System.out.println(laptop);
System.out.println(licenta);
System.out.println(john);

}

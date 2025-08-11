package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.util.Collections.list;

public class Program {
    public static void main (String[] args) throws ParseException {

        SimpleDateFormat date= new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int number = sc.nextInt();

        for(int i = 1; i <= number; i++){
            System.out.printf("\nProduct #%d data:  \n", i );
            System.out.print("Common, used or imported (c/u/i): ");
            char cui = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (cui == 'c'){
                list.add(new Product(name,price));
            } else if (cui == 'u') {
                System.out.print("Manufacture Date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name,price,manufactureDate));
            }else{
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name,price,customsFee));
            }
        }
        System.out.println("\n PRICE TAGS: ");
        for(Product product: list){
            System.out.println(product.priceTag());
        }


        sc.close();
    }
}


import java.util.ArrayList;
import java.util.List;

class Product {
    String productName;
    double unitPrice;
    int quantity;
    double gstPercentage;

    
    public Product(String productName, double unitPrice, int quantity, double gstPercentage) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.gstPercentage = gstPercentage;
    }
}

public class tech {
    public static void main(String[] args) {
      
        List<Product> basket = new ArrayList<>();

        
        basket.add(new Product("Leather Wallet", 1100, 1, 18));
        basket.add(new Product("Umbrella", 900, 4, 12));
        basket.add(new Product("Cigarette", 200, 3, 28));
        basket.add(new Product("Honey", 100, 2, 0));

       
        double totalAmount = 0;

        
        String maxGstProduct = "";
        double maxGstAmount = 0;

        for (Product product : basket) {
            double unitPrice = product.unitPrice;
            int quantity = product.quantity;
            double gstPercentage = product.gstPercentage;

          
            double productAmount = unitPrice * quantity;


            if (unitPrice >= 500) {
                productAmount *= 0.95; 
            }

          
            double gstAmount = (productAmount * gstPercentage) / 100;

            
            totalAmount += (productAmount + gstAmount);

      
            if (gstAmount > maxGstAmount) {
                maxGstAmount = gstAmount;
                maxGstProduct = product.productName;
            }
        }

      
        System.out.printf("Total amount to be paid to the shopkeeper: Rs. %.2f\n", totalAmount);
        System.out.println("Product for which the maximum GST amount is paid: " + maxGstProduct);
    }
}

package Test.Lab_Program_20_Electricity_Bill_Calculation;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhushan.config.AppConfig;
import com.bhushan.sbeans.BillingStrategy;
import com.bhushan.sbeans.CommercialBilling;
import com.bhushan.sbeans.ElectricityBillingSystem;
import com.bhushan.sbeans.InndustrialBilling;
import com.bhushan.sbeans.ResidentialBilling;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       BillingStrategy billing = null;
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter Customer Type : ");
       String customerType = sc.nextLine();
       
       System.out.println("Enter total Unit consumed : ");
       int units = Integer.parseInt(sc.nextLine());
       
       if(customerType.equalsIgnoreCase("residential")) {
    	       billing = ctx.getBean(ResidentialBilling.class);
       }
       else if(customerType.equalsIgnoreCase("commercial")) {
    	       billing = ctx.getBean(CommercialBilling.class);
       }
       else if(customerType.equalsIgnoreCase("industrial")) {
	       billing = ctx.getBean(InndustrialBilling.class);
       }
       
       ElectricityBillingSystem bill = new ElectricityBillingSystem(billing);
       bill.showBill(units);
       sc.close();
       ctx.close();
    }
}

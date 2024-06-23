import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rental data");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.print("Return (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));
        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();
        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
        rentalService.processInvoice(carRental);
        System.out.print("INVOICE:");
        System.out.print("Basic payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.print("Tax: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.print("Total payment: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

        sc.close();

    }
}

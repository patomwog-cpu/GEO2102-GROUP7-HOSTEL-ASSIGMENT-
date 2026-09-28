public class Main {
    public static void main(String[] args) {

        // Group 7 hostel records: H28 to H31
        Hostel[] hostels = {
            new Hostel("H28", "Ndagire Hostel",
                    "Not self-contained (Single)", 650000,
                    "Occupied", 0.59956051, 32.474724),

            new Hostel("H29", "Lisan Hostel",
                    "Self-contained (Single)", 500000,
                    "Occupied", 0.59909215, 32.474489),

            new Hostel("H30", "Moze Hostel (Twins Guest House)",
                    "Self-contained (Double)", 1000000,
                    "Occupied", 0.59838342, 32.475535),

            new Hostel("H31", "Peaches",
                    "Half self-contained (Single)", 800000,
                    "Partially Occupied", 0.59806894, 32.476105)
        };

        double totalRentalPrice = 0;
        int fullyOccupied = 0;
        int notFullyOccupied = 0;

        System.out.println("==================================================");
        System.out.println("        GEO 2102 - GROUP 7 HOSTEL REPORT");
        System.out.println("==================================================");

        // Loop through all hostel objects in the array
        for (Hostel hostel : hostels) {

            System.out.println("\n--------------------------------------------------");
            hostel.displayDetails();

            // Boolean value required by the assignment
            boolean isOccupied = hostel.isOccupied();

            // Selection statement
            if (isOccupied) {
                System.out.println("Occupancy Result: Fully Occupied");
                fullyOccupied++;
            } else {
                System.out.println("Occupancy Result: Not Fully Occupied");
                notFullyOccupied++;
            }

            totalRentalPrice += hostel.getRentalPrice();
        }

        // Calculate average rental price
        double averageRentalPrice = totalRentalPrice / hostels.length;

        System.out.println("\n==================================================");
        System.out.println("                SUMMARY");
        System.out.println("==================================================");
        System.out.printf("Average Rental Price: UGX %,.0f%n", averageRentalPrice);
        System.out.println("Fully Occupied Hostels: " + fullyOccupied);
        System.out.println("Not Fully Occupied Hostels: " + notFullyOccupied);
        System.out.println("Total Hostels Processed: " + hostels.length);
        System.out.println("==================================================");
    }
}

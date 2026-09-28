public class Hostel {
    // Fields for storing hostel information
    private String hostelId;
    private String hostelName;
    private String accommodationType;
    private double rentalPrice;
    private String occupancyStatus;
    private double latitude;
    private double longitude;

    // Constructor
    public Hostel(String hostelId, String hostelName, String accommodationType,
                  double rentalPrice, String occupancyStatus,
                  double latitude, double longitude) {
        this.hostelId = hostelId;
        this.hostelName = hostelName;
        this.accommodationType = accommodationType;
        this.rentalPrice = rentalPrice;
        this.occupancyStatus = occupancyStatus;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters
    public String getHostelId() {
        return hostelId;
    }

    public String getHostelName() {
        return hostelName;
    }

    public String getAccommodationType() {
        return accommodationType;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public String getOccupancyStatus() {
        return occupancyStatus;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    // Returns true only when the hostel is fully occupied
    public boolean isOccupied() {
        return occupancyStatus.equalsIgnoreCase("Occupied");
    }

    // Displays all details of one hostel
    public void displayDetails() {
        System.out.println("Hostel ID: " + hostelId);
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Accommodation Type: " + accommodationType);
        System.out.printf("Rental Price: UGX %,.0f%n", rentalPrice);
        System.out.println("Occupancy Status: " + occupancyStatus);
        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
    }
}

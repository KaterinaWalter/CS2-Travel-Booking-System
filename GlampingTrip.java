public class GlampingTrip {
    // 1. INSTANCE VARIABLES (data)
    private static int processFee = 75; // class variable
    private String travelerName; // provided by client
    private String destination; // provided by client
    private int durationInDays; // provided by client
    private boolean isOutdoorsy; // provided by client
    private double totalCost; // calculated later
    
    // 2. CONSTRUCTORS (default + parameterized)
    public GlampingTrip() {
        this.travelerName = "DefaultClient";
        this.destination = "Yellowstone National Park";
        this.durationInDays = 5;
        this.isOutdoorsy = true;
        this.totalCost = processFee * this.durationInDays; // calculation
    }
    public GlampingTrip(String name, String destination, int duration, boolean outdoorsy) {
        this.travelerName = name; // set instance variable to client-provided value
        this.destination = destination;
        this.durationInDays = duration;
        this.isOutdoorsy = outdoorsy;
        this.totalCost = processFee * this.durationInDays; // calculation
    }

}
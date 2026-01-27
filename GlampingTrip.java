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
    public GlampingTrip(String n, String des, int dur, boolean o) {
        this.travelerName = n; // set instance variable to client-provided value
        this.destination = des;
        this.durationInDays = dur;
        this.isOutdoorsy = o;
        this.totalCost = processFee * this.durationInDays; // calculation
    }

    // GETTERS (one for each inst. var.)

    // SETTERS (for each inst. var. EXCEPT totalCost)
    public void setDurationInDays(int newDuration) {
        this.durationInDays = newDuration;
    }

    // Special setter for totalCost just RECALCULATES cost
    public void setTotalCost() {
        this.totalCost = processFee * this.durationInDays;
    }

    // toString (see example on course site)

}
package screenmatch.model;

import screenmatch.computations.Classifiable;

public class Title implements Classifiable {

    private String Name;
    private int Year;
    private float SumOfRatings;
    private int ratingTotal;
    private  int durationInMinutes;

    // ---------------------- GETTERS ----------------------

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public String getName() {
        return Name;
    }

    public int getYear() {
        return Year;
    }

    public int getRatingTotal() {
        return ratingTotal;
    }

    public float getSumOfRatings() {
        return SumOfRatings;
    }

    // ---------------------- SETTERS ----------------------

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void ShowTechnicalSpecifications (){
        System.out.println("Name: " + Name);
        System.out.println("   Year: " + Year);
        System.out.println("  Minutes: " + getDurationInMinutes());
    }

    public void evaluates(float rating){
        SumOfRatings = SumOfRatings + rating;
        ratingTotal++;
    }

    public double averageRating(){
        return (SumOfRatings/ratingTotal);
    }

    @Override
    public int getClassifiable() {
        return (int) averageRating() /2;
    }

}

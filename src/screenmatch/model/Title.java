package screenmatch.model;

public class Movie {

    private String movieName;
    private int movieYear;
    private float SumOfRatings;
    private int ratingTotal;
    private  int durationInMinutes;

    // ---------------------- GETTERS ----------------------

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public int getRatingTotal() {
        return ratingTotal;
    }

    public float getSumOfRatings() {
        return SumOfRatings;
    }

    // ---------------------- SETTERS ----------------------

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void ShowTechnicalSpecifications (){
        System.out.println("Name of the movie: " + movieName);
        System.out.println("   Year of the movie: " + movieYear);
        System.out.println("  Minutes in the movie: " + durationInMinutes);
    }

    public void evaluates(float rating){
        SumOfRatings = SumOfRatings + rating;
        ratingTotal++;
    }

    public double averageRating(){
        return (SumOfRatings/ratingTotal);
    }

}

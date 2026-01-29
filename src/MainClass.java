import screenmatch.model.Movie;
import screenmatch.model.Series;
import screenmatch.model.Title;

public class MainClass {

    static void main(String[]args) {

        Movie myMovie = new Movie();

        myMovie.setName("Spider Man");
        myMovie.setYear(2002);
        myMovie.setDurationInMinutes(121);

        myMovie.ShowTechnicalSpecifications();

        myMovie.evaluates(9);
        myMovie.evaluates(10);
        myMovie.evaluates(8);
        System.out.println(myMovie.getSumOfRatings());
        System.out.println(myMovie.getRatingTotal());
        System.out.println(myMovie.averageRating());
        System.out.println("Movie classification in stars: " + myMovie.getClassifiable());

        System.out.println("\n\n");

        Series mySeries = new Series();

        mySeries.setName("Suits");
        mySeries.setYear(2011);
        mySeries.setSeasons(9);
        mySeries.setEpisodesPerSeason(15); // Number used for testing only
        mySeries.setMinutesPerEpisode(44);
        System.out.println("you´ll need" + mySeries.getDurationInMinutes() + " to watch all the show");

        mySeries.ShowTechnicalSpecifications();

        mySeries.evaluates(7);
        mySeries.evaluates(8);
        mySeries.evaluates(8.5f);
        System.out.println(mySeries.getSumOfRatings());
        System.out.println(mySeries.getRatingTotal());
        System.out.println(mySeries.averageRating());
        System.out.println("Show classification in stars: " + mySeries.getClassifiable());




    }
}

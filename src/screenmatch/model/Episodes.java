package screenmatch.model;

import screenmatch.computations.Classifiable;

public class Episodes extends Title implements Classifiable {

    private int number;
    private String name;
    private Series series;
    private int totalViews;

    //---------------------- GETTERS----------------------
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Series getSeries() {
        return series;
    }

    public int getTotalViews() {
        return totalViews;
    }

    //---------------------- SETTERS ----------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    //---------------------------------------------------

    @Override
    public int getClassifiable() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }

}


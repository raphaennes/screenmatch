package screenmatch.model;

public class Series extends Title {

    private int seasons;
    private int episodesPerSeason;
    private boolean isActive;
    private float minutesPerEpisode;

    // ---------------------- GETTERS ----------------------
    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public int getSeasons() {
        return seasons;
    }

    public float getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    // ---------------------- SETTERS ----------------------
    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setMinutesPerEpisode(float minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    // -----------------------------------------------------------------------

    @Override
    public int getDurationInMinutes() {
        return (int) (seasons * episodesPerSeason * minutesPerEpisode);
    }


}

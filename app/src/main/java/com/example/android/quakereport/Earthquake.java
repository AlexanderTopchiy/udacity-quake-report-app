package com.example.android.quakereport;


/**
 * {@link Earthquake} class represent some data about earthquake.
 */
public class Earthquake {

    // The magnitude of earthquake, the place where there was it and the date of event.
    private String mEarthquakeMagnitude;
    private String mEarthquakePlace;
    private String mEarthquakeDate;

    /**
     * Create new {@link Earthquake} object.
     * @param earthquakeMagnitude is the magnitude of earthquake.
     * @param earthquakePlace is the place where there was it.
     * @param earthquakeDate is the date of event.
     */
    public Earthquake(String earthquakeMagnitude, String earthquakePlace, String earthquakeDate) {
        mEarthquakeMagnitude = earthquakeMagnitude;
        mEarthquakePlace = earthquakePlace;
        mEarthquakeDate = earthquakeDate;
    }

    // Get the magnitude of earthquake.
    public String getEarthquakeMagnitude() {
        return mEarthquakeMagnitude;
    }

    // Get the name of place where there was it.
    public String getEarthquakePlace() {
        return mEarthquakePlace;
    }

    // Get the date of event.
    public String getEarthquakeDate() {
        return mEarthquakeDate;
    }

    // Set the magnitude of earthquake.
    public void setEarthquakeMagnitude(String earthquakeMagnitude) {
        mEarthquakeMagnitude = earthquakeMagnitude;
    }

    // Set the name of place where there was it.
    public void setEarthquakePlace(String earthquakePlace) {
        mEarthquakePlace = earthquakePlace;
    }

    // Set the name of place where there was it.
    public void setEarthquakeDate(String earthquakeDate) {
        mEarthquakeDate = earthquakeDate;
    }
}

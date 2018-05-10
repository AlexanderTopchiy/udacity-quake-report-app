package com.example.android.quakereport;


/**
 * This class represent some data about earthquake.
 */
public class Earthquake {

    // The magnitude of earthquake, the place where there was it and the date of event.
    private double mEarthquakeMagnitude;
    private String mEarthquakePlace;
    private String mEarthquakeDate;

    /**
     * Create new Earthquake object.
     * @param earthquakeMagnitude is the magnitude of earthquake.
     * @param earthquakePlace is the place where there was it.
     * @param earthquakeDate is the date of event.
     */
    public Earthquake(double earthquakeMagnitude, String earthquakePlace, String earthquakeDate) {
        mEarthquakeMagnitude = earthquakeMagnitude;
        mEarthquakePlace = earthquakePlace;
        mEarthquakeDate = earthquakeDate;
    }

    // Get the magnitude of earthquake.
    public double getEarthquakeMagnitude() {
        return mEarthquakeMagnitude;
    }

    // Get the name of place where there was it.
    public String getmEarthquakePlace() {
        return mEarthquakePlace;
    }

    // Get the date of event.
    public String getmEarthquakeDate() {
        return mEarthquakeDate;
    }
}

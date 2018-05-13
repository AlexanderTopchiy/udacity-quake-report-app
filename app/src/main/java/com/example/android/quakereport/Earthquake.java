package com.example.android.quakereport;


/**
 * {@link Earthquake} class represent some data about earthquake.
 */
public class Earthquake {

    // The magnitude of earthquake, the place where there was it and the date of event.
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    /**
     * Create new {@link Earthquake} object.
     * @param magnitude is the magnitude of earthquake.
     * @param location is the place where there was it.
     * @param timeInMilliseconds is the time of event.
     * @param url is the website URL to find more details about the earthquake.
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    // Get the magnitude of earthquake.
    public double getMagnitude() {
        return mMagnitude;
    }

    // Get the name of place where there was it.
    public String getLocation() {
        return mLocation;
    }

    // Get the date of event.
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    // Get the url of event.
    public String getUrl() {
        return mUrl;
    }
}

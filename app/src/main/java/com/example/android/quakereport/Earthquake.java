package com.example.android.quakereport;


/**
 * {@link Earthquake} class represent some data about earthquake.
 */
public class Earthquake {

    // The magnitude of earthquake, the place where there was it and the date of event.
    private String mMagnitude;
    private String mPlace;
    private long mTimeInMilliseconds;

    /**
     * Create new {@link Earthquake} object.
     * @param magnitude is the magnitude of earthquake.
     * @param place is the place where there was it.
     * @param timeInMilliseconds is the time of event.
     */
    public Earthquake(String magnitude, String place, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mPlace = place;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    // Get the magnitude of earthquake.
    public String getMagnitude() {
        return mMagnitude;
    }

    // Get the name of place where there was it.
    public String getPlace() {
        return mPlace;
    }

    // Get the date of event.
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}

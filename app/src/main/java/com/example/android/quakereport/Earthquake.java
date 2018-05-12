package com.example.android.quakereport;


/**
 * {@link Earthquake} class represent some data about earthquake.
 */
public class Earthquake {

    // The magnitude of earthquake, the place where there was it and the date of event.
    private String mMagnitude;
    private String mPlace;
    private String mDate;

    /**
     * Create new {@link Earthquake} object.
     * @param magnitude is the magnitude of earthquake.
     * @param place is the place where there was it.
     * @param date is the date of event.
     */
    public Earthquake(String magnitude, String place, String date) {
        mMagnitude = magnitude;
        mPlace = place;
        mDate = date;
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
    public String getDate() {
        return mDate;
    }

    // Set the magnitude of earthquake.
    public void setMagnitude(String magnitude) {
        mMagnitude = magnitude;
    }

    // Set the name of place where there was it.
    public void setPlace(String place) {
        mPlace = place;
    }

    // Set the name of place where there was it.
    public void setDate(String date) {
        mDate = date;
    }
}

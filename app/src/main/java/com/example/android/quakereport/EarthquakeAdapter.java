package com.example.android.quakereport;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.ArrayList;


/**
 * {@link EarthquakeAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Earthquake} objects.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    // Constant what using to separate offset and primary locations.
    private static final String LOCATION_SEPARATOR = " of ";


    /**
     * Create a new {@link EarthquakeAdapter} object.
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param object is the list of {@link Earthquake}s to be displayed.
     */
    public EarthquakeAdapter(Context context, ArrayList<Earthquake> object) {
        super(context, 0, object);
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     * @param position The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Create a ViewHolder object.
        ViewHolder holder;

        // Check if the existing view is being reused, otherwise inflate the view.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.earthquake_list_item, parent, false);
            holder = new ViewHolder();
            holder.magnitudeTextView = convertView.findViewById(R.id.magnitude);
            holder.locationOffsetTextView = convertView.findViewById(R.id.location_offset);
            holder.primaryLocationTextView = convertView.findViewById(R.id.primary_location);
            holder.dateTextView = convertView.findViewById(R.id.date);
            holder.timeTextView = convertView.findViewById(R.id.time);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // Get the Earthquake object located at this position in the list.
        Earthquake currentEarthquake = getItem(position);

        // Get the original location string from the Earthquake object and
        // split it to 2 TextView (location_offset and primary_location) by using split() method.
        String originalLocation = currentEarthquake.getLocation();
        String locationOffset;
        String primaryLocation;
        if (originalLocation.contains(LOCATION_SEPARATOR)) {
            String[] parts = originalLocation.split(LOCATION_SEPARATOR);
            locationOffset = parts[0] + LOCATION_SEPARATOR;
            primaryLocation = parts[1];
        } else {
            locationOffset = getContext().getString(R.string.near_the);
            primaryLocation = originalLocation;
        }

        // Create a new Date object from the time in milliseconds of the earthquake.
        Date dateObject = new Date(currentEarthquake.getTimeInMilliseconds());
        // Format the date string (i.e. "Mar 3, 1984").
        String formattedDate = formatDate(dateObject);
        // Format the time string (i.e. "4:30PM").
        String formattedTime = formatTime(dateObject);

        // Set proper data in earthquake_list_item by using ViewHolder.
        holder.magnitudeTextView.setText(currentEarthquake.getMagnitude());
        holder.locationOffsetTextView.setText(locationOffset);
        holder.primaryLocationTextView.setText(primaryLocation);
        holder.dateTextView.setText(formattedDate);
        holder.timeTextView.setText(formattedTime);

        return convertView;
    }


    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }


    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}

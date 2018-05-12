package com.example.android.quakereport;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;


/**
 * {@link EarthquakeAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Earthquake} objects.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

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
            holder.placeTextView = convertView.findViewById(R.id.place);
            holder.dateTextView = convertView.findViewById(R.id.date);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        // Get the Earthquake object located at this position in the list.
        Earthquake earthquake = getItem(position);

        // Set proper data in earthquake_list_item by using ViewHolder.
        holder.magnitudeTextView.setText(earthquake.getMagnitude());
        holder.placeTextView.setText(earthquake.getPlace());
        holder.dateTextView.setText(earthquake.getDate());

        return convertView;
    }
}

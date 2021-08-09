package com.example.andr17.LocationFragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.andr17.R;
import com.example.andr17.models.Lockats;

import java.util.ArrayList;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationHolder> {

    private ArrayList<Lockats> list;

    public LocationAdapter(Context context, ArrayList<Lockats> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public LocationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.location_item,parent,false);
        return new LocationHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull LocationAdapter.LocationHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class LocationHolder extends RecyclerView.ViewHolder {
        private TextView location , planetName;
        public LocationHolder(@NonNull View itemView) {
            super(itemView);
            location = itemView.findViewById(R.id.tv_loc);
            planetName = itemView.findViewById(R.id.tv_planetName);
        }

        public void onBind(Lockats lockats) {
            location.setText(lockats.getLocation());
            planetName.setText(lockats.getPlanetName());
        }
    }
}

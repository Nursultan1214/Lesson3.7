package com.example.andr17.LocationFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andr17.R;
import com.example.andr17.databinding.FragmentLocationBinding;
import com.example.andr17.models.Lockats;

import java.util.ArrayList;


public class LocationFragment extends Fragment {
    private ArrayList<Lockats> list;
    private RecyclerView rv;
    private LocationAdapter locationAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_location,null);
        list = new ArrayList<>();
        list.add(new Lockats("NBC-228","Planet"));
        list.add(new Lockats("NBC-228","Planet"));
        list.add(new Lockats("NBC-228","Planet"));
        list.add(new Lockats("NBC-228","Planet"));
        list.add(new Lockats("NBC-228","Planet"));
        list.add(new Lockats("NBC-228","Planet"));
        list.add(new Lockats("NBC-228","Planet"));
        list.add(new Lockats("NBC-228","Planet"));
        list.add(new Lockats("NBC-228","Planet"));
        list.add(new Lockats("NBC-228","Planet"));
        list.add(new Lockats("NBC-228","Planet"));
        rv = view.findViewById(R.id.locationRv);
        locationAdapter = new LocationAdapter(getContext(),list);
        rv.setLayoutManager(new GridLayoutManager(getContext(),2));
        rv.setAdapter(locationAdapter);
        return  view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
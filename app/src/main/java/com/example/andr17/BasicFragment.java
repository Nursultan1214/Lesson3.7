package com.example.andr17;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andr17.databinding.FragmentBasicBinding;
import com.example.andr17.models.Characters;

public class BasicFragment extends Fragment {
    private FragmentBasicBinding basicBinding;
    private Characters characters;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        basicBinding = FragmentBasicBinding.inflate(inflater,container,false);
        return basicBinding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        characters = (Characters) getArguments().getSerializable("model");
        if (characters != null){
            basicBinding.tvName.setText(characters.getName());
            basicBinding.tvStatus.setText(characters.getStatus());
            basicBinding.imafd.setImageResource(characters.getImage());
        }
    }
}
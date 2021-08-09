package com.example.andr17.CharacterFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andr17.BasicFragment;
import com.example.andr17.MainActivity;
import com.example.andr17.R;
import com.example.andr17.databinding.FragmentCharacterBinding;
import com.example.andr17.models.Characters;

import java.util.ArrayList;

public class CharacterFragment extends Fragment implements CharacterAdapter.OnItemClickListener {

    private FragmentCharacterBinding binding;
    private ArrayList<Characters> list;
    private CharacterAdapter characterAdapter;
    private RecyclerView rv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_character, null);
        list = new ArrayList<>();
        list.add(new Characters(R.drawable.director, "dead", "Agency director"));
        list.add(new Characters(R.drawable.rick, "alive", "Rick Sanchez"));
        list.add(new Characters(R.drawable.morty, "alive", "Morty Smith"));
        list.add(new Characters(R.drawable.mom, "alive", "Summer Smith"));
        list.add(new Characters(R.drawable.albert, "dead", "Albert Einstein"));
        list.add(new Characters(R.drawable.ralls, "dead", "Alan Rails"));
        list.add(new Characters(R.drawable.father, "alive", "Jerry Smith"));
        list.add(new Characters(R.drawable.jij, "dead", "Adjudicator Rick "));
        rv = view.findViewById(R.id.characterRv);
        characterAdapter = new CharacterAdapter(getContext(),list);
        rv.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rv.setAdapter(characterAdapter);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        characterAdapter.setOnItemClickListener(this);
    }

    @Override
    public void onClick(int pos) {
        Bundle bundle = new Bundle();
        Characters c = characterAdapter.getItem(pos);
        Fragment fragment= new BasicFragment();
        bundle.putSerializable("model", c);
        fragment.setArguments(bundle);

        getParentFragmentManager().beginTransaction().replace(R.id.mContainer,fragment).addToBackStack(null).commit();
    }
}
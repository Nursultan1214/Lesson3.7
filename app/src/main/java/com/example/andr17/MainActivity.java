package com.example.andr17;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.andr17.CharacterFragment.CharacterFragment;
import com.example.andr17.LocationFragment.LocationFragment;
import com.example.andr17.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
   private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        initBottomNav();
    }

    private void initBottomNav() {
        getSupportFragmentManager().beginTransaction().replace(R.id.mContainer,new CharacterFragment()).commit();
        binding.botNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.character:
                        binding.tvTool.setText("Character");
                        getSupportFragmentManager().beginTransaction().replace(R.id.mContainer,new CharacterFragment()).addToBackStack(null).commit();
                        break;
                    case R.id.location:
                        binding.tvTool.setText("Location");
                        getSupportFragmentManager().beginTransaction().replace(R.id.mContainer,new LocationFragment()).addToBackStack(null).commit();
                        break;
                }
                return true;
            }
        });
    }
}
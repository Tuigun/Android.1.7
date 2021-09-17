package com.example.android17;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.android17.FirstFragment.FirstFragment;
import com.example.android17.R;
import com.example.android17.SecondFragment.SecondFragment;
import com.example.android17.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityMainBinding.inflate(getLayoutInflater());
        View view = bind.getRoot();
        setContentView(view);

        initBottomNav();
    }

    private void initBottomNav() {

        getSupportFragmentManager().beginTransaction().add(R.id.Conteinter,new FirstFragment()).commit();

        bind.btn.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.firstFragment:
                    getSupportFragmentManager().beginTransaction().replace(R.id.Conteinter,new FirstFragment()).commit();

                    break;

                    case R.id.secondFragment:

                        getSupportFragmentManager().beginTransaction().replace(R.id.Conteinter,new SecondFragment()).commit();

                        break;
                }


                return true;

            }
        });

    }

}
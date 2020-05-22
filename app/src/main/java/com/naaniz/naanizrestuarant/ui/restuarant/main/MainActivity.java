package com.naaniz.naanizrestuarant.ui.restuarant.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.naaniz.naanizrestuarant.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bnv = findViewById(R.id.bottomNavigationView);
        NavController navController = Navigation.findNavController(this, R.id.main_activity_nav_host);

        NavigationUI.setupWithNavController(bnv, navController);
        NavigationUI.setupActionBarWithNavController(this, navController);
    }
}

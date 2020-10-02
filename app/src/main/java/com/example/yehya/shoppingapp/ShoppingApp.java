package com.example.yehya.shoppingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;

import java.util.ArrayList;

public class ShoppingApp extends AppCompatActivity {


    public static ArrayList<componts> foods;
    public static ArrayList<componts> clothes;
    public static ArrayList<componts> electronics;
    private RecyclerView lv;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.nav_food:

                    FoodAdapter foodAdapter = new FoodAdapter(ShoppingApp.this, foods , R.layout.compont_item_design);
                    lv.setAdapter(foodAdapter);
                    GridLayoutManager fglm = new GridLayoutManager(getApplicationContext() , 2);
                    lv.setLayoutManager(fglm);
                    return true;


                case R.id.nav_clothes:

                    ClothesAdapter clothesAdapter = new ClothesAdapter(ShoppingApp.this , clothes , R.layout.compont_item_design);
                    lv.setAdapter(clothesAdapter);
                    GridLayoutManager cglm = new GridLayoutManager(getApplicationContext() , 2);
                    lv.setLayoutManager(cglm);
                    return true;


                case R.id.nav_electronic:

                    ElectronicAdapter electronicsAdapter = new ElectronicAdapter(ShoppingApp.this , electronics , R.layout.compont_item_design);
                    lv.setAdapter(electronicsAdapter);
                    GridLayoutManager eglm = new GridLayoutManager(getApplicationContext() , 2);
                    lv.setLayoutManager(eglm);
                    return true;
            }

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        // getSupportFragmentManager().beginTransaction().replace(R.id.content_main_food , new FoodFragment()).addToBackStack(null).commit();
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS , WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.navigation, new FoodFragment()).commit();


        foods = new ArrayList<>();
        componts food1 = new componts();
        food1.setName("Meat");
        food1.setPhotoIm(R.drawable.meat);

        componts food2 = new componts();
        food2.setName("Vegetable");
        food2.setPhotoIm(R.drawable.vegetables);

        componts food3 = new componts();
        food3.setName("Fish");
        food3.setPhotoIm(R.drawable.fish);

        componts food4 = new componts();
        food4.setName("Fruit");
        food4.setPhotoIm(R.drawable.fruit);

        foods.add(food1);
        foods.add(food2);
        foods.add(food3);
        foods.add(food4);


        clothes = new ArrayList<>();

        componts clothes1 = new componts();
        clothes1.setName("Summer Clothes");
        clothes1.setPhotoIm(R.drawable.summer);

        componts clothes2 = new componts();
        clothes2.setName("Winter Clothes");
        clothes2.setPhotoIm(R.drawable.winter);

        clothes.add(clothes1);
        clothes.add(clothes2);


         electronics = new ArrayList<>();
        componts electronic1 = new componts();
        electronic1.setName("Laptop");
        electronic1.setPhotoIm(R.drawable.computer);

        componts electronic2 = new componts();
        electronic2.setName("SmartPhone");
        electronic2.setPhotoIm(R.drawable.smartphone);

        componts electronic3 = new componts();
        electronic3.setName("Accessories");
        electronic3.setPhotoIm(R.drawable.watch_hand);

        componts electronic4 = new componts();
        electronic4.setName("KitchenTools");
        electronic4.setPhotoIm(R.drawable.kitchentools);

        electronics.add(electronic1);
        electronics.add(electronic2);
        electronics.add(electronic3);
        electronics.add(electronic4);

        lv = findViewById(R.id.recyclerView);

        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.cart);
        actionBar.setTitle("Shopping App");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            Intent intent = new Intent(getApplicationContext() , PurchasesActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}

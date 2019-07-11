package com.example.aacharya;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;




public class FeedActivity extends AppCompatActivity {
    int[] IMAGES = {R.drawable.javacourse1,R.drawable.javacourse2,R.drawable.pythoncourse1,R.drawable.pythoncourse2};
    ListView listView;
    CustomAdapter customAdapter;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);


        listView = (ListView) findViewById(R.id.listView);
        customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.customlayout, null);
            ImageView imageView = (ImageView) view.findViewById(R.id.post_image);

            imageView.setImageResource(IMAGES[position]);


            return view;
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    switch (menuItem.getItemId()) {
                        case R.id.home:
                            //startActivity(new Intent(FeedActivity.this, FeedActivity.class));
                            break;
                        case R.id.search:
                            //startActivity(new Intent(FeedActivity.this, Search_Activity.class));
                            break;
                        case R.id.add:
                            //startActivity(new Intent(FeedActivity.this, SelectDesignType.class));
                            break;
                        case R.id.heart:
                            //startActivity(new Intent(FeedActivity.this, FavoriteActivity.class));
                            break;
                        case R.id.profile:
                            //startActivity(new Intent(FeedActivity.this, ProfileActivity.class));
                            break;
                    }


                    return true;
                }
            };

}

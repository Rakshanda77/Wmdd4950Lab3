package com.example.lab3;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;



public class MainActivity extends AppCompatActivity {
    int flag = 52;
     final int DECK_SIZE = 52;
    ArrayList<Integer> deck = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Integer[] images = {R.drawable.ace_of_clubs, R.drawable.ace_of_diamonds, R.drawable.ace_of_hearts, R.drawable.ace_of_spades, R.drawable.ace_of_spades2, R.drawable.black_joker, R.drawable.two_of_spades, R.drawable.two_of_hearts, R.drawable.two_of_diamonds, R.drawable.two_of_clubs, R.drawable.eight_of_clubs, R.drawable.eight_of_diamonds, R.drawable.eight_of_hearts, R.drawable.eight_of_spades, R.drawable.five_of_clubs, R.drawable.five_of_diamonds, R.drawable.five_of_hearts, R.drawable.five_of_spades, R.drawable.four_of_clubs, R.drawable.four_of_diamonds, R.drawable.four_of_hearts, R.drawable.four_of_spades, R.drawable.jack_of_clubs, R.drawable.jack_of_clubs2, R.drawable.jack_of_diamonds, R.drawable.jack_of_diamonds2, R.drawable.jack_of_hearts, R.drawable.jack_of_hearts2, R.drawable.jack_of_spades, R.drawable.jack_of_spades2, R.drawable.king_of_clubs, R.drawable.king_of_clubs2, R.drawable.king_of_diamonds, R.drawable.king_of_diamonds2, R.drawable.king_of_hearts, R.drawable.king_of_hearts2, R.drawable.king_of_spades, R.drawable.king_of_spades2, R.drawable.nine_of_clubs, R.drawable.nine_of_diamonds, R.drawable.nine_of_hearts, R.drawable.nine_of_spades, R.drawable.queen_of_clubs, R.drawable.queen_of_clubs2, R.drawable.queen_of_diamonds, R.drawable.queen_of_diamonds2, R.drawable.queen_of_hearts, R.drawable.queen_of_hearts2, R.drawable.queen_of_spades, R.drawable.queen_of_spades2, R.drawable.red_joker, R.drawable.seven_of_clubs, R.drawable.seven_of_diamonds, R.drawable.seven_of_hearts, R.drawable.seven_of_spades, R.drawable.six_of_hearts, R.drawable.six_of_clubs, R.drawable.six_of_diamonds, R.drawable.six_of_spades, R.drawable.ten_of_clubs, R.drawable.ten_of_diamonds, R.drawable.ten_of_hearts, R.drawable.ten_of_spades, R.drawable.three_of_clubs, R.drawable.three_of_diamonds, R.drawable.three_of_hearts, R.drawable.three_of_spades};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final TextView t1 = findViewById(R.id.textView1);
        final ImageView image = findViewById(R.id.imageView);
        // final Integer[] flag = new Integer[52];
        t1.setText("Card Remaining" + " :" + " " + flag);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setImageResource(R.drawable.tap_and_play);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
                                   public void onClick(View view) {
                final ImageView[] imageview = new ImageView[1];

                                       //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                                       // .setAction("Action", null).show();
                                       // TextView t1 = findViewById(R.id.textview_main);
                                       // TextView t2 = findViewById(R.id.textView2);
                Random rand = new Random();
                for (int i = 0; i < DECK_SIZE; ++i) {
                    deck.add(i);
                }
                Collections.shuffle(Arrays.asList(images));
                image.setImageResource(images[rand.nextInt(images.length)]);


             //   for (int i = 0; i < images.length; i++) {
               //     int j = (int)(Math.random() * images.length); // Get a random index out of 52
                 //   int temp = images[i]; // Swap the cards
                   // images[i] = images[j];
                    //images[j] = temp;
                   // Collections.shuffle(i);

                //}
                flag--;
                t1.setText("Card Remaining" + " :" + " " + flag);
                if (flag >0) {
                    t1.setText("Card Remaining" + " :" + " " + flag);

                } else {
                    flag = 51;
                    t1.setText("Card Remaining" + " :" + " " + flag);
                                       }
                                   }
                               }
        );

    }
        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            final TextView t1 = findViewById(R.id.textView1);
            final ImageView image = findViewById(R.id.imageView);

            int id = item.getItemId();
            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                flag = 52
                ;
                t1.setText("Card Remaining" + " :" + " " + flag);
                image.setImageResource(R.drawable.black_joker);

            }
            return super.onOptionsItemSelected(item);
        }
    }


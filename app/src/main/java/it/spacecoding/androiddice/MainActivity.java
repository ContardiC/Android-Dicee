package it.spacecoding.androiddice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView mLeftDice, mRightDice;
    private int[] mDiceArray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6 };
    private Random mRandomNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLeftDice = (ImageView) findViewById(R.id.imageViewLeftDice);
        mRightDice = (ImageView) findViewById(R.id.imageViewRightDice);
        mRandomNumber = new Random();
    }

    public void rollDice(View view) {
        mLeftDice.setImageResource(mDiceArray[mRandomNumber.nextInt(6)]);
        mRightDice.setImageResource(mDiceArray[mRandomNumber.nextInt(6)]);



    }
}
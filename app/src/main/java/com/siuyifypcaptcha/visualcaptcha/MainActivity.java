package com.siuyifypcaptcha.visualcaptcha;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageButton cloud, duck, lightbulb, torch, truck, graduationcap, dogbone, tractor, servicebell, nut;
//    private ImageButton imageOne, imageTwo, imageThree, imageFour,imageFive;
    private TextView randomWord;
    private String randomtext;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //randomise textview
        randomWord = (TextView)findViewById(R.id.textviewrnd);
        String [] word ={"cloud", "duck", "light bulb", "torch", "truck", "graduation cap", "dog bone", "tractor", "service bell", "nut"};
        Random rnd = new Random();
        randomtext = word[rnd.nextInt(word.length)];
        randomWord.setText("Touch the " + randomtext + ".");


        //set click listener for the image buttons
        cloud = (ImageButton)findViewById(R.id.imageButton);
        cloud.setOnClickListener(this);

        duck = (ImageButton)findViewById(R.id.imageButton1);
        duck.setOnClickListener(this);

        lightbulb = (ImageButton)findViewById(R.id.imageButton2);
        lightbulb.setOnClickListener(this);

        torch = (ImageButton)findViewById(R.id.imageButton3);
        torch.setOnClickListener(this);

        truck = (ImageButton)findViewById(R.id.imageButton4);
        truck.setOnClickListener(this);

        graduationcap = (ImageButton)findViewById(R.id.imgButt1);
        graduationcap.setOnClickListener(this);

        dogbone = (ImageButton)findViewById(R.id.imgButt2);
        dogbone.setOnClickListener(this);

        tractor = (ImageButton)findViewById(R.id.imgButt3);
        tractor.setOnClickListener(this);

        servicebell = (ImageButton)findViewById(R.id.imgButt4);
        servicebell.setOnClickListener(this);

        nut = (ImageButton)findViewById(R.id.imgButt5);
        nut.setOnClickListener(this);

    }

    //on click, check what's the random text generated, then check if the user clicks on the right imagebutton.
    //if the user did not click on the right image button, they are expected to retry the challenge again.
    @Override
    public void onClick(View v){
        if (randomtext.equals("cloud") && (v.getId() == cloud.getId())){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
        else if (randomtext.equals("duck") && (v.getId() == duck.getId())){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
        else if (randomtext.equals("light bulb") && (v.getId() == lightbulb.getId())){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
        else if (randomtext.equals("torch") && (v.getId() == torch.getId())){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
        else if (randomtext.equals("truck") && (v.getId() == truck.getId())){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
        else if (randomtext.equals("graduation cap") && (v.getId() == graduationcap.getId())){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
        else if (randomtext.equals("dog bone") && (v.getId() == dogbone.getId())){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
        else if (randomtext.equals("tractor") && (v.getId() == tractor.getId())){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
        else if (randomtext.equals("service bell") && (v.getId() == servicebell.getId())){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
        else if (randomtext.equals("nut") && (v.getId() == nut.getId())){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(intent);
        }
    }
}

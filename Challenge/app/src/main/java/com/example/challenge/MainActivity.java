package com.example.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.xml.sax.helpers.XMLReaderAdapter;

public class MainActivity extends AppCompatActivity {

    Boolean Xturn= true;
    TextView win ;
    int[] Xarray = new int (9);
    int[] Oarray = new int (9);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button one = findViewById(R.id.button1);
      final   Button two = findViewById(R.id.button2);
        final Button three = findViewById(R.id.button3);
        final Button four = findViewById(R.id.button4);
        final Button five = findViewById(R.id.button5);
       final Button six = findViewById(R.id.button6);
        final Button seven = findViewById(R.id.button7);
        final Button eight = findViewById(R.id.button8);
        final Button nine = findViewById(R.id.button9);
       final Button reset = findViewById(R.id.button10);
        final TextView win = findViewById(R.id.textView2);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (Xturn){
                   Xarray[0]= 1;
                one.setText("X");
                   checkXwin ();}
                else{Oarray [0]=1;
                    one.setText("O");
                checkOwin ();}

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[1]=1;
                    two.setText("X");
                    checkXwin ();}
                else {Oarray[1]=1;
                    two.setText("O");
                checkOwin ();}

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[2]=1;
                    three.setText("X");
                    checkXwin ();}
                else {Oarray[1]=1;
                    three.setText("O");
                    checkOwin ();}

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[3]= 1;
                    four.setText("X");
                    checkXwin ();}
                else {Oarray[3]=1;
                    four.setText("O");
                    checkOwin();}

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[4]= 1;
                    five.setText("X");
                    checkXwin ();}
                else {Oarray[4]=1;
                    five.setText("O");
                    checkOwin ();}

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[5]= 1;
                    six.setText("X");
                    checkXwin();}
                else {Oarray[5]=1;
                    six.setText("O");
                    checkOwin();}

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[6]= 1;
                    seven.setText("X");
                    checkXwin ();}
                else{ Oarray[6]=1;
                    seven.setText("O");
                    checkOwin ();}

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[7]= 1;
                    eight.setText("X");
                    checkXwin ();}
                else {
                    Oarray[7]=1;
                    eight.setText("O");
                    checkOwin ();}

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn){
                    Xarray[8]= 1;
                    nine.setText("X");
                    checkXwin ();}
                else {Oarray[8]=1;
                    nine.setText("O");
                    checkOwin();}

            }
        });


    }
    public void checkXwin (){
        TextView win = findViewById(R.id.textView2);
        Xturn = false ;
        win.setText("O turn");
        if (Xarray[0] == 1 && Xarray[1] ==1 && Xarray[2]==1 ){
            Toast.makeText(MainActivity.this."X won",Toast.LENGTH_SHORT).show();
                else if { (Xarray[4] == 1 && Xarray[4] ==1 && Xarray[5]==1 ){
                Toast.makeText(MainActivity.this."X won",Toast.LENGTH_SHORT).show();}


        }
    }
    public void checkOwin (){
        TextView win = findViewById(R.id.textView2);
        Xturn = true ;
        win.setText("X turn"); }
}

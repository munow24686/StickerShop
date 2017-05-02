package com.example.munow.stickershop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Munow on 3/5/2560.
 */

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Initial View
        TextView titleTextView = (TextView) findViewById(R.id.txtTitleDetail);
        TextView detailTextView = (TextView) findViewById(R.id.txtDetailScroll);
        ImageView imageView = (ImageView) findViewById(R.id.imvImageDetail);
        Button button = (Button) findViewById(R.id.btnBack);

        //Show Data from MainActivity
        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        imageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.traffic_01));

    }   //Main Method

    public void clickBack(View view) {
        finish();
    }

    public void onClickBuy(View view) {

        Toast.makeText(this, "ซื้อเรียบร้อย", Toast.LENGTH_SHORT).show();

    }   //Main Method onClickBuy

}   //Main Class

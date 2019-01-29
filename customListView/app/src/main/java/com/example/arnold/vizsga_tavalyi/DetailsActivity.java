package com.example.arnold.vizsga_tavalyi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView;
    TextView tvPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = (ImageView)findViewById(R.id.detailsImageID);
        tvPrice = (TextView)findViewById(R.id.detailsTextViewID);

        Integer image = getIntent().getIntExtra("image",1);
        Double priceInRon = 4.5*(getIntent().getDoubleExtra("price",1));
        imageView.setImageResource(image);
        tvPrice.setText("Price:"+String.valueOf(priceInRon)+" RON");
    }
}

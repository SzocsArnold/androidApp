package com.example.arnold.vizsga_tavalyi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomListAdapter extends ArrayAdapter {

    private final Activity context;

    private final String[] nameArray;

    private  final Integer[] imageArray;

    private final Double[] priceArray;

    public CustomListAdapter(Activity context,String[] nameArrayParam,Double[] priceArrayParam,Integer[] imageArrayParam ) {
        super(context, R.layout.list_row,nameArrayParam);
        this.context = context;
        this.nameArray = nameArrayParam;
        this.imageArray=imageArrayParam;
        this.priceArray=priceArrayParam;

    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_row,null,true);

        ImageView imageView = (ImageView)rowView.findViewById(R.id.imageView2);
        TextView tvName = (TextView)rowView.findViewById(R.id.textView2);
        TextView tvprice = (TextView)rowView.findViewById(R.id.textView3);

        imageView.setImageResource(imageArray[position]);
        tvName.setText(nameArray[position]);
        tvprice.setText(String.valueOf(priceArray[position]));

        return rowView;
    }
}

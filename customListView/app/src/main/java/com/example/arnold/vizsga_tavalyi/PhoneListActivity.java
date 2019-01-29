package com.example.arnold.vizsga_tavalyi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class PhoneListActivity extends AppCompatActivity {

    String[] nameArray = {"Apple MacBook","Dell Inspiron 7000 Core i5","Microsoft Surface Pro 4 Core"};
    Integer[] imageArray={R.drawable.macbook,R.drawable.dellinspiron,R.drawable.surface};
    Double[] priceArray={3800.50,2200.200,1200.70};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_list);

        ListAdapter adapter = new CustomListAdapter(this,nameArray,priceArray,imageArray);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(PhoneListActivity.this,DetailsActivity.class);
                intent.putExtra("image",imageArray[position]);
                intent.putExtra("price",priceArray[position]);
                startActivity(intent);
            }
        });

    }


}

package com.example.myapplication.food_shop;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.myapplication.R;

public class Shop_cart_window extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_cart);
        //setContentView(R.layout.test);
        ExpandableListView expandableListView=findViewById(R.id.shop_cart_elv);
        Shop_cart_adapter shop_cart_adapter=new Shop_cart_adapter(this);
        expandableListView.setAdapter(shop_cart_adapter);
        for (int i=0;i<Global_shop_cart.taoCanlist.size();i++){
            expandableListView.expandGroup(i);
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        finish();
        return true;
    }
}

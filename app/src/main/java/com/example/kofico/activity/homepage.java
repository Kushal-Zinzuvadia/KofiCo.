package com.example.kofico.activity;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kofico.R;
import com.example.kofico.models.item;

import java.util.ArrayList;
import java.util.Locale;

public class homepage extends AppCompatActivity {

    private RecyclerView.Adapter ad,ad2;
    private  RecyclerView rallitem,rpoular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homepage);
        rcate();

    }

    private void rcate() {
        LinearLayoutManager lm=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        rallitem=findViewById(R.id.rv_all_item);
        rallitem.setLayoutManager(lm);

        ArrayList<item> item=new ArrayList<>();
        item.add(new item("pizza","5","100","res/drawable-hdpi/image123.png"));
    }
}
package com.tripujiindriyani.uts_mobile1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvhandphone;
    private ArrayList<Handphone> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvhandphone = findViewById(R.id.rv_handphone);
        rvhandphone.setHasFixedSize(true);

        list.addAll(DataHandphone.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvhandphone.setLayoutManager(new LinearLayoutManager(this));
        ListHandphone listHandphone = new ListHandphone(list);
        rvhandphone.setAdapter(listHandphone);

        listHandphone.setOnItemClickCallback(new ListHandphone.OnItemClickCallback(){
            @Override
            public void onItemClicked(Handphone data) {
                showSelectedHandphone(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.activity_main:
                showRecyclerList();
                break;
            case R.id.action_about:
                Intent about = new Intent(MainActivity.this,About.class);
                startActivity(about);

        }
    }


    private void showSelectedHandphone(Handphone handphone) {
        Intent detail = new Intent(MainActivity.this,Detail.class);
        detail.putExtra("ImagesHp", handphone.getPhoto());
        detail.putExtra("NamesHp", handphone.getName());
        detail.putExtra("DetailsHp", handphone.getDetail());
        detail.putExtra("HargaHp", handphone.getHarga());
        detail.putExtra("fiturHp", handphone.getFitur());
        startActivity(detail);
    }
}
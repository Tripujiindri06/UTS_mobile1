package com.tripujiindriyani.uts_mobile1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class Detail extends AppCompatActivity {
    Toolbar back;
    ImageView imageshp;
    TextView namehp, detailhp, hargahp, fiturhp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageshp = findViewById(R.id.img_item_photo);
        namehp = findViewById(R.id.tv_item_name);
        detailhp = findViewById(R.id.tv_item_detail);
        hargahp = findViewById(R.id.tv_item_harga);
        fiturhp = findViewById(R.id.tv_item_fitur);

        back = findViewById(R.id.toolbarback);
        setSupportActionBar(back);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        int photo = getIntent().getIntExtra("ImagesHp", 0);
        String nama = getIntent().getStringExtra("NamesHp");
        String deskripsi = getIntent().getStringExtra("DetailsHp");
        String harga = getIntent().getStringExtra("HargaHp");
        String fitur = getIntent().getStringExtra("fiturHp");
        imageshp.setImageResource(photo);
        namehp.setText(nama);
        detailhp.setText(deskripsi);
        hargahp.setText(harga);
        fiturhp.setText(fitur);
    }

    private void setSupportActionBar(Toolbar back) {
    }
}

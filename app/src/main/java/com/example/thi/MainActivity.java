package com.example.thi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvthongtin;
    ArrayList<thongtin> thongtins;
    Adapter adapter;
    EditText edt1, edt2;
    Button btn1, btn2, btn3;
    int vitri = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();

        thongtins = new ArrayList<>();
        thongtins.add(new thongtin("Trần Tuấn Vũ", R.drawable.ic_launcher_background,"21"));
        thongtins.add(new thongtin("Thân Thị Trang", R.drawable.ic_launcher_background,"20"));
        thongtins.add(new thongtin("Hà Thị Kim Chi", R.drawable.ic_launcher_background,"21"));
        thongtins.add(new thongtin("Nguyễn Văn Hiếu", R.drawable.ic_launcher_background,"21"));

        adapter = new Adapter(this, R.layout.dong_thong_tin, thongtins);
        lvthongtin.setAdapter(adapter);
        add();

    }

    private void add() {
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = edt1.getText().toString();
                String tuoi = edt2.getText().toString();
                thongtins.add(new thongtin(ten, R.drawable.ic_launcher_background, tuoi));
                adapter.notifyDataSetChanged();
            }
        });
    }


    private void anhXa() {
        lvthongtin = (ListView) findViewById(R.id.listview);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        btn1 = (Button)findViewById(R.id.buttonupdate);
        btn2 = (Button)findViewById(R.id.buttonview);
        btn3 = (Button)findViewById(R.id.buttonadd);

    }
}
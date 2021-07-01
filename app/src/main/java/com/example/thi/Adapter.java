package com.example.thi;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<thongtin> thongtins;

    public Adapter(Context context, int layout, List<thongtin> thongtins) {
        this.context = context;
        this.layout = layout;
        this.thongtins = thongtins;
    }

    @Override
    public int getCount() {
        return thongtins.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        TextView txtTen = (TextView)convertView.findViewById(R.id.tv1);
        ImageView img = (ImageView)convertView.findViewById(R.id.imageView);
        TextView txttuoi = (TextView) convertView.findViewById(R.id.tv2);

        thongtin thongtin = thongtins.get(position);
        txtTen.setText(thongtin.getName());
        img.setImageResource(thongtin.getImg());
        txttuoi.setText(thongtin.getAge());
        return convertView;
    }
}

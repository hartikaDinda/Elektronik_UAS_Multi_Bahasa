package com.example.elektronik;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import model.Elektronik;

public class DafatarElektronikAdapter extends ArrayAdapter<Elektronik>{
    Context context;

    public DafatarElektronikAdapter(Context context, List<Elektronik> elektroniks) {
        super(context, R.layout.row_actifiry_elektronik, elektroniks);
        this.context = context;
    }

    private static class ViewHolder  {
        TextView textJenis;
        TextView textName;
        ImageView gambar;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Elektronik elektronik = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_actifiry_elektronik, parent, false);
            viewHolder.textJenis =  convertView.findViewById(R.id.row_text_jenis);
            viewHolder.textName = (TextView) convertView.findViewById(R.id.row_text_name);
            viewHolder.gambar = convertView.findViewById(R.id.row_image_elektronik);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textJenis.setText(elektronik.getElektronik());
        viewHolder.textName.setText(elektronik.getNama());
        viewHolder.gambar.setImageDrawable(context.getDrawable(elektronik.getDrawableRes()));
        return convertView;
    }
}

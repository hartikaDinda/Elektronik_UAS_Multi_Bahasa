package com.example.elektronik;

import android.content.Context;
import model.Elektronik;
import model.Handphone;
import model.Laptop;
import model.Televisi;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    private static List<Elektronik> elektroniks = new ArrayList<>();

    private static List<Handphone> initCoktail(Context ctx) {
        List<Handphone> handphones = new ArrayList<>();
        handphones.add(new Handphone(ctx.getString(R.string.name_infinix), ctx.getString(R.string.jenis_infinix),ctx.getString(R.string.diskripsi_infinix) ,R.drawable.hp_infinix));
        handphones.add(new Handphone(ctx.getString(R.string.name_xiomi),
                ctx.getString(R.string.jenis_android), ctx.getString(R.string.deskripsi_xiomi), R.drawable.hp_xiomi));
        handphones.add(new Handphone(ctx.getString(R.string.name_oppo),ctx.getString(R.string.jenis_oppo),ctx.getString(R.string.deskripsi), R.drawable.hp_oppo));
        handphones.add(new Handphone(ctx.getString(R.string.name_nokia), ctx.getString(R.string.jenis_nokia),ctx.getString(R.string.deskripsi_nokia)
               , R.drawable.hp_noxia));
        handphones.add(new Handphone(ctx.getString(R.string.name_blackberry), ctx.getString(R.string.jenis_blackberry),ctx.getString(R.string.deskripsi_blackberry),
                 R.drawable.hp_blackbery));
        return handphones;
    }

    private static List<Laptop> initMocktail(Context ctx) {
        List<Laptop> laptops = new ArrayList<>();

        laptops.add(new Laptop(ctx.getString(R.string.name_lenovo), ctx.getString(R.string.jenis_lenovo), ctx.getString(R.string.deskripsi_lenovo)
                , R.drawable.laptop_lenovo));
        laptops.add(new Laptop(ctx.getString(R.string.name_toshiba), ctx.getString(R.string.jenis_toshiba), ctx.getString(R.string.deskripsi_toshiba)
               , R.drawable.laptop_toshiba));
        laptops.add(new Laptop(ctx.getString(R.string.name_hp), ctx.getString(R.string.jenis_hp), ctx.getString(R.string.deskripsi_hp)
                , R.drawable.laptp_hp));
        laptops.add(new Laptop(ctx.getString(R.string.name_assus), ctx.getString(R.string.jenis_assus), ctx.getString(R.string.deskripsi_assus)
                , R.drawable.laptop_asus));
        laptops.add(new Laptop(ctx.getString(R.string.name_accer), ctx.getString(R.string.jenis_accer), ctx.getString(R.string.deskripsi_accer)
               , R.drawable.laptop_acer));
        return laptops;
    }

    private static List<Televisi> initIndonesianFoos(Context ctx) {
        List<Televisi> televisis = new ArrayList<>();
        televisis.add(new Televisi(ctx.getString(R.string.name_lg), ctx.getString(R.string.jenis_lg), ctx.getString(R.string.deskripsi_lg), R.drawable.tv_lg));
        televisis.add(new Televisi(ctx.getString(R.string.name_politron), ctx.getString(R.string.jenis_politron), ctx.getString(R.string.deskripsi_politron)
                , R.drawable.tv_polaytron));
        televisis.add(new Televisi(ctx.getString(R.string.name_toshibaa), ctx.getString(R.string.jenis_toshibaa), ctx.getString(R.string.deskripsi_toshibaa)
               , R.drawable.tv_toshiba));
        return televisis;
    }


    private static void initAllElektronik(Context ctx) {
        elektroniks.addAll(initCoktail(ctx));
        elektroniks.addAll(initMocktail(ctx));
        elektroniks.addAll(initIndonesianFoos(ctx));
    }

    public static List<Elektronik> getElektroniksByTipe(Context ctx, String jenis) {
        List<Elektronik> elektroniksByType = new ArrayList<>();
        if (elektroniks.size() == 0) {
            initAllElektronik(ctx);
        }
        for (Elektronik h : elektroniks) {
            if (h.getElektronik().equals(jenis)) {
                elektroniksByType.add(h);
            }
        }
        return elektroniksByType;
    }
}

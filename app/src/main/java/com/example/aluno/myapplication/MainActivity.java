package com.example.aluno.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.special.ResideMenu.ResideMenu;
import com.special.ResideMenu.ResideMenuItem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ResideMenu resideMenu;
    Boolean opened = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // attach to current activity;
        resideMenu = new ResideMenu(this);
        resideMenu.setBackgroundColor(Color.parseColor("#FFC107"));
        resideMenu.attachToActivity(this);

        // create menu items;
        String titles[] = { "Home", "Profile", "Calendar", "Settings" };
        int icon[] = { R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};

        ResideMenuItem menuItem = new ResideMenuItem(this);

        menuItem.removeAllViews();


        LayoutInflater layoutInflater = LayoutInflater.from(this);

        View view = layoutInflater.inflate(R.layout.linha,null);
        Button button2 = (Button) view.findViewById(R.id.button2);
        button2.setOnClickListener(this);
        menuItem.addView(view);

        resideMenu.addMenuItem(menuItem, ResideMenu.DIRECTION_LEFT);

        for (int i = 0; i < titles.length; i++){
            /*
            ResideMenuItem item = new ResideMenuItem(this, icon[i], titles[i]);
            item.setOnClickListener(this);
            com.example.aluno.myapplication.ResideMenuItem resideMenuItem =  new com.example.aluno.myapplication.ResideMenuItem(this,R.mipmap.ic_launcher,"teste");
            resideMenu.addMenuItem(this,  ResideMenu.DIRECTION_LEFT); // or  ResideMenu.DIRECTION_RIGHT
            */

        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
    }
    public void click(View v)
    {
        if(opened)
        {
            resideMenu.closeMenu();
            opened = false;
        }
        else
        {
            opened = true;
            resideMenu.openMenu(ResideMenu.DIRECTION_LEFT); // or ResideMenu.DIRECTION_RIGHT
        }


    }
}

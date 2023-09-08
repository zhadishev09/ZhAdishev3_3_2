package com.example.less3_2part_home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_chat;
    private ArrayList<String> nameList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_chat = findViewById(R.id.rv_chat);
        loadData();
        ChatAdapter adapter = new ChatAdapter(nameList);
        rv_chat.setAdapter(adapter);
    }

    private void loadData() {
        nameList.add("Naruto");
        nameList.add("Saske");
        nameList.add("Gauter");
        nameList.add("Zeldris");
        nameList.add("Estorossa");
        nameList.add("Eskanor");
        nameList.add("Mayer");
        nameList.add("Merlin");
        nameList.add("Ban");
        nameList.add("King");
        nameList.add("Diana");
        nameList.add("Arhangel");
        nameList.add("Demon king");
        nameList.add("Hunter x Hunter");
        nameList.add("10 Заповедей");
        nameList.add("Droll");
        nameList.add("Feitan");
        nameList.add("Paku");
        nameList.add("Hisoka");
        nameList.add("Gon");
        nameList.add("Killua");
        nameList.add("Luffy");
        nameList.add("One Piece");
    }

}
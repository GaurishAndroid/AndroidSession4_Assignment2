package com.example.abhisheki.androidsession4_assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    public static String [] Contacts={"Gaurish","Preetika","Rama","Santosh"};
    public static String [] Phones={"567456788","544566788","457890677","678976540"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MakeList();
    }
    public void MakeList()
    {
        ListView listView;
        CustomList customList = new CustomList(this, Contacts, Phones);

        listView = (ListView) findViewById(R.id.MyList);
        listView.setAdapter(customList);
    }
}

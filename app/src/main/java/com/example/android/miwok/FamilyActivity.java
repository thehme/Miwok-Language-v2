package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> familyMembers = new ArrayList<Word>();

        familyMembers.add(new Word("father","әpә"));
        familyMembers.add(new Word("mother", "әṭa"));
        familyMembers.add(new Word("son", "angsi"));
        familyMembers.add(new Word("daughter", "ṭune"));
        familyMembers.add(new Word("older brother", "taachi"));
        familyMembers.add(new Word("younger brother", "chalitti"));
        familyMembers.add(new Word("older sister", "teṭe"));
        familyMembers.add(new Word("younger sister", "kolliti"));
        familyMembers.add(new Word("grandmother", "ama"));
        familyMembers.add(new Word("grandfather", "paapa"));

        WordAdapter itemsAdapter = new WordAdapter(this, familyMembers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
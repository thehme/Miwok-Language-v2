/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // attach event listener to numbers TextView
        TextView numbersActivity = (TextView) findViewById(R.id.numbers);
        numbersActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberActivityIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numberActivityIntent);
            }
        });

        // attach event listener to colors TextView
        TextView colorsActivity = (TextView) findViewById(R.id.colors);
        colorsActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent colorsActivityIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsActivityIntent);
            }
        });

        // attach event listener to family TextView
        TextView familyActivity = (TextView) findViewById(R.id.family);
        familyActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyActivityIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyActivityIntent);
            }
        });

        // attach event listener to phrases TextView
        TextView phrasesActivity = (TextView) findViewById(R.id.phrases);
        phrasesActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesActivityIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(phrasesActivityIntent);
            }
        });
    }
}

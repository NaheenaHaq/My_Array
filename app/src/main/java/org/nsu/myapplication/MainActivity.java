package org.nsu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /*public class MainActivity extends Activity implements OnClickListener {

    Button btnStartAnotherActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartAnotherActivity = (Button) findViewById(R.id.btnStartAnotherActivity);

        btnStartAnotherActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent inent = new Intent(this, AnotherActivity.class);

        // calling an activity using <intent-filter> action name
        //  Intent inent = new Intent("com.hmkcode.android.ANOTHER_ACTIVITY");

        startActivity(inent);
    }*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names = new String[]{"Atiar", "Saadman","Jabin","Arabi","Naheena","Nafis","Salat","Saiful"};
        ListView listView = (ListView)findViewById(R.id.list);

        PersonItem atiar = new PersonItem("Atiar","Swajan",R.drawable.panda,"Computer Science","24","Student");
        PersonItem jibne = new PersonItem("Kamal","Jibne",R.drawable.monkey,"Computer Engineering","25","Student");
        PersonItem nafis = new PersonItem("Nafis","UI",R.drawable.cat,"Computer Science","26","Student");
        final ArrayList<PersonItem> personItems = new ArrayList<>();
        personItems.add(atiar);
        personItems.add(jibne);
        personItems.add(nafis);

        PersonAdapter nameAdapter =
                new PersonAdapter(this, personItems);

        listView.setAdapter(nameAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                PersonItem personItem = personItems.get(i);
                String name= personItem.name;
                Toast.makeText(MainActivity.this, "I clicked position"+name,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void onClick(View view) {

        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}

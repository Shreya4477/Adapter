package com.example.adapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listView);

        String[] contact={"Shreya", "Papa", "Chotu Bhai", "Mummy", "Mithu", "Shreya", "Papa", "Chotu Bhai", "Mummy", "Mithu"};
        int[] image={R.drawable.account,R.drawable.account2,R.drawable.account,R.drawable.account2,R.drawable.flash, R.drawable.account,R.drawable.account2,R.drawable.account,R.drawable.account2,R.drawable.flash};
        ArrayList<HashMap<String,String>> arrayList =new ArrayList<>();
        for(int i=0;i<contact.length;i++){
            HashMap<String,String> hashMap=new HashMap<>();
            hashMap.put("contacts",contact[i]);
            hashMap.put("images",image[i] +"");
            arrayList.add(hashMap);
        }
        String[] from={"contacts", "images"};
        int[] to={R.id.txtView,R.id.imagelist};

        SimpleAdapter simpleAdapter= new SimpleAdapter(this,arrayList,R.layout.activity_single_list,from,to);
        listview.setAdapter(simpleAdapter);

//        final ArrayList<String> list = new ArrayList<>();
//        final ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_single_list,list);
//        listview.setAdapter(adapter);
//
//        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Language");
//        reference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//               // list.clear();
//                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
//                    /*Breakfast breakfast = snapshot.getValue(Breakfast.class);
//                    String txt = breakfast.getName() + ":" + breakfast.getCalories();
//                    list.add(txt);*/
//                    list.add(snapshot.getValue().toString());
//                }
//                adapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });

    }

    public void nothing(View view) {
        Toast.makeText(this, "Thank you for wasting your time", Toast.LENGTH_SHORT).show();
    }
}
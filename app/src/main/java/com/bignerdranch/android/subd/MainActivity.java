

package com.bignerdranch.android.subd;

import android.app.Activity;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Scanner;

public class MainActivity extends Activity {
 public class  my implements ListAdapter{
     @Override
     public boolean areAllItemsEnabled() {
         return false;
     }

     @Override
     public boolean isEnabled(int i) {
         return false;
     }

     @Override
     public void registerDataSetObserver(DataSetObserver dataSetObserver) {

     }

     @Override
     public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

     }

     @Override
     public int getCount() {
         return 0;
     }

     @Override
     public Object getItem(int i) {
         return null;
     }

     @Override
     public long getItemId(int i) {
         return 0;
     }

     @Override
     public boolean hasStableIds() {
         return false;
     }

     @Override
     public View getView(int i, View view, ViewGroup viewGroup) {
         return null;
     }

     @Override
     public int getItemViewType(int i) {
         return 0;
     }

     @Override
     public int getViewTypeCount() {
         return 0;
     }

     @Override
     public boolean isEmpty() {
         return false;
     }
 }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Main m=new Main(this.getBaseContext());



        Button btAdd=(Button)findViewById(R.id.ba);
        Button btUp=(Button)findViewById(R.id.bu);
        Button btSum=(Button)findViewById(R.id.bs);
        final EditText etName=(EditText) findViewById(R.id.etn);
        final EditText etCost=(EditText) findViewById(R.id.etc);

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Scanner sc= new Scanner(etCost.getText().toString());
                m.addRec(etName.getText().toString(),sc.nextInt());
            }
        });
        btUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                my adapter = new my(this,m.getStringList() );
                ListView lv = (ListView) findViewById(R.id.ListView);
                lv.setAdapter(adapter);
            }
        });
    }


}

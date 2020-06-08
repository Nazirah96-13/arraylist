package sg.edu.rp.c346.id17032457.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    ArrayList<String>fruits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("ArrayList");

        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        //add fourth element
        fruits.add(3,"durian");

        //get second element
        String theFruit = fruits.get(1);

        //remove first element
        fruits.remove(0);

        //Change last element to dragon fruit
        fruits.set(fruits.size()-1,"dragon fruit");

        tv = findViewById(R.id.textView2);
        String text = "Fruits\n";
        text += "=====\n";

        for (int i =0; i<fruits.size();i++){
            text += fruits.get(i) + "\n";

        }
        tv.setText(text);


    }
}

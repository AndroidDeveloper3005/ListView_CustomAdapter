package com.programming.himel.listview_customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<BDPlayer>players;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview_id);
        players = new ArrayList<>();
        setData();

        CustomAdapter adapter = new
                CustomAdapter(getApplicationContext(),R.layout.custom_row_item
                ,players);
        listView.setAdapter(adapter);



    }

    private void setData() {


        players.add(new BDPlayer("Mashrafe Bin Mortaza"
                ,R.drawable.mash,
                "Major teams : Bangladesh, Asia XI," +
                        " Dhaka Gladiators, Khulna Division," +
                        " Kolkata Knight Riders"));

        players.add(new BDPlayer("Shakib Al Hasan"
                ,R.drawable.sakib,
                "Major teams : Bangladesh, Adelaide Strikers, Bangladesh A" +
                        ", Bangladesh Cricket Board XI, Barbados Tridents, Dhaka Gladiators" +
                        ", Jamaica Tallawahs, Karachi Kings, Khulna Division" +
                        ", Kolkata Knight Riders, Peshawar Zalmi" +
                        ", Sunrisers Hyderabad, Worcestershire"));

        players.add(new BDPlayer("Tamim Iqbal Khan"
                ,R.drawable.tamim,
                "Major teams : Bangladesh, Asia XI, Bangladesh A" +
                        ", Bangladesh Under-19s, Chittagong Division" +
                        ", Duronto Rajshahi, ICC World XI, Nottinghamshire, Peshawar Zalmi" +
                        ", Pune Warriors, St Lucia Zouks, Wellington, World-XI"));


        players.add(new BDPlayer("Mohammad Mahmudullah"
                ,R.drawable.mahmudullah,
                "Major teams :  Bangladesh, Bangladesh A" +
                        ", Bangladesh Under-19s, Barisal Bulls, Central Zone (Bangladesh)" +
                        ", Chittagong Kings, Dhaka Division, Jamaica Tallawahs, Khulna Titans" +
                        ", Quetta Gladiators, St Kitts and Nevis Patriots"));

        players.add(new BDPlayer(" Mohammad Mushfiqur Rahim"
                ,R.drawable.mushi,
                "Major teams :  Bangladesh, Bangladesh Under-19s" +
                        ", Karachi Kings, North Zone (Bangladesh), Rajshahi Division" +
                        ", Rajshahi Kings, Sylhet Division, Sylhet Royals"));
    }
}

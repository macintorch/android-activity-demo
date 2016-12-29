package ainor.com.my.multipleactivitiesdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public void toSecondActivity (View view) {
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

        intent.putExtra("username", "ainor");

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myFriendsListView = (ListView) findViewById(R.id.friendsListView);

        final ArrayList<String> friends = new ArrayList<String>();

        friends.add("Adi Hassan");
        friends.add("Umar Zayeed");
        friends.add("Azry Mangsor");
        friends.add("Zainal Abidin");
        friends.add("Izwan Hamadi");
        friends.add("Ihtifazuddin");
        friends.add("Asrul Fadly");
        friends.add("Nor Hazmy");
        friends.add("Faiz Fauzi");
        friends.add("Mat Fizra");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, friends);

        myFriendsListView.setAdapter(arrayAdapter);

        myFriendsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                String getFriends = friends.get(i);

                intent.putExtra("name", getFriends);

                Log.i("Tapped Friend", getFriends);

                startActivity(intent);

            }
        });
    }
}

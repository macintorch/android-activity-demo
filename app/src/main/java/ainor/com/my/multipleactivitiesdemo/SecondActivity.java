package ainor.com.my.multipleactivitiesdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    public void toFirstActivity (View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);



        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        Toast.makeText(this, intent.getStringExtra(String.valueOf(intent)), Toast.LENGTH_LONG).show();


    }
}

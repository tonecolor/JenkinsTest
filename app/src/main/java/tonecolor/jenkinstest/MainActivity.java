package tonecolor.jenkinstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "git 1", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "git 2", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "git 3", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "git 4", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "git 5", Toast.LENGTH_SHORT).show();
    }
}

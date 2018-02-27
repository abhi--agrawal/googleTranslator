package homemadesolutions.practice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LanguageFamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new LanguageFamilyFragment())
                .commit();

    }
}

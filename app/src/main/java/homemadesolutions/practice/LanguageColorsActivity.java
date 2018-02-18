package homemadesolutions.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LanguageColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_words);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<LanguageWord> words = new ArrayList<>();
        words.add(new LanguageWord("Kempu","red", R.drawable.color_red));
        words.add(new LanguageWord("Hasiru","green",R.drawable.color_green));
        words.add(new LanguageWord("Kandu baṇṇadalliruttade","brown",R.drawable.color_brown));
        words.add(new LanguageWord("Būdu","gray",R.drawable.color_gray));
        words.add(new LanguageWord("Kappu","black",R.drawable.color_black));
        words.add(new LanguageWord("Biḷi","white",R.drawable.color_white));
        words.add(new LanguageWord("Haḷadi","yellow",R.drawable.color_dusty_yellow));
        words.add(new LanguageWord("Sāsive haḷadi","mustard yellow",R.drawable.color_mustard_yellow));

        LanguageWordAdapter itemsAdapter = new LanguageWordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.activity_language_words);
        listView.setAdapter(itemsAdapter);

    }
}

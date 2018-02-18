package homemadesolutions.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LanguageFamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_words);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<LanguageWord> words = new ArrayList<>();
        words.add(new LanguageWord("Tande","father",R.drawable.family_father));
        words.add(new LanguageWord("Tāyi","mother",R.drawable.family_mother));
        words.add(new LanguageWord("Maga","son",R.drawable.family_son));
        words.add(new LanguageWord("Magaḷu","daughter",R.drawable.family_daughter));
        words.add(new LanguageWord("Sahōdara","brother",R.drawable.family_older_brother));
        words.add(new LanguageWord("Sahōdari","sister",R.drawable.family_older_sister));
        words.add(new LanguageWord("Ajja","grandfather",R.drawable.family_grandfather));
        words.add(new LanguageWord("Ajji","grandmother",R.drawable.family_grandmother));

        LanguageWordAdapter itemsAdapter = new LanguageWordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.activity_language_words);
        listView.setAdapter(itemsAdapter);
    }
}

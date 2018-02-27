package homemadesolutions.practice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LanguageFamilyFragment extends Fragment {


    public LanguageFamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_language_words, container, false);

        ArrayList<LanguageWord> words = new ArrayList<>();
        words.add(new LanguageWord("Tande", "father", R.drawable.family_father));
        words.add(new LanguageWord("Tāyi", "mother", R.drawable.family_mother));
        words.add(new LanguageWord("Maga", "son", R.drawable.family_son));
        words.add(new LanguageWord("Magaḷu", "daughter", R.drawable.family_daughter));
        words.add(new LanguageWord("Sahōdara", "brother", R.drawable.family_older_brother));
        words.add(new LanguageWord("Sahōdari", "sister", R.drawable.family_older_sister));
        words.add(new LanguageWord("Ajja", "grandfather", R.drawable.family_grandfather));
        words.add(new LanguageWord("Ajji", "grandmother", R.drawable.family_grandmother));

        LanguageWordAdapter itemsAdapter = new LanguageWordAdapter(getActivity(), words, R.color.category_family);

        ListView listView = (ListView) rootView.findViewById(R.id.activity_language_words);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}

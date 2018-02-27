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
public class LanguageColorsFragment extends Fragment {


    public LanguageColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_language_words, container, false);

        ArrayList<LanguageWord> words = new ArrayList<>();
        words.add(new LanguageWord("Kempu", "red", R.drawable.color_red));
        words.add(new LanguageWord("Hasiru", "green", R.drawable.color_green));
        words.add(new LanguageWord("Kandu baṇṇadalliruttade", "brown", R.drawable.color_brown));
        words.add(new LanguageWord("Būdu", "gray", R.drawable.color_gray));
        words.add(new LanguageWord("Kappu", "black", R.drawable.color_black));
        words.add(new LanguageWord("Biḷi", "white", R.drawable.color_white));
        words.add(new LanguageWord("Haḷadi", "yellow", R.drawable.color_dusty_yellow));
        words.add(new LanguageWord("Sāsive haḷadi", "mustard yellow", R.drawable.color_mustard_yellow));

        LanguageWordAdapter itemsAdapter = new LanguageWordAdapter(getActivity(), words, R.color.category_colors);

        ListView listView = (ListView) rootView.findViewById(R.id.activity_language_words);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}

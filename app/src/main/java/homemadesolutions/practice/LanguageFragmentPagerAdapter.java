package homemadesolutions.practice;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by I320047 on 27-Feb-18.
 */

public class LanguageFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"Numbers", "Colors", "Family", "Phrases"};

    public LanguageFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LanguageNumberFragment();
        } else if (position == 1) {
            return new LanguageColorsFragment();
        } else if (position == 2) {
            return new LanguageFamilyFragment();
        } else {
            return new LanguagePhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
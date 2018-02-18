package homemadesolutions.practice;

/**
 * Created by I320047 on 11-Feb-18.
 */

public class LanguageWord {

    public LanguageWord(String translation, String word) {
        this.translation = translation;
        this.word = word;
        iconResourceId = -1;
    }

    public LanguageWord(String translation, String word, int iconResourceId) {
        this.translation = translation;
        this.word = word;
        this.iconResourceId = iconResourceId;
    }


    private String translation;
    private String word;
    private int iconResourceId;

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getIconResourceId() {
        return iconResourceId;
    }

    public void setIconResourceId(int iconResourceId) {
        this.iconResourceId = iconResourceId;
    }

}

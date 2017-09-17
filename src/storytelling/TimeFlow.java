package storytelling;

import dictionary.nouns.Noun;
import dictionary.verbs.Verbs;

public class TimeFlow extends Verbs {

    // Mb this is a class for all global states of the Story
    public static Noun mainCharacter;

    public TimeFlow the(Noun character){  // Mb extract articles to a separate package either
        return this;
    }

    public TimeFlow a(Noun character){
        return this;
    }

    public TimeFlow _(Noun character){ // Fix this
        return this;}


}

package storytelling;

import dictionary.nouns.Noun;

public class OnceUponATime {

    public static TimeFlow timeFlow = new TimeFlow();

    public static TimeFlow a(Noun character){
        TimeFlow.mainCharacter = character;
        return timeFlow;
    }

}
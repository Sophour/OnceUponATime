package dictionary.verbs;

import dictionary.prepositions.Preposition;
import storytelling.OnceUponATime;
import storytelling.TimeFlow;

import java.io.File;
import java.io.IOException;

public class Verbs {

    public TimeFlow went(Preposition preposition){
        return OnceUponATime.timeFlow;
    }

    // Make a preposition parameter null by default? Or use overloaded methods?
    public TimeFlow did(){
        return OnceUponATime.timeFlow;
    }

    // Don't belong here. Move somewhere
    public TimeFlow not(){

        return OnceUponATime.timeFlow;
    }
    public TimeFlow and(){
        return OnceUponATime.timeFlow;
    }

    public TimeFlow took(/*Preposition preposition*/){
        return OnceUponATime.timeFlow;
    }

    public TimeFlow met(/*Preposition preposition*/){
        return OnceUponATime.timeFlow;
    }

    public void perished(){
        String fileName = TimeFlow.mainCharacter.getClass().getSimpleName() + " corpse.lol";
        String path = System.getProperty("user.home") + File.separator + fileName;
        File jokeOfTheCentury = new File(path);
        try {
            jokeOfTheCentury.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

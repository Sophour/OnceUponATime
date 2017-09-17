package storytelling;

import dictionary.nouns.He;
import dictionary.nouns.Noun;
import dictionary.nouns.characters.Bear;
import dictionary.nouns.characters.Dwarf;
import dictionary.nouns.characters.Forest;
import dictionary.nouns.characters.Weapon;
import dictionary.prepositions.Preposition;
import dictionary.prepositions.To;

public class Main {
    // Garbage
    static Preposition to = new To(); // Fix this init shit. Mb extract to some dictionary
    static Noun forest = new Forest();
    static Noun he = new He();
    static Noun weapon = new Weapon();
    static Noun bear = new Bear();

    public static void main(String[] args) {

        // Maybe there will be a separate process of character creation // or gotta get rid of this "new" stuff, or make an introduction with the list of actors like in a theatrical piece
        Dwarf dwarf = new Dwarf();

        // Here a sample story begins
        OnceUponATime.a(dwarf.named("Sophour")).went(to).the(forest)
                ._(he).did().not().took().a(weapon).met().a(bear).and().perished();


        // Here goes your story
    }
}


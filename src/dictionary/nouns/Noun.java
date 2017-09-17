package dictionary.nouns;

public class Noun {

    protected String name;

    public Noun named(String name){
        this.name = name;
        return this;
    }
}

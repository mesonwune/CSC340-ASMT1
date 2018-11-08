public enum DataEntry
{
    CSC210a("CSC210", "adjective", "Comfortable with Objects and Classes"),
    CSC210b("CSC210", "adjective", "Ready for CSC 220."),
    CSC210c("CSC210", "noun", "Intro to Java."),
    CSC210d("CSC210", "verb", "To learn Java."),
    CSC220a("CSC220", "adjective", "Ready to create complex data structures."),
    CSC220b("CSC220", "noun", "Data Structures."),
    CSC220c("CSC220", "verb", "To create data structures."),
    CSC340a("CSC340", "noun", "A CS upper division course."),
    CSC340b("CSC340", "noun", "Many hours outside of class."),
    CSC340c("CSC340", "noun", "Programming Methodology."),
    CSC340d("CSC340", "adjective", "C++ version of CSC210 + CSC220 + more."),
    VERB("Verb", "noun", "Verb is a word or group of words that expresses an action (such as eat), an event (such as happen) or a state (such as exist)."),
    CONJUNCTION("Conjunction", "noun", "Conjunction is a word that joins words, phrases or sentences, for example 'and', 'but', 'or'."),
    INTERJECTION("Interjection", "noun", "Interjection is a short sound, word or phrase spoken suddenly to express an emotion. Oh!, Look out! and Ow! are interjections."),
    ADJECTIVE("Adjective", "noun", "Adjective is a word that describes a person or thing, for example big, red and clever in a big house, red wine and a clever idea."),
    BOOKa("Book", "noun", "A set of pages."),
    BOOKb("Book", "noun", "A written work published in printed or electronic form."),
    BOOKc("Book", "verb", "To arrange for someone to have a seat on a plane."),
    BOOKd("Book", "verb", "To arrange something on a particular date."),
    BOOKABLE("Bookable", "adjective", "Can be ordered in advance."),
    PLACEHOLDERa("Placeholder", "adjective", "To be updated..."),
    PLACEHOLDERb("Placeholder", "adjective", "To be updated..."),
    PLACEHOLDERc("Placeholder", "adverb", "To be updated..."),
    PLACEHOLDERd("Placeholder", "conjunction", "To be updated..."),
    PLACEHOLDERe("Placeholder", "interjection", "To be updated..."),
    PLACEHOLDERf("Placeholder", "noun", "To be updated..."),
    PLACEHOLDERg("Placeholder", "noun", "To be updated..."),
    PLACEHOLDERh("Placeholder", "noun", "To be updated..."),
    PLACEHOLDERi("Placeholder", "preposition", "To be updated..."),
    PLACEHOLDERj("Placeholder", "pronoun", "To be updated..."),
    PLACEHOLDERk("Placeholder", "verb", "To be updated..."),
    ;

    private String word;
    private String partOfSpeech;
    private String def;

    private DataEntry(String word, String pOS, String meaning)
    {
        this.word = word;
        this.partOfSpeech = pOS;
        this.def = meaning;
    }

    public String getWord()
    {
        return this.word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public String getPartOfSpeech()
    {
        return this.partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech)
    {
        this.partOfSpeech = partOfSpeech;
    }

    public String getDef()
    {
        return this.def;
    }

    public void setDef(String def)
    {
        this.def = def;
    }

    @Override
    public String toString()
    {
        return this.word + " [" + this.partOfSpeech + "] : " + this.def;
    }
}

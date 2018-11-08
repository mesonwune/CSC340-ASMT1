import java.util.Comparator;

public class Words
{

    String entry;
    String pOS;
    String defin;

    public Words(String entry, String partOfSpeech, String definition)
    {
        this.entry = entry;
        this.pOS = partOfSpeech;
        this.defin = definition;
    }

    public String getEntry()
    {
        return entry;
    }

    public String getpOS()
    {
        return pOS;
    }

    public String getDef()
    {
        return defin;
    }

    @Override
    public String toString()
    {
        return this.entry + " [" + this.pOS + "] : " + this.defin;
    }

/*    public static Comparator<Words> WordsComparator = new Comparator<Words>()
    {
        @Override
        public int compare(Words o1, Words o2)
        {
            String entry1 = o1.toString().toUpperCase();
            String entry2 = o2.toString().toUpperCase();

            return entry1.compareTo(entry2);
        }
    };*/
}

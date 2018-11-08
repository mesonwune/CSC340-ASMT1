import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //creating the data structures

        System.out.println("! Loading data...");
        ArrayList<Words> dictionary = new ArrayList<Words>();
        Scanner reader = new Scanner(System.in);
        String search;
        ArrayList<String> partsOfSpeech = new ArrayList<String>();

        //!System.out.println("Apple".equals("apple"));

        //getting the data into the data structures
        for (DataEntry entry : DataEntry.values())
        {
            String word, pOS, def;
            word = entry.getWord();
            pOS = entry.getPartOfSpeech();
            def = entry.getDef();

          //  Map<String, Map<String, String>> dictionary2 = new Map<String, Map<String, String>>()


            Words value = new Words(word, pOS, def);
            dictionary.add(value);

            if(!partsOfSpeech.contains(pOS)) {partsOfSpeech.add(pOS);}
        }

        //print out that the loading is complete and the search
        System.out.println("! Loading completed...");
        System.out.println();
        System.out.println("-----DICTIONARY 340 JAVA-----");
        System.out.println();

        System.out.print("Search: ");
        search = reader.nextLine();

        //while the user doesn't put !Q, run
        while (!(search.equals("!Q")))
        {
            //keep track if anything is printed out
            int count = 0;
            System.out.println("|");
            //tokenize the search here
            String[] tokens = search.trim().split(" ");
            if (tokens.length == 3)
            {
                //if the third word isn't distinct
                if (!tokens[2].equals("distinct"))
                {
                    //let user know
                    System.out.println("<3rd argument must be \"distinct\">");
                    count++;
                }
                //if the second word isn't a part of speech
                else if (!partsOfSpeech.contains(tokens[1]))
                {
                    //let user know
                    System.out.println("<2nd argument must be a part of speech>");
                    count++;
                }
                else
                {
                    //create a distinct checker ArrayList
                    ArrayList <Words> distinctChecker = new ArrayList<Words>();

                    //for the length of the dictionary
                    for (int i = 0; i < dictionary.size(); i++)
                    {
                        //if the term's entry and part of speech equals the token's entry and part of speech
                        if ((dictionary.get(i).getEntry().toUpperCase()).equals(tokens[0].toUpperCase())
                        && ((dictionary.get(i).getpOS().toUpperCase()).equals(tokens[1].toUpperCase())))
                        {
                            //check to see if the entry is distinct
                                if (!(distinctChecker.toString().contains(dictionary.get(i).toString())))
                                {
                                    //add it to our distinct checker and print it out
                                    distinctChecker.add(dictionary.get(i));
                                    System.out.println(dictionary.get(i).toString());
                                    count++;
                                }
                        }
                    }
                }
            }
            else if (tokens.length == 2)
            {
                //if the second word is distinct
                if (tokens[1].equals("distinct"))
                {
                    //create a distinct checker ArrayList
                    ArrayList <Words> distinctChecker = new ArrayList<Words>();

                    //for the length of the dictionary
                    for (int i = 0; i < dictionary.size(); i++)
                    {
                        //if the dictionary's entry equals the token's entry
                        if ((dictionary.get(i).getEntry().toUpperCase()).equals(tokens[0].toUpperCase()))
                        {
                            //check to see if the entry is distinct
                            if (!(distinctChecker.toString().contains(dictionary.get(i).toString())))
                            {
                                //add it to our distinct checker and print it out
                                distinctChecker.add(dictionary.get(i));
                                System.out.println(dictionary.get(i).toString());
                                count++;
                            }
                        }
                    }
                }
                //if the second word is a part of speech
                else if (partsOfSpeech.contains(tokens[1]))
                {
                    //for the length of the dictionary
                    for (int i = 0; i < dictionary.size(); i++)
                    {
                        //if the dictionary's entry equals the token's entry
                        if ((dictionary.get(i).getEntry().toUpperCase()).equals(tokens[0].toUpperCase())
                            && ((dictionary.get(i).getpOS().toUpperCase()).equals(tokens[1].toUpperCase())))
                        {
                            //print that index
                            System.out.println(dictionary.get(i).toString());
                            count++;
                        }
                    }
                }
                else
                {
                    //let user know
                    System.out.println("<2nd argument must be a part of speech or \"distinct\">");
                    count++;
                }
            }
            else
            {
                //scan through the dictionary
                for (int i = 0; i < dictionary.size(); i++)
                {
                    //if the entry matches the first token, print it
                    if ((dictionary.get(i).getEntry().toUpperCase()).equals(tokens[0].toUpperCase()))
                    {
                        System.out.println(dictionary.get(i).toString());
                        count++;
                    }

                }
            }

            //if nothing is found, print not found
            if (count == 0) {System.out.println("<Not found>");}

            //search again
            System.out.println("|");
            System.out.print("Search: ");
            search = reader.nextLine();

        }

        System.out.println();
        System.out.println("-----THANK YOU-----");
    }
}
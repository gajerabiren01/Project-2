public class StringPractice {



    //Class for non-static method
    static StringPractice stringPractice = new StringPractice();

    // Main method
    public static void main(String[] args) {

        stringPractice.concatenateString("Cut", "Apple");
        stringPractice.specifiedSequence("John Dillinger", "Dillinger");
        stringPractice.removeSpecialChar("$The $quick *brown) fox");
        stringPractice.stringEndWithOtherString("The lazy dog", "The lazy cat");
        stringPractice.ignoreCaseConsideration("Hello World", "hello world");
        extractNumber("Rajesh34 patel45 2345988 London");
        lengthString("Hello world");
        startsWithOtherString("the quick brown fox", "jumps ove the lazy dog");
        subStringSpecifiedPosition("The quick brown fox jumps over the lazy dog");
        replaceSpecificCharacters("The quick brown fox jumps over the lazy dog");
    }

    //Method to concatenate string

    void concatenateString(String Action, String Fruit) {

        System.out.println("String 1: " + Action);
        System.out.println("String 2: " + Fruit);
        System.out.println("Concatenated string: " + Action + " " + Fruit);

    }

    //Method to find specified sequence

    void specifiedSequence(String name, String surname) {

        System.out.println("Original string: " + name);
        System.out.println("Specified sequence: " + surname);
        System.out.println(name.contains(surname));

    }

    //Method to remove special symbol
    void removeSpecialChar(String sentence) {

        System.out.println("The original sentence : " + sentence);
        System.out.println("Without special char:" + sentence.replaceAll(("[^a-zA-Z0-9]"), " "));

    }

    //Method to find given string end with other string


    void stringEndWithOtherString(String sentence01, String sentence02) {

        System.out.println(" 'The lazy dog' ends with 'dog' " + sentence01.endsWith("dog"));
        System.out.println(" 'The lazy cat' ends with 'dog' " + sentence02.endsWith("dog"));

    }

    //Method to compare a given string to another string, ignoring case considerations.

    void ignoreCaseConsideration(String sentence01, String sentence02) {
        System.out.println("'Hello World' equals 'hello world' : " + sentence01.equalsIgnoreCase(sentence02));

    }

    //Static Method : Extract number only from given string

    static void extractNumber(String sentenceAndNumber) {
        System.out.println("old: " + sentenceAndNumber);
        System.out.println("New: " + sentenceAndNumber.replaceAll("\\D+", ""));

    }

    //Static Method: Method to find the length of a given string.

    static void lengthString(String length) {

        System.out.println("The String length of 'Hello world' is : " + length.length());
    }

    //Static Method: Method to check whether a given string starts with another string.

    static void startsWithOtherString(String start, String start01) {

        System.out.println("'the quick brown fox' starts with 'the' : " + start.startsWith("the"));
        System.out.println("'jumps ove the lazy dog' starts with 'the' : " + start01.startsWith("the"));

    }

    //Static Method: Method to get a substring of a given string at two specified positions.

    static void subStringSpecifiedPosition(String main) {

        System.out.println("Old = " + main);
        System.out.println("New = " + main.substring(10, 19));

    }

    // Static Method: Method  to replace specific characters

    static void replaceSpecificCharacters(String replaceCharacter) {

        System.out.println("Old = " + replaceCharacter);
        System.out.println("New = " + replaceCharacter.replace('e', 'h'));
    }




}

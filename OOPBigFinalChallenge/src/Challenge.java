import java.util.HashMap;
import java.util.LinkedHashMap;

//Find first non repeating character in String.
//    For example:
//    "analogy" -> "n"
//    "easiest" -> "a"
//    ""
//    getFirstNonRepeat("")
//    HashMap<Character, Integer>
//Get the unique surnames in uppercase of the first 15 book authors that are 50 years old or older.
//
//    List<String> surname =
//    library.stream()

//List<String> surname =
//    library.stream()
//    .map(book -> book.getAuthor())
//    .filter(author -> author.getAge() >= 50)
//    .map(Author::getSurname)
//    .map(String::toUpperCase)
//    .distinct()
//    .limit(15)
//    .collect(toList()));

public class Challenge {
    public static void main(String[] args) {
        char result = getFirstNonRepeatedCharacter("anna");
        System.out.println(result);
    }

    private static char getFirstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> characterCountMap = new HashMap<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            characterCountMap.merge(c, 1, (a, b) -> a + b);
        }
        System.out.println(characterCountMap);
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (characterCountMap.get(c) == 1) {
                return c;
            }
        }
        return (char) -1;
    }
}

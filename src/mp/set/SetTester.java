
package mp.set;

public class SetTester {
  public static void main(String[] args) {
    Character[] vowelLetters = {'a', 'e', 'i', 'o', 'u'};
    Character[] consonantLetters = {'b', 'c', 'd', 'f', 'g'};

    Set vowels = new Set(vowelLetters);
    Set consonants = new Set(consonantLetters);

    System.out.println("VOWELS     : " + vowels);
    System.out.println("CONSONANTS : " + consonants);

    System.out.println("VOWELS UNION CONSONANTS        : " + vowels.union(consonants));
    System.out.println("VOWELS INTERSECTION CONSONANTS : " + vowels.intersection(consonants));
    System.out.println("VOWELS DIFFERENCE CONSONANTS   : " + vowels.difference(consonants));

    System.out.println("VOWELS POWERSET :\n" + vowels.powerSet().display());
  }
}

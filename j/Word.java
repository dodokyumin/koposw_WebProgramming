public class Word {
  private String letters;

  public Word(String letters) {
    this.letters = letters.toLowerCase();
  }

  // i 번째 글자가 모음인지 // a, i, u, e, o
  public boolean isVowel(int i) {
    boolean answer = false;
    String[] Vowel = { "a", "i", "u", "e", "o" };

    for (int j = 0; j < Vowel.length; j++) {

    }
    String target = letters.substring(i, i + 1);

    if (target.equals("a") || target.equals("i") || target.equals("u") || target.equals("e") || target.equals("o")) {
      answer = true;
    }

    return answer;
  }

  // i 번째 글자가 자음인지 // a, i, u, e, o 제외한 나머지.
  public boolean isConsonant(int i) {
    boolean result = false;
    String vowel = "aiueo";
    String target = letters.substring(i, i + 1);
    if (vowel.contains(target)) {
      result = false;
    } else {
      result = true;
    }
    return result;
  }
}
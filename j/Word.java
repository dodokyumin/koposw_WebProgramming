public class Word {
  private String letters;

  public Word(String letters) {
    this.letters = letters.toLowerCase();
  }

  // i 번째 글자가 모음인지 // a, i, u, e, o
  public boolean isVowel(int i) {
    boolean answer = false;
    String[] Vowel = new String[5];
    String target = letters.substring(i, i + 1);
    if (target.equals("a") || target.equals("i") || target.equals("u") || target.equals("e") || target.equals("o")) {
      answer = true;
    }

    return answer;
  }
}


public class InterviewTest {

  public static void main(String[] args) {
    String s1 = "abcdefg";
    String s2 = null;
    for (int i = s1.length() - 1; i >= 0; i--) {
      s2 = s2 + s1.charAt(i);
    }
    System.out.println(s2);
  }
}

import java.util.*;
class CapitalizeWords {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
        StringBuilder result = new StringBuilder();

        result.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ') {
                result.append(Character.toUpperCase(str.charAt(i)));
            } else {
                result.append(str.charAt(i));
            }
        }

        System.out.println(result.toString());
    }
}
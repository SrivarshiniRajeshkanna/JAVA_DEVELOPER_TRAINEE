import java.util.*;
class Anagram{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print( " Print the first word" );
		System.out.print( " Print the Second word" );
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		if(s1.length() != s2.length()){
			System.out.println("It is not a Anagram");
		}
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		int[] freqcount = new int[26];
		
		for(int i=0; i<s1.length(); i++){
			char ch1 = s1.charAt(i);
			char ch2 = s2.charAt(i);
			freqcount[ch1-'a']++;
			freqcount[ch2-'a']--;
		}
		for (int i = 0; i < 26; i++) {
            if (freqcount[i] != 0) {
                System.out.println("It is not a Anagram");
                return;
            }
        }
        System.out.println("Anagram");
	}
}
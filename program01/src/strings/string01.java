package strings;

public class string01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="It is raining outside!Can I have a raincoat Please";
     str =str.toLowerCase();
     char []charArray;
     charArray=str.toCharArray();
     
     int vowel=0;
     for(char ch:charArray)
     {
    	 if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
    		 vowel++;
    	 }
     }
     System.out.println(vowel);
	}

}

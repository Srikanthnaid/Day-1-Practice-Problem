package bridgeLAbz;

public class CheckingStrings {
	
	
	public void compareStrings(){
		String str1 = "Srikanth";
		String str2 = "srikanth";
		//str1 = str2.toLowerCase(); this will provide converting uppercase to lowercase.
		if(str1==str2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

	public static void main(String[] args) {
		CheckingStrings obj = new CheckingStrings();
		obj.compareStrings();

	}

}

class Pangrams{
	public static boolean isPangram(String str){
		String allLetters="abcdefghijklmnopqrstuvwxyz";
		String str1=str.toLowerCase();
		for(int i=0;i<allLetters.length();i++){
			if(!str1.contains(Character.toString(allLetters.charAt(i)))){
				return false;
			}
		}
		return true;
	}
}

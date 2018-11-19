package functions;

public class Functions3 {

	public static void main(String[] args) {
		String phrase = new String ("350.");
		String middle3 = new String ("tri"); //I want to print the middle 3 characters in "phrase" which I think is "tri".

		middle3 = phrase.substring (1, 2); // this only prints out 1 letter instead of 3


		System.out.println ("middle3: " + middle3);
	}
}
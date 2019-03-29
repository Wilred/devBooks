public class BeerSong {
	public static void main(String args[]){
		int number = 99;
		String word = "bottles";
		while (number > 0){
			if (number == 1){
				word = "bottle"; 
			}
			System.out.println(number + " " + word + " of beer on the wall!");
			System.out.println(number + " " + word + " of beer!");
			System.out.println("Take one down, pass it around");
			number--;
			if (number > 1){
				System.out.println(number + "bottles of beer on the wall!");
			} else if (number == 1) {
				System.out.println(number + "bottle of beer on the wall!");
			} else {
				System.out.println("No more bottles of beer on the wall!");
			}
		}
	}
}
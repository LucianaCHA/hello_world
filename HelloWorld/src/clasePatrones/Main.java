package clasePatrones;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song = new Song(
				"The Scientist",
				"Coldplay",
				"A Rush of Blood to the head",
				2002
		);

		System.out.println("Test 1 - Regular Trend - reproducciones: " 
		+ song.getPopularity() + " ,reproduciones hoy: " + song.getReproductionsToday());
		song.play();
		song.getStats();

		song.setPopularity(1001);
		System.out.println("Test 2 - Boom Trend - reproducciones: " + song.getPopularity()  + " ,reproduciones hoy: " + song.getReproductionsToday());
		song.play();
		song.getStats();
		
		song.setDislikes(6123);
		System.out.println("Test 3 - Boom Trend to regular- reproducciones: " + song.getPopularity() + ", likes :" +
		song.getLikes() + ", dislikes : "+ song.getDislikes()   + " ,reproduciones hoy: " + song.getReproductionsToday());
		song.play();
		song.getStats();
		
		song.setDislikes(10);
		song.setLikes(23000);
		song.setPopularity(50001);
		System.out.println("Test 4 - Fire Trend- reproducciones: " + song.getPopularity() + ", likes :" +
				song.getLikes() + ", dislikes : "+ song.getDislikes() + " ,reproduciones hoy: " + song.getReproductionsToday());
		song.getStats();
		
		song.setReproductionsToday(0);
		System.out.println("Test 5 - Fire Trend to regular 'cause it had not been played today- reproducciones: " 
		+ song.getPopularity() + ", likes :" + song.getLikes() + ", dislikes : "+ song.getDislikes() + " ,reproduciones hoy: " + song.getReproductionsToday());
		song.getStats();
		
		
		
		
		

		
		

	}

}

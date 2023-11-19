package clasePatrones;

public class RegularTrend implements ITrending {

	@Override
	public void calculateTredState(Song song){ 
		if (song.getPopularity() < Constants.MIN_POPULARITY_PROMOTE_TO_BOOM_CATEGORY 
		|| song.getDislikes() > Constants.MAX_DISLIKE_TO_AVOID_REGULAR_CATEGORY 
		|| song.getReproductionsToday() == 0) {
			
			String message = Icon.MUSICAL_NOTE.text() +
					" " + song.getArtist() + " - " + song.getAlbum()+ " - " +  song.getTitle();
			
			System.out.println(message);
		}else {
				song.setTrend(new BoomTrend());
				song.getTrend().calculateTredState(song);
		}
}
}

package clasePatrones;

public class BoomTrend implements ITrending {

	@Override
	public void calculateTredState(Song song) {
		if(song.getReproductionsToday() == 0 
				||song.getDislikes() >= Constants.MAX_DISLIKE_TO_AVOID_REGULAR_CATEGORY) {
			song.setTrend(new RegularTrend());
			song.getTrend().calculateTredState(song);
		}else if(song.getPopularity()> Constants.MIN_POPULARITY_PROMOTE_TO_FIRE_CATEGORY 
				&& song.getLikes() > Constants.MIN_LIKES_PROMOTE_TO_FIRE_CATEGORY){
			song.setTrend(new FireTrend());
			song.getTrend().calculateTredState(song);
		}else {
			String message = Icon.ROCKET.text() +
					" " + song.getArtist() + " - " + song.getTitle()+
					"(" +  song.getAlbum() + "-" + song.getYear() + ")";
			System.out.println(message);
		}




	}

}

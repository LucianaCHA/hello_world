package clasePatrones;

public class FireTrend implements ITrending {

	@Override
	public void calculateTredState(Song song) {
		// TODO Auto-generated method stub
		if(song.getReproductionsToday() == 0) {
			song.setTrend(new RegularTrend());
			song.getTrend().calculateTredState(song);
		}else {			
			String message = Icon.FIRE.text() +
					" " + song.getTitle() + " - " + song.getArtist()+ "(" +  song.getAlbum() + "-" + song.getYear()+")";
			
			System.out.println(message);
		}

	}

}

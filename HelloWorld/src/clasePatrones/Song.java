package clasePatrones;

public class Song {
    private String title;
    private String artist;
    private String album;
    private int year;
    private int popularity = 0;
    private int likes = 0;
    private int dislikes = 0;
    private int reproductionsToday = 0;
    ITrending trend;

    public Song(String title, String artist, String album,int year) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year= year;
        this.trend = new RegularTrend();
    }
    

    public Song(String title, String artist, String album,int year, int popularity, int likes, int dislikes,int reproductionsToday) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year= year;
		this.popularity = popularity;
		this.likes = likes;
		this.dislikes = dislikes;
		this.reproductionsToday = reproductionsToday ;
        this.trend = new RegularTrend();

	}

    public void play(){
        this.popularity++;
        this.reproductionsToday++;
    }
    
    public void getStats() {
        this.trend.calculateTredState(this);
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public int getPopularity() {
		return popularity;
	}

	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDislikes() {
		return dislikes;
	}

	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}

	public int getReproductionsToday() {
		return reproductionsToday;
	}

	public void setReproductionsToday(int reproductionsToday) {
		this.reproductionsToday = reproductionsToday;
	}    
	
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTrend(ITrending trend) {
        this.trend = trend;
    }

    public ITrending getTrend() {
        return trend;
    }

    
}

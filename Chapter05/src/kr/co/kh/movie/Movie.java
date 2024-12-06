package kr.co.kh.movie;

public class Movie {

	private String title;
	private String director;
	private String actors;
	
	
	public Movie() {
	}

	public Movie(String title, String director, String actors) {
		super();
		this.title = title;
		this.director = director;
		this.actors = actors;
	}
	
	// 접근자(겟터), 설정자(셋터)

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", actors=" + actors + "]";
	}
	
	
}

package fight;

public class Movie {
	
	String title = null;
	String director = null;
	double rating = 0.0;
	int year = 0;
	
	String print(String title, double rating, String director, int year) {
		this.title = title;
		this.director = director;
		this.rating = rating;
		this.year = year;
		
		
		return "제목:" + title + "\n평점:" + rating + "\n감독 :" + director + "\n개봉연도 :" + year;
	}
	
	
}

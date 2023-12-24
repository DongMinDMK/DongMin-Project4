package moviePractice;

class Movie{
	String genre;
	String movieTitle;
	String movieLearningTime;
	
	public Movie(String genre, String movieTitle, String movieLearningTime) {
		this.genre = genre;
		this.movieTitle = movieTitle;
		this.movieLearningTime = movieLearningTime;
	}
	
	public void movieMethod() {
		System.out.println("수많은 영화가 존재한다.");
		System.out.println("그 많은 영화 중에 제가 좋아하는 대표적인 장르는 " + this.genre + "이다.");
		System.out.println("또한 저는 " + this.movieTitle + "의 영화를 인상깊게 봤고 재밌게 봤다.");
		System.out.println(this.movieTitle + "의 상영시간은 각각 " + this.movieLearningTime + " 이다.");
	}
}
class Drama{
	String dramaTitle;
	
	public Drama(String dramaTitle) {
		this.dramaTitle = dramaTitle;
	}
	
	public void dramaMethod() {
		System.out.println("제가 인상깊게 봤던 드라마 제목은 " + this.dramaTitle + "를 즐겨봤다.");
	}
}

public class MoviePractice {

	public static void main(String[] args) {
		Movie movie = new Movie("액션, 멜로/로맨스, 뮤지컬", "범죄도시1, 라라랜드, 위대한쇼맨, 서울의 봄", "121분, 127분, 104분, 141분");
		movie.movieMethod();
		
		System.out.println();
		
		Drama drama = new Drama("꽃보다 남자, 이태원 클라쓰, 경찰수업");
		drama.dramaMethod();

	}

}

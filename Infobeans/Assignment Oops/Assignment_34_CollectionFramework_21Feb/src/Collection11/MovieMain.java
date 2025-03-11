package Collection11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MovieComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {

		if (o1.getRating() < o2.getRating()) {
			return -1;
		} else if (o1.getRating() > o1.getRating()) {
			return +1;
		} else {
			return 0;
		}

	}
}

class Movie {
	private String title;
	private int releaseYear;
	private double rating;

	public Movie(String title, int releaseYear, double rating) {
		super();
		this.title = title;
		this.releaseYear = releaseYear;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Title: " + title + ", ReleaseYear: " + releaseYear + ", Rating: " + rating ;
	}

}

public class MovieMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Movie> t = new ArrayList<>();
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String title = sc.nextLine();
			int ry=Integer.parseInt(sc.nextLine());
			double rating = Double.parseDouble(sc.nextLine());

			Movie e = new Movie(title,ry,rating);
			t.add(e);
		}
		Collections.sort(t,new MovieComparator());
		for (Movie i : t) {
			System.out.println(i);
		}
	}
}

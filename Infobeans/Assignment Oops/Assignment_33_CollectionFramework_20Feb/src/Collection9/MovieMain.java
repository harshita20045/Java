package Collection9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class Movie implements Comparable<Movie> {
	private String title;
	private double rating;
	private int releaseYear;

	
	public Movie(String title, double rating, int releaseYear) {
		super();
		this.title = title;
		this.rating = rating;
		this.releaseYear = releaseYear;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}


	public int getReleaseYear() {
		return releaseYear;
	}


	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}


	@Override
	public String toString() {
		return "Movie [title=" + title + ", rating=" + rating + ", releaseYear=" + releaseYear + "]";
	}


	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		if (this.getReleaseYear() < o.getReleaseYear()) {
			return -1;
		} else if (this.getReleaseYear()>o.getReleaseYear()) {

			return +1;
		} else {
			return 0;
		}
	}

}

public class MovieMain {
public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);
		ArrayList<Movie> l = new ArrayList<>();
	while (true) {
		System.out.println("Add Product :");
		System.out.println("Display  :");
		int choice = Integer.parseInt( sc.nextLine());

		switch (choice) {
		case 1:
			System.out.print("Enter title : ");
			String title = sc.nextLine();
			System.out.print("Enter rating : ");
			double rate = Double.parseDouble(sc.nextLine());
			System.out.print("Enter Release Year : ");
			int year = Integer.parseInt(sc.nextLine());
			Movie m=new Movie(title,rate,year);
			l.add(m);
			break;
		case 2:
			Collections.sort(l);
			System.out.println("Display  : ");
			for (Movie i : l) {
				System.out.println(i);
			}

		}

}
}}
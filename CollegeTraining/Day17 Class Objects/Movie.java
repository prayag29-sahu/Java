/*
9. Create a class Movie with name, rating, and releaseYear. Create 5 movie objects and display
movies released after 2020
 */
class MovieDet{
    String name;
    int rating;
    int releaseyera;

    MovieDet(String n, int r, int ry) {
        name = n;
        rating = r;
        releaseyera = ry;
    }
    void display(){
        System.out.println("Movie Name : "+name);
        System.out.println("Movie Ratings : "+rating);
        System.out.println("Movie Release Year : "+releaseyera);
    }
    
}
public class Movie {
    public static void main(String[] args) {
        MovieDet m1 = new MovieDet(" Oppenheimer", 8, 2023);
        MovieDet m2 = new MovieDet(" Spider-Man: No Way Home", 7, 2021);
        MovieDet m3 = new MovieDet(" Top Gun: Maverick", 8, 2022);
        MovieDet m4 = new MovieDet("  The Batman", 7, 2022);
        MovieDet m5 = new MovieDet("Dune: Part One", 8, 2021);
        m1.display();
        System.out.println();
        m2.display();
        System.out.println();
        m3.display();
        System.out.println();
        m4.display();
        System.out.println();
        m5.display();
        System.out.println();
    }
}
/*
Movie Name :  Oppenheimer
Movie Ratings : 8
Movie Release Year : 2023

Movie Name :  Spider-Man: No Way Home   
Movie Ratings : 7
Movie Release Year : 2021

Movie Name :  Top Gun: Maverick
Movie Ratings : 8
Movie Release Year : 2022

Movie Name :   The Batman
Movie Ratings : 7
Movie Release Year : 2022

Movie Name : Dune: Part One
Movie Ratings : 8
Movie Release Year : 2021

 */
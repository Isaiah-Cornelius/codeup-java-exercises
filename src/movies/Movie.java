package movies;

public class Movie {

    public Movie(){}

    public Movie(String name){
        this.name = name;
    }

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    private String name;

    public void setName(String name){
        this.name = name;
    }

    private String category;

    public void setCategory(String category){
            this.category = category;
    }

    public void getMovieInfo(){
        System.out.println(this.name + " -- " + this.category);
    }

    public String getMovieCategory(){
        return this.category;
    }

    public static void main(String[] args) {

    }
}

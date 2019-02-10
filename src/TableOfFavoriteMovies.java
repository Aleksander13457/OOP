public class TableOfFavoriteMovies {
    public static void main(String[] args) {

        String[] nameOfMovie = new String[5];
        nameOfMovie[0] = "Aquaman";
        nameOfMovie[1] = "Green Book";
        nameOfMovie[2] = "Venom";
        nameOfMovie[3] = "Glass";
        nameOfMovie[4] = "Creed II";

        for (String movie : nameOfMovie) {
            System.out.println(movie);
        }
    }
}
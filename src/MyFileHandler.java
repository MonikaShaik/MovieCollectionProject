import java.io.*;
import java.util.ArrayList;
import model.Movie;

public class MyFileHandler {

  private static final String FILE_NAME = "movies.dat";

  public void saveMovies(ArrayList<Movie> list) {
    try {
      ObjectOutputStream output =
          new ObjectOutputStream(
              new FileOutputStream(FILE_NAME));

      output.writeObject(list);
      output.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public ArrayList<Movie> loadMovies() {
    try {
      ObjectInputStream input =
          new ObjectInputStream(
              new FileInputStream(FILE_NAME));

      ArrayList<Movie> list =
          (ArrayList<Movie>) input.readObject();

      input.close();

      return list;

    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
      return new ArrayList<Movie>();
    }
  }
}

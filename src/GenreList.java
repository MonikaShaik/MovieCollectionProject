import java.util.ArrayList;

public class GenreList
{
  private ArrayList<Genre> genres;

  public GenreList(Genre genre)
  {
    genres = new ArrayList<>();
    genres.add(genre);
  }

  public void addGenre(Genre genre)
  {
    genres.add(genre);
  }
  public String toString()
  {
    return "Genres: "+ genres;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }
    GenreList other = (GenreList) obj;
    return genres.equals(other.genres);
  }
}

public class Genre
{
  private String genreName;

  public Genre(String genreName)
  {
    this.genreName = genreName;
  }

  public String getGenreName()
  {
    return genreName;
  }

  public void setGenreName(String year)
  {
    this.genreName = genreName;
  }

  public String toString()
  {
    return "Genre: "+ genreName;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }
    Genre other = (Genre) obj;
    return genreName.equals(other.genreName);
  }
}

public class GenreName
{
  private String genreName;

  public GenreName(String genreName)
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
    GenreName other = (GenreName) obj;
    return genreName.equals(other.genreName);
  }
}

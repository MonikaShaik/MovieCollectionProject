public class Director
{
  private String director;

  public Director(String director)
  {
    this.director = director;
  }

  public String getDirector()
  {
    return director;
  }

  public void setDirector(String year)
  {
    this.director = director;
  }

  public String toString()
  {
    return "Director: "+ director;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }
    Director other = (Director) obj;
    return director.equals(other.director);
  }
}

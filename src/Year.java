public class Year
{
  private int year;

  public Year(int year)
  {
    this.year = year;
  }

  public int getYear()
  {
    return year;
  }

  public void setYear(int year)
  {
    this.year = year;
  }

  public String toString()
  {
    return "Year: "+ year;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }
    Year other = (Year) obj;
    return year == other.year;
  }

}

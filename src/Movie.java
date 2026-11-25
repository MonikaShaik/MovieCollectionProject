public class Movie
 {
  private String title;
  private Year releaseYear;
  private GenreList genres;
  private Director director;
  private Status status;

  public Movie(Year releaseYear, String title) {
    this.title = title;
    this.releaseYear =  releaseYear;
    this.genres = new GenreList();//ask allen
    this.director = new Director() ;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getReleaseYear() {
    return releaseYear.getYear();
  }

  public void setReleaseYear(int year) {
    releaseYear.setYear(year);
  }

  public void addGenre(Genre genre) {
    genres.addGenre(genre);
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Movie copy() {
    return new Movie(releaseYear,title);
  }

  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    Movie other = (Movie) obj;
    return getReleaseYear() == other.getReleaseYear()
        && title.equals(other.title)
        && genres.equals(other.genres)
        && director.equals(other.director)
        && status.equals(other.status);
  }


  public String toString() {
    return "Movie{title='" + title + '\''
        + ", releaseYear=" + releaseYear.copy()
        + ", genres=" + genres
        + ", director=" + director
        + ", status=" + status
        + '}';
  }
}

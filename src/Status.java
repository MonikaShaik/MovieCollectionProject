public class Status
{
  private String status;

  public Status(String status)
  {
    this.status = status;
  }

  public String getStatus()
  {
    return status;
  }

  public void setStatus(String status)
  {
    this.status = status;
  }

  public String toString()
  {
    return "Status: "+ status;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
    {
      return false;
    }
    Status other = (Status) obj;
    return status.equals(other.status);
  }
}

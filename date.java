import java.time.LocalDate;
public class date {
    public int day;
    public int month;
    public int year;
    public date()
    {
        LocalDate l=LocalDate.now();
        day=l.getDayOfMonth();
        month=l.getMonthValue();
        year=l.getYear();
    }
    public date(int d,int m,int y)
    {
        day=d;
        month=m;
        year=y;
    }
    public void setday(int n)
    {
        day=n;
    }
    public void setmonth(int n)
    {
        month=n;
    }
    public void setyear(int n)
    {
        year=n;
    }
    public void setdate(int d,int m,int y)
    {
        day=d;
        month=m;
        year=y;
    }
    public int getday()
    {
        return day;
    }
    public int getmonth()
    {
        return month;
    }
    public int getyear()
    {
        return year;
    }
    public String getdate()
    {
        return day+"\\"+month+"\\"+year;
    }
}

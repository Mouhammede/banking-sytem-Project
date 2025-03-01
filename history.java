import java.util.ArrayList;

public class history {
    private date d;//date
    private String procedure;
    private int PID;// the one ho did the procedure
    private double money;
    private int to=0;//transfer to ID
    public history(date dd,String p,int pi,double m,int t)
    {
        d=dd;
        procedure=p;
        PID=pi;
        money=m;
        to=t;
    }
    public ArrayList<Object> getinfo()
    {
        ArrayList<Object> u=new ArrayList<>();
        u.add(d);
        u.add(procedure);
        u.add(PID);
        u.add(money);
        u.add(to);
        return u;
    }
    public void setinfo(date dd,String p,int pi,double m,int t)
    {
        d=dd;
        procedure=p;
        PID=pi;
        money=m;
        to=t;
    }
}

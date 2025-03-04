import java.util.ArrayList;
import java.util.Random;
public class bank 
{
    public String name;
    public String location;
    private ArrayList<account> accounts=new ArrayList<>();
    public class account
    {
        private int password;
        private int key;
        private double balence;
        private double loan;
        private int ID;
        private String on;//owner name
        private String oa;//owner addres
        private date op;//opening date
        private int tax;
        private ArrayList<history> hist;
        public account(int i,String n,String a,double b,int t)
        {
            balence=b;
            loan=0;
            op=new date();
            Random r=new Random();
            ID=i;// later : make an algorithm to generate an ID
            on=n;
            oa=a;
            key=r.nextInt(99)+1;
            tax=t;
            hist=new ArrayList<>();
        }
        public int getkey()
        {
            return key;
        }
        public String getoinfo()//get owner informashon
        {
            return "name : "+on+"\naddres : "+oa;
        }
        public date getopeningdate()
        {
            return op;
        }
        public void settax(int n)
        {
            tax=n;
        }
        public int gettax()
        {
            return tax;
        }
        public void Deposit(double n)
        {
            date t=new date();
            if(loan==0)
            {
                balence=balence+n;
                hist.add(new history(t,"Deposit",ID,n,0));
            }
            else
            {
                balence=balence+n-(n*0.2);
                if(loan<(n*0.2))
                {
                    balence=balence+(n-loan);
                    hist.add(new history(t,"Pay the loan",ID,(n*0.2)-loan,0));
                    hist.add(new history(t,"Deposit",ID,n-loan,0));
                    loan=0;
                }
            }
        }
        public void Withdraw(double n)
        {
            date t=new date();
            if(n<=balence)
            {
                balence=balence-n;
                hist.add(new history(t,"Withdraw",ID,n,0));
            }
            else
            {
                System.out.println("you do not have "+n+" DA");
                System.out.println("you have "+balence+" DA");
            }
        }
        public boolean checkownership(int i,int p)
        {
            if(i==ID&&p==password)
            {
                return true;
            }
            return false;
        }
        public void takeloan(int n)
        {
            if(loan==0)
            {
                loan=n;
                date t=new date();
                hist.add(new history(t,"Take a loan",ID,n,0));
            }
        }
        public void paytheloan(int n)
        {
            if(loan!=0)
            {
                date t=new date();
                loan=loan-n;
                if(loan<0)
                {
                    loan=loan*(-1);
                    balence=balence+loan;
                    hist.add(new history(t,"pay the loan",ID,n-loan,0));
                    hist.add(new history(t,"Deposit",ID,loan,0));
                    loan=0;
                }
                else
                {
                    hist.add(new history(t,"pay the loan",ID,n-loan,0));
                }
            }
        }
    }
    private int getindex(int id,int pass)
    {
        int i;
        for(i=0;i<accounts.size();i++)
        {
            if(accounts.get(i).checkownership(id,pass))
            {
                return i;
            }
        }
        return -1;
    }
    public void dipos(double n,int id,int pass)
    {
        int y;
        y=getindex(id,pass);
        if(y!=-1)
        {
            accounts.get(y).Deposit(n);
        }
    }
    public void withd(double n,int id,int pass)
    {
        int y;
        y=getindex(id,pass);
        if(y!=-1)
        {
            accounts.get(y).Withdraw(n);
        }
    }
}
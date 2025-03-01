import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
public class bank 
{
    public String name;
    public String location;
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
            if(n<balence)
            {
                balence=balence-n;
            }
            else
            {
                System.out.println("you do not have "+n+" DA");
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
    }
}
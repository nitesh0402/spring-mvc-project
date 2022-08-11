package SpringEx;

public class SimpleIntrest {
private int p;
private int r;
private int t;

SimpleIntrest(int p,int r,int t)
{
this.p=p;
this.r=r;
this.t=t;
}
void calculate()
{
 System.out.println("result "+p*r*t/100); 	
}	
}

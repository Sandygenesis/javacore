/*package examples;
public class amst {
	public static void main(String[] args) {
	int r,n=150,tem;
	int sum=0;
	tem=n;
	while(n>0)
	{
		r=n%10;
		n=n/10;
		sum=sum+r*r*r;
	}
	if(tem==sum)
	{
		System.out.println("armstrong");
	
	}
	else
		System.out.println("armstrong");

}
}
*/
package examples;
public class amst {
	public static void main(String[] args) {
	int r,n=121,tem;
	int sum=0;
	tem=n;
	while(n>0)
	{
		r=n%10;
		n=n/10;
		sum=(sum*10)+r;
	}
	if(tem==sum)
	{
		System.out.println("palindrom");
	
	}
	else
		System.out.println("not palidrom");

}
}

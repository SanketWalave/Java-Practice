/*3. Write Program create class name as ArrSum with method void setValue(int arr[]) you have to 
create child class name as GetSum with method int getArrSum() you have to accept array values from ArrSum and 
calculate its sum and return it.
*/
class ArrSum
{
	int a[];
	void setValue(int a[])
	{
		this.a=a;
	}
}
class GetSum extends ArrSum
{
	int getArrSum()
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		
		return sum;
	}
}
public class ArraySum_21_1
{
	public static void main(String x[])
	{
		int a[]={1,1,1,1,5};
		
		GetSum gs=new GetSum();
		gs.setValue(a);
		System.out.println("1,1,1,1,1  array");
		System.out.println("array sum         ="+gs.getArrSum());
	}
}
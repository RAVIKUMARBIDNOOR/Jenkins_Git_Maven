package New.github.com;

public class Git {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum=0,num = 123,rem;
	int temp=num;
	while(num>0)
	{
		rem=num%10;
		sum=(sum*10)+rem;
		num=num/10;
	}
	if(temp==sum)
	{
		System.out.println("The number is polindrom: "+num);
	}
	else
	{
		System.out.println("The number is not polindram: "+num);
	}

	}

}

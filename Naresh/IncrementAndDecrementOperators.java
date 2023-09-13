class IncrementAndDecrementOperators 
{
	public static void main(String[] args) 
	{
		int num = 10;
		//num++;
		//++num;
		//System.out.println(++num);//11,10
		//num++;
		//++num;
		//System.out.println(++num);//12,11
		//System.out.println(num);//12
		/*num--;
		System.out.println(num);
		num--;
		System.out.println(num);*/
		//int sum = num++ + num++;//10 + 11;
		//int sum = ++num + ++num;//11 + 12;
		/*int sum = ++num + ++num + num++ + num++;//11 + 12 + 12 + 13
		System.out.println(sum);//48
        System.out.println(num);*/
        int sum = --num + --num + num-- + num-- + num++ + num++ + --num + num;//9 + 8 + 8 + 7 + 6 + 7 + 7 + 7
		System.out.println(sum);//59
        System.out.println(num);//7
		
	}
}

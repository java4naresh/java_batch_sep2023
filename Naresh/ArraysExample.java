import java.util.Arrays;

class ArraysExample 
{
	public static void main(String[] args) 
	{
		//first way
		int numbers[] = {10,20,30,40,50,60,70,80,90,100};
        /*System.out.println(numbers[0]);//10
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		System.out.println(numbers[5]);
		//System.out.println(numbers[6]);//error
		numbers[0] = 15;
		System.out.println(numbers[0]);//15
        System.out.println(numbers.length);*/
		System.out.println(Arrays.toString(numbers));
		for(int i=0;i<numbers.length; i++) {//0<7
		//System.out.println(numbers[i]);//
        numbers[i] = numbers[i]+5;
		}
		System.out.println(Arrays.toString(numbers));

		//second way
		int[] numbers2 = new int[5];
        System.out.println(Arrays.toString(numbers2));
		numbers2[0] = 1;
		numbers2[1] = 2;
		numbers2[2] = 3;
		numbers2[3] = 4;
		numbers2[4] = 5;
		System.out.println(Arrays.toString(numbers2));

		int[] numbers3 = {8,5,2,6,9,7};
        //System.out.println(numbers3[0]+numbers3[1]+numbers3[2]+numbers3[3]+numbers3[4]);
        int sum = 0;
		for(int i=0;i<numbers3.length; i++) {
		sum = sum + numbers3[i];
		}
        System.out.println(sum);

		int number4 = {2,5,6,8,9};
		
}
}

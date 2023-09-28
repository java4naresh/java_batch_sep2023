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

		int[] number = {2,5,6,8,9,10};
		int check = 8;
		String status = "Absent";
		for(int i=0; i<number.length; i++) {
		if(number[i] == check) {
		status = "Present";
		break;
		}
		}
        System.out.println(status);

		int[] numbers4 = {4,5,1,20,9,8,2,10,16,15};//60

        sum=0;
		for(int i=0; i<numbers4.length; i++) {
		if(numbers4[i]%2==0) {
		sum = sum+numbers4[i];
		}
		}
		System.out.println(sum);

		int[] numbers5 = {8,9,2,1,3,5,6,7};//{1,2,3,5,6,7,8,9}
		//{2,9,8,1,3,5,6,7}
		//{1,9,8,2,3,5,6,7}
        //{1,8,9,2,3,5,6,7}
		//{1,2,9,8,3,5,6,7}
        //{1,2,8,9,3,5,6,7}
        //{1,2,3,9,8,5,6,7}
		System.out.println(Arrays.toString(numbers5));
		for(int i=0;i<numbers5.length;i++) {//0<8
		for(int j=i+1;j<numbers5.length;j++) {//3<8
		if(numbers5[i]>numbers5[j]) {//numbers5[0]>numbers5[3] 2>1
		int temp = numbers5[i];
        numbers5[i] = numbers5[j];
        numbers5[j] = temp;
		}
		}
		}
        System.out.println(Arrays.toString(numbers5));
		
}
}

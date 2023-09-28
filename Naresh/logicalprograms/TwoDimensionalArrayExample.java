import java.util.Arrays;

class TwoDimensionalArrayExample 
{
	public static void main(String[] args) 
	{
		int[][] multiArray = {{1,2,3,4},{5,6,7,8},{9,10,11}};
		
		/*System.out.println(multiArray[0][0]);
		System.out.println(multiArray[0][1]);
		System.out.println(multiArray[0][2]);
		System.out.println(multiArray[1][0]);
		System.out.println(multiArray[1][1]);
		System.out.println(multiArray[1][2]);
		System.out.println(multiArray[2][0]);
		System.out.println(multiArray[2][1]);
		System.out.println(multiArray[2][2]);*/
        //System.out.println(multiArray);
		//System.out.println(Arrays.toString(multiArray));

		System.out.println(Arrays.toString(multiArray[0]));
		System.out.println(Arrays.toString(multiArray[1]));
		System.out.println(Arrays.toString(multiArray[2]));
        System.out.println("=====================");
		for(int i=0;i<multiArray.length; i++) {
		for(int j=0;j<multiArray[i].length;j++) {
		if(j == multiArray[i].length-1) {
		int temp = multiArray[i][0];
        multiArray[i][0] = multiArray[i][j];
        multiArray[i][j] = temp;
		}
		}
		}
		System.out.println(Arrays.toString(multiArray[0]));
		System.out.println(Arrays.toString(multiArray[1]));
		System.out.println(Arrays.toString(multiArray[2]));

		/*System.out.println(Arrays.toString(multiArray[0]));
		System.out.println(Arrays.toString(multiArray[1]));
		System.out.println(Arrays.toString(multiArray[2]));
        System.out.println("=====================");
		for(int i=0;i<multiArray.length; i++) {
		for(int j=0;j<multiArray[i].length;j++) {
		if(i==multiArray.length-1) {
		int temp = multiArray[i][j];
        multiArray[i][j] = multiArray[0][j];
        multiArray[0][j] = temp;
		}
		}
		}
		System.out.println(Arrays.toString(multiArray[0]));
		System.out.println(Arrays.toString(multiArray[1]));
		System.out.println(Arrays.toString(multiArray[2]));*/

        
	}
}

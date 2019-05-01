class Task6{
	public static void main(String args[]) {
 int temp, size;
      int array[] = {1, 8, 3, 2, 6, 4};
      size = array.length;

	String val = args[0];
	int num = Integer.parseInt(val);
	boolean check = false;
	int pos = 0;

      for(int i = 0; i<size; i++ ){
		if( array[i] == num ){
			check = true;
			pos = i;
		}
      }
	  
	  if( check == true ){
			System.out.println("Position is : "+pos);
		}else{
			System.out.println("Not Found!");
		}
	  
   }
}
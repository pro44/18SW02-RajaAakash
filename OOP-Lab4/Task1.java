class Task1{
public static void main(String args[]){
	
	int i,k = 0,space, rows =5;
	
	for(  i = 1;i<6;i++ ){
		for(int j = 1; j<=i;j++){
		System.out.print("*");
		}
		System.out.println();
	}	
	System.out.println();
	
	for(  i = 1;i<6;i++ ){
		for(int j = 6; j>i;j--){
		System.out.print("*");
		}
		System.out.println();
	}
	//--------------------------------    	
		for( i = 1;i<= rows;i++){
			for(space =1;space<=rows-i;space++){
					System.out.print("  ");
			}
			while(k!=2*i-1){
				System.out.print("* ");
				++k;
			}
			k=0;
			System.out.println();
		}
		

		
    }
}

package hello;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		
		for(int i=0;i<5;i++) {
		  for(int j=0;j<5-i;j++) {
			  System.out.print("*");
		  }
			System.out.println();
		}
		
		
		
		/*
		
		for(int i=0;i<6;i++) {
			
			  for(int j=0;j<5-i;j++) {
				  System.out.print(" ");}
			  for(int j=0;j<i+1;j++) {
				  System.out.print("*");}
				  		
				System.out.println();
	}
					
	/*			for(int i=0;i<6;i++) {
					
					  for(int j=0;j<i;j++) {
						  System.out.print(" ");
					  }
					  for(int j=0;j<6-i;j++) {
						  System.out.print("*");
					  }
						System.out.println();
						
					}		
		
	/*	for(int i=0;i<6;i++) {
			
			  for(int j=0;j<5-i;j++) {
				  System.out.print(" ");
			  }
			  for(int j=0;j<2*i+1;j++) {
				  System.out.print("*");
			  }
				System.out.println();
		}		
		/*	
		for(int i=0;i<6;i++) {
			
			  for(int j=0;j<i+1;j++) {
				  System.out.print(" ");
			  }
			  for(int j=0;j<2*(4-i)+1;j++) {
				  System.out.print("*");
			  }
				System.out.println();
		}	*/
		
	/*	for(int i=0;i<9;i++) {
				if(i<5) {
					
					for(int j=0;j<3-i;j++) {
						  System.out.print(" ");
					  }
					  for(int j=0;j<2*i+1;j++) {
						  System.out.print("*");
					  }
					  
					  
				} else {
					 for(int j=0;j<i-3;j++) {
						  System.out.print(" ");
					  }
					  for(int j=0;j<2*(6-i)+1;j++) {
						  System.out.print("*");
					  }
				}
				System.out.println();
				
		} */
		
		/*
		for (int i = 0; i< 11; i++) {
			if(i<6) { 
			for (int j = 0; j< 6-i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j< 2*i+1; j++) {
				System.out.print("_");
			}
			for (int j = 0; j< 6-i; j++) {
				System.out.print("*");
			}
			}else {
				for (int j = 0; j< i-4; j++) {
					System.out.print("*");
				}
				for (int j = 0; j< 11-(2*(i-5)); j++) {
					System.out.print("_");
				}
				for (int j = 0; j< i-4; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		} */
		/*
		for(int i=0;i<9;i++) {
			if(i<5) {
				
				  for(int j=0;j<i+1;j++) {
					  System.out.print("*");
				  }
				  
				  
			} else {
				  for(int j=0;j<9-i;j++) {
					  System.out.print("*");
				  }
			}
			System.out.println();
		}
		*/
		/*
		for(int i=0;i<9;i++) {
			if(i<5) {
				
				for(int j=0;j<4-i;j++) {
					  System.out.print(" ");
				  }
				  for(int j=0;j<i+1;j++) {
					  System.out.print("*");
				  }
				  
			} else {
				 for(int j=0;j<i-4;j++) {
					  System.out.print(" ");
				  }
				  for(int j=0;j<9-i;j++) {
					  System.out.print("*");
				  }
			}
			System.out.println();
		} */
		
		/*
		for (int i = 0; i< 9; i++) {
			if(i<5) { 
			for (int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j< 9-(2*i); j++) {
				System.out.print("*");
			}
			for (int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			}else {
				for (int j = 0; j< 8-i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j< (2*i)-7; j++) {
					System.out.print("*");
				}
				for (int j = 0; j< 8-i; j++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		
		for (int i = 0; i< 10; i++) {
			if(i<5) { 
			for (int j = 0; j<i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j< 8-(2*i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j<i; j++) {
				System.out.print("*");
			}
			}else {
				for (int j = 0; j< 8-i; j++) {
					System.out.print("*");
				}
				for (int j = 0; j< (2*i)-8; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j< 8-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}
		
	

class Ex12{ 
public static void main(String args[]){
	int x = 10; 
    int y = new Ex12().change(x); 
    System.out.print (x+y); 
    }
 int change(int x){ 
 x=12;
 return x;
 }
}
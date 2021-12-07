import java.util.Scanner;

class IntegerToBinary{

static int arr[]=new int[10];

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number to convert to binary:");
int n=sc.nextInt();

for(int i=0; i>0; i++){
arr[i]=n%2;
n=n/2;
}
System.out.println("The binary number is:");
for(int j=i-1; j>=0; j--){
System.out.println(arr[j]);

}

}

}
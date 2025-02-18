import java.util.Scanner;
class Testarray{  
public static void main(String args[]){  
/*
int a[]={1,2,3,4,5};
for(int i=0;i<a.length;i++)
System.out.println(a[i]);  
*/
int m=3,n=3;
int i,j;
int arr[][]=new int[m][n];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the elements");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
arr[i][j]=sc.nextInt();
}}
System.out.println("The First Matrix is:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
int m1=3,n1=3;
 int arr2[][]=new int[m1][n1];
System.out.println("Enter the elements");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
arr2[i][j]=sc.nextInt();
}}
System.out.println("The Second Matrix is:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(arr2[i][j]+" ");
}
System.out.println();
}
int result[][]=new int[m][n];
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
result[i][j]=arr[i][j]+arr2[i][j];
}
}
System.out.println("The new matrix is");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(result[i][j]+" ");
}
System.out.println();
}
sc.close();

}}

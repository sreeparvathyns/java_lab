import java.util.Scanner;
class Complex{
public static void main(String args[])
{
int real_part1,imag_part1,real_part2,imag_part2,sum_of_real,sum_of_imag;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the real part of the first complex no:");
real_part1=sc.nextInt();
System.out.println("Enter the imaginary part of the first complex no");
imag_part1=sc.nextInt();
System.out.println("The entered number is: " + real_part1 + " + " + imag_part1 + "i");

System.out.println("Enter the real part of the second complex no:");
real_part2=sc.nextInt();
System.out.println("Enter the imaginary part of the second complex no");
imag_part2=sc.nextInt();
System.out.println("The entered number is: " + real_part2 + " + " + imag_part2+ "i");

sum_of_real=real_part1+real_part2;
sum_of_imag=imag_part1+imag_part2;

System.out.println("The sum of two complex numbers is : "+sum_of_real+"+"+sum_of_imag+"i");
sc.close();
}
}



class A
{

static int c = 30; // Sv // with the help of classname dot variable name
int a = 10 ; // Iv // obj create object
public static void main(String ...args)
{
A obj = new A();// creating object

int b=20 ;// Lc // directly

 System.out.println(A.c);
 System.out.println(b);
 System.out.println(obj.a);
}

}
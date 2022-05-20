interface Sample {
void display(String a);
default void display1() {
System.out.println("I am default method");
}
static void my() {
System.out.println("I am static method");
}
}
public class DefaultMethod implements Sample {
public static void main(String[] args) {
DefaultMethod d = new DefaultMethod();
d.display("Good Morning");
d.display1();
Sample.my();
}
@Override
public void display(String a) {
System.out.println(a);	
}
}

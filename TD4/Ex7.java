public class Ex7 {
public boolean b = true;
public boolean set(boolean x) {
x = !x ;
return (x == b);
}
public static void main(String[] args) {
Exemple ex = new Exemple();
ex.b = ex.set(ex.b);
System.out.println(ex.b);
}
}
(a) le programme imprime true.
(b) le programme imprime false.
#include <stdio.h>


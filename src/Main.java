
public class Main {
    public static void main(String[] args) {
        C1 a = new C5(); /* Valid, polymorphism - C5 is a subclass of C1.
        (can use a reference of type C1 to refer to an object of type C5.)*/
        C1 b = new C3(); // Valid, polymorphism - C3 is a subclass of C1.
        C2 c = (C2) a;   // inValid but with explicit casting it'll be valid - C2 is a subclass of C1.

        // C4 d = new C1(); // Compilation error - Cannot directly instantiate an object of the abstract class C1(superclass).


         b = a; // Valid, both a and b are of type C1, so you can assign one to the other.
         b = new C6(); // Valid, polymorphism - C6 is a subclass of C1.
         c = (C2) b; // invalid, they aren't in same type, so we use casting to fix it.

         // d = b; // Compilation error - Cannot assign a C1 (super Class) object directly to a C4 (subclass Class) reference.



         C4 e;
         b = new C5(); // Valid, polymorphism - C5 is a subclass of C1.
         // e = (C4) b; // Runtime error (ClassCastException) - trying to cast a C5 object to C4 is not allowed.(b is not a C4 object or a subtype of C4)
    }
}
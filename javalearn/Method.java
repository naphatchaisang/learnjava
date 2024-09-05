public class Method {
public static void main(String[] args) {

    staticMethod();
    privateStaticMethod();
    publicStaticMethod();

    
}

// void function for no returning value from function
void noReturnMethod(){
    System.err.println("no return method");
}

// replace void with type for returning that type from function
int returnIntMethod(){
    System.err.println("returning value method");
    return 1;
}

// static method for function that can be called without create class object
static void staticMethod(){
    System.err.println("no returning static method");
}

// private function can only be used in the same class
private static void privateStaticMethod(){
    System.err.println("private function");
}

// public function can be used from another file
public static void publicStaticMethod(){
    System.err.println("public function");
}

}

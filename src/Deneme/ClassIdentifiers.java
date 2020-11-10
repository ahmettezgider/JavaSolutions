package Deneme;

// public, default
public class ClassIdentifiers {

    //instance vars
    private int val11;
    int val12;
    protected int val13;
    public int val14;

    private static int val21;
    static int val22;
    protected static int val23;
    public static int val24;

    private final int val31=0;
    final int val32=0;
    protected final int val33=0;
    public final int val34=0;

    private final static int val41=0;
    final static int val42=0;
    protected final static int val43=0;
    public final static int val44=0;


    public ClassIdentifiers() {
    }


    // methods
    private void method11(){}
    void method12(){}
    protected void method13(){}
    public void method14(){}

    private static void method21(){}
    static void method22(){}
    protected static void method23(){}
    public static void method24(){}

    // Reports methods declared final and private.
    // As private methods cannot be meaningfully overridden, declaring them final is redundant.
    private final void method31(){}         // redundant
    final void method32(){}
    protected final void method33(){}
    public final void method34(){}


    // When a static method is overridden in a subclass it can still be accessed via the super class,
    // making a final declaration not very necessary.
    // Declaring a static method final does prevent subclasses from defining a static method with the same signature.
    private final static void method41(){}
    final static void method42(){}
    protected final static void method43(){}
    public final static void method44(){}


    void myMethod(){
        int i;      // in method only default local variable definition
    }

    public static void main(String[] args) {

    }

}

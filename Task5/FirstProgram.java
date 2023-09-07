import FirstPackage.SecondClass;
class FirstClass {
    public static void main(String[] s) {
        SecondClass o = new SecondClass(0, 0);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                o.setNum1(i);
                o.setNum2(j);
                System.out.print(o.addNumbers());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

//cd /Users/edavkinstepan/Desktop/Java/Laba1/Task5/
//javac FirstPackage/SecondClass.java
//javac FirstProgram.java
//java FirstClass
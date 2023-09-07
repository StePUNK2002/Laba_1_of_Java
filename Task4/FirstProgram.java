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

class SecondClass {
	// два приватных поля типа int
    private int num1;
    private int num2;

    // конструктор, создающий объект и инициализирующий значения полей
    public SecondClass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // методы для получения и модификации их значений
    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // метод с возвращаемым типом int, реализующий над этими числами какое-либо действие
    public int addNumbers() {
        return this.num1 + this.num2;
    }
}

//cd /Users/edavkinstepan/Desktop/Java/Laba1/Task4/
//javac FirstProgram.java
//java FirstClass 
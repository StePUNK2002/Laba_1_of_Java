package FirstPackage;
public class SecondClass {
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

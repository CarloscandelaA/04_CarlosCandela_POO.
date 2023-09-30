public class Calculadora_04 {
    //atributos
    private int num1;
    private int num2;

    //constructores
    public Calculadora_04() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public Calculadora_04(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //metodos con valores de retorno
    public int sumar() {
        return num1 + num2;
    }

    public int restar() {
        return num1 - num2;
    }

    //sobrecarga de metodos
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    void setNum1(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNum2(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int multiplicar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
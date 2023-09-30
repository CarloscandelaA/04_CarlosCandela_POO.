public class Main_04 {
    public static void main(String[] args) {
        // Crear un objeto Estudiante_00 usando el constructor sin parámetros
        Estudiante_04 estudiante1 = new Estudiante_04();
        estudiante1.setNombre("Juan");
        estudiante1.setEdad(20);
        estudiante1.setCarrera("Ingeniería");

        // Crear un objeto Estudiante_04 usando el constructor con parámetros
        Estudiante_04 estudiante2 = new Estudiante_04("María", 22, "Medicina");

        // Imprimir los datos del estudiante1
        System.out.println("Estudiante 1:");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Carrera: " + estudiante1.getCarrera());

        // Imprimir los datos del estudiante2
        System.out.println("\nEstudiante 2:");
        System.out.println("Nombre: " + estudiante2.getNombre());
        System.out.println("Edad: " + estudiante2.getEdad());
        System.out.println("Carrera: " + estudiante2.getCarrera());

        // Crear un objeto Calculadora_04 usando el constructor sin parámetros
        Calculadora_04 calculadora = new Calculadora_04();
        calculadora.setNum1(10);
        calculadora.setNum2(5);

        // Realizar operaciones con la calculadora
        int suma = calculadora.sumar();
        int resta = calculadora.restar();
        int multiplicacion = calculadora.multiplicar();
        
        // Imprimir los resultados de las operaciones
        System.out.println("\nResultados de la calculadora:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
    }
}
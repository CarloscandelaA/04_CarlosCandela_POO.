public class Estudiante_04 {
    //atributos
    private String nombre;
    private int edad;
    private String carrera;

    //constructores
    public Estudiante_04() {
        this.nombre = "";
        this.edad = 0;
        this.carrera = "";
    }

    public Estudiante_04(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    //metodos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    //sobrecarga de metodos
    public void estudiar() {
        System.out.println("El estudiante está estudiando");
    }

    public void estudiar(String materia) {
        System.out.println("El estudiante está estudiando " + materia);
    }
}
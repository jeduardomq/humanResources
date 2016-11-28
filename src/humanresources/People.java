package humanresources;

public class People {

    String Nombre;
    String Apellido;
    int Edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    

    public String toString(){
        return "clase padre"+Nombre+" "+Apellido+" "+Edad;
    }

}

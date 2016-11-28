
package humanresources;

public class Sistemas extends People{

      
    String tipoAcceso="All";
    int Clave=12;
    /*
    public People(String tipoAcceso,int Clave){
        super(Nombre, Apellido,Edad);
        
    }
    */
    public String formaAccesar(){
        System.out.println("Acceden con el tipo de Acceso "+ tipoAcceso
                +"mas la Clave"+Clave);
        return "";
    }
    
    public String getTipoAcceso() {
        return tipoAcceso;
    }

    public void setTipoAcceso(String tipoAcceso) {
        this.tipoAcceso = tipoAcceso;
    }

    public int getClave() {
        return Clave;
    }

    public void setClave(int Clave) {
        this.Clave = Clave;
    }

        
    @Override
    public String toString(){
        return super.toString()+this.getTipoAcceso();
    }
}

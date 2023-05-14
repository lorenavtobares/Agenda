
package negocio;


public class Cliente {
    private int dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    private String telefono; 
    public boolean getApellido;

    public Cliente() { 
    }

    public Cliente(int dni, String nombre, String apellido, String ciudad, String direccion, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   

    @Override
    public String toString() {
        return "Cliente{" + "dni: " + dni + ", nombre: " + nombre + ", apellido: " + apellido + ", ciudad: " + ciudad + ", direccion: " + direccion + ", telefono: " + telefono + '}';
    }
    
    
    
    
    
}

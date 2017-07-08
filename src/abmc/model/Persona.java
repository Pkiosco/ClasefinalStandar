package abmc.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author daro
 */
public class Persona {
    
    private Integer id;
    private StringProperty nombre;
    private StringProperty apellido;
    private StringProperty direccion;
    private StringProperty telefono;
    private StringProperty celular;
    private StringProperty email;

    public Persona(Integer id, String nombre, String apellido, String direccion, String telefono, String celular, String email) {
        this.id = id;
        this.nombre = new SimpleStringProperty(nombre);
        this.apellido = new SimpleStringProperty(apellido);
        this.direccion = new SimpleStringProperty(direccion);
        this.telefono = new SimpleStringProperty(telefono);
        this.celular = new SimpleStringProperty(celular);
        this.email = new SimpleStringProperty(email);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getNombre() {
        return nombre.get();
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getApellido() {
        return apellido.get();
    }

    public void setApellido(String apellido) {
        this.apellido.set(apellido);
    }

    public String getDireccion() {
        return direccion.get();
    }

    public void setDireccion(String direccion) {
        this.direccion.set(direccion);
    }

    public String getTelefono() {
        return telefono.get();
    }

    public void setTelefono(String telefono) {
        this.telefono.set(telefono);
    }

    public String getCelular() {
        return celular.get();
    }

    public void setCelular(String celular) {
        this.celular.set(celular);
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }
    
    public StringProperty nombre() {
        return nombre;
    }
    
    public StringProperty apellido() {
        return apellido;
    }
}

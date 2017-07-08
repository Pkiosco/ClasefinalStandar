/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abmc.dao;

import abmc.model.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author educacionit
 */
public class PersonaDao {

    private Connection connection;
    
    public PersonaDao() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost/ambc", "root", "");
    }
    
    public List<Persona> getAll() throws SQLException {
        // Arma la consulta y la ejecuta
        String laConsulta = "SELECT * FROM personas";
        List<Persona> personas;
        
        try (Statement stmtConsulta = connection.createStatement()) {
            ResultSet rs = stmtConsulta.executeQuery(laConsulta);
            // Informa la insercion a realizar
            System.out.println(">>SQL: " + laConsulta);
            // Construye la coleccion de autos
            personas = new ArrayList<>();
            // Muestra los datos
            while (rs.next()) {
                // Arma el objeto auto con los datos de la consulta
                Persona  p = new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("direccion"),
                        rs.getString("telefono"), rs.getString("celular"), rs.getString("email"));
                
                // Agrega el auto a la coleccion
                personas.add(p);
            }
            // Cierra el Statement
        }

        // Retorna la coleccion
        return personas;

    }
    
    public void add(Persona persona)throws SQLException  {
    PreparedStatement ps =  connection.prepareStatement("insert into Personas (nombre, Apellido,direccion,telefono, Celular, email) VALUES (?,?,?,?,?,?)");
    ps.setString(1, persona.getNombre());
    ps.setString(2, persona.getApellido());
    ps.setString(3, persona.getDireccion());
    ps.setString(4, persona.getTelefono());
    ps.setString(5, persona.getCelular());
    ps.setString(6, persona.getEmail());
    
    ps.execute();         
    }

    public void update(Persona persona)throws SQLException  {
    PreparedStatement psu =  connection.prepareStatement("update clientes set "
    + "id = ?, nombre = ?, apellido = ? ,direccion = ? , telefono  = ? , celular  = ? , email =? ");
    psu.setInt(1, persona.getId());
    psu.setString(2, persona.getNombre());
    psu.setString(3, persona.getApellido());
    psu.setString(4, persona.getDireccion());
    psu.setString(5, persona.getCelular());
    psu.setString(6, persona.getEmail());
    
    psu.execute(); 
    }

    public void delete(int id)throws SQLException  {
    PreparedStatement psD =  connection.prepareStatement("Delete from clientes where id = ?");   
    psD.setInt(1, id);
    }    
}

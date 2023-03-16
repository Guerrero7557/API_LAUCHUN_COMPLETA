package pe.idat.edu.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="EmpleadoEntity")
@Table(name="empleado")
public class EmpleadoEntity implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="idempleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idempleado;
    
    @ManyToOne
    @JoinColumn(name="idcredenciales",nullable= false )
    private CredencialesEntity idcredenciales;
    
    @ManyToOne
    @JoinColumn(name="idrol",nullable= false )
    private RolEntity idrol;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="apellidos")
    private String apellidos;
    
    @Column(name="sexo")
    private String sexo;
    
    @Column(name="email")
    private String email;
    
    @Column(name="dni")
    private String dni;
    
    @Column(name="direccion")
    private String direccion;
    
    @Column(name="estado")
    private boolean estado;
    
}
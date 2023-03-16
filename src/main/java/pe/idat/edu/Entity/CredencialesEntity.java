
package pe.idat.edu.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="CredencialesEntity")
@Table(name="credenciales")
public class CredencialesEntity implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @Column(name="idcredenciales")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcredenciales;
    
    @Column(name="usuario")
    private String usuario;
    
    @Column(name="password")
    private String password;
}

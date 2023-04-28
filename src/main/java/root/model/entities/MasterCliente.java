/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package root.model.entities;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 *
 * @author micke
 */
@Entity
@Table(name = "master_clientes")
@NamedQueries({
  @NamedQuery(name = "MasterCliente.findAll", query = "SELECT m FROM MasterCliente m"),
  @NamedQuery(name = "MasterCliente.findByCliIdentificacion", query = "SELECT m FROM MasterCliente m WHERE m.cliIdentificacion = :cliIdentificacion"),
  @NamedQuery(name = "MasterCliente.findByCliNombres", query = "SELECT m FROM MasterCliente m WHERE m.cliNombres = :cliNombres"),
  @NamedQuery(name = "MasterCliente.findByCliApellido1", query = "SELECT m FROM MasterCliente m WHERE m.cliApellido1 = :cliApellido1"),
  @NamedQuery(name = "MasterCliente.findByCliApellido2", query = "SELECT m FROM MasterCliente m WHERE m.cliApellido2 = :cliApellido2"),
  @NamedQuery(name = "MasterCliente.findByCliFechaNac", query = "SELECT m FROM MasterCliente m WHERE m.cliFechaNac = :cliFechaNac"),
  @NamedQuery(name = "MasterCliente.findByCliCorreo", query = "SELECT m FROM MasterCliente m WHERE m.cliCorreo = :cliCorreo")})
public class MasterCliente implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @Basic(optional = false)
  @Column(name = "cli_identificacion")
  private String cliIdentificacion;
  @Column(name = "cli_nombres")
  private String cliNombres;
  @Column(name = "cli_apellido1")
  private String cliApellido1;
  @Column(name = "cli_apellido2")
  private String cliApellido2;
  @Column(name = "cli_fecha_nac")
  @Temporal(TemporalType.DATE)
  private Date cliFechaNac;
  @Column(name = "cli_correo")
  private String cliCorreo;

  public MasterCliente() {
  }

  public MasterCliente(String cliIdentificacion) {
    this.cliIdentificacion = cliIdentificacion;
  }

  public String getCliIdentificacion() {
    return cliIdentificacion;
  }

  public void setCliIdentificacion(String cliIdentificacion) {
    this.cliIdentificacion = cliIdentificacion;
  }

  public String getCliNombres() {
    return cliNombres;
  }

  public void setCliNombres(String cliNombres) {
    this.cliNombres = cliNombres;
  }

  public String getCliApellido1() {
    return cliApellido1;
  }

  public void setCliApellido1(String cliApellido1) {
    this.cliApellido1 = cliApellido1;
  }

  public String getCliApellido2() {
    return cliApellido2;
  }

  public void setCliApellido2(String cliApellido2) {
    this.cliApellido2 = cliApellido2;
  }

  public Date getCliFechaNac() {
    return cliFechaNac;
  }

  public void setCliFechaNac(Date cliFechaNac) {
    this.cliFechaNac = cliFechaNac;
  }

  public String getCliCorreo() {
    return cliCorreo;
  }

  public void setCliCorreo(String cliCorreo) {
    this.cliCorreo = cliCorreo;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (cliIdentificacion != null ? cliIdentificacion.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof MasterCliente)) {
      return false;
    }
    MasterCliente other = (MasterCliente) object;
    if ((this.cliIdentificacion == null && other.cliIdentificacion != null) || (this.cliIdentificacion != null && !this.cliIdentificacion.equals(other.cliIdentificacion))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "root.model.entities.MasterCliente[ cliIdentificacion=" + cliIdentificacion + " ]";
  }
  
}

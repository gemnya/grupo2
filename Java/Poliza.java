package com.globallogic.curso;

import java.io.Serializable;

import java.util.Date;

import java.util.Calendar;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries( { @NamedQuery(name = "Poliza.findAll",
                             query = "select o from Poliza o") })
public class Poliza implements Serializable {

    @Column(name = "ESTADO_POLIZA", length = 10)
    private String estadoPoliza;
    
    @Column(name = "FECHA_CONTRATACION")
    @Temporal(value= TemporalType.DATE)
    private Date fechaContratacion;
    
    @Column(name = "FECHA_VALIDEZ")
        @Temporal(value= TemporalType.DATE)
    private Date fechaValidez;
    
    @Column(name = "ID_AUTOMOVIL", nullable = false)
    private Long idAutomovil;
    
    @Column(name = "ID_CLIENTE", nullable = false)
    private Long idCliente;
    
    @Column(name = "ID_PLAN", nullable = false)
    private Long idPlan;

    @Id
    @GeneratedValue(generator = "polizaSeq")
    @SequenceGenerator(name = "polizaSeq", sequenceName = "poliza_seq",allocationSize = 1)
    @Column(name = "ID_POLIZA", nullable = false)
    private Long idPoliza;
    
    @Column(name = "ID_PRODUCTOR", nullable = false)
    private Long idProductor;

    @Column(name = "PREMIO", nullable = false)
    private Long premio;
    
    @Column(name = "PRIMA", nullable = false)
    private Long prima;

    @Column(name = "SUMA_ASEGURADA")
    private Long sumaAsegurada;

    public Poliza() {
    }

    public Poliza(String estadoPoliza, Date fechaContratacion,
                  Date fechaValidez, Long idAutomovil, Long idCliente,
                  Long idPlan, Long idPoliza, Long idProductor, Long premio,
                  Long prima, Long sumaAsegurada) {
        this.estadoPoliza = estadoPoliza;
        this.fechaContratacion = fechaContratacion;
        this.fechaValidez = fechaValidez;
        this.idAutomovil = idAutomovil;
        this.idCliente = idCliente;
        this.idPlan = idPlan;
        this.idPoliza = idPoliza;
        this.idProductor = idProductor;
        this.premio = premio;
        this.prima = prima;
        this.sumaAsegurada = sumaAsegurada;
    }

    public String getEstadoPoliza() {
        return estadoPoliza;
    }

    public void setEstadoPoliza(String estadoPoliza) {
        this.estadoPoliza = estadoPoliza;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Date getFechaValidez() {
        return fechaValidez;
    }

    public void setFechaValidez(Date fechaValidez) {
        this.fechaValidez = fechaValidez;
    }

    public Long getIdAutomovil() {
        return idAutomovil;
    }

    public void setIdAutomovil(Long idAutomovil) {
        this.idAutomovil = idAutomovil;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Long idPlan) {
        this.idPlan = idPlan;
    }

    public Long getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(Long idPoliza) {
        this.idPoliza = idPoliza;
    }

    public Long getIdProductor() {
        return idProductor;
    }

    public void setIdProductor(Long idProductor) {
        this.idProductor = idProductor;
    }

    public Long getPremio() {
        return premio;
    }

    public void setPremio(Long premio) {
        this.premio = premio;
    }

    public Long getPrima() {
        return prima;
    }

    public void setPrima(Long prima) {
        this.prima = prima;
    }

    public Long getSumaAsegurada() {
        return sumaAsegurada;
    }

    public void setSumaAsegurada(Long sumaAsegurada) {
        this.sumaAsegurada = sumaAsegurada;
    }
}

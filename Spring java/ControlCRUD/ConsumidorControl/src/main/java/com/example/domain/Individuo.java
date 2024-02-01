package com.example.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.Data;

@Data 
@Entity
@Table(name= "individuo")//No es obligatoria
public class Individuo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_individuo;
    
    @NotEmpty //Valida cadena vacia
    private String nombre;
    
    @NotEmpty
    private String apellido;
    
    private String telefono;
    
    @NotEmpty
    @Email
    private String correo;
    
    @NotEmpty
    private String edad;

}

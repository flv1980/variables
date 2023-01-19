package com.miempresa.miapp.clases;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Lombok {
    public String nombre;
    public String apellido;
    public Integer edad;
    public Date fechaNacimiento;
    public String genero;
}

package com.miempresa.miapp.colecciones;

public class Cliente {
    public String cliente;
    public String direccion;
    public Integer telefono;
    public String email;
    public Cliente() {
        this.cliente = "";
        this.direccion = "";
        this.telefono = 0;
        this.email = "";
    }
    public Cliente(String clinete, String direccion, Integer telefono, String email) {
        this.cliente = clinete;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "clinete='" + cliente + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

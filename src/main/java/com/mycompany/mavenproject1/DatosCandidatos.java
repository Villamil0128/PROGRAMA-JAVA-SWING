/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author villamil
 */
public class DatosCandidatos {
    private String Edad;
    private String Experiencia;
    
    
    //Se almacena la edad
    public void setEdad(String NuevaEdad){
        this.Edad=NuevaEdad;
    }
    //Se almacena la Experiencia
    public void setExperiencia(String NuevaExperiencia){
        this.Experiencia=NuevaExperiencia;
    }
    
    //Se obtiene la edad
    public String getEdad(){
            return Edad;
    }
    
    public String getExperiencia(){
        return Experiencia;
    }
    
}

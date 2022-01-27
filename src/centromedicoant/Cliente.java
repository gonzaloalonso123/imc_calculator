/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centromedicoant;

public class Cliente {
    
    private String nombre;
    private String genero;
    private String grupo;
    private String fechaHora;
    private double peso;
    private double altura;
    private double IMC;
    private String estado;
    
    public Cliente(String nombre, String genero, String grupo, String fechaHora, double peso, double altura, double IMC, String estado)
    {  
        this.nombre = nombre;
        this.genero = genero;
        this.grupo = grupo;
        this.fechaHora = fechaHora;
        this.peso = peso;
        this.altura = altura;
        this.IMC = IMC;
        this.estado = estado;
    }   
    public String[] darStringArray()
    {
        String [] strings = new String[8];
        
        strings[0] = this.nombre;
        strings[1] = this.genero;
        strings[2] = this.grupo;
        strings[3] = this.fechaHora;
        strings[4] = "" + this.peso;
        strings[5] = "" + this.altura;
        strings[6] = "" + this.IMC;
        strings[7] = this.estado;
        
        return strings;
    }
}
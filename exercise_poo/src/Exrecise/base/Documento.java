/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exrecise.base;




import java.util.List;


public class Documento {
  private String codigo;
  private String descripcion;
  private String tipo;
  private Tarea tarea;
  private List<Version> listaDeVersiones;
  
public Documento(){
    
}
public Documento(String codigo, String descrip){
    this.codigo=codigo;
    this.descripcion=descrip;
}
  
}
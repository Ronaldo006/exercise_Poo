/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exrecise.base;



import java.util.Date;
import java.util.List;

public class Tarea {
   private String descripcion;
   private String tipo;
   private Date fechaInicioEstimado;
   private Date fechaInicioReal;
   private int duracionEstimada;
   private int duracionReal;
   private List<Empleado> listaDeEmpleados;
   private Proyecto proyecto;
   private List<Documento> listaDeDocumentos; 
   
   public Tarea(){
   
   }
   public Tarea(String d, String t){
   descripcion = d;
   tipo= t;
   }
}
package tiendadeportiva;

import java.util.Scanner;

/**
 *
 * @author familiachea
 */
public class Camiseta {
    Scanner sc=new Scanner(System.in);
    private int cE;
    private String categoriaEquipo;
    private int numero;
    private double precio;
    private double subtotal=0;
    private double cA=7.50;    
    
    private Camiseta(String categoriaEquipo,int numero, double precio,double subtotal){
        this.categoriaEquipo=categoriaEquipo;
        this.numero=numero;
        this.precio=precio;
        this.subtotal=subtotal;
    }
    public Camiseta(){
    this.categoriaEquipo="";
    this.numero=0;
    this.precio=0;
    this.subtotal=0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    public String getCategoriaEquipo() {
        return categoriaEquipo;
    }

    public void setCategoriaEquipo(String categoriaEquipo) {
        this.categoriaEquipo = categoriaEquipo;
    }

    
    public void IngresoDatos(){
          System.out.println("ELIJA LA CATEGORIA DE EQUIPO: ");
        cE=sc.nextInt();
        
        
            switch(cE){
                case 1:{
                    this.subtotal=(cA*0.10);
                    this.setSubtotal(subtotal);
                    System.out.println("Camiseta de categoria A" );
                    this.setCategoriaEquipo("Categoria A");
                    
                    break;
                } 
                case 2:{
                    this.subtotal=(cA*0.05);
                    this.setSubtotal(subtotal);
                    System.out.println("Camiseta de categoria B" );
                    this.setCategoriaEquipo("Categoria B");
                    
                    break;
                }
                case 3:{
                    if(this.numero==10||this.numero==7){
                    this.subtotal=(cA)+5;
                    this.setSubtotal(subtotal);
                    System.out.println("Camiseta de categoria C" );
                    this.setCategoriaEquipo("Categoria C");
                    }else{
                        
                    }
                    break;
                }
                default:
                    System.out.println("ESCOJA UNA OPCION VALIDA");
                    this.IngresoDatos();
                break;
               }
            }
    
    
    public void CalcularPrecT(){
        precio=(this.getSubtotal()+(cA));
        System.out.println("EL TOTAL DE LA VENTAS ES: " +precio );
        
    }
    
    public void MostrarDatos(){
        System.out.println("\nNUMERO DE CAMISETA: " + this.getNumero());
        System.out.println("CATEGORIA DE EQUIPO: "+this.getCategoriaEquipo());
        System.out.println("EL PRECIO TOTAL DE LA CAMISETA ES: "+ precio);
    }
    }

        
        
   


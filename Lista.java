package Enunciado1;
public class Lista {
    private Nodo inicio;
    private int tamaño;

    public Lista() {
        inicio=null;
        tamaño=0;
    }
    
    public boolean esVacia(){
        return inicio==null;
    }
   
    public void agregarInicio(String name){
        Nodo nuevo= new Nodo();
        nuevo.setValor(name);
        if(esVacia()){//inicio==null
            inicio=nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
        }
        tamaño++;
    }
    

        
    public void listar(){
        if(!esVacia()){
            Nodo aux=inicio;
            int i=0;
            while(aux!=null){
                System.out.print("[ " +aux.getValor()+ " ]"+" -> ");
                aux=aux.getSiguiente();
            }
        }else{
            System.out.println("La lista esta vacia....");
        }
    }
    
    
    /**
     * Elimina la lista
     */
    public void eliminar(){
        // Elimina el valor y la referencia a los demas nodos.
        inicio = null;
        // Reinicia el contador de tamaño de la lista a 0.
        tamaño = 0;
    }
    
    
    
}

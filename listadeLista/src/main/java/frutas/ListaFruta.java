package frutas;

import java.util.ArrayList;
import java.util.List;

public class ListaFruta {
    private List<String> frutas = new ArrayList();
    
    public ListaFruta(){
    
    }
    
    public void setListaFruta(String fruta){
        this.frutas.add(fruta);
    }
    
    public String buscarFruta(String pesquisa){
        Boolean achou = false;
        for(int i = 0;i < this.frutas.size();i++){
            if(this.frutas.get(i).equals(pesquisa)){
                achou = true;
            }
        }
        if(achou){
            return "A fruta "+pesquisa+" esta na lista";
        }
        return "Fruta "+pesquisa+" não esta na lista";
    }
   
}

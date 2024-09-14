import java.util.ArrayList;
/**Fraccionar billetes
     Tenemos los Cortes: 20,10,7,5,3,2,1
     no se puede fraccionar asi:
     fracionar 10: 5,5 ERROR
     solo una vez usar cada corte*/ 
public class FraccionarDinero{
    /** help es una posibilidad del fraccionar un billete
     *  ans es la respuesta de TODOS los helps*/ 
    public ArrayList<ArrayList<Integer>> fraccionar(int [] lista, int money){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> help = new ArrayList<Integer>();
        fraccionar(lista,0,0,money,ans,help); 
        return ans;
    }
    
    public void fraccionar(int [] lista, int pos, int sumaAct, int money, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> help){
        //help guarda una solucion para fraccionar
        //ans es una lista de listas, guarda todos los helps
        if(pos >= lista.length){ // ya recorrimos todo un posible camino
            //&& help.size() es para que se cumpla la condicion de fraccionar 10 ejemplo: fracionar 10: 5,5 ERROR 
            if(sumaAct == money && help.size() > 1 ){
                ans.add(help);
            }
            return;
        }
        //                                                 MANDAR HELP
        fraccionar(lista, pos+1, sumaAct, money, ans, new ArrayList<>(help));
        help.add(lista[pos]);
        fraccionar(lista, pos+1, sumaAct+lista[pos], money, ans, new ArrayList<>(help));
        help.remove(help.size() - 1);
        return;
    }
}



























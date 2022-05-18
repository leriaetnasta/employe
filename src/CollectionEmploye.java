import java.util.*;

public class CollectionEmploye {
    public static List<Employe> listeEmploye= new ArrayList<>();
    public static SortedMap<Integer, Employe> mapEmploye= new TreeMap<Integer, Employe>();
    public static void ajouterEmployeList(Employe employe){
        listeEmploye.add(employe);
    }
    public static boolean supprimerEmployeListe(int matricule){
        for (Employe emp: listeEmploye
             ) {
            if(emp.getMatricule()==matricule)
                return listeEmploye.remove(emp);

        }
        return false;
    }
    public static Employe renvoyerEmployeListe(int matricule){
        for (Employe emp: listeEmploye
        ) {
            if(emp.getMatricule()==matricule)
                return emp;

        }
        return null;
    }
    public void afficherEmployeListe(){
        Iterator<Employe> it= listeEmploye.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
    public  static void ajouterEmployeMap(Employe employe){
        mapEmploye.put(employe.getMatricule(),employe);
    }
    public static boolean supprimerEmployeMap(int matricule){
        return mapEmploye.remove(matricule)!=null;
    }
    public static Employe renvoyerPremierEmploye(){
        return mapEmploye.get(mapEmploye.firstKey());
    }
    public void afficherMatriculeEmployeMap(){
        Set<Map.Entry<Integer,Employe>> set= mapEmploye.entrySet();
        Iterator<Map.Entry<Integer, Employe>> it= set.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getKey()+ it.next().getValue().toString());
        }
    }



}

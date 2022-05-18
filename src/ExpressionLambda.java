import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ExpressionLambda {
    private static List<Employe> listEmp= Arrays.asList(
            new Employe("loubna", "talha", 2345, 99999, Employe.Departement.INFORMATIQUE),
            new Employe("loubna", "talha", 2345, 99999, Employe.Departement.ACHAT),
            new Employe("loubna", "talha", 2345, 99999, Employe.Departement.COMMERCIAL),
            new Employe("loubna", "talha", 2345, 99999, Employe.Departement.RH)
    );
   /* public static List<Employe> filtrerEmploye(Predicate<Employe> predicate){
        List<Employe> nouvelleliste= new ArrayList<Employe>();
        listEmp.forEach( employe -> if(predicate.test(employe) nouvelleliste.add(employe);
        );

    }*/

    public static void main(String[] args) {
        Comparator<Employe> comp= new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getMatricule()-o2.getMatricule();
            }
        };
        Comparator<Employe> comparator= (e1,e2)-> e1.getMatricule()-e2.getMatricule();
        listEmp.forEach(System.out::println);
        listEmp.forEach(emp-> System.out.println(emp.toString()));
        //List<Employe> empyersalairesup2000

    }
}

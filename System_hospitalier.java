package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {

    private List<Requête> listRequetes;

    public System_hospitalier(List<Requête> listRequetes) {
        super();
        this.listRequetes = listRequetes;
    }

    public System_hospitalier() {
        super();
        listRequetes = new ArrayList<>();
    }

    public List<Requête> getListRequetes() {
        return listRequetes;
    }

    public void setListRequetes(List<Requête> listRequetes) {
        this.listRequetes = listRequetes;
    }

    public void recevoirRequete(Requête requete) {
        listRequetes.add(requete);
        String analyse =  analyserRequete(requete);
        String comparaisonDonnees = comparerDonnes();
        System.out.println(analyse);
        System.out.println(comparaisonDonnees);
    }

    private String analyserRequete(Requête requête) {    /*La méthode privée analyserRequete(Requête requête) prend une requête de type 
							Requête en paramètre
        						et retourne "requête analysée" de type String.*/
        return "requête analysée";
    }

    private String comparerDonnes() {		/*La méthode privée comparerDonnes() retourne "Cluster trouvé" de type String. 
						Celle-ci ne prend pas de paramètres.*/
        					
        return "Cluster trouvé";
    }

}

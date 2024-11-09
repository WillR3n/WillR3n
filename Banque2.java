

class Banque2{
    public static void main(String[] args) {
        // Créer les comptes pour le premier client
        Compte comptePrivePedro = new Compte(1000.0, 0.01);
        Compte compteEpargnePedro = new Compte(2000.0, 0.02);
        Client pedro = new Client("Pedro", "Geneve", comptePrivePedro, compteEpargnePedro);

        // Créer les comptes pour le deuxième client
        Compte comptePriveAlexandra = new Compte(3000.0, 0.01);
        Compte compteEpargneAlexandra = new Compte(4000.0, 0.02);
        Client alexandra = new Client("Alexandra", "Lausanne", comptePriveAlexandra, compteEpargneAlexandra);

        // Afficher les données des clients
        pedro.afficherClient();
        alexandra.afficherClient();

        // Boucler les comptes des clients
        pedro.bouclerComptes();
        alexandra.bouclerComptes();

        // Afficher les données des clients après bouclement
        pedro.afficherClient();
        alexandra.afficherClient();
    }
} 

class Client {
    private String nom;
    private String ville;
    private Compte comptePrive;
    private Compte compteEpargne;

    public Client(String nom, String ville, Compte comptePrive, Compte compteEpargne) {
        this.nom = nom;
        this.ville = ville;
        this.comptePrive = comptePrive;
        this.compteEpargne = compteEpargne;
    }

    public void afficherClient() {
        System.out.println("Client " + nom + " de " + ville);
        System.out.println(" Compte privé: " + comptePrive.getSolde() + " francs");
        System.out.println(" Compte d'épargne: " + compteEpargne.getSolde() + " francs");
    }

    public void bouclerComptes() {
        comptePrive.bouclerCompte();
        compteEpargne.bouclerCompte();
    }
}

class Compte {
    private double solde;
    private double taux;

    public Compte(double solde, double taux) {
        this.solde = solde;
        this.taux = taux;
    }

    public double getSolde() {
        return solde;
    }

    public void bouclerCompte() {
        double interets = taux * solde;
        solde += interets;
    }
}
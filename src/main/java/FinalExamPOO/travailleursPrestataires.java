package FinalExamPOO;

import java.time.LocalDate;

public class travailleursPrestataires extends travailleurs {
    private double TJM;

    public void TJM(int id, String nom, String prenom, String email, String telephone, double tjm) {
        this.TJM = tjm;
    }

    public travailleursPrestataires(int id, String nom, String prenom, String email, String telephone, double tjm) {
        super(id, nom, prenom, email, telephone);
        TJM = tjm;
    }

    public double calculerSalaire(LocalDate debut, LocalDate fin) {
        long jours = dateTravail(debut, fin);
        return jours * TJM;
    }

    private long dateTravail(LocalDate debut, LocalDate fin) {
            return 0;
    }

}

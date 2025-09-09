package FinalExamPOO;

public class travailleursSalariés extends travailleurs {
        private final double salaireMensuel;

        public travailleursSalariés(int id, String nom, String prenom, String email, String telephone, double salaireMensuel) {
            super(id, nom, prenom, email, telephone);
            this.salaireMensuel = salaireMensuel;
        }

        public double calculerSalaire(LocalDate debut, LocalDate fin) {
            long mois = ChronoUnit.MONTHS.between(debut.withDayOfMonth(1), fin.withDayOfMonth(1)) + 1;
            return salaireMensuel * mois;
        }
    }

void main() {
}

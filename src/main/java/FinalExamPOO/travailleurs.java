package FinalExamPOO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString

public abstract class travailleurs {
    private final int id;
    private final String nom;
    private final String prenom;
    private final String email;
    private final String telephone;
    private final List<Promotions> promotions = new ArrayList<>();
    private final List<Pointage> pointages = new ArrayList<>();

    public travailleurs(int id, String nom, String prenom, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }

    public void ajouterPromotion(Promotions promotion) {
        promotions.add(promotion);
    }

    public void ajouterPointage(Pointage pointage) {
        pointages.add(pointage);
    }

}

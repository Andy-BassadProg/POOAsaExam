package FinalExamPOO;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor

public class Pointage {
    public enum type {ENSEIGNEMENT, ADMINISTRATION, COMMUNICATION,RD, ABS_PAYÉE, ABS_NON_PAYÉE};

    private final LocalDate date;;
    private final type travail;
    private final double temps;
    private final String description;

}

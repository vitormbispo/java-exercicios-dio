package excollections.ex6;

public class ExerciciosCollections6 {
    public static void RodarExercicio() {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Vitor",12345);
        convidados.adicionarConvidado("Vitória",12345);
        convidados.adicionarConvidado("Samira",32515);
        convidados.adicionarConvidado("Heitor",12341);
        convidados.adicionarConvidado("Leonardo",124321);
        convidados.adicionarConvidado("Pedro",12345);

        convidados.exibirCandidatos();
    }

}

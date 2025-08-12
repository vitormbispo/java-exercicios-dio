package excollections.ex1;

public class ExerciciosCollections1 {
    public static void RodarExercicio() {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Varrer a casa");
        listaTarefas.adicionarTarefa("Lavar a louça");
        listaTarefas.adicionarTarefa("Tirar o frango do freezer");
        listaTarefas.adicionarTarefa("Jogar o lixo fora");

        System.out.println("Tamanho da lista: " + listaTarefas.obterNumeroTotalTarefas());
        System.out.println("Tarefas: " + listaTarefas.obterDescricoesTarefas());
    }
}

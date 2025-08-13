package excollections.ex7;

public class ExerciciosCollections7 {
    public static void RodarExercicio() {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Vitor Bispo","(44)98819-7304");
        agenda.adicionarContato("Vitor Hugo","(12)98092-8294");
        agenda.adicionarContato("Vitor Santos","(79)2138-7460");
        agenda.adicionarContato("Camila","(32)9459-4589");
        agenda.adicionarContato("Camila","(43)99922-1243");
        agenda.adicionarContato("Camila","(22)93219-4549");
        agenda.adicionarContato("Kelvyn","(14)92052-1293");
        agenda.adicionarContato("Laura","(11)90129-9532");
        agenda.adicionarContato("Luiz","(25)92139-5921");
        agenda.adicionarContato("Gustavo","(16)90498-2569");
        agenda.adicionarContato("Sophia","(67)91245-4832");

        agenda.exibirContatos();
        System.out.println("\nPesquisando por \"Vitor\"...\n");
        for(Contato c : agenda.pesquisarContato("Vitor")) System.out.println(c.getNome());
        System.out.println();
        agenda.atualizarContato("Vitor Bispo","(44)99873-2308");
        agenda.removerContato("Sophia");
        agenda.removerContato("Gustavo");
        agenda.exibirContatos();

    }
}

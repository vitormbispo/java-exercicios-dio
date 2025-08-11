package exclasses.ex3;

public class PetShop {
    private Pet petAtual;
    private float agua;
    private float shampoo;
    private boolean maquinaLimpa;

    public PetShop() {
        agua = 0;
        shampoo = 0;
        maquinaLimpa = true;
    }
    public void abastecerAgua(float quantia) {
        if (quantia > 2) {
            agua += 2;
            System.out.println("-> O abastecimento só suporta 2 litros por vez. Abastecido 2 litros de água.");
        }
        else {
            agua += quantia;
            System.out.println("-> Água abastecida.");
        }

        float AGUA_MAXIMA = 30.0f;
        if(agua > AGUA_MAXIMA) {
            System.out.println("-> Capacidade máxima atingida!");
            agua = AGUA_MAXIMA;
        }
    }
    public void abastecerShampoo(float quantia) {
        if (quantia > 2) {
            shampoo += 2;
            System.out.println("-> O abastecimento só suporta 2 litros por vez. Abastecido 2 litros de shampoo.");
        }
        else {
            shampoo += quantia;
            System.out.println("-> Shampoo abastecido.");
        }

        float SHAMPOO_MAXIMO = 10.0f;
        if(shampoo > SHAMPOO_MAXIMO) {
            System.out.println("-> Capacidade máxima atingida!");
            shampoo = SHAMPOO_MAXIMO;
        }
    }

    public float verificarNivelAgua() {
        return agua;
    }
    public float verificarNivelShampoo() {
        return shampoo;
    }
    public boolean petNoBanho() {
        return petAtual != null;
    }

    public void colocarPetMaquina(Pet pet) {
        if(!maquinaLimpa) {System.out.println("A máquina está suja! Limpe-a primeiro!"); return;}
        if(petAtual != null) {System.out.println("A máquina já está ocupada!"); return;}
        petAtual = pet;
        System.out.println("-> Pet colocado na máquina");
    }
    public void tirarPetMaquina() {
        if(petAtual == null) {System.out.println("Não tem pet na máquina!");return;}
        if(!petAtual.getLimpo()) {
            maquinaLimpa = false;
            System.out.println("O pet removido ainda estava sujo! A máquina ficou suja...");
        }
        petAtual = null;
        System.out.println("-> Pet removido da máquina");
    }
    public void limparMaquina() {
        if(maquinaLimpa) {System.out.println("A máquina já está limpa!"); return;}
        if(petAtual != null) {System.out.println("A máquina está ocupada!.");return;}
        if(agua < 3 || shampoo < 1) {System.out.println("A máquina não tem os materiais necessários! Abasteça com pelo menos 3 litros de água e 1 litro de shampoo.");return;}

        maquinaLimpa = true;
        agua -= 3;
        shampoo -=1;
        System.out.println("-> A máquina foi limpa!\n");
    }
    public void darBanho() {
        if(petAtual == null) {System.out.println("Não tem pet na máquina! Coloque o pet na máquina para dar banho.");return;}
        if(agua < 10 || shampoo < 2) {System.out.println("A máquina não tem os materiais necessários! Abasteça com pelo menos 10 litros de água e 2 litros de shampoo.");return;}
        petAtual.setLimpo(true);
        maquinaLimpa = true;
        System.out.println("-> Banho finalizado! O pet está limpo.");
    }
}

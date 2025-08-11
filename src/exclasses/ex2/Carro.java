package exclasses.ex2;

import exclasses.ex2.exceptions.CarroDesligadoException;
import exclasses.ex2.exceptions.PontoNeutroException;
import exclasses.ex2.exceptions.PuloDeMarchasException;
import exclasses.ex2.exceptions.VelocidadeNaCurvaException;

public class Carro {
    private boolean ligado;
    private int marcha;
    private int velocidade;

    public Carro() {
        this.ligado = false;
        this.marcha = 0;
    }

    public boolean estaLigado() {
        return ligado;
    }
    public void ligar() {
        this.ligado = true;
        System.out.println("-> Carro ligado!");
    }
    public void desligar() {
        if(marcha == 0 && velocidade == 0) {
            this.ligado = false;
            System.out.println("-> Carro desligado.");
        }
        else {
            System.out.println("-> O carro deve estar em ponto neutro e parado para desligar!");
        }

    }
    public void acelerar() throws CarroDesligadoException, PontoNeutroException {
        if(!ligado) throw new CarroDesligadoException("-> O carro está desligado!");
        if(marcha == 0) throw new PontoNeutroException("-> O carro está no ponto neutro e não pode acelerar!");

        velocidade++;
        velocidade = velocidadeMarcha();
    }

    public void diminuirVelocidade() throws CarroDesligadoException{
        if(!ligado) throw new CarroDesligadoException("-> O carro está desligado!");

        velocidade--;
        velocidade = velocidadeMarcha();
    }

    private int velocidadeMarcha() {
        switch (marcha) {
            case 0 -> {return 0;}
            case 1 -> {
                if(velocidade < 0) return 0;
                else return Math.min(velocidade, 20);
            }
            case 2 -> {
                if(velocidade < 21) return 21;
                else return Math.min(velocidade, 40);
            }
            case 3 -> {
                if(velocidade < 41) return 41;
                else return Math.min(velocidade, 60);
            }
            case 4 -> {
                if(velocidade < 61) return 61;
                else return Math.min(velocidade, 80);
            }
            case 5 -> {
                if(velocidade < 81) return 81;
                else return Math.min(velocidade, 100);
            }
            case 6 -> {
                if(velocidade < 101) return 101;
                else return Math.min(velocidade, 120);
            }
        }
        return 0;
    }

    public void trocarMarcha(int proxMarcha) throws CarroDesligadoException, PuloDeMarchasException {
        if(!ligado) throw new CarroDesligadoException("-> O carro está desligado!");
        if(Math.abs(proxMarcha-marcha) > 1) throw new PuloDeMarchasException("-> Não é possível pular marchas! Aumente ou diminua apenas uma marcha por vez.");

        marcha = proxMarcha;
        velocidade = velocidadeMarcha();
    }

    public void virar(String direcao) throws VelocidadeNaCurvaException {
        if(!ligado) throw new CarroDesligadoException("-> O carro está desligado!");
        if(velocidade < 1 || velocidade > 40) throw new VelocidadeNaCurvaException("-> Você não está na velocidade ideal para virar! (1-40km/h)");
        System.out.printf("-> Virando à %s\n",direcao);
    }
    public void verificarVelocidade() {
        System.out.printf("-> Velocidade atual: %skm/h\n",velocidade);
    }
    public void verificarMarcha() {
        System.out.printf("-> Marcha atual: %s\n",marcha);
    }
}

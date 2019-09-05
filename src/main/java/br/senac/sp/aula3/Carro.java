package br.senac.sp.aula3;
/**
 * @author gabriel.max
 */
public class Carro {
    //Adicionando variáveis a classe Carro

    //Variáveis da Classe
    private static String fabricante = "Mercedes";
    private static int max_gasolina = 40;
    private int gasolina = 20;
    
    //Variáveis de instância
    private String[] Rodas;
    private String cor;
    private String modelo;
    private int velocidadeAtual;

    public Carro() {
    }
    
    public Carro(int maxGasolina) {
        this.max_gasolina = maxGasolina;
    }

    //Criando Getters e Setters
    public static String getFabricante() {
        return fabricante;
    }

    public static void setFabricante(String fabricante) {
        Carro.fabricante = fabricante;
    }

    public String[] getRodas() {
        return Rodas;
    }

    public void setRodas(String[] Rodas) {
        this.Rodas = Rodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public static int getMax_gasolina() {
        return max_gasolina;
    }

    public static void setMax_gasolina(int max_gasolina) {
        Carro.max_gasolina = max_gasolina;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }
    
    //Método para verificar as informações do objeto
    public String descreve() {
        String infos ="";
        
        String modeloCarro = getModelo();
        String corCarro = getCor();
        
        if(modeloCarro!=null){
            infos += "Um "+modeloCarro;
            if(corCarro!=null){
                infos += " na cor "+corCarro;
            }
        }else{
            infos = "Um carro";
        }
        
        return infos;
    }
    
    //Método para abastecer o carro
    public void abastecer(int litros){
        gasolina += litros;
        if(gasolina > max_gasolina)
            gasolina = max_gasolina;
    } 
}

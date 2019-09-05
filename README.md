# Aula3 - Introdução a Orientacao a Objetos com Java
Objetivo: Apresentar os conceitos básicos de Orientação a Objetos para viabilizar o uso de formulários e classes do projeto.

### Tarefa 1 - Projetar uma Classe 
1.1 Adicione à classe Carro, as seguintes propriedades:
* ***fabricante*** – _String_ – propriedade da ***CLASSE***
* ***rodas*** – Vetor de _String_ – propriedade da ***instância (OBJETO)***
* ***cor*** – _String_ – propriedade da ***instância (OBJETO)***
* ***modelo*** – _String_ – propriedade da ***instância (OBJETO)***
* ***velocidadeAtual*** – _Inteiro_ – propriedade da ***instância (OBJETO)***

1.2 Defina um ***construtor*** vazio para a classe:
<code>public Carro() {} </code>

1.3 Crie os métodos acessores (***_getters e setters_***) para cada propriedade. <br />
Dica: _Alt_ + _Ins_ no NetBeans
Ex:
```
//Retornar a cor do veiculo
public String getCor() {
        return cor;
}

//Definir a cor do veículo
public void setCor(String pCor) {
        this.cor = pCor;
}
```

1.4 Crie uma método "descreve".<br/>
Se o carro é um "Fiat Uno" "prata", esse método retorna<br/>
"Um Fiat Uno na cor prata" (respeitando maiúsculas e minúsculas)<br/>
<br/>
Se o carro é um "Corsa" sem cor definida, esse método retorna<br/>
"Um Corsa"<br/>
<br/>
Se o carro não tem o modelo definido, esse método retorna <br/>
"Um carro"<br/>

### Tarefa 2 - Instanciar Objetos
2.1 Na classe Main, instancie (crie) um objeto da classe Carro e defina na propriedade *"modelo"*, o nome de sua preferência. Ex:
```
   //Instancio o objeto da classe Carro
   Carro meuCarro = new Carro();
   meuCarro.setModelo("SeuModeloDeCarroFavorito");
```
2.2 Ainda na classe Main, instancie outro objeto da classe Carro e defina a cor e o modelo de sua preferência:
```
   //Instancio outro objeto da classe Carro
   Carro carroRodizio = new Carro();
   carroRodizio.setModelo(“SeuOutroModelo");
   carroRodizio.setCor(“SuaCorFavorita");
```
2.3 Na Main, exiba uma caixa de diálogo de mensagem com as informações do segundo carro:
<code>JOptionPane.showMessageDialog(null, carroRodizio.getModelo() + " - " + carroRodizio.getCor());</code>

### Tarefa 3 - Rodar testes
3.1 Na classe Main, método main, habilite a chamada das funções <code>testar_atributos</code> e <code>testar_descricao</code>. Elas vão te ajudar a se certificar que fez a tarefa 1 corretamente. No momento, essas chamadas estão comentadas, com duas barras. Basta retirar as barras que as chamadas passam a estar "valendo".<br>

Você também precisa habilitar as funções em si. Se você olhar na classe main,
temos o seguinte:<br>
```
/*
    public static void testar_atributos() {
        Carro carro1 =  new Carro();
        Carro carro2 =  new Carro();
        carro1.setModelo("Fiat Uno");
        assertEqual(carro1.getModelo(), "Fiat Uno");
        carro2.setModelo("Ford Escort");
        assertEqual(carro1.getModelo(), "Fiat Uno");
        assertEqual(carro2.getModelo(), "Ford Escort");
        carro2.setCor("prata");
        assertEqual(carro2.getCor(), "prata");
        System.out.println("Parabéns, o teste de atributos está correto!");  
    }
*/
```

Para usar essa função, você terá que remover os símbolos <code>/* </code> e <code>*/</code>, para que ela deixe de ser um comentário e se torne código.

Se algo não estiver funcionando, você pode usar o depurador ou o JOptionPane para ver os valores das variáveis!

### Tarefa 4 - Gasolina
4.1 Adicione ao carro dois atributos: <code>gasolina</code> e <code>max_gasolina</code>. <code>max_gasolina</code> deve iniciar com 40 e um carro novo deve iniciar com 20 de gasolina (faça isso no construtor) <br>

4.2 Adicione ao carro um método abastece que recebe um número inteiro de litros, e aumenta a gasolina. Porém, a gasolina não pode passar do valor max_gasolina: um carro com 39 litros no tanque, se for abastecido com 20 litros, fica com apenas 40 (se <code>max_gasolina</code> for 40, o que é verdade por enquanto)

4.3 Teste sua funcionalidade, habilitando as funções <code>testar_gasolina1</code> e <code>testar_gasolina2</code> no método main do arquivo Main.

### Tarefa 5 - Max gasolina
5.1 Crie no carro um segundo construtor. Esse segundo construtor recebe um inteiro, e usa esse inteiro para ser o valor de <code>max_gasolina</code>.<br>

5.2 Teste sua funcionalidade, habilitando <code>testar_max_gasolina</code>

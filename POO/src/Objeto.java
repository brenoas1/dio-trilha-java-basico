public class Objeto {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro();

        // Definindo os atributos do carro
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2022;

        // Chamando o método para exibir informações
        meuCarro.exibirInformacoes();
    }
}


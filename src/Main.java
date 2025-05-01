public class Main {

    public static void main(String[] args) {
        // Acessando a configuração global usando o padrão Singleton
        Configuracao config1 = Configuracao.getInstancia();
        Configuracao config2 = Configuracao.getInstancia();

        // Ambos devem apontar para a mesma instância
        System.out.println("Config 1 URL Base: " + config1.getUrlBase());
        System.out.println("Config 2 URL Base: " + config2.getUrlBase());

        // Modificando a configuração através de uma instância
        config1.setUrlBase("http://novoendereco.com");
        
        // Ambas as instâncias refletem a alteração
        System.out.println("Config 1 URL Base após alteração: " + config1.getUrlBase());
        System.out.println("Config 2 URL Base após alteração: " + config2.getUrlBase());

        // Verificando se as instâncias são a mesma
        System.out.println("As instâncias são iguais? " + (config1 == config2));
    }
}
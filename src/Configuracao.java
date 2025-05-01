public class Configuracao {

    // A instância única da classe
    private static Configuracao instancia;

    // Atributos de configuração (exemplo simples)
    private String urlBase;
    private int timeout;

    // Construtor privado para evitar instanciamento externo
    private Configuracao() {
        this.urlBase = "http://api.exemplo.com";
        this.timeout = 5000;  // 5 segundos
    }

    // Método público para acessar a instância única
    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    // Métodos para acessar as configurações
    public String getUrlBase() {
        return urlBase;
    }

    public int getTimeout() {
        return timeout;
    }

    // Métodos para modificar as configurações
    public void setUrlBase(String urlBase) {
        this.urlBase = urlBase;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
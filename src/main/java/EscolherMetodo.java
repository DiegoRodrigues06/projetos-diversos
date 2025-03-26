public class EscolherMetodo {
    public String escolherCategoria(int codigoProduto) {
        String categoria;
        switch (codigoProduto) {
            case 1:
                categoria = "eletrônicos";
                break;
            case 2:
                categoria = "alimento";
                break;
            default:
                categoria = "não encontrado";
        }
        return categoria;
    }
}

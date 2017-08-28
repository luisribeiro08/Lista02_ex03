/*
Desenvolva um programa para calcular o preço médio base do seguro anual de
um veículo com base nos dados de marca, modelo, ano, valor do modelo-ano na
tabela FIPE, alíquota ou porcentagem de valor do seguro do modelo, valor da
franquia, idade e estado civil do contratante do seguro. Outras variáveis para o
cálculo do seguro (bônus, tem garagem em casa, etc.) não serão
responsabilidade desse programa. Utilize uma classe de nome “Veiculo” e outra
de nome “Seguro” para implementar seu programa. O usuário deve informar
todos os dados cadastrais do veículo e do contratante do seguro, exceto o valor
da tabela FIPE e alíquota. Seu programa deve calcular o valor do seguro e
mostrar opções de pagamento da fatura do seguro: à vista ou parcelado em
boleto bancário, débito automático ou cartão de crédito.
 */

package lista02_ex03;
public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private Seguro seguro;
    
    public float valorAliquota(){
        return 2;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

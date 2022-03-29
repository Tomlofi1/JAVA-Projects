package projetovendas;

public class Pessoa {
    private String nome;  
    private String telefone;
    private int anoNascimento;
    private char sexo; //'f' para feminino, 'm' para masculino

// aqui comeca os codigos do nome

    public boolean setnome(String n) {
        nome = n;
        return true;

    }

    public String getnome(){ 
        return nome; 
    }

// aqui termina os codigos do nome

// aqui comeca os codigos da idade

    public boolean setanoNascimento(int i){
        if (i > 2000) {
            return false;    
        } else {
            anoNascimento = i;
            return true;            
        }
    }

    public int getanoNascimento() {
        return anoNascimento;
    }

// aqui termina os codigos da idade

// aqui comeca os codigos do sexo
    
    public boolean setSexo(char s) {
        if (s == 'f' || s == 'm') {
            sexo = s;
            return true;
        } else {
            return false;
        }
    }

    public char getSexo() {
        return sexo;
    }
// aqui termina os codigos do sexo

// aqui comeca os codigos do telefone

    public boolean setTelefone(String t){
        telefone = t;
        return true;
    }
    public String getTelefone(){
        return telefone;
    }



class Clientes {
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        this.ID = iD;
    }

class Funcionarios {
    private String Matricula;
    private String Salario;
    public String getMatricula() {
        return Matricula;
    }
    public String getSalario() {
        return Salario;
    }
    public void setSalario(String salario) {
        this.Salario = salario;
    }
    public void setMatricula(String matricula) {
        this.Matricula = matricula;
    }

class Produtos{
    private String Idprod;                  // fazendo o básico, adicionando os get e os set e criando as várivéis como privadas, n tem muito o que comentar em si nesse código, a partet mais chata que foi o começo ja se passou.
    private String Descricao;
    private String Preco;
    public String getIdprod() {
        return Idprod;
    }
    public String getPreco() {
        return Preco;
    }
    public String getDescricao(){
        return Descricao;
    }
    
    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }
    public void setIdprod(String idprod) {
        this.Idprod = idprod;
    }
    public void setPreco(String preco) {
        this.Preco = preco;
    }


class Fornecedores {
    private String Idforne;  // coloquei todos com Forne de fornecedores(obviamente), para ficar mais facil a leitura, e também por ser um costume meu de python.
    private String NomeForne;
    private String Fordescricao;
    private String Contato;
    private String TypeProd; //coloquei TypeProd, pq a questão pede "Tipos de produtos", então decidi colocar Type de tipo em inglês, e Prod de produtos.
   
    public String getIdforne() {
        return Idforne;
    }
    public String getTypeProd() {
        return TypeProd;
    }
    public void setTypeProd(String typeProd) {
        this.TypeProd = typeProd;
    }
    public String getContato() {
        return Contato;
    }
    public void setContato(String contato) {
        this.Contato = contato;
    }
    public String getFordescricao() {
        return Fordescricao;
    }
    public void setFordescricao(String fordescricao) {
        this.Fordescricao = fordescricao;
    }
    public String getNomeForne() {
        return NomeForne;
    }
    public void setNomeForne(String nomeForne) {
        this.NomeForne = nomeForne;
    }
    public void setIdforne(String idforne) {
        this.Idforne = idforne;
    }

class Vendas {
    private String Idvendas;
    private String Product;
    private String Valor;
    private String Total;
    public String getIdvendas() {
        return Idvendas;
    }
    public String getTotal() {
        return Total;
    }
    public void setTotal(String total) {
        this.Total = total;
    }
    public String getValor() {
        return Valor;
    }
    public void setValor(String valor) {
        this.Valor = valor;
    }
    public String getProduct() {
        return Product;
    }
    public void setProduct(String product) {
        this.Product = product;
    }
    public void setIdvendas(String idvendas) {
        this.Idvendas = idvendas;
    }
}
}
}
}
}
}







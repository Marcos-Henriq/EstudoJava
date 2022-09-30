package Exercicio1;

public class Colaborador {

    private String nome;
    private String cargo;
    private Double salario = 0.0;

    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        if (validarSalario(salario)) {
            System.out.println("Colaborador "+getNome()+" com salario Inválido");
        } else {
            System.out.println("Colaborador "+getNome()+" cadastrado com sucesso");
            this.salario = salario;
        }

    }
    public String getColaborador(){
        return String.format("Nome: %s \nCargo: %s\nSalario: %.2f",this.nome,this.cargo,this.salario);
    }
    public String getNome() {
        return this.nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(Double salario) {
        if (validarSalario(salario)) {
            System.out.println("Valor de Salario Inválido");
        } else {
            this.salario = salario;
        }
    }

    public Boolean validarSalario(Double salario) {
        return salario <= 0 || salario < this.salario;
    }

}

public class CalculadoraDeSalario {
    public double calcula(Funcionario funcionario) {
        return funcionario.calcularSalario();
    }
}

public interface RegraDeCalculo {
    public double calcula(Funcionario funcionario);
}
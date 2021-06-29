public class TesteEmpresa {
    public static void main(String[] args) {
        FuncionarioPJ pj = new FuncionarioPJ("Rodrigo", 50);
        FuncionarioTecnico tecnico = new FuncionarioTecnico("César", CargoFuncionario.TECNICO);
        FuncionarioAnalista analista = new FuncionarioAnalista("Marinho", CargoFuncionario.ANALISTA);
        FuncionarioGerente gerente = new FuncionarioGerente("Mariana", CargoFuncionario.GERENTE);
        FuncionarioDiretor diretor = new FuncionarioDiretor("Patricia", CargoFuncionario.DIRETOR);

        System.out.println(pj.pagarSalario(160));
        System.out.println(tecnico.pagarSalario(2));
        System.out.println(analista.pagarSalario(4));
        System.out.println(gerente.pagarSalario(6));
        System.out.println(diretor.pagarSalario(1000000));
    }
}

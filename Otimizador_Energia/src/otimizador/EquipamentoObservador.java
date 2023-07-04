package otimizador;

public class EquipamentoObservador implements Observador {
	private String nome;
	public EquipamentoObservador(String nome) {
        this.nome = nome;
    }
    @Override
    public void atualizar(boolean equipamentosLigados) {
        if (equipamentosLigados) {
            System.out.println("Equipamentos ligados...");
        } else {
            System.out.println("Equipamentos desligados...");
        }
    }
}

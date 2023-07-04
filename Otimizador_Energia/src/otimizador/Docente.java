package otimizador;
public class Docente {
	private String nome;

//	private EquipamentoObservavel equipamentoObservavel;

    public Docente(String nome) {
        this.nome = nome;
//        this.equipamentoObservavel = equipamentoObservavel;
    }

    public void entrarNoBloco() {
        System.out.println("Docente " + nome + " entrou no bloco.");
//        
    }

    public void sairDoBloco() {
        System.out.println("Docente " + nome + " saiu do bloco.");
//        equipamentoObservavel.setEquipamentosLigados(false);
    }
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "DOCENTE - " + getNome();
	}
//	public EquipamentoObservavel getEquipamentoObservavel() {
//		return equipamentoObservavel;
//	}
//
//	public void setEquipamentoObservavel(EquipamentoObservavel equipamentoObservavel) {
//		this.equipamentoObservavel = equipamentoObservavel;
//	}
}

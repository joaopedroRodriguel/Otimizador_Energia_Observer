package otimizador;
import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.List;

public class EquipamentoObservavel {
	private EquipamentoObservador equipamentoObservador;
	private List<Docente> docentes = new ArrayList<>();
    

	private boolean equipamentosLigados = false;

//    public void adicionarObservador(Observador observador) {
//        observadores.add(observador);
//    }
//
//    public void removerObservador(Observador observador) {
//        observadores.remove(observador);
//    }
	
	
    public List<Docente> getDocentes() {
		return docentes;
	}
    
    public void adicionarDocente(Docente docente) {
        if(this.isEmpty()==true) {
        	this.setEquipamentosLigados(true);
        	System.out.println(docente.getNome() + " entrou na sala que estava vazia.");
        }
        else {
        	docente.entrarNoBloco();
        }
        docentes.add(docente);
        this.notificarObservadores();
    }

    public void removerDocente( Docente docente) {
    	docentes.remove(docente);   	
    	if(this.isEmpty()==true) {
    		System.out.println(docente.getNome() + " foi o último a sair da sala.");
    		this.setEquipamentosLigados(false);
    	}
    	else {
    		docente.sairDoBloco();
    	}
    	this.notificarObservadores();
    }

    public void notificarObservadores() {
    	equipamentoObservador = new EquipamentoObservador("teste");
        equipamentoObservador.atualizar(equipamentosLigados);
    }
    
    public boolean isEmpty() {
    	if(docentes.isEmpty()==true) {
    		return true;
    	}
    	return false;
    }

    public void setEquipamentosLigados(boolean equipamentosLigados) {
        this.equipamentosLigados = equipamentosLigados;
        notificarObservadores();
    }
}

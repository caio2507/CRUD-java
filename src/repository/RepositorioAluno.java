package repository;
import model.Aluno;
import java.util.List;
import java.util.ArrayList;
public class RepositorioAluno {

    private List<Aluno> alunos = new ArrayList<>();

    public void criar(Aluno aluno ){
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso");
    }
    public void listar(){
        System.out.println("\n--LISTA DE ALUNOS--\n");
        if (alunos.isEmpty()){
            System.out.println("Nenhum aluno encontrado");
        }else {
            for (int i = 0; i < alunos.size(); i++) {
                System.out.print("[" + i + "] ");
                alunos.get(i).exibirInfo();
            }
        }
    }
    public void atualizar(int indece, String novoNome, String novoObjeto){
        if (indece >= 0 && indece < alunos.size()){
            Aluno aluno = alunos.get(indece);
            aluno.setNome(novoNome);
            aluno.setObjetivo(novoObjeto);
        }
    }
    public void excluir(int indece){
        if(indece >= 0 && indece < alunos.size()){
            alunos.remove(indece);
        }
    }

}

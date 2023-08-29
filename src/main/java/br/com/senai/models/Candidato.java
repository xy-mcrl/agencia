package br.com.senai.models;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import br.com.senai.enuns.Genero;

public class Candidato {
    public static final Escolaridade[] Escolaridade = null;
    public String nomeCompleto;
    public LocalDate dataNascimento;
    public String cpf;
    public String email;
    public Genero genero; 
    public String naturalidade;
    public String nacionalidade;
    public Endereco endereco;
    public List<Escolaridade> escolaridades = new ArrayList<>();

    public int calcularIdade(){
        return Period.between(this.dataNascimento, 
            LocalDate.now()).getYears();
    }



    public void calcularidade(){

        int user = 18;

        if (user < 18) {
            System.out.println("Menor de Idade");
        }
        else if (user > 18 && user < 40){
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("Usuario pode acessar");
        }
    }
    
}
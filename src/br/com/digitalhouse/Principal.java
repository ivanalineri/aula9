package br.com.digitalhouse;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Pessoa tairo = new Pessoa("Tairo", "Roberto", 30);
        Pessoa jessica = new Pessoa("Jessica", "Milena", 18);
        Pessoa vini = new Pessoa("Vini", "PHP", 21);

        pessoas.add(tairo);
        pessoas.add(jessica);
        pessoas.add(vini);

        /*for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + "\nSobrenome: " + pessoa.getSobrenome() + "\n");
        }*/

        Set<Pessoa> pessoaSet = new HashSet<>();
        pessoaSet.add(tairo);
        pessoaSet.add(jessica);
        pessoaSet.add(vini);
        pessoaSet.add(vini);
        pessoaSet.add(vini);

      /*  for (Pessoa pessoa : pessoaSet) {
            System.out.println("Nome: " + pessoa.getNome() + "\nSobrenome: " + pessoa.getSobrenome() + "\n");
        }*/

        Map<String,Pessoa> pessoaMap = new HashMap<>();
        pessoaMap.put("Tairo",tairo);
        pessoaMap.put("Jessica",jessica);
        pessoaMap.put("Vini",vini);
        pessoaMap.put("Vini",vini);
        pessoaMap.put("Vini",vini);

        for(String chave: pessoaMap.keySet()){
            System.out.println("Nome: " + pessoaMap.get(chave).getNome() + "\nSobrenome: " + pessoaMap.get(chave).getSobrenome() + "\n");
        }
    }
}

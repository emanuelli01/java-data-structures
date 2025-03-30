package DoubleLinkedList.ex01;

/*
1. Implementar uma Lista Duplamente Encadeada
 Enunciado: Implemente uma lista duplamente encadeada com operações básicas: inserção no final, remoção e exibição dos elementos. 

2. Reverter uma Lista Duplamente Encadeada
  Enunciado: Escreva um método para reverter uma lista duplamente encadeada.

3. Encontrar o Tamanho da Lista 
 Enunciado: Implemente um método que retorna o número total de elementos na lista.

4. Inserir um Nó Antes de um Dado Valor
 Enunciado: Escreva um método para inserir um novo nó antes de um nó existente com um determinado valor.

5. Remover um Nó da Fila (Cabeça ou Cauda)  
 Enunciado: Implemente um método para remover o primeiro ou o último nó da lista.
*/

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        int[] nums = {10, 20, 30, 40};
        for (int num : nums) {
            list.insert(num);
        }

        System.out.println("=============== lista original =================");
        list.print();
        System.out.printf("Elementos na lista: %d\n", list.count());
        

        System.out.println("================ inseriu no meio =============");
        list.insertIn(323, 40);
        list.print();
        list.removeIn(1);
        list.print();
        
    }
}

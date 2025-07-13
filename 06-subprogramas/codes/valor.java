public class valor {

    public static void incrementar(int numero) {
        System.out.println("Dentro do metodo (por valor): O valor inicial do numero eh " + numero);
        numero = numero + 10; // Altera a COPIA do valor
        System.out.println("Dentro do metodo (por valor): O valor apos a alteracao eh " + numero);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Antes da chamada do metodo: O valor de meuNumero eh " + num);

        incrementar(num); // Passa uma COPIA de num

        System.out.println("Depois da chamada do metodo: O valor de meuNumero eh " + num); // num continua 5
    }
}
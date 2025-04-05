public class TypesAnalysis {
    public static void main(String[] args) {
        char c = 'c';
        int i = 10;
        double d = 10;
        long l = 1;
        String s = "Hello";

        // ERRO: A operação c + 1 resulta em um int, 
        // e não pode ser atribuído diretamente a um char sem um cast explícito.
        // c = c + 1; 

        // OK: O operador += permite a concatenação de String com outros tipos, 
        // então 1 é convertido automaticamente para "1" e adicionado à String.
        s += 1; // "Hello1"

        // ERRO: Não é possível somar um int com uma String diretamente,
        // pois o Java não converte automaticamente String para int.
        // i += s; 

        // ERRO: Não é possível somar um char com uma String, 
        // pois são tipos incompatíveis para essa operação.
        // c += s; 

        // OK: O operador += permite somar um int com um long,
        // e a conversão de long para int ocorre implicitamente.
        i += l; // int aceita a conversão implícita de long quando não há perda de precisão
    }
}

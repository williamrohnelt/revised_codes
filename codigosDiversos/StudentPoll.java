package codigosDiversos;

// programa de análise de enquete
public class StudentPoll {
    public static void main(String[] args) {
        
        // criação de um array de inteiros com o nome de responses, 20 de tamanho e valores definidos
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3,  1,  4,  3,  3,  3,  2,  3,  3,  2, 14};
        //        índices: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19

        // array de inteiros com o nome de frequency, tamanho 6, 0-5
        int[] frequency = new int[6];

        // para cada resposta, seleciona elemento de respostas e utiliza esse valor
        // como índice de frequência para determinar elemento a incrementar
        for (int answer = 0; answer < responses.length; answer++) {
            try {
                // first loop, responses[answer] = responses[0] = 1
                // ++ ao lado do array frequency significa que irá somar 1
                // ao índice desse array, esse índice é o valor que está no índice apontado por answer do array responses
                // exemplo: no primeiro loop answer é 0, então responses[0], o valor 1 está no índice 0 do array response
                // então esse 1 é o índice do array frequancy, frequency[responses[0]] = frequency[1], o ++ irá somar 1 ao índice 1
                ++frequency[responses[answer]];

            // captura o erro específico de índice inválido e o guarda em e
            } catch (ArrayIndexOutOfBoundsException e) {

                // chama o método toString do erro, imprimindo sua descrição
                System.out.println(e);

                // mostra qual índice e qual valor causaram o problema
                System.out.printf("resporses [%d] = %d%n%n", answer, responses[answer]);
            }
        }

        System.out.printf("%s%10s%n", "Rating", "Frequency");

        // gera saída do valor de cada elemento do array
        for (int rating = 1; rating < frequency.length; rating++)
            System.out.printf("%6d%10d%n", rating, frequency[rating]);
    }
}

// try = tente fazer isso
// catch = se der esse erro específico, faça isso em vez de travar
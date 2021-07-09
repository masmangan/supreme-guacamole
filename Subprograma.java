// Direitos Autorais, 2021, PUCRS/Escola Politécnica

/**
 * A classe Subprograma oferece um método que permite
 * verificar se os elementos de um vetor são
 * todos eles números inteiros pares.
 * 
 * @author Marco Mangan (marco.mangan@pucrs.br)
 * @date 2021-07-09
 */
public class Subprograma
{
    /**
     * Verifica se todos os elementos do vetor são pares.
     * 
     * @param a o vetor com números que devem ser verificados
     * @return false se ao menos um dos números for ímpar
     */
    public static boolean isAllEven(int[] a)
    {
        int i;
        boolean todosPares;
        
        todosPares = true;
        
        for (i = 0; i < a.length; i++)
        {
            if (a[i] % 2 != 0)
            {
                todosPares = false;
            } 
        }
                
        return todosPares;
    }
}

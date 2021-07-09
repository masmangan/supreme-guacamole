// Direitos Autorais, 2021, PUCRS/Escola Politécnica


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste SubprogramaTest verifica que a 
 * classe Subprograma funciona corretamente.
 *
 * @author Marco Mangan (marco.mangan@pucrs.br)
 * @date 2021-07-09
 */
public class SubprogramaTest
{
    /**
     * Construtor default para a classe de teste SubprogramaTest
     */
    public SubprogramaTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void test1()
    {
        int[] vs = {10, 20, 30};
        boolean expectativa = true;
        boolean realidade = Subprograma.isAllEven(vs);
        assertEquals(expectativa, realidade);
    }

    @Test
    public void teste2()
    {
        int[] vs = {11, 21, 31};
        boolean expectativa = false;
        boolean realidade = Subprograma.isAllEven(vs);
        assertEquals(expectativa, realidade);    
    }

    @Test
    public void teste3()
    {
        int[] vs = {10, 20, 31};
        boolean expectativa = false;
        boolean realidade = Subprograma.isAllEven(vs);
        assertEquals(expectativa, realidade);    
    }

    
    @Test
    public void teste4()
    {
        int[] vs = {11, 20, 30};
        boolean expectativa = false;
        boolean realidade = Subprograma.isAllEven(vs);
        assertEquals(expectativa, realidade);    
    }    

    @Test
    public void teste5()
    {
        int[] vs = {10, 21, 30};
        boolean expectativa = false;
        boolean realidade = Subprograma.isAllEven(vs);
        assertEquals(expectativa, realidade);    
    }

}





public class Teste
{
    Teste()
    {
        int abc = op(1,3);
        System.out.println(abc);
        
        if (abc <8){
            System.out.println(op(3,4));
        }
        abc ++;
        System.out.println(abc);
    }

    int op(int realA, int realB)
    {
        int temp = 2;
        temp += realA - realB;
        return temp;
    }
}

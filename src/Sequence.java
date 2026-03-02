public class Sequence
{

    public boolean isPermutationOf(int[] one, int[] two)
    {
        if(one.length != two.length) return false;

        boolean[] thisCheck = new boolean[one.length];
        boolean[] otherCheck = new boolean[two.length];

        for(int i = 0; i < one.length; i++)
        {
            for(int j = 0; (j < two.length) && !thisCheck[i]; j++)
            {
                if(otherCheck[j]) continue;
                if(one[i] == two[j])
                {
                    thisCheck[i] = true;
                    otherCheck[j] = true;
                }
            }
        }
        for(int i = 0; i < thisCheck.length; i++)
        {
            if(!thisCheck[i]) return false;
            if(!otherCheck[i]) return false;
        }
        return true;
    }
}
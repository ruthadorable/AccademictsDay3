public class SumIntegers {

    public SumIntegers() {
    }

    public int arraySum (int [] tab){
        int som = 0 ;
        for(int i : tab){
            som+=i;
        }
        return som;
    }
}

/**
 * Created by Varg on 05.06.2017.
 */
public class Calculator {
    /**
     Result
     */
    private int result;

    /**
     @param params
     */
    public void add(int ... params) {
        for(Integer param : params)
            result += param;
    }

    /**
     @return result
     */
    public int getResult() {
        return result;
    }

    /**
     Clear
     */
    public void clearResult() {
        result = 0;
    }
}

package 接口四则计算器;

public class Sub implements ICompute{
    @Override
    public int computer(int n, int m) {
        return n-m;
    }
}

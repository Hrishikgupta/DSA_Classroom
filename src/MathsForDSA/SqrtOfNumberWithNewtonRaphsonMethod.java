package MathsForDSA;

public class SqrtOfNumberWithNewtonRaphsonMethod {
    public static void main(String[] args) {
        double n = 40;
        System.out.println(sqrt(n));
    }
    //Time Complexity: O((log N)f(N))
    //f(N) : Cost of calculating f(x)/f'(x) with n digit precision
    static double sqrt(double n){
        double x = n;
        double root = n;
        while(true){
            root = 0.5*(x+(n/x));
            if(Math.abs(root-x)<1){ //we can change this to get more accurate result
                break;
            }
            x = root;
        }
        return root;
    }
}

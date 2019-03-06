public class CycRotation {

    public int[] solution(int[] A, int K){

        int counter = 0;
        while(counter < K  ){
            int temp = A[A.length-1];
            for ( int i =A.length-1; i>0; i--   ){
                A[i] = A[i-1];
            }
            A[0] = temp;
            counter++;
        }

        return A;
    }

}

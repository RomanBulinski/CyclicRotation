import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestCyclo {

    @Test
    public void test() {
        CycRotation cycRotation = new CycRotation();
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        int[] B = {9, 7, 6, 3, 8};
        assertArrayEquals(B, cycRotation.solution(A, K));
    }

    @Test
    public void test2() {
        CycRotation cycRotation = new CycRotation();
        int[] A = {1, 2, 3, 4, 5};
        int K = 1;
        int[] B = {5, 1, 2, 3, 4};
        assertArrayEquals(B, cycRotation.solution(A, K));
    }

}

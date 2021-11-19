class Solution {
    public int hammingDistance(int x, int y) {
        int target = x^y;
        int output = 0;
        for(int i=0;i<32;i++){
            if ((target>>i & 1) == 1)
                output++;
        }
        return output;
    }
}

/*
x = 4  (0100)
y = 1  (0001)
x^y=5  (0101)

xor연산으로 각자리의 비트가 서로 다른 경우 1로 만들고,
shift연산으로 오른쪽으로 옮기면서 1의 개수 카운팅
32비트 체크
*/

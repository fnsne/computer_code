import java.util.Arrays;
public class immoc1 {
    
    //���� main ��k
    public static void main(String[] args) {
        int[] scores = new int[]{89,-23,64,91,119,52,73};
        immoc1 hello = new immoc1();
        hello.operater(scores);
        
    }
    
    //�w?��k������?�ƧǦ}?�X�e�T�W���\��
    public void operater(int[] scores){
        Arrays.sort(scores);
        int[] people = new int[3];
        int j = 0;
        for(int i = scores.length-1 ; i >=0 ; i--){
            if((scores[i]>=0)&&(scores[i] <=100)){
                people[j] = scores[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(people));
    }
    
    
    
    
    
    
    
    
    
}
